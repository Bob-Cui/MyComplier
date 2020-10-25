
import FileOperation.MyFileManager;
import org.antlr.v4.runtime.*;

import java.util.List;

public class CompilerManager {

    public static void run(String str) {
        ANTLRInputStream inputStream = new ANTLRInputStream(str);
        CBLexer lexer = new CBLexer(inputStream);


        List<CommonToken> c2 = (List<CommonToken>) lexer.getAllTokens();
        for (CommonToken c1 : c2) {
            if (c1.getChannel() == 2) {

                System.out.println(c1.getText());
            }
        }


    }

    public static void main(String[] args) throws Exception {
        String[] testStr = {
                "a=3     ;",
                "float b=4;",
                "       /*dasffasdf sdfads fdfasdf df asdf sdasf eafsd dsf sda*/"
        };

        for (String c : testStr) {
            run(c);
//            break;
        }
    }
}
