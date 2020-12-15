import LearnAntlr.LearnBaseVisitor;
import LearnAntlr.LearnLexer;
import LearnAntlr.LearnParser;
import LearnAntlr.LearnVisitor;
import MyAntlr.MyErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class LearnTest {


    public static void main(String[] args) {


//        for()

        CharStream input= CharStreams.fromString("12*2+-12\r\n");
        LearnLexer learnLexer = new LearnLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(learnLexer);
        LearnParser parser = new LearnParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new MyErrorListener());
        ParseTree tree = parser.prog();
        LearnVisitor learnVisitor = new LearnBaseVisitor();
        learnVisitor.visit(tree);


    }
}
