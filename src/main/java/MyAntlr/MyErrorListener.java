package MyAntlr;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class MyErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        System.out.println("第"+String.valueOf(line)+"  "+"第"+String.valueOf(charPositionInLine)+"列    "+"   非法符号    "+offendingSymbol+"  错误原因  "+msg);
    }
}
