// Generated from Smart.g4 by ANTLR 4.7.2

    package com.github.javakky.smart.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmartParser}.
 */
public interface SmartListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmartParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SmartParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SmartParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#classfile}.
	 * @param ctx the parse tree
	 */
	void enterClassfile(SmartParser.ClassfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#classfile}.
	 * @param ctx the parse tree
	 */
	void exitClassfile(SmartParser.ClassfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#funcfile}.
	 * @param ctx the parse tree
	 */
	void enterFuncfile(SmartParser.FuncfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#funcfile}.
	 * @param ctx the parse tree
	 */
	void exitFuncfile(SmartParser.FuncfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(SmartParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(SmartParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(SmartParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(SmartParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#class_modifier}.
	 * @param ctx the parse tree
	 */
	void enterClass_modifier(SmartParser.Class_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#class_modifier}.
	 * @param ctx the parse tree
	 */
	void exitClass_modifier(SmartParser.Class_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(SmartParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(SmartParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#dotlist}.
	 * @param ctx the parse tree
	 */
	void enterDotlist(SmartParser.DotlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#dotlist}.
	 * @param ctx the parse tree
	 */
	void exitDotlist(SmartParser.DotlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(SmartParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(SmartParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#class_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClass_body_stmt(SmartParser.Class_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#class_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClass_body_stmt(SmartParser.Class_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#enumdef}.
	 * @param ctx the parse tree
	 */
	void enterEnumdef(SmartParser.EnumdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#enumdef}.
	 * @param ctx the parse tree
	 */
	void exitEnumdef(SmartParser.EnumdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#traitdef}.
	 * @param ctx the parse tree
	 */
	void enterTraitdef(SmartParser.TraitdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#traitdef}.
	 * @param ctx the parse tree
	 */
	void exitTraitdef(SmartParser.TraitdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#interfacedef}.
	 * @param ctx the parse tree
	 */
	void enterInterfacedef(SmartParser.InterfacedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#interfacedef}.
	 * @param ctx the parse tree
	 */
	void exitInterfacedef(SmartParser.InterfacedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#enum_body}.
	 * @param ctx the parse tree
	 */
	void enterEnum_body(SmartParser.Enum_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#enum_body}.
	 * @param ctx the parse tree
	 */
	void exitEnum_body(SmartParser.Enum_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#member_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMember_stmt(SmartParser.Member_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#member_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMember_stmt(SmartParser.Member_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#abs_classdef}.
	 * @param ctx the parse tree
	 */
	void enterAbs_classdef(SmartParser.Abs_classdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#abs_classdef}.
	 * @param ctx the parse tree
	 */
	void exitAbs_classdef(SmartParser.Abs_classdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#abs_enumdef}.
	 * @param ctx the parse tree
	 */
	void enterAbs_enumdef(SmartParser.Abs_enumdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#abs_enumdef}.
	 * @param ctx the parse tree
	 */
	void exitAbs_enumdef(SmartParser.Abs_enumdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#abs_traitdef}.
	 * @param ctx the parse tree
	 */
	void enterAbs_traitdef(SmartParser.Abs_traitdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#abs_traitdef}.
	 * @param ctx the parse tree
	 */
	void exitAbs_traitdef(SmartParser.Abs_traitdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#abs_interfacedef}.
	 * @param ctx the parse tree
	 */
	void enterAbs_interfacedef(SmartParser.Abs_interfacedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#abs_interfacedef}.
	 * @param ctx the parse tree
	 */
	void exitAbs_interfacedef(SmartParser.Abs_interfacedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#abs_funcdef}.
	 * @param ctx the parse tree
	 */
	void enterAbs_funcdef(SmartParser.Abs_funcdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#abs_funcdef}.
	 * @param ctx the parse tree
	 */
	void exitAbs_funcdef(SmartParser.Abs_funcdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#field_modifier}.
	 * @param ctx the parse tree
	 */
	void enterField_modifier(SmartParser.Field_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#field_modifier}.
	 * @param ctx the parse tree
	 */
	void exitField_modifier(SmartParser.Field_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#fielddef}.
	 * @param ctx the parse tree
	 */
	void enterFielddef(SmartParser.FielddefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#fielddef}.
	 * @param ctx the parse tree
	 */
	void exitFielddef(SmartParser.FielddefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#constructor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_stmt(SmartParser.Constructor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#constructor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_stmt(SmartParser.Constructor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#func_modifier}.
	 * @param ctx the parse tree
	 */
	void enterFunc_modifier(SmartParser.Func_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#func_modifier}.
	 * @param ctx the parse tree
	 */
	void exitFunc_modifier(SmartParser.Func_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(SmartParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(SmartParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(SmartParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(SmartParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(SmartParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(SmartParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(SmartParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(SmartParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(SmartParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(SmartParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(SmartParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(SmartParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SmartParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SmartParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(SmartParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(SmartParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SmartParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SmartParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(SmartParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(SmartParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(SmartParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(SmartParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(SmartParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(SmartParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(SmartParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(SmartParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(SmartParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(SmartParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(SmartParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(SmartParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#through_stmt}.
	 * @param ctx the parse tree
	 */
	void enterThrough_stmt(SmartParser.Through_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#through_stmt}.
	 * @param ctx the parse tree
	 */
	void exitThrough_stmt(SmartParser.Through_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(SmartParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(SmartParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#label_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLabel_stmt(SmartParser.Label_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#label_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLabel_stmt(SmartParser.Label_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(SmartParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(SmartParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(SmartParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(SmartParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(SmartParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(SmartParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(SmartParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(SmartParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stmt(SmartParser.Switch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stmt(SmartParser.Switch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(SmartParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(SmartParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(SmartParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(SmartParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#rep_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRep_stmt(SmartParser.Rep_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#rep_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRep_stmt(SmartParser.Rep_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(SmartParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(SmartParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(SmartParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(SmartParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(SmartParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(SmartParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(SmartParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(SmartParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(SmartParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(SmartParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(SmartParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(SmartParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(SmartParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(SmartParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(SmartParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(SmartParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(SmartParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(SmartParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SmartParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SmartParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(SmartParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(SmartParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(SmartParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(SmartParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SmartParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SmartParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(SmartParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(SmartParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(SmartParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(SmartParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(SmartParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(SmartParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(SmartParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(SmartParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SmartParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SmartParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SmartParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SmartParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(SmartParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(SmartParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(SmartParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(SmartParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(SmartParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(SmartParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(SmartParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(SmartParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(SmartParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(SmartParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(SmartParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(SmartParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#integer_value}.
	 * @param ctx the parse tree
	 */
	void enterInteger_value(SmartParser.Integer_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#integer_value}.
	 * @param ctx the parse tree
	 */
	void exitInteger_value(SmartParser.Integer_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#float_value}.
	 * @param ctx the parse tree
	 */
	void enterFloat_value(SmartParser.Float_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#float_value}.
	 * @param ctx the parse tree
	 */
	void exitFloat_value(SmartParser.Float_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(SmartParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(SmartParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(SmartParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(SmartParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(SmartParser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(SmartParser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(SmartParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(SmartParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(SmartParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(SmartParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(SmartParser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(SmartParser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SmartParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SmartParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(SmartParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(SmartParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(SmartParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(SmartParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#float_number}.
	 * @param ctx the parse tree
	 */
	void enterFloat_number(SmartParser.Float_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#float_number}.
	 * @param ctx the parse tree
	 */
	void exitFloat_number(SmartParser.Float_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#point_float}.
	 * @param ctx the parse tree
	 */
	void enterPoint_float(SmartParser.Point_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#point_float}.
	 * @param ctx the parse tree
	 */
	void exitPoint_float(SmartParser.Point_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#exponent_float}.
	 * @param ctx the parse tree
	 */
	void enterExponent_float(SmartParser.Exponent_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#exponent_float}.
	 * @param ctx the parse tree
	 */
	void exitExponent_float(SmartParser.Exponent_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(SmartParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(SmartParser.FractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(SmartParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(SmartParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmartParser#int_part}.
	 * @param ctx the parse tree
	 */
	void enterInt_part(SmartParser.Int_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmartParser#int_part}.
	 * @param ctx the parse tree
	 */
	void exitInt_part(SmartParser.Int_partContext ctx);
}