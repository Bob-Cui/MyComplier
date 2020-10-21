
import FileOperation.MyFileManager;
import org.antlr.v4.runtime.ANTLRInputStream;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class HomeWork {

    public static void run(String str)  {
        ANTLRInputStream inputStream = new ANTLRInputStream(str);
        CBLexer lexer = new CBLexer(inputStream);
        String[] t = lexer.getTokenNames();


        List<CommonToken> c2 = (List<CommonToken>) lexer.getAllTokens();
        List<? extends Token> c = lexer.getAllTokens();
        System.out.println("列表的长度为 " + c.size());
        for (CommonToken c1 : c2) {
            System.out.println(c1.getText());
            System.out.println("第" + c1.getLine() + "行");
            System.out.println("起始位置" + c1.getStartIndex());
//            c1.getLine()+c1.getStartIndex()+c1.getStopIndex();
        }


    }

    public static void main(String[] args) throws Exception {
//        Math\
        String[] testStr = {
                "a=3     ;",
                "float b=4;",
                // "hi world"
        };

        MyFileManager myFileManager = new MyFileManager();
        List<String> list = myFileManager.getFileLines("C:\\Users\\DELL\\Desktop\\WebForContest\\Complier\\src\\MyANTLR\\grammer.txt");
        for (String c : list) {
            run(c);
            break;
        }

    }
}
