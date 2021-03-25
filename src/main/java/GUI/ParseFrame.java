/*
 * Created by JFormDesigner on Tue Dec 15 10:25:41 CST 2020
 */

package GUI;


import MyAntlr.CBBaseVisitor;
import MyAntlr.CBLexer;
import MyAntlr.CBParser;
import MyAntlr.CBVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserInterpreter;
import org.antlr.v4.runtime.tree.ParseTree;

import java.awt.*;
import java.util.LinkedList;
import javax.swing.*;

/**
 * @author 崔博
 */
public class ParseFrame extends JFrame {
    public static LinkedList<ErrorInformation> errorInformationLinkedList;

    static {
        errorInformationLinkedList = new LinkedList<>();

    }

    public ParseFrame() {
        System.out.println("初始化");
        initComponents();

    }

    /**
     * 传入代码调用构造函数
     * @param codes
     */
    public ParseFrame(LinkedList<String> codes) {
        Toolkit kit = Toolkit.getDefaultToolkit();


        this.setTitle("语法分析界面");
        initComponents();

        String t = "";
        for (String str : codes) {
            if (str.contains("/") || str.contains("#")) continue;
            showCode.append(str);
            t += str;
        }
        parsering(t);


        if (errorInformationLinkedList.isEmpty()) {
            result.setText("语法正确");
        } else {
            int count = 1;
            for (ErrorInformation errorInformation : errorInformationLinkedList) {
                String str = "";
                error.append(String.format("第%d个错误\n", count++));
                error.append(String.format("第%d行\n", errorInformation.getLine()));
                error.append(String.format("第%d个字符\n", errorInformation.getCharPositionInLine()));
                error.append(String.format("错误原因为%s\n", errorInformation.getMsg()));
                error.append(String.format("错误字符为%s\n", errorInformation.getOffendingSymbol()));
                error.append("-----------------------\n");
            }
            errorInformationLinkedList.clear();
        }
    }

    /**
     * 进行语法分析
     *
     * @param str
     */
    private void parsering(String str) {
        CharStream charStream = CharStreams.fromString(str);
        CBLexer cbLexer = new CBLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(cbLexer);
        CBParser cbParser = new CBParser(tokenStream);

        cbParser.removeErrorListeners();
        cbParser.addErrorListener(new MyErrorListener());
        ParseTree tree = cbParser.prog();
        CBVisitor cbVisitor = new CBBaseVisitor();
        cbVisitor.visit(tree);
//        LearnVisitor learnVisitor = new LearnBaseVisitor();
//        learnVisitor.visit(tree);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 崔博
        scrollPane1 = new JScrollPane();
        showCode = new JTextArea();
        panel1 = new JPanel();
        scrollPane2 = new JScrollPane();
        error = new JTextArea();
        result = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

        //======== scrollPane1 ========
        {
            scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

            //---- showCode ----
            showCode.setMaximumSize(new Dimension(230, 2147483647));
            showCode.setMinimumSize(new Dimension(230, 19));
            showCode.setPreferredSize(new Dimension(230, 19));
            showCode.setFont(showCode.getFont().deriveFont(showCode.getFont().getSize() + 2f));
            scrollPane1.setViewportView(showCode);
        }
        contentPane.add(scrollPane1);

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(error);
            }
            panel1.add(scrollPane2);

            //---- result ----
            result.setText(" ");
            result.setMaximumSize(new Dimension(100, 50));
            result.setMinimumSize(new Dimension(100, 50));
            result.setPreferredSize(new Dimension(100, 50));
            result.setAlignmentX(0.5F);
            result.setFont(result.getFont().deriveFont(result.getFont().getSize() + 9f));
            result.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(result);
        }
        contentPane.add(panel1);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 崔博
    private JScrollPane scrollPane1;
    private JTextArea showCode;
    private JPanel panel1;
    private JScrollPane scrollPane2;
    private JTextArea error;
    private JLabel result;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        ParseFrame parseFrame = new ParseFrame();

    }
}
