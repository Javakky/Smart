package com.github.javakky.smart.truffle;

import com.github.javakky.smart.antlr.SmartListener;
import com.github.javakky.smart.antlr.SmartParser;
import com.github.javakky.smart.node.LongNode;
import com.github.javakky.smart.node.SmartNode;
import com.github.javakky.smart.node.SmartRootNode;
import com.oracle.truffle.api.frame.FrameDescriptor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;

/**
 * Truffle nodes creator.
 */
public class SmartParseTreeListener implements SmartListener {

    private SmartNode node;

    private LinkedList<SmartNode> smartNodes = new LinkedList<>();

    public SmartRootNode getRoot(SmartLang smartLang) {
        return new SmartRootNode(smartLang, new FrameDescriptor(), node, "main");
    }

    @Override
    public void enterMain(SmartParser.MainContext ctx) {

    }

    @Override
    public void exitMain(SmartParser.MainContext ctx) {
        node = smartNodes.pop();
    }

    @Override
    public void enterClassfile(SmartParser.ClassfileContext ctx) {

    }

    @Override
    public void exitClassfile(SmartParser.ClassfileContext ctx) {

    }

    @Override
    public void enterFuncfile(SmartParser.FuncfileContext ctx) {

    }

    @Override
    public void exitFuncfile(SmartParser.FuncfileContext ctx) {

    }

    @Override
    public void enterImport_stmt(SmartParser.Import_stmtContext ctx) {

    }

    @Override
    public void exitImport_stmt(SmartParser.Import_stmtContext ctx) {

    }

    @Override
    public void enterImport_name(SmartParser.Import_nameContext ctx) {

    }

    @Override
    public void exitImport_name(SmartParser.Import_nameContext ctx) {

    }

    @Override
    public void enterClass_modifier(SmartParser.Class_modifierContext ctx) {

    }

    @Override
    public void exitClass_modifier(SmartParser.Class_modifierContext ctx) {

    }

    @Override
    public void enterClassdef(SmartParser.ClassdefContext ctx) {

    }

    @Override
    public void exitClassdef(SmartParser.ClassdefContext ctx) {

    }

    @Override
    public void enterDotlist(SmartParser.DotlistContext ctx) {

    }

    @Override
    public void exitDotlist(SmartParser.DotlistContext ctx) {

    }

    @Override
    public void enterClass_body(SmartParser.Class_bodyContext ctx) {

    }

    @Override
    public void exitClass_body(SmartParser.Class_bodyContext ctx) {

    }

    @Override
    public void enterClass_body_stmt(SmartParser.Class_body_stmtContext ctx) {

    }

    @Override
    public void exitClass_body_stmt(SmartParser.Class_body_stmtContext ctx) {

    }

    @Override
    public void enterEnumdef(SmartParser.EnumdefContext ctx) {

    }

    @Override
    public void exitEnumdef(SmartParser.EnumdefContext ctx) {

    }

    @Override
    public void enterTraitdef(SmartParser.TraitdefContext ctx) {

    }

    @Override
    public void exitTraitdef(SmartParser.TraitdefContext ctx) {

    }

    @Override
    public void enterInterfacedef(SmartParser.InterfacedefContext ctx) {

    }

    @Override
    public void exitInterfacedef(SmartParser.InterfacedefContext ctx) {

    }

    @Override
    public void enterEnum_body(SmartParser.Enum_bodyContext ctx) {

    }

    @Override
    public void exitEnum_body(SmartParser.Enum_bodyContext ctx) {

    }

    @Override
    public void enterMember_stmt(SmartParser.Member_stmtContext ctx) {

    }

    @Override
    public void exitMember_stmt(SmartParser.Member_stmtContext ctx) {

    }

    @Override
    public void enterAbs_classdef(SmartParser.Abs_classdefContext ctx) {

    }

    @Override
    public void exitAbs_classdef(SmartParser.Abs_classdefContext ctx) {

    }

    @Override
    public void enterAbs_enumdef(SmartParser.Abs_enumdefContext ctx) {

    }

    @Override
    public void exitAbs_enumdef(SmartParser.Abs_enumdefContext ctx) {

    }

    @Override
    public void enterAbs_traitdef(SmartParser.Abs_traitdefContext ctx) {

    }

    @Override
    public void exitAbs_traitdef(SmartParser.Abs_traitdefContext ctx) {

    }

    @Override
    public void enterAbs_interfacedef(SmartParser.Abs_interfacedefContext ctx) {

    }

    @Override
    public void exitAbs_interfacedef(SmartParser.Abs_interfacedefContext ctx) {

    }

    @Override
    public void enterAbs_funcdef(SmartParser.Abs_funcdefContext ctx) {

    }

