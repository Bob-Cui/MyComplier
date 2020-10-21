package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

//import
public class CBFrame extends JFrame {

    //    private final Object ActionListener;
//    MyButton open1 = null;
    private int Width;
    private int Height;


    /**
     * 使用空布局的方法进行布局
     *
     *
     */
    private void initButtons() {
        JButton chooseFile = new JButton("选择C语言文件");
        chooseFile.setBounds(Width / 32,  Height / 5, Width / 8, Height / 10);
        chooseFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser();
            }
        });
        JButton lexerButton = new JButton("词法分析");
        lexerButton.setBounds(Width / 32, 3 * Height / 5, Width / 8, Height / 10);
        lexerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(lexerButton);
        this.add(chooseFile);
    }


    public CBFrame() throws HeadlessException {

        initBound();
        initButtons();

        JTextField sourceCFile = new JTextField("dasf", 10);
        sourceCFile.setFont(new Font(null, Font.PLAIN | Font.BOLD | Font.ITALIC, 20));

        sourceCFile.setBounds(Width / 6, Height / 15, Width / 3, 3 * Height / 4);
        this.setLayout(null);


        this.add(sourceCFile);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * 将对话框的大小设置为整个屏幕的一半
     */
    private void initBound() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimension = kit.getScreenSize();

        Width = dimension.width;
        Height = dimension.height;
        setBounds(Width / 4, Height / 4, Width / 2, Height / 2);

        Width = dimension.width / 2;
        Height = dimension.height / 2;
    }


    public void fileChooser() {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jFileChooser.showDialog(new JLabel(), "选择一个C语言文件");
        File file = jFileChooser.getSelectedFile();

        if (file.isDirectory()) {

            System.out.println("目录");

        } else if (file.isFile()) {
            System.out.println("file");

            try {
                FileReader reader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String t;
                while ((t = bufferedReader.readLine()).length() > 0) {
                    System.out.println(t);
                }
            } catch (IOException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
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
