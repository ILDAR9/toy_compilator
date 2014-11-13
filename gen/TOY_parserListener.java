// Generated from C:/Users/user/Documents/IdeaProjects/toy_compilator/src/main/antlr4/innopolis/icc/toy/parser\TOY_parser.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TOY_parserParser}.
 */
public interface TOY_parserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull TOY_parserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull TOY_parserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull TOY_parserParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull TOY_parserParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(@NotNull TOY_parserParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(@NotNull TOY_parserParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(@NotNull TOY_parserParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(@NotNull TOY_parserParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull TOY_parserParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull TOY_parserParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(@NotNull TOY_parserParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(@NotNull TOY_parserParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(@NotNull TOY_parserParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(@NotNull TOY_parserParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull TOY_parserParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull TOY_parserParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#arrayTail}.
	 * @param ctx the parse tree
	 */
	void enterArrayTail(@NotNull TOY_parserParser.ArrayTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#arrayTail}.
	 * @param ctx the parse tree
	 */
	void exitArrayTail(@NotNull TOY_parserParser.ArrayTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull TOY_parserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull TOY_parserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#newType}.
	 * @param ctx the parse tree
	 */
	void enterNewType(@NotNull TOY_parserParser.NewTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#newType}.
	 * @param ctx the parse tree
	 */
	void exitNewType(@NotNull TOY_parserParser.NewTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull TOY_parserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull TOY_parserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#classMembers}.
	 * @param ctx the parse tree
	 */
	void enterClassMembers(@NotNull TOY_parserParser.ClassMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#classMembers}.
	 * @param ctx the parse tree
	 */
	void exitClassMembers(@NotNull TOY_parserParser.ClassMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#localDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclarations(@NotNull TOY_parserParser.LocalDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#localDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclarations(@NotNull TOY_parserParser.LocalDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull TOY_parserParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull TOY_parserParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull TOY_parserParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull TOY_parserParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull TOY_parserParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull TOY_parserParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull TOY_parserParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull TOY_parserParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#compoundName}.
	 * @param ctx the parse tree
	 */
	void enterCompoundName(@NotNull TOY_parserParser.CompoundNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#compoundName}.
	 * @param ctx the parse tree
	 */
	void exitCompoundName(@NotNull TOY_parserParser.CompoundNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull TOY_parserParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull TOY_parserParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#staticness}.
	 * @param ctx the parse tree
	 */
	void enterStaticness(@NotNull TOY_parserParser.StaticnessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#staticness}.
	 * @param ctx the parse tree
	 */
	void exitStaticness(@NotNull TOY_parserParser.StaticnessContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull TOY_parserParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull TOY_parserParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclaration(@NotNull TOY_parserParser.LocalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclaration(@NotNull TOY_parserParser.LocalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull TOY_parserParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull TOY_parserParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull TOY_parserParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull TOY_parserParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(@NotNull TOY_parserParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(@NotNull TOY_parserParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#classDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarations(@NotNull TOY_parserParser.ClassDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#classDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarations(@NotNull TOY_parserParser.ClassDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull TOY_parserParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull TOY_parserParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(@NotNull TOY_parserParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(@NotNull TOY_parserParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull TOY_parserParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull TOY_parserParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull TOY_parserParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull TOY_parserParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull TOY_parserParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull TOY_parserParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull TOY_parserParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull TOY_parserParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(@NotNull TOY_parserParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(@NotNull TOY_parserParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull TOY_parserParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull TOY_parserParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#extension}.
	 * @param ctx the parse tree
	 */
	void enterExtension(@NotNull TOY_parserParser.ExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#extension}.
	 * @param ctx the parse tree
	 */
	void exitExtension(@NotNull TOY_parserParser.ExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull TOY_parserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull TOY_parserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#leftPart}.
	 * @param ctx the parse tree
	 */
	void enterLeftPart(@NotNull TOY_parserParser.LeftPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#leftPart}.
	 * @param ctx the parse tree
	 */
	void exitLeftPart(@NotNull TOY_parserParser.LeftPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull TOY_parserParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull TOY_parserParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#factors}.
	 * @param ctx the parse tree
	 */
	void enterFactors(@NotNull TOY_parserParser.FactorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#factors}.
	 * @param ctx the parse tree
	 */
	void exitFactors(@NotNull TOY_parserParser.FactorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull TOY_parserParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull TOY_parserParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull TOY_parserParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull TOY_parserParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#addSign}.
	 * @param ctx the parse tree
	 */
	void enterAddSign(@NotNull TOY_parserParser.AddSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#addSign}.
	 * @param ctx the parse tree
	 */
	void exitAddSign(@NotNull TOY_parserParser.AddSignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(@NotNull TOY_parserParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(@NotNull TOY_parserParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOY_parserParser#multSign}.
	 * @param ctx the parse tree
	 */
	void enterMultSign(@NotNull TOY_parserParser.MultSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOY_parserParser#multSign}.
	 * @param ctx the parse tree
	 */
	void exitMultSign(@NotNull TOY_parserParser.MultSignContext ctx);
}