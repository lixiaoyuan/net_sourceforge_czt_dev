
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

package net.sourceforge.czt.oz.impl;


/**
 * <p>An implementation of the object factory for constructing
 * concrete Z terms.  Each factory method returns an instance
 * of the corresponding class provided in this package.</p>
 *
 * @author GnAST version 1.6-cdh
 */
public class OzFactoryImpl
  extends net.sourceforge.czt.zpatt.impl.ZpattFactoryImpl
  implements net.sourceforge.czt.oz.ast.OzFactory
{
  protected OzFactoryImpl(net.sourceforge.czt.util.Visitor<String> toStringVisitor)
  {
    super(toStringVisitor);
  }

  public OzFactoryImpl()
  {
    super(new net.sourceforge.czt.oz.util.PrintVisitor());
  }

  public net.sourceforge.czt.oz.ast.PrimaryDecl createPrimaryDecl()
  {
    net.sourceforge.czt.oz.ast.PrimaryDecl zedObject = new net.sourceforge.czt.oz.impl.PrimaryDeclImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.PrimaryDecl createPrimaryDecl( net.sourceforge.czt.z.ast.DeclList  declList)
  {
    net.sourceforge.czt.oz.ast.PrimaryDecl zedObject = createPrimaryDecl();
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.OpPromotionExpr createOpPromotionExpr()
  {
    net.sourceforge.czt.oz.ast.OpPromotionExpr zedObject = new net.sourceforge.czt.oz.impl.OpPromotionExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.OpPromotionExpr createOpPromotionExpr( net.sourceforge.czt.z.ast.Expr  expr, net.sourceforge.czt.z.ast.Name  name)
  {
    net.sourceforge.czt.oz.ast.OpPromotionExpr zedObject = createOpPromotionExpr();
    zedObject.setExpr(expr);
    zedObject.setName(name);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassPara createClassPara()
  {
    net.sourceforge.czt.oz.ast.ClassPara zedObject = new net.sourceforge.czt.oz.impl.ClassParaImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassPara createClassPara( net.sourceforge.czt.z.ast.Name  name, net.sourceforge.czt.z.ast.NameList  nameList, net.sourceforge.czt.oz.ast.VisibilityList  visibilityList, net.sourceforge.czt.z.ast.ExprList  inheritedClass,java.util.List<? extends net.sourceforge.czt.z.ast.Para>
 localDef, net.sourceforge.czt.oz.ast.State  state, net.sourceforge.czt.oz.ast.InitialState  initialState,java.util.List<? extends net.sourceforge.czt.oz.ast.Operation>
 operation)
  {
    net.sourceforge.czt.oz.ast.ClassPara zedObject = createClassPara();
    zedObject.setName(name);
    zedObject.setNameList(nameList);
    zedObject.setVisibilityList(visibilityList);
    zedObject.setInheritedClass(inheritedClass);
    if (localDef != null) {
      zedObject.getLocalDef().addAll(localDef);
    }
    zedObject.setState(state);
    zedObject.setInitialState(initialState);
    if (operation != null) {
      zedObject.getOperation().addAll(operation);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassRef createClassRef()
  {
    net.sourceforge.czt.oz.ast.ClassRef zedObject = new net.sourceforge.czt.oz.impl.ClassRefImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassRef createClassRef( net.sourceforge.czt.z.ast.ZName  name,java.util.List<? extends net.sourceforge.czt.z.ast.Type2>
 type,java.util.List<? extends net.sourceforge.czt.z.ast.NewOldPair>
 newOldPair)
  {
    net.sourceforge.czt.oz.ast.ClassRef zedObject = createClassRef();
    zedObject.setName(name);
    if (type != null) {
      zedObject.getType().addAll(type);
    }
    if (newOldPair != null) {
      zedObject.getNewOldPair().addAll(newOldPair);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.DeltaList createDeltaList()
  {
    net.sourceforge.czt.oz.ast.DeltaList zedObject = new net.sourceforge.czt.oz.impl.DeltaListImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.DeltaList createDeltaList(java.util.List<? extends net.sourceforge.czt.z.ast.Name>
 name)
  {
    net.sourceforge.czt.oz.ast.DeltaList zedObject = createDeltaList();
    if (name != null) {
      zedObject.getName().addAll(name);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.VisibilityList createVisibilityList()
  {
    net.sourceforge.czt.oz.ast.VisibilityList zedObject = new net.sourceforge.czt.oz.impl.VisibilityListImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.VisibilityList createVisibilityList(java.util.List<? extends net.sourceforge.czt.z.ast.ZName>
 zName)
  {
    net.sourceforge.czt.oz.ast.VisibilityList zedObject = createVisibilityList();
    if (zName != null) {
      zedObject.getZName().addAll(zName);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.PolyExpr createPolyExpr()
  {
    net.sourceforge.czt.oz.ast.PolyExpr zedObject = new net.sourceforge.czt.oz.impl.PolyExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.PolyExpr createPolyExpr( net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.oz.ast.PolyExpr zedObject = createPolyExpr();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ConjOpExpr createConjOpExpr()
  {
    net.sourceforge.czt.oz.ast.ConjOpExpr zedObject = new net.sourceforge.czt.oz.impl.ConjOpExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ConjOpExpr createConjOpExpr(java.util.List<? extends net.sourceforge.czt.oz.ast.OpExpr>
 opExpr)
  {
    net.sourceforge.czt.oz.ast.ConjOpExpr zedObject = createConjOpExpr();
    if (opExpr != null) {
      zedObject.getOpExpr().addAll(opExpr);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.Operation createOperation()
  {
    net.sourceforge.czt.oz.ast.Operation zedObject = new net.sourceforge.czt.oz.impl.OperationImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.Operation createOperation( net.sourceforge.czt.z.ast.Name  name, net.sourceforge.czt.oz.ast.OpExpr  opExpr,net.sourceforge.czt.z.ast.Box
 box)
  {
    net.sourceforge.czt.oz.ast.Operation zedObject = createOperation();
    zedObject.setName(name);
    zedObject.setOpExpr(opExpr);
    zedObject.setBox(box);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.NameSignaturePair createNameSignaturePair()
  {
    net.sourceforge.czt.oz.ast.NameSignaturePair zedObject = new net.sourceforge.czt.oz.impl.NameSignaturePairImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.NameSignaturePair createNameSignaturePair( net.sourceforge.czt.z.ast.Name  name, net.sourceforge.czt.z.ast.Signature  signature)
  {
    net.sourceforge.czt.oz.ast.NameSignaturePair zedObject = createNameSignaturePair();
    zedObject.setName(name);
    zedObject.setSignature(signature);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.AssoParallelOpExpr createAssoParallelOpExpr()
  {
    net.sourceforge.czt.oz.ast.AssoParallelOpExpr zedObject = new net.sourceforge.czt.oz.impl.AssoParallelOpExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.AssoParallelOpExpr createAssoParallelOpExpr(java.util.List<? extends net.sourceforge.czt.oz.ast.OpExpr>
 opExpr)
  {
    net.sourceforge.czt.oz.ast.AssoParallelOpExpr zedObject = createAssoParallelOpExpr();
    if (opExpr != null) {
      zedObject.getOpExpr().addAll(opExpr);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.DistConjOpExpr createDistConjOpExpr()
  {
    net.sourceforge.czt.oz.ast.DistConjOpExpr zedObject = new net.sourceforge.czt.oz.impl.DistConjOpExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.DistConjOpExpr createDistConjOpExpr( net.sourceforge.czt.z.ast.SchText  schText, net.sourceforge.czt.oz.ast.OpExpr  opExpr)
  {
    net.sourceforge.czt.oz.ast.DistConjOpExpr zedObject = createDistConjOpExpr();
    zedObject.setSchText(schText);
    zedObject.setOpExpr(opExpr);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.DistChoiceOpExpr createDistChoiceOpExpr()
  {
    net.sourceforge.czt.oz.ast.DistChoiceOpExpr zedObject = new net.sourceforge.czt.oz.impl.DistChoiceOpExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.DistChoiceOpExpr createDistChoiceOpExpr( net.sourceforge.czt.z.ast.SchText  schText, net.sourceforge.czt.oz.ast.OpExpr  opExpr)
  {
    net.sourceforge.czt.oz.ast.DistChoiceOpExpr zedObject = createDistChoiceOpExpr();
    zedObject.setSchText(schText);
    zedObject.setOpExpr(opExpr);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.SeqOpExpr createSeqOpExpr()
  {
    net.sourceforge.czt.oz.ast.SeqOpExpr zedObject = new net.sourceforge.czt.oz.impl.SeqOpExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.SeqOpExpr createSeqOpExpr(java.util.List<? extends net.sourceforge.czt.oz.ast.OpExpr>
 opExpr)
  {
    net.sourceforge.czt.oz.ast.SeqOpExpr zedObject = createSeqOpExpr();
    if (opExpr != null) {
      zedObject.getOpExpr().addAll(opExpr);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ScopeEnrichOpExpr createScopeEnrichOpExpr()
  {
    net.sourceforge.czt.oz.ast.ScopeEnrichOpExpr zedObject = new net.sourceforge.czt.oz.impl.ScopeEnrichOpExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ScopeEnrichOpExpr createScopeEnrichOpExpr(java.util.List<? extends net.sourceforge.czt.oz.ast.OpExpr>
 opExpr)
  {
    net.sourceforge.czt.oz.ast.ScopeEnrichOpExpr zedObject = createScopeEnrichOpExpr();
    if (opExpr != null) {
      zedObject.getOpExpr().addAll(opExpr);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassUnionType createClassUnionType()
  {
    net.sourceforge.czt.oz.ast.ClassUnionType zedObject = new net.sourceforge.czt.oz.impl.ClassUnionTypeImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassUnionType createClassUnionType( net.sourceforge.czt.oz.ast.ClassRefList  classes, net.sourceforge.czt.z.ast.Signature  state,java.util.List<? extends net.sourceforge.czt.z.ast.NameTypePair>
 attribute,java.util.List<? extends net.sourceforge.czt.oz.ast.NameSignaturePair>
 operation)
  {
    net.sourceforge.czt.oz.ast.ClassUnionType zedObject = createClassUnionType();
    zedObject.setClasses(classes);
    zedObject.setState(state);
    if (attribute != null) {
      zedObject.getAttribute().addAll(attribute);
    }
    if (operation != null) {
      zedObject.getOperation().addAll(operation);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassRefList createClassRefList()
  {
    net.sourceforge.czt.oz.ast.ClassRefList zedObject = new net.sourceforge.czt.oz.impl.ClassRefListImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassRefList createClassRefList(java.util.List<? extends net.sourceforge.czt.oz.ast.ClassRef>
 classRef)
  {
    net.sourceforge.czt.oz.ast.ClassRefList zedObject = createClassRefList();
    if (classRef != null) {
      zedObject.getClassRef().addAll(classRef);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.SecondaryDecl createSecondaryDecl()
  {
    net.sourceforge.czt.oz.ast.SecondaryDecl zedObject = new net.sourceforge.czt.oz.impl.SecondaryDeclImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.SecondaryDecl createSecondaryDecl( net.sourceforge.czt.z.ast.DeclList  declList)
  {
    net.sourceforge.czt.oz.ast.SecondaryDecl zedObject = createSecondaryDecl();
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.RenameOpExpr createRenameOpExpr()
  {
    net.sourceforge.czt.oz.ast.RenameOpExpr zedObject = new net.sourceforge.czt.oz.impl.RenameOpExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.RenameOpExpr createRenameOpExpr( net.sourceforge.czt.oz.ast.OpExpr  opExpr, net.sourceforge.czt.z.ast.RenameList  renameList)
  {
    net.sourceforge.czt.oz.ast.RenameOpExpr zedObject = createRenameOpExpr();
    zedObject.setOpExpr(opExpr);
    zedObject.setRenameList(renameList);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ParallelOpExpr createParallelOpExpr()
  {
    net.sourceforge.czt.oz.ast.ParallelOpExpr zedObject = new net.sourceforge.czt.oz.impl.ParallelOpExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ParallelOpExpr createParallelOpExpr(java.util.List<? extends net.sourceforge.czt.oz.ast.OpExpr>
 opExpr)
  {
    net.sourceforge.czt.oz.ast.ParallelOpExpr zedObject = createParallelOpExpr();
    if (opExpr != null) {
      zedObject.getOpExpr().addAll(opExpr);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.DistSeqOpExpr createDistSeqOpExpr()
  {
    net.sourceforge.czt.oz.ast.DistSeqOpExpr zedObject = new net.sourceforge.czt.oz.impl.DistSeqOpExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.DistSeqOpExpr createDistSeqOpExpr( net.sourceforge.czt.z.ast.SchText  schText, net.sourceforge.czt.oz.ast.OpExpr  opExpr)
  {
    net.sourceforge.czt.oz.ast.DistSeqOpExpr zedObject = createDistSeqOpExpr();
    zedObject.setSchText(schText);
    zedObject.setOpExpr(opExpr);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassRefType createClassRefType()
  {
    net.sourceforge.czt.oz.ast.ClassRefType zedObject = new net.sourceforge.czt.oz.impl.ClassRefTypeImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassRefType createClassRefType( net.sourceforge.czt.oz.ast.ClassRefList  classes, net.sourceforge.czt.z.ast.Signature  state,java.util.List<? extends net.sourceforge.czt.z.ast.NameTypePair>
 attribute,java.util.List<? extends net.sourceforge.czt.oz.ast.NameSignaturePair>
 operation, net.sourceforge.czt.oz.ast.ClassRef  thisClass, net.sourceforge.czt.oz.ast.ClassRefList  superClass, net.sourceforge.czt.oz.ast.VisibilityList  visibilityList,java.util.List<? extends net.sourceforge.czt.z.ast.Name>
 primary)
  {
    net.sourceforge.czt.oz.ast.ClassRefType zedObject = createClassRefType();
    zedObject.setClasses(classes);
    zedObject.setState(state);
    if (attribute != null) {
      zedObject.getAttribute().addAll(attribute);
    }
    if (operation != null) {
      zedObject.getOperation().addAll(operation);
    }
    zedObject.setThisClass(thisClass);
    zedObject.setSuperClass(superClass);
    zedObject.setVisibilityList(visibilityList);
    if (primary != null) {
      zedObject.getPrimary().addAll(primary);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.HideOpExpr createHideOpExpr()
  {
    net.sourceforge.czt.oz.ast.HideOpExpr zedObject = new net.sourceforge.czt.oz.impl.HideOpExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.HideOpExpr createHideOpExpr( net.sourceforge.czt.oz.ast.OpExpr  opExpr, net.sourceforge.czt.z.ast.NameList  nameList)
  {
    net.sourceforge.czt.oz.ast.HideOpExpr zedObject = createHideOpExpr();
    zedObject.setOpExpr(opExpr);
    zedObject.setNameList(nameList);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ContainmentExpr createContainmentExpr()
  {
    net.sourceforge.czt.oz.ast.ContainmentExpr zedObject = new net.sourceforge.czt.oz.impl.ContainmentExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ContainmentExpr createContainmentExpr( net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.oz.ast.ContainmentExpr zedObject = createContainmentExpr();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ExChoiceOpExpr createExChoiceOpExpr()
  {
    net.sourceforge.czt.oz.ast.ExChoiceOpExpr zedObject = new net.sourceforge.czt.oz.impl.ExChoiceOpExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ExChoiceOpExpr createExChoiceOpExpr(java.util.List<? extends net.sourceforge.czt.oz.ast.OpExpr>
 opExpr)
  {
    net.sourceforge.czt.oz.ast.ExChoiceOpExpr zedObject = createExChoiceOpExpr();
    if (opExpr != null) {
      zedObject.getOpExpr().addAll(opExpr);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.OpText createOpText()
  {
    net.sourceforge.czt.oz.ast.OpText zedObject = new net.sourceforge.czt.oz.impl.OpTextImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.OpText createOpText( net.sourceforge.czt.oz.ast.DeltaList  deltaList, net.sourceforge.czt.z.ast.SchText  schText)
  {
    net.sourceforge.czt.oz.ast.OpText zedObject = createOpText();
    zedObject.setDeltaList(deltaList);
    zedObject.setSchText(schText);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassPolyType createClassPolyType()
  {
    net.sourceforge.czt.oz.ast.ClassPolyType zedObject = new net.sourceforge.czt.oz.impl.ClassPolyTypeImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassPolyType createClassPolyType( net.sourceforge.czt.oz.ast.ClassRefList  classes, net.sourceforge.czt.z.ast.Signature  state,java.util.List<? extends net.sourceforge.czt.z.ast.NameTypePair>
 attribute,java.util.List<? extends net.sourceforge.czt.oz.ast.NameSignaturePair>
 operation, net.sourceforge.czt.oz.ast.ClassRef  rootClass)
  {
    net.sourceforge.czt.oz.ast.ClassPolyType zedObject = createClassPolyType();
    zedObject.setClasses(classes);
    zedObject.setState(state);
    if (attribute != null) {
      zedObject.getAttribute().addAll(attribute);
    }
    if (operation != null) {
      zedObject.getOperation().addAll(operation);
    }
    zedObject.setRootClass(rootClass);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassUnionExpr createClassUnionExpr()
  {
    net.sourceforge.czt.oz.ast.ClassUnionExpr zedObject = new net.sourceforge.czt.oz.impl.ClassUnionExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.ClassUnionExpr createClassUnionExpr(java.util.List<? extends net.sourceforge.czt.z.ast.Expr>
 expr)
  {
    net.sourceforge.czt.oz.ast.ClassUnionExpr zedObject = createClassUnionExpr();
    if (expr != null) {
      zedObject.getExpr().addAll(expr);
    }
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.InitialState createInitialState()
  {
    net.sourceforge.czt.oz.ast.InitialState zedObject = new net.sourceforge.czt.oz.impl.InitialStateImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.InitialState createInitialState( net.sourceforge.czt.z.ast.Pred  pred,net.sourceforge.czt.z.ast.Box
 box)
  {
    net.sourceforge.czt.oz.ast.InitialState zedObject = createInitialState();
    zedObject.setPred(pred);
    zedObject.setBox(box);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.AnonOpExpr createAnonOpExpr()
  {
    net.sourceforge.czt.oz.ast.AnonOpExpr zedObject = new net.sourceforge.czt.oz.impl.AnonOpExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.AnonOpExpr createAnonOpExpr( net.sourceforge.czt.oz.ast.OpText  opText)
  {
    net.sourceforge.czt.oz.ast.AnonOpExpr zedObject = createAnonOpExpr();
    zedObject.setOpText(opText);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.PredExpr createPredExpr()
  {
    net.sourceforge.czt.oz.ast.PredExpr zedObject = new net.sourceforge.czt.oz.impl.PredExprImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.PredExpr createPredExpr( net.sourceforge.czt.z.ast.Pred  pred)
  {
    net.sourceforge.czt.oz.ast.PredExpr zedObject = createPredExpr();
    zedObject.setPred(pred);
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.State createState()
  {
    net.sourceforge.czt.oz.ast.State zedObject = new net.sourceforge.czt.oz.impl.StateImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.oz.ast.State createState( net.sourceforge.czt.oz.ast.PrimaryDecl  primaryDecl, net.sourceforge.czt.oz.ast.SecondaryDecl  secondaryDecl, net.sourceforge.czt.z.ast.Pred  pred,net.sourceforge.czt.z.ast.Box
 box)
  {
    net.sourceforge.czt.oz.ast.State zedObject = createState();
    zedObject.setPrimaryDecl(primaryDecl);
    zedObject.setSecondaryDecl(secondaryDecl);
    zedObject.setPred(pred);
    zedObject.setBox(box);
    return zedObject;
  }

}