    @Override
    public void exitAbs_funcdef(SmartParser.Abs_funcdefContext ctx) {

    }

    @Override
    public void enterField_modifier(SmartParser.Field_modifierContext ctx) {

    }

    @Override
    public void exitField_modifier(SmartParser.Field_modifierContext ctx) {

    }

    @Override
    public void enterFielddef(SmartParser.FielddefContext ctx) {

    }

    @Override
    public void exitFielddef(SmartParser.FielddefContext ctx) {

    }

    @Override
    public void enterConstructor_stmt(SmartParser.Constructor_stmtContext ctx) {

    }

    @Override
    public void exitConstructor_stmt(SmartParser.Constructor_stmtContext ctx) {

    }

    @Override
    public void enterFunc_modifier(SmartParser.Func_modifierContext ctx) {

    }

    @Override
    public void exitFunc_modifier(SmartParser.Func_modifierContext ctx) {

    }

    @Override
    public void enterFuncdef(SmartParser.FuncdefContext ctx) {

    }

    @Override
    public void exitFuncdef(SmartParser.FuncdefContext ctx) {

    }

    @Override
    public void enterParameters(SmartParser.ParametersContext ctx) {

    }

    @Override
    public void exitParameters(SmartParser.ParametersContext ctx) {

    }

    @Override
    public void enterTypedargslist(SmartParser.TypedargslistContext ctx) {

    }

    @Override
    public void exitTypedargslist(SmartParser.TypedargslistContext ctx) {

    }

    @Override
    public void enterTfpdef(SmartParser.TfpdefContext ctx) {

    }

    @Override
    public void exitTfpdef(SmartParser.TfpdefContext ctx) {

    }

    @Override
    public void enterTypes(SmartParser.TypesContext ctx) {

    }

    @Override
    public void exitTypes(SmartParser.TypesContext ctx) {

    }

    @Override
    public void enterDotted_name(SmartParser.Dotted_nameContext ctx) {

    }

    @Override
    public void exitDotted_name(SmartParser.Dotted_nameContext ctx) {

    }

    @Override
    public void enterType(SmartParser.TypeContext ctx) {

    }

    @Override
    public void exitType(SmartParser.TypeContext ctx) {

    }

    @Override
    public void enterSuite(SmartParser.SuiteContext ctx) {

    }

    @Override
    public void exitSuite(SmartParser.SuiteContext ctx) {

    }

    @Override
    public void enterStmt(SmartParser.StmtContext ctx) {

    }

    @Override
    public void exitStmt(SmartParser.StmtContext ctx) {

    }

    @Override
    public void enterSimple_stmt(SmartParser.Simple_stmtContext ctx) {

    }

    @Override
    public void exitSimple_stmt(SmartParser.Simple_stmtContext ctx) {

    }

    @Override
    public void enterSmall_stmt(SmartParser.Small_stmtContext ctx) {

    }

    @Override
    public void exitSmall_stmt(SmartParser.Small_stmtContext ctx) {

    }

    @Override
    public void enterPass_stmt(SmartParser.Pass_stmtContext ctx) {

    }

    @Override
    public void exitPass_stmt(SmartParser.Pass_stmtContext ctx) {

    }

    @Override
    public void enterFlow_stmt(SmartParser.Flow_stmtContext ctx) {

    }

    @Override
    public void exitFlow_stmt(SmartParser.Flow_stmtContext ctx) {

    }

    @Override
    public void enterBreak_stmt(SmartParser.Break_stmtContext ctx) {

    }

    @Override
    public void exitBreak_stmt(SmartParser.Break_stmtContext ctx) {

    }

    @Override
    public void enterContinue_stmt(SmartParser.Continue_stmtContext ctx) {

    }

    @Override
    public void exitContinue_stmt(SmartParser.Continue_stmtContext ctx) {

    }

    @Override
    public void enterThrough_stmt(SmartParser.Through_stmtContext ctx) {

    }

    @Override
    public void exitThrough_stmt(SmartParser.Through_stmtContext ctx) {

    }

    @Override
    public void enterReturn_stmt(SmartParser.Return_stmtContext ctx) {

    }

    @Override
    public void exitReturn_stmt(SmartParser.Return_stmtContext ctx) {

    }

    @Override
    public void enterLabel_stmt(SmartParser.Label_stmtContext ctx) {

    }

    @Override
    public void exitLabel_stmt(SmartParser.Label_stmtContext ctx) {

    }

    @Override
    public void enterAssert_stmt(SmartParser.Assert_stmtContext ctx) {

    }

    @Override
    public void exitAssert_stmt(SmartParser.Assert_stmtContext ctx) {

    }

    @Override
    public void enterExpr_stmt(SmartParser.Expr_stmtContext ctx) {

    }

    @Override
    public void exitExpr_stmt(SmartParser.Expr_stmtContext ctx) {

    }

    @Override
    public void enterCompound_stmt(SmartParser.Compound_stmtContext ctx) {

    }

    @Override
    public void exitCompound_stmt(SmartParser.Compound_stmtContext ctx) {

    }

    @Override
    public void enterIf_stmt(SmartParser.If_stmtContext ctx) {

    }

    @Override
    public void exitIf_stmt(SmartParser.If_stmtContext ctx) {

    }

    @Override
    public void enterSwitch_stmt(SmartParser.Switch_stmtContext ctx) {

    }

    @Override
    public void exitSwitch_stmt(SmartParser.Switch_stmtContext ctx) {

    }

    @Override
    public void enterWhile_stmt(SmartParser.While_stmtContext ctx) {

    }

    @Override
    public void exitWhile_stmt(SmartParser.While_stmtContext ctx) {

    }

    @Override
    public void enterFor_stmt(SmartParser.For_stmtContext ctx) {

    }

    @Override
    public void exitFor_stmt(SmartParser.For_stmtContext ctx) {

    }

    @Override
    public void enterRep_stmt(SmartParser.Rep_stmtContext ctx) {

    }

    @Override
    public void exitRep_stmt(SmartParser.Rep_stmtContext ctx) {

    }

    @Override
    public void enterTry_stmt(SmartParser.Try_stmtContext ctx) {

    }

    @Override
    public void exitTry_stmt(SmartParser.Try_stmtContext ctx) {

    }

    @Override
    public void enterWith_stmt(SmartParser.With_stmtContext ctx) {

    }

    @Override
    public void exitWith_stmt(SmartParser.With_stmtContext ctx) {

    }

    @Override
    public void enterWith_item(SmartParser.With_itemContext ctx) {

    }

    @Override
    public void exitWith_item(SmartParser.With_itemContext ctx) {

    }

    @Override
    public void enterExcept_clause(SmartParser.Except_clauseContext ctx) {

    }

    @Override
    public void exitExcept_clause(SmartParser.Except_clauseContext ctx) {

    }

    @Override
    public void enterTest(SmartParser.TestContext ctx) {

    }

    @Override
    public void exitTest(SmartParser.TestContext ctx) {

    }

    @Override
    public void enterTestlist(SmartParser.TestlistContext ctx) {

    }

    @Override
    public void exitTestlist(SmartParser.TestlistContext ctx) {

    }

    @Override
    public void enterOr_test(SmartParser.Or_testContext ctx) {

    }

    @Override
    public void exitOr_test(SmartParser.Or_testContext ctx) {

    }

    @Override
    public void enterAnd_test(SmartParser.And_testContext ctx) {

    }

    @Override
    public void exitAnd_test(SmartParser.And_testContext ctx) {

    }

    @Override
    public void enterNot_test(SmartParser.Not_testContext ctx) {

    }

    @Override
    public void exitNot_test(SmartParser.Not_testContext ctx) {

    }

    @Override
    public void enterComparison(SmartParser.ComparisonContext ctx) {

    }

    @Override
    public void exitComparison(SmartParser.ComparisonContext ctx) {

    }

    @Override
    public void enterComp_op(SmartParser.Comp_opContext ctx) {

    }

    @Override
    public void exitComp_op(SmartParser.Comp_opContext ctx) {

    }

    @Override
    public void enterAugassign(SmartParser.AugassignContext ctx) {

    }

    @Override
    public void exitAugassign(SmartParser.AugassignContext ctx) {

    }

    @Override
    public void enterExpr(SmartParser.ExprContext ctx) {

    }

    @Override
    public void exitExpr(SmartParser.ExprContext ctx) {

    }

    @Override
    public void enterXor_expr(SmartParser.Xor_exprContext ctx) {

    }

    @Override
    public void exitXor_expr(SmartParser.Xor_exprContext ctx) {

    }

    @Override
    public void enterAnd_expr(SmartParser.And_exprContext ctx) {

    }

    @Override
    public void exitAnd_expr(SmartParser.And_exprContext ctx) {

    }

    @Override
    public void enterShift_expr(SmartParser.Shift_exprContext ctx) {

    }

    @Override
    public void exitShift_expr(SmartParser.Shift_exprContext ctx) {

    }

    @Override
    public void enterArith_expr(SmartParser.Arith_exprContext ctx) {

    }

    @Override
    public void exitArith_expr(SmartParser.Arith_exprContext ctx) {

    }

    @Override
    public void enterTerm(SmartParser.TermContext ctx) {

    }

