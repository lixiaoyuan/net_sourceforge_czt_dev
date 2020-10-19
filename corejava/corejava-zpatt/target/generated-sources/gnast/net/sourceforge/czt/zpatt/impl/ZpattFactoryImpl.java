
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE CoreFactoryImpl.vm.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

-------------------------------------------------------------------------------

Copyright 2003, 2004, 2005, 2006, 2007 Mark Utting
This file is part of the czt project.

The czt project contains free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

The czt project is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with czt; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
******************************************************************************/

package net.sourceforge.czt.zpatt.impl;


/**
 * <p>An implementation of the object factory for constructing
 * concrete Z terms.  Each factory method returns an instance
 * of the corresponding class provided in this package.</p>
 *
 * @author GnAST version 1.6-cdh
 */
public class ZpattFactoryImpl
  extends net.sourceforge.czt.z.impl.ZFactoryImpl
  implements net.sourceforge.czt.zpatt.ast.ZpattFactory
{
  protected ZpattFactoryImpl(net.sourceforge.czt.util.Visitor<String> toStringVisitor)
  {
    super(toStringVisitor);
  }

  public ZpattFactoryImpl()
  {
    super(new net.sourceforge.czt.zpatt.util.PrintVisitor());
  }

  public net.sourceforge.czt.zpatt.ast.JokerNameList createJokerNameList()
  {
    net.sourceforge.czt.zpatt.ast.JokerNameList zedObject = new net.sourceforge.czt.zpatt.impl.JokerNameListImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerNameList createJokerNameList( String  name, String  id)
  {
    net.sourceforge.czt.zpatt.ast.JokerNameList zedObject = createJokerNameList();
    zedObject.setName(name);
    zedObject.setId(id);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerDeclList createJokerDeclList()
  {
    net.sourceforge.czt.zpatt.ast.JokerDeclList zedObject = new net.sourceforge.czt.zpatt.impl.JokerDeclListImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerDeclList createJokerDeclList( String  name, String  id)
  {
    net.sourceforge.czt.zpatt.ast.JokerDeclList zedObject = createJokerDeclList();
    zedObject.setName(name);
    zedObject.setId(id);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerNameListBinding createJokerNameListBinding()
  {
    net.sourceforge.czt.zpatt.ast.JokerNameListBinding zedObject = new net.sourceforge.czt.zpatt.impl.JokerNameListBindingImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerNameListBinding createJokerNameListBinding( net.sourceforge.czt.zpatt.ast.JokerNameList  jokerNameList, net.sourceforge.czt.z.ast.NameList  nameList)
  {
    net.sourceforge.czt.zpatt.ast.JokerNameListBinding zedObject = createJokerNameListBinding();
    zedObject.setJokerNameList(jokerNameList);
    zedObject.setNameList(nameList);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerExprListBinding createJokerExprListBinding()
  {
    net.sourceforge.czt.zpatt.ast.JokerExprListBinding zedObject = new net.sourceforge.czt.zpatt.impl.JokerExprListBindingImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerExprListBinding createJokerExprListBinding( net.sourceforge.czt.zpatt.ast.JokerExprList  jokerExprList, net.sourceforge.czt.z.ast.ExprList  exprList)
  {
    net.sourceforge.czt.zpatt.ast.JokerExprListBinding zedObject = createJokerExprListBinding();
    zedObject.setJokerExprList(jokerExprList);
    zedObject.setExprList(exprList);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerExpr createJokerExpr()
  {
    net.sourceforge.czt.zpatt.ast.JokerExpr zedObject = new net.sourceforge.czt.zpatt.impl.JokerExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerExpr createJokerExpr( String  name, String  id)
  {
    net.sourceforge.czt.zpatt.ast.JokerExpr zedObject = createJokerExpr();
    zedObject.setName(name);
    zedObject.setId(id);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerStroke createJokerStroke()
  {
    net.sourceforge.czt.zpatt.ast.JokerStroke zedObject = new net.sourceforge.czt.zpatt.impl.JokerStrokeImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerStroke createJokerStroke( String  name, String  id)
  {
    net.sourceforge.czt.zpatt.ast.JokerStroke zedObject = createJokerStroke();
    zedObject.setName(name);
    zedObject.setId(id);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.OracleAppl createOracleAppl()
  {
    net.sourceforge.czt.zpatt.ast.OracleAppl zedObject = new net.sourceforge.czt.zpatt.impl.OracleApplImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.OracleAppl createOracleAppl(java.util.List<? extends net.sourceforge.czt.zpatt.ast.Binding>
 binding, net.sourceforge.czt.zpatt.ast.OracleAnswer  oracleAnswer, String  name)
  {
    net.sourceforge.czt.zpatt.ast.OracleAppl zedObject = createOracleAppl();
    if (binding != null) {
      zedObject.getBinding().addAll(binding);
    }
    zedObject.setOracleAnswer(oracleAnswer);
    zedObject.setName(name);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerRenameListBinding createJokerRenameListBinding()
  {
    net.sourceforge.czt.zpatt.ast.JokerRenameListBinding zedObject = new net.sourceforge.czt.zpatt.impl.JokerRenameListBindingImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerRenameListBinding createJokerRenameListBinding( net.sourceforge.czt.zpatt.ast.JokerRenameList  jokerRenameList, net.sourceforge.czt.z.ast.RenameList  renameList)
  {
    net.sourceforge.czt.zpatt.ast.JokerRenameListBinding zedObject = createJokerRenameListBinding();
    zedObject.setJokerRenameList(jokerRenameList);
    zedObject.setRenameList(renameList);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.Jokers createJokers()
  {
    net.sourceforge.czt.zpatt.ast.Jokers zedObject = new net.sourceforge.czt.zpatt.impl.JokersImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.Jokers createJokers(java.util.List<? extends String>
 name,net.sourceforge.czt.zpatt.ast.JokerType
 jokerType)
  {
    net.sourceforge.czt.zpatt.ast.Jokers zedObject = createJokers();
    if (name != null) {
      zedObject.getName().addAll(name);
    }
    zedObject.setJokerType(jokerType);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerName createJokerName()
  {
    net.sourceforge.czt.zpatt.ast.JokerName zedObject = new net.sourceforge.czt.zpatt.impl.JokerNameImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerName createJokerName( String  name, String  id)
  {
    net.sourceforge.czt.zpatt.ast.JokerName zedObject = createJokerName();
    zedObject.setName(name);
    zedObject.setId(id);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.SequentList createSequentList()
  {
    net.sourceforge.czt.zpatt.ast.SequentList zedObject = new net.sourceforge.czt.zpatt.impl.SequentListImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.SequentList createSequentList(java.util.List<? extends net.sourceforge.czt.zpatt.ast.Sequent>
 sequent)
  {
    net.sourceforge.czt.zpatt.ast.SequentList zedObject = createSequentList();
    if (sequent != null) {
      zedObject.getSequent().addAll(sequent);
    }
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.Oracle createOracle()
  {
    net.sourceforge.czt.zpatt.ast.Oracle zedObject = new net.sourceforge.czt.zpatt.impl.OracleImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.Oracle createOracle( net.sourceforge.czt.zpatt.ast.Sequent  sequent, String  name)
  {
    net.sourceforge.czt.zpatt.ast.Oracle zedObject = createOracle();
    zedObject.setSequent(sequent);
    zedObject.setName(name);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.HeadDeclList createHeadDeclList()
  {
    net.sourceforge.czt.zpatt.ast.HeadDeclList zedObject = new net.sourceforge.czt.zpatt.impl.HeadDeclListImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.HeadDeclList createHeadDeclList( net.sourceforge.czt.z.ast.ZDeclList  zDeclList, net.sourceforge.czt.zpatt.ast.JokerDeclList  jokerDeclList)
  {
    net.sourceforge.czt.zpatt.ast.HeadDeclList zedObject = createHeadDeclList();
    zedObject.setZDeclList(zDeclList);
    zedObject.setJokerDeclList(jokerDeclList);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerStrokeBinding createJokerStrokeBinding()
  {
    net.sourceforge.czt.zpatt.ast.JokerStrokeBinding zedObject = new net.sourceforge.czt.zpatt.impl.JokerStrokeBindingImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerStrokeBinding createJokerStrokeBinding( net.sourceforge.czt.zpatt.ast.JokerStroke  jokerStroke, net.sourceforge.czt.z.ast.Stroke  stroke)
  {
    net.sourceforge.czt.zpatt.ast.JokerStrokeBinding zedObject = createJokerStrokeBinding();
    zedObject.setJokerStroke(jokerStroke);
    zedObject.setStroke(stroke);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerPredBinding createJokerPredBinding()
  {
    net.sourceforge.czt.zpatt.ast.JokerPredBinding zedObject = new net.sourceforge.czt.zpatt.impl.JokerPredBindingImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerPredBinding createJokerPredBinding( net.sourceforge.czt.zpatt.ast.JokerPred  jokerPred, net.sourceforge.czt.z.ast.Pred  pred)
  {
    net.sourceforge.czt.zpatt.ast.JokerPredBinding zedObject = createJokerPredBinding();
    zedObject.setJokerPred(jokerPred);
    zedObject.setPred(pred);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerExprBinding createJokerExprBinding()
  {
    net.sourceforge.czt.zpatt.ast.JokerExprBinding zedObject = new net.sourceforge.czt.zpatt.impl.JokerExprBindingImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerExprBinding createJokerExprBinding( net.sourceforge.czt.zpatt.ast.JokerExpr  jokerExpr, net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.zpatt.ast.JokerExprBinding zedObject = createJokerExprBinding();
    zedObject.setJokerExpr(jokerExpr);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerNameBinding createJokerNameBinding()
  {
    net.sourceforge.czt.zpatt.ast.JokerNameBinding zedObject = new net.sourceforge.czt.zpatt.impl.JokerNameBindingImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerNameBinding createJokerNameBinding( net.sourceforge.czt.zpatt.ast.JokerName  jokerName, net.sourceforge.czt.z.ast.Name  name)
  {
    net.sourceforge.czt.zpatt.ast.JokerNameBinding zedObject = createJokerNameBinding();
    zedObject.setJokerName(jokerName);
    zedObject.setName(name);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.CheckPassed createCheckPassed()
  {
    net.sourceforge.czt.zpatt.ast.CheckPassed zedObject = new net.sourceforge.czt.zpatt.impl.CheckPassedImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.CheckPassed createCheckPassed(java.util.List<? extends net.sourceforge.czt.zpatt.ast.Binding>
 binding)
  {
    net.sourceforge.czt.zpatt.ast.CheckPassed zedObject = createCheckPassed();
    if (binding != null) {
      zedObject.getBinding().addAll(binding);
    }
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerRenameList createJokerRenameList()
  {
    net.sourceforge.czt.zpatt.ast.JokerRenameList zedObject = new net.sourceforge.czt.zpatt.impl.JokerRenameListImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerRenameList createJokerRenameList( String  name, String  id)
  {
    net.sourceforge.czt.zpatt.ast.JokerRenameList zedObject = createJokerRenameList();
    zedObject.setName(name);
    zedObject.setId(id);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerExprList createJokerExprList()
  {
    net.sourceforge.czt.zpatt.ast.JokerExprList zedObject = new net.sourceforge.czt.zpatt.impl.JokerExprListImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerExprList createJokerExprList( String  name, String  id)
  {
    net.sourceforge.czt.zpatt.ast.JokerExprList zedObject = createJokerExprList();
    zedObject.setName(name);
    zedObject.setId(id);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.RuleAppl createRuleAppl()
  {
    net.sourceforge.czt.zpatt.ast.RuleAppl zedObject = new net.sourceforge.czt.zpatt.impl.RuleApplImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.RuleAppl createRuleAppl(java.util.List<? extends net.sourceforge.czt.zpatt.ast.Binding>
 binding, net.sourceforge.czt.zpatt.ast.SequentList  sequentList, String  name)
  {
    net.sourceforge.czt.zpatt.ast.RuleAppl zedObject = createRuleAppl();
    if (binding != null) {
      zedObject.getBinding().addAll(binding);
    }
    zedObject.setSequentList(sequentList);
    zedObject.setName(name);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.Sequent createSequent()
  {
    net.sourceforge.czt.zpatt.ast.Sequent zedObject = new net.sourceforge.czt.zpatt.impl.SequentImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.Sequent createSequent( net.sourceforge.czt.zpatt.ast.SequentContext  sequentContext, net.sourceforge.czt.z.ast.Pred  pred)
  {
    net.sourceforge.czt.zpatt.ast.Sequent zedObject = createSequent();
    zedObject.setSequentContext(sequentContext);
    zedObject.setPred(pred);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.SequentContext createSequentContext()
  {
    net.sourceforge.czt.zpatt.ast.SequentContext zedObject = new net.sourceforge.czt.zpatt.impl.SequentContextImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.Rule createRule()
  {
    net.sourceforge.czt.zpatt.ast.Rule zedObject = new net.sourceforge.czt.zpatt.impl.RuleImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.Rule createRule( net.sourceforge.czt.zpatt.ast.Sequent  sequent, String  name, net.sourceforge.czt.zpatt.ast.SequentList  premisses)
  {
    net.sourceforge.czt.zpatt.ast.Rule zedObject = createRule();
    zedObject.setSequent(sequent);
    zedObject.setName(name);
    zedObject.setPremisses(premisses);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerDeclListBinding createJokerDeclListBinding()
  {
    net.sourceforge.czt.zpatt.ast.JokerDeclListBinding zedObject = new net.sourceforge.czt.zpatt.impl.JokerDeclListBindingImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerDeclListBinding createJokerDeclListBinding( net.sourceforge.czt.zpatt.ast.JokerDeclList  jokerDeclList, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    net.sourceforge.czt.zpatt.ast.JokerDeclListBinding zedObject = createJokerDeclListBinding();
    zedObject.setJokerDeclList(jokerDeclList);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerPred createJokerPred()
  {
    net.sourceforge.czt.zpatt.ast.JokerPred zedObject = new net.sourceforge.czt.zpatt.impl.JokerPredImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.zpatt.ast.JokerPred createJokerPred( String  name, String  id)
  {
    net.sourceforge.czt.zpatt.ast.JokerPred zedObject = createJokerPred();
    zedObject.setName(name);
    zedObject.setId(id);
    return zedObject;
  }

}
