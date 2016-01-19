package bige.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParseTest {
	public static void main(String[] args) {
        ANTLRInputStream input = new ANTLRInputStream("Subject.riskLevel > 4");
        ConditionalExpLexer lexer = new ConditionalExpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ConditionalExpParser parser = new ConditionalExpParser(tokens);
        ParseTree tree = parser.logicalExpr();

        ConditionalExpBaseVisitorImp calcVisitor = new ConditionalExpBaseVisitorImp();
        calcVisitor.visit(tree);
	}
}