    @Override
    public void exitTerm(SmartParser.TermContext ctx) {

    }

    @Override
    public void enterFactor(SmartParser.FactorContext ctx) {

    }

    @Override
    public void exitFactor(SmartParser.FactorContext ctx) {

    }

    @Override
    public void enterPower(SmartParser.PowerContext ctx) {

    }

    @Override
    public void exitPower(SmartParser.PowerContext ctx) {

    }

    @Override
    public void enterAtom_expr(SmartParser.Atom_exprContext ctx) {

    }

    @Override
    public void exitAtom_expr(SmartParser.Atom_exprContext ctx) {

    }

    @Override
    public void enterTrailer(SmartParser.TrailerContext ctx) {

    }

    @Override
    public void exitTrailer(SmartParser.TrailerContext ctx) {

    }

    @Override
    public void enterArglist(SmartParser.ArglistContext ctx) {

    }

    @Override
    public void exitArglist(SmartParser.ArglistContext ctx) {

    }

    @Override
    public void enterArgument(SmartParser.ArgumentContext ctx) {

    }

    @Override
    public void exitArgument(SmartParser.ArgumentContext ctx) {

    }

    @Override
    public void enterAtom(SmartParser.AtomContext ctx) {

    }

    @Override
    public void exitAtom(SmartParser.AtomContext ctx) {

    }

    @Override
    public void enterInteger_value(SmartParser.Integer_valueContext ctx) {

    }

    @Override
    public void exitInteger_value(SmartParser.Integer_valueContext ctx) {
        String text = ctx.value.getText();
        smartNodes.push(new LongNode(Long.parseLong(text)));
    }

    @Override
    public void enterFloat_value(SmartParser.Float_valueContext ctx) {

    }

    @Override
    public void exitFloat_value(SmartParser.Float_valueContext ctx) {

    }

    @Override
    public void enterTestlist_comp(SmartParser.Testlist_compContext ctx) {

    }

    @Override
    public void exitTestlist_comp(SmartParser.Testlist_compContext ctx) {

    }

    @Override
    public void enterDictorsetmaker(SmartParser.DictorsetmakerContext ctx) {

    }

    @Override
    public void exitDictorsetmaker(SmartParser.DictorsetmakerContext ctx) {

    }

    @Override
    public void enterComp_iter(SmartParser.Comp_iterContext ctx) {

    }

    @Override
    public void exitComp_iter(SmartParser.Comp_iterContext ctx) {

    }

    @Override
    public void enterComp_for(SmartParser.Comp_forContext ctx) {

    }

    @Override
    public void exitComp_for(SmartParser.Comp_forContext ctx) {

    }

    @Override
    public void enterExprlist(SmartParser.ExprlistContext ctx) {

    }

    @Override
    public void exitExprlist(SmartParser.ExprlistContext ctx) {

    }

    @Override
    public void enterComp_if(SmartParser.Comp_ifContext ctx) {

    }

    @Override
    public void exitComp_if(SmartParser.Comp_ifContext ctx) {

    }

    @Override
    public void enterNumber(SmartParser.NumberContext ctx) {

    }

    @Override
    public void exitNumber(SmartParser.NumberContext ctx) {

    }

    @Override
    public void enterDigit(SmartParser.DigitContext ctx) {

    }

    @Override
    public void exitDigit(SmartParser.DigitContext ctx) {

    }

    @Override
    public void enterInteger(SmartParser.IntegerContext ctx) {

    }

    @Override
    public void exitInteger(SmartParser.IntegerContext ctx) {

    }

    @Override
    public void enterFloat_number(SmartParser.Float_numberContext ctx) {

    }

    @Override
    public void exitFloat_number(SmartParser.Float_numberContext ctx) {

    }

    @Override
    public void enterPoint_float(SmartParser.Point_floatContext ctx) {

    }

    @Override
    public void exitPoint_float(SmartParser.Point_floatContext ctx) {

    }

    @Override
    public void enterExponent_float(SmartParser.Exponent_floatContext ctx) {

    }

    @Override
    public void exitExponent_float(SmartParser.Exponent_floatContext ctx) {

    }

    @Override
    public void enterFraction(SmartParser.FractionContext ctx) {

    }

    @Override
    public void exitFraction(SmartParser.FractionContext ctx) {

    }

    @Override
    public void enterExponent(SmartParser.ExponentContext ctx) {

    }

    @Override
    public void exitExponent(SmartParser.ExponentContext ctx) {

    }

    @Override
    public void enterInt_part(SmartParser.Int_partContext ctx) {

    }

    @Override
    public void exitInt_part(SmartParser.Int_partContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

    @Override
    public void visitErrorNode(ErrorNode node) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }
}
