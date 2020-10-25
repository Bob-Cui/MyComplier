package MyAntlr;

import org.antlr.v4.runtime.*;

import java.util.List;

public class CompilerManager {

    public static void run(String str) {
        ANTLRInputStream inputStream = new ANTLRInputStream(str);
        CBLexer lexer = new CBLexer(inputStream);


        List<CommonToken> c2 = (List<CommonToken>) lexer.getAllTokens();
        for (CommonToken c1 : c2) {
//            if(c1.getText().equals(" ")){
//                continue;
//
//            }
            if (c1.getChannel() == 2) {

                System.out.println("注释为" + c1.getText() + "   " + c1.getType());

            } else if (c1.getChannel() == 3) {

                System.out.println("预处理为" + c1.getText() + " " + c1.getType());
            }

        }


    }

    public static void main(String[] args) {
        String[] testStr = {
                "a=3;",
                "float b=44534e100;",
                "       /*dasffasdf sdfads fdfasdf df asdf sdasf eafsd dsf sda*/",
                "#dsafdsfsdafe fdsafsdf// "

        };

        for (String c : testStr) {
            run(c);
        }
    }
}
