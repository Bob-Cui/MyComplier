
import FileOperation.MyFileManager;
import org.antlr.v4.runtime.*;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.Queue;

public class CompilerManager {

    public static void run(String str)  {
        ANTLRInputStream inputStream = new ANTLRInputStream(str);
        CBLexer lexer = new CBLexer(inputStream);


        List<CommonToken> c2 = (List<CommonToken>) lexer.getAllTokens();
        for (CommonToken c1 : c2) {
            System.out.println(c1.getText());
            System.out.println("第" + c1.getLine() + "行");
            System.out.println("起始位置" + c1.getStartIndex());
        }


    }

    public static void main(String[] args) throws Exception {
        String[] testStr = {
                "a=3     ;",
                "float b=4;",
        };

        MyFileManager myFileManager = new MyFileManager();
        List<String> list = myFileManager.getFileLines("C:\\Users\\DELL\\Desktop\\WebForContest\\Complier\\src\\MyANTLR\\grammer.txt");
        for (String c : list) {
            run(c);
            break;
        }
    }
}
