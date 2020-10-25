package GUI;

import MyAntlr.CBLexer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonToken;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.LinkedList;
import java.util.List;


import javax.swing.filechooser.FileFilter;

/**
 * @author 全栈工程师崔博先生
 */
public class CBFrame extends JFrame {


    private final int PREPROCESS = 3; //预处理 channel
    private final int COMMENT = 2;//注释 channel
    private int Width;
    private int height;
    private FileFilter myfileFilter;
    private JTextArea sourceCFile, afterLexing, preProcess;
    private LinkedList<String> lines;
    private boolean choosed;

    /**
     * 使用空布局的方法进行布局
     *
     * @throws HeadlessException
     */
    private void initButtons() {
        JButton chooseFile = new JButton("选择C语言文件");
        chooseFile.setBounds(Width / 32, height / 5, Width / 8, height / 10);


        chooseFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                fileChooser();
                lines = getFileLines();
                if (lines == null) {
                } else {
                    for (String t : lines) {
                        sourceCFile.append(t + '\n');
                    }
                    choosed = true;
                }
            }
        });
        JButton lexerButton = new JButton("词法分析");
        lexerButton.setBounds(Width / 32, 3 * height / 5, Width / 8, height / 10);
        lexerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lines != null) {
                    for (String str : lines) {
                        ANTLRInputStream inputStream = new ANTLRInputStream(str);
                        CBLexer lexer = new CBLexer(inputStream);
                        java.util.List<CommonToken> c2 = (List<CommonToken>) lexer.getAllTokens();
                        for (CommonToken c1 : c2) {
                            String t = "";
                            if (c1.getChannel() == PREPROCESS || c1.getChannel() == COMMENT) {
                                t = c1.getText();
                                preProcess.append(t + '\n');
                            } else {
                                t += c1.getText() + " ";
                                t += "第" + c1.getLine() + "行   ";
                                t += "起始位置" + c1.getStartIndex();
                                afterLexing.append(t + '\n');
                            }
                        }
//                        afterLexing.append(str);
                    }
                    choosed = false;
                }
            }
        });
        this.add(lexerButton);
        this.add(chooseFile);
    }


    public CBFrame() throws HeadlessException {
        init();
        initBound();
        initButtons();
        JLabel left = new JLabel("源文件");
        left.setBounds(Width / 3, height / 10, Width / 6, height / 12);

//        this.add(left);
        sourceCFile = new JTextArea(40, 10);
        sourceCFile.setFont(new Font(null, Font.PLAIN | Font.BOLD, 15));
        sourceCFile.setLineWrap(true);
        sourceCFile.setBounds(Width / 6, height / 10, Width / 3, 3 * height / 4);

        afterLexing = new JTextArea(40, 10);
        afterLexing.setFont(new Font(null, Font.PLAIN | Font.BOLD, 15));
        afterLexing.setBounds(Width / 2 + Width / 24, height / 10, Width / 3, 3 * height / 4);

        preProcess = new JTextArea(40, 10);
        preProcess.setFont(new Font(null, Font.PLAIN | Font.BOLD, 15));
        preProcess.setBounds(Width, height / 10, Width / 4, 3 * height / 4);


        JLabel preLabel = new JLabel("预处理结果");
        preLabel.setFont(new Font(null, Font.PLAIN | Font.BOLD, 20));
        preLabel.setBounds(Width + Width / 15, height / 30, Width / 6, height / 15);

        JLabel lexLabel = new JLabel("词法分析结果");
        lexLabel.setFont(new Font(null, Font.PLAIN | Font.BOLD, 20));
        lexLabel.setBounds(Width / 2 + Width / 24 + Width / 15, height / 30, Width / 6, height / 15);
        this.add(lexLabel);
        this.add(preLabel);
        this.add(preProcess);
        this.add(sourceCFile);
        this.add(afterLexing);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * 文件过滤器只有以.c结尾的文件才能够被接受
     */
    private void init() {
//设置一个文件过滤器
        this.setTitle("简单C语言词法分析器");
        this.setLayout(null);
        this.setResizable(false);//窗口的大小不可更改
        myfileFilter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.getName().endsWith(".c")) {
                    return true;
                } else {
                    return false;
                }

            }

            ;

            @Override
            public String getDescription() {
                return null;
            }
        };
    }

    /**
     * 将对话框的大小设置为整个屏幕的一半
     */
    private void initBound() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimension = kit.getScreenSize();

        Width = dimension.width;
        height = dimension.height;
        setBounds(Width / 4 - Width / 12, height / 4, Width / 2 + Width / 6, height / 2);

        Width = dimension.width / 2;
        height = dimension.height / 2;
    }

    /**
     * 初始化一个文件选择器，并返回文件内所有字符串集组成的集合
     *
     * @return c语言源文件字符串集合
     */
    private LinkedList<String> getFileLines() {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);


        jFileChooser.setFileFilter(myfileFilter);
        jFileChooser.showDialog(new JLabel(), "选择一个C语言文件");
        LinkedList<String> stringLinkedList = new LinkedList<>();

        File file = jFileChooser.getSelectedFile();
        if (file == null) {
            return null;
        }
        if (file.isFile()) {


            try {
                FileReader reader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String str;
                while ((str = bufferedReader.readLine()) != null) {//用null来判断就不会出现忽略空格的情况
//                    System.out.println(str);
                    stringLinkedList.add(str);
                }

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        if (stringLinkedList.isEmpty()) {
            return null;
        }
        return stringLinkedList;
    }

    public void fileChooser() {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);


        jFileChooser.setFileFilter(myfileFilter);
        jFileChooser.showDialog(new JLabel(), "选择一个C语言文件");


        File file = jFileChooser.getSelectedFile();
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {

            System.out.println("目录");

        } else if (file.isFile()) {
            System.out.println("file");

            try {
                FileReader reader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String t;
                while ((t = bufferedReader.readLine()) != null) {
                    System.out.println(t);
                }
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CBFrame fileTest = new CBFrame();
                fileTest.setVisible(true);
            }
        });
    }
}
