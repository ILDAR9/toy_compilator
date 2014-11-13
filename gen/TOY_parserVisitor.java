// Generated from C:/Users/user/Documents/IdeaProjects/toy_compilator/src/main/antlr4/innopolis/icc/toy/parser\TOY_parser.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TOY_parserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TOY_parserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull TOY_parserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull TOY_parserParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(@NotNull TOY_parserParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#visibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility(@NotNull TOY_parserParser.VisibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull TOY_parserParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(@NotNull TOY_parserParser.MethodTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(@NotNull TOY_parserParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull TOY_parserParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#arrayTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTail(@NotNull TOY_parserParser.ArrayTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull TOY_parserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#newType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewType(@NotNull TOY_parserParser.NewTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull TOY_parserParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#classMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMembers(@NotNull TOY_parserParser.ClassMembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#localDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDeclarations(@NotNull TOY_parserParser.LocalDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull TOY_parserParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(@NotNull TOY_parserParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull TOY_parserParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull TOY_parserParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#compoundName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundName(@NotNull TOY_parserParser.CompoundNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull TOY_parserParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#staticness}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticness(@NotNull TOY_parserParser.StaticnessContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull TOY_parserParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#localDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDeclaration(@NotNull TOY_parserParser.LocalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull TOY_parserParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull TOY_parserParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(@NotNull TOY_parserParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#classDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarations(@NotNull TOY_parserParser.ClassDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull TOY_parserParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(@NotNull TOY_parserParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull TOY_parserParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull TOY_parserParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull TOY_parserParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull TOY_parserParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(@NotNull TOY_parserParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull TOY_parserParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension(@NotNull TOY_parserParser.ExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull TOY_parserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#leftPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftPart(@NotNull TOY_parserParser.LeftPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull TOY_parserParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#factors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactors(@NotNull TOY_parserParser.FactorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull TOY_parserParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull TOY_parserParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#addSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSign(@NotNull TOY_parserParser.AddSignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(@NotNull TOY_parserParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TOY_parserParser#multSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultSign(@NotNull TOY_parserParser.MultSignContext ctx);
}