package bige.antlr;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import bige.antlr.ConditionalExpParser.AtomicCompareContext;
import bige.antlr.ConditionalExpParser.ExpressionContext;
import bige.antlr.ConditionalExpParser.FieldNameContext;
import bige.antlr.ConditionalExpParser.LogicalEntityContext;
import bige.antlr.ConditionalExpParser.LogicalExpressionAndContext;
import bige.antlr.ConditionalExpParser.LogicalExpressionInParenContext;
import bige.antlr.ConditionalExpParser.LogicalExpressionOrContext;
import bige.antlr.ConditionalExpParser.LogicalPrimaryContext;
import bige.antlr.ConditionalExpParser.NumericEntityContext;
import bige.antlr.ConditionalExpParser.OperandConstantContext;
import bige.antlr.ConditionalExpParser.OperandDataPathContext;
import bige.antlr.ConditionalExpParser.OperandEnvironmentAttributeContext;
import bige.antlr.ConditionalExpParser.OperandResourceAttributeContext;
import bige.antlr.ConditionalExpParser.OperandSubjectAttributeContext;
import bige.antlr.ConditionalExpParser.ParameterListContext;
import bige.antlr.ConditionalExpParser.PrimaryAtomicCompareContext;
import bige.antlr.ConditionalExpParser.PrimaryFunctionCallContext;
import bige.antlr.ConditionalExpParser.PrimarySetCompareContext;

public class ConditionalExpBaseVisitorImp extends ConditionalExpBaseVisitor<Void> {

	@Override
	public Void visitExpression(ExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExpression(ctx);
	}

	@Override
	public Void visitLogicalEntity(LogicalEntityContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLogicalEntity(ctx);
	}

	@Override
	public Void visitLogicalExpressionInParen(LogicalExpressionInParenContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLogicalExpressionInParen(ctx);
	}

	@Override
	public Void visitLogicalExpressionAnd(LogicalExpressionAndContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLogicalExpressionAnd(ctx);
	}

	@Override
	public Void visitLogicalExpressionOr(LogicalExpressionOrContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLogicalExpressionOr(ctx);
	}

	@Override
	public Void visitLogicalPrimary(LogicalPrimaryContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLogicalPrimary(ctx);
	}

	@Override
	public Void visitPrimaryAtomicCompare(PrimaryAtomicCompareContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrimaryAtomicCompare(ctx);
	}

	@Override
	public Void visitPrimarySetCompare(PrimarySetCompareContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrimarySetCompare(ctx);
	}

	@Override
	public Void visitPrimaryFunctionCall(PrimaryFunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrimaryFunctionCall(ctx);
	}

	@Override
	public Void visitAtomicCompare(AtomicCompareContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAtomicCompare(ctx);
	}

	@Override
	public Void visitOperandSubjectAttribute(OperandSubjectAttributeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOperandSubjectAttribute(ctx);
	}

	@Override
	public Void visitOperandResourceAttribute(OperandResourceAttributeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOperandResourceAttribute(ctx);
	}

	@Override
	public Void visitOperandEnvironmentAttribute(OperandEnvironmentAttributeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOperandEnvironmentAttribute(ctx);
	}

	@Override
	public Void visitOperandDataPath(OperandDataPathContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOperandDataPath(ctx);
	}

	@Override
	public Void visitOperandConstant(OperandConstantContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOperandConstant(ctx);
	}

	@Override
	public Void visitFieldName(FieldNameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFieldName(ctx);
	}

	@Override
	public Void visitParameterList(ParameterListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParameterList(ctx);
	}

	@Override
	public Void visitNumericEntity(NumericEntityContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNumericEntity(ctx);
	}

	@Override
	public Void visit(ParseTree tree) {
		// TODO Auto-generated method stub
		return super.visit(tree);
	}

	@Override
	public Void visitChildren(RuleNode node) {
		// TODO Auto-generated method stub
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName + " :" + node.getText());
		return super.visitChildren(node);
	}

}
