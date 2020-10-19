
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstClass.vm.
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
 * An implementation of the interface
 * {@link net.sourceforge.czt.oz.ast.ClassPara}.
 *
 * @author GnAST version 1.6-cdh
 */
public class ClassParaImpl
extends 		 						net.sourceforge.czt.z.impl.ParaImpl
						 	  implements net.sourceforge.czt.oz.ast.ClassPara
{





  /**
   * static instance count for ClassParaImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of ClassParaImpl (e.g., ic >= sl)
   */
  //private static final long startLoggingFrom_ = Long.MAX_VALUE;
   
    // cannot be final because JokerCommunicationImpl extends CommunicationImpl
  public /*final*/ static boolean countingFinaliser() { return false; }
  public /*final*/ static long instancesFinalised() 
  { 
    throw new UnsupportedOperationException("GnAST AST finalisers have not been set"); 
  }
  
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.oz.ast.OzFactory object factory}.
   */
  protected ClassParaImpl()
  {
    this(null);
  }

  protected ClassParaImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this ClassParaImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ClassParaImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //ClassParaImpl object = ((ClassParaImpl) obj);
        if (name_ != null) {
          if (!name_.equals(((ClassParaImpl) obj).name_)) {
            return false;
          }
        }
        else {
          if (((ClassParaImpl) obj).name_ != null) {
            return false;
          }
        }
        if (nameList_ != null) {
          if (!nameList_.equals(((ClassParaImpl) obj).nameList_)) {
            return false;
          }
        }
        else {
          if (((ClassParaImpl) obj).nameList_ != null) {
            return false;
          }
        }
        if (visibilityList_ != null) {
          if (!visibilityList_.equals(((ClassParaImpl) obj).visibilityList_)) {
            return false;
          }
        }
        else {
          if (((ClassParaImpl) obj).visibilityList_ != null) {
            return false;
          }
        }
        if (inheritedClass_ != null) {
          if (!inheritedClass_.equals(((ClassParaImpl) obj).inheritedClass_)) {
            return false;
          }
        }
        else {
          if (((ClassParaImpl) obj).inheritedClass_ != null) {
            return false;
          }
        }
        if (localDef_ != null) {
          if (!localDef_.equals(((ClassParaImpl) obj).localDef_)) {
            return false;
          }
        }
        else {
          if (((ClassParaImpl) obj).localDef_ != null) {
            return false;
          }
        }
        if (state_ != null) {
          if (!state_.equals(((ClassParaImpl) obj).state_)) {
            return false;
          }
        }
        else {
          if (((ClassParaImpl) obj).state_ != null) {
            return false;
          }
        }
        if (initialState_ != null) {
          if (!initialState_.equals(((ClassParaImpl) obj).initialState_)) {
            return false;
          }
        }
        else {
          if (((ClassParaImpl) obj).initialState_ != null) {
            return false;
          }
        }
        if (operation_ != null) {
          if (!operation_.equals(((ClassParaImpl) obj).operation_)) {
            return false;
          }
        }
        else {
          if (((ClassParaImpl) obj).operation_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ClassParaImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ClassParaImpl".hashCode();
    if (name_ != null) {
      hashCode += 31 * name_.hashCode();
    }
    if (nameList_ != null) {
      hashCode += 31 * nameList_.hashCode();
    }
    if (visibilityList_ != null) {
      hashCode += 31 * visibilityList_.hashCode();
    }
    if (inheritedClass_ != null) {
      hashCode += 31 * inheritedClass_.hashCode();
    }
    if (localDef_ != null) {
      hashCode += 31 * localDef_.hashCode();
    }
    if (state_ != null) {
      hashCode += 31 * state_.hashCode();
    }
    if (initialState_ != null) {
      hashCode += 31 * initialState_.hashCode();
    }
    if (operation_ != null) {
      hashCode += 31 * operation_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.oz.visitor.ClassParaVisitor) {
      net.sourceforge.czt.oz.visitor.ClassParaVisitor<R> visitor = 
      	  (net.sourceforge.czt.oz.visitor.ClassParaVisitor<R>) v;
      return visitor.visitClassPara(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public ClassParaImpl create(Object[] args)
  {
    ClassParaImpl zedObject = null;
    try {
	  	  			  	net.sourceforge.czt.z.ast.Name name = (
						net.sourceforge.czt.z.ast.Name) args[0];
	  	  	  			  	net.sourceforge.czt.z.ast.NameList nameList = (
						net.sourceforge.czt.z.ast.NameList) args[1];
	  	  	  			  	net.sourceforge.czt.oz.ast.VisibilityList visibilityList = (
						net.sourceforge.czt.oz.ast.VisibilityList) args[2];
	  	  	  			  	net.sourceforge.czt.z.ast.ExprList inheritedClass = (
						net.sourceforge.czt.z.ast.ExprList) args[3];
	  	  		  @SuppressWarnings("unchecked")
	  	  	  java.util.List<net.sourceforge.czt.z.ast.Para>
	  	localDef = (java.util.List<net.sourceforge.czt.z.ast.Para>) args[4];
	  	  	  			  	net.sourceforge.czt.oz.ast.State state = (
						net.sourceforge.czt.oz.ast.State) args[5];
	  	  	  			  	net.sourceforge.czt.oz.ast.InitialState initialState = (
						net.sourceforge.czt.oz.ast.InitialState) args[6];
	  	  		  @SuppressWarnings("unchecked")
	  	  	  java.util.List<net.sourceforge.czt.oz.ast.Operation>
	  	operation = (java.util.List<net.sourceforge.czt.oz.ast.Operation>) args[7];
	        zedObject = new ClassParaImpl(getFactory());
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
    }
    catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException(e);
    }
    catch (ClassCastException e) {
      throw new IllegalArgumentException(e);
    }
    return zedObject;
  }

  public Object[] getChildren()
  {
    Object[] erg = { getName(), getNameList(), getVisibilityList(), getInheritedClass(), getLocalDef(), getState(), getInitialState(), getOperation() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }


  private
            		net.sourceforge.czt.z.ast.Name
  name_;

  public 
		net.sourceforge.czt.z.ast.Name
  getName()
  {
    return name_;
  }

  public void setName(
		net.sourceforge.czt.z.ast.Name
	name)
  {
                          name_ = name;
    }


  private
            		net.sourceforge.czt.z.ast.NameList
  nameList_;

  public 
		net.sourceforge.czt.z.ast.NameList
  getNameList()
  {
    return nameList_;
  }

  public void setNameList(
		net.sourceforge.czt.z.ast.NameList
	nameList)
  {
                          nameList_ = nameList;
    }
  /**
   * This is a convenience method.
   * It returns a ZNameList if #getNameList
   * returns an instance of ZNameList
   * and throws an UnsupportedAstClassException otherwise.
   */
  public net.sourceforge.czt.z.ast.ZNameList getZNameList()
  {
    net.sourceforge.czt.z.ast.NameList object = getNameList();
    if (object instanceof net.sourceforge.czt.z.ast.ZNameList) {
      return (net.sourceforge.czt.z.ast.ZNameList) object;
    }
    final String message = "Expected the Z implementation of net.sourceforge.czt.z.ast.NameList" +
      " but found " + String.valueOf(object);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }


  private
            		net.sourceforge.czt.oz.ast.VisibilityList
  visibilityList_;

  public 
		net.sourceforge.czt.oz.ast.VisibilityList
  getVisibilityList()
  {
    return visibilityList_;
  }

  public void setVisibilityList(
		net.sourceforge.czt.oz.ast.VisibilityList
	visibilityList)
  {
                          visibilityList_ = visibilityList;
    }


  private
            		net.sourceforge.czt.z.ast.ExprList
  inheritedClass_;

  public 
		net.sourceforge.czt.z.ast.ExprList
  getInheritedClass()
  {
    return inheritedClass_;
  }

  public void setInheritedClass(
		net.sourceforge.czt.z.ast.ExprList
	inheritedClass)
  {
                          inheritedClass_ = inheritedClass;
    }


  private net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.z.ast.Para> localDef_ =
    new net.sourceforge.czt.base.impl.ListTermImpl<net.sourceforge.czt.z.ast.Para>();

  public net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.z.ast.Para> getLocalDef()
  {
    return localDef_;
  }


  private
            		net.sourceforge.czt.oz.ast.State
  state_;

  public 
		net.sourceforge.czt.oz.ast.State
  getState()
  {
    return state_;
  }

  public void setState(
		net.sourceforge.czt.oz.ast.State
	state)
  {
                          state_ = state;
    }


  private
            		net.sourceforge.czt.oz.ast.InitialState
  initialState_;

  public 
		net.sourceforge.czt.oz.ast.InitialState
  getInitialState()
  {
    return initialState_;
  }

  public void setInitialState(
		net.sourceforge.czt.oz.ast.InitialState
	initialState)
  {
                          initialState_ = initialState;
    }


  private net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.oz.ast.Operation> operation_ =
    new net.sourceforge.czt.base.impl.ListTermImpl<net.sourceforge.czt.oz.ast.Operation>();

  public net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.oz.ast.Operation> getOperation()
  {
    return operation_;
  }

  public net.sourceforge.czt.z.ast.ZName getClassName()
  {
	  net.sourceforge.czt.z.ast.Name declName = getName();
    if (declName instanceof net.sourceforge.czt.z.ast.ZName) {
      return (net.sourceforge.czt.z.ast.ZName) declName;
    }
    final String message = "Expected the default (Z) implementation of Name" +
      " but found " + String.valueOf(declName);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }

  public net.sourceforge.czt.z.ast.ZExprList getInheritedExpr()
  {
	  net.sourceforge.czt.z.ast.ExprList exprList = getInheritedClass();
    if (exprList instanceof net.sourceforge.czt.z.ast.ZExprList) {
      return ((net.sourceforge.czt.z.ast.ZExprList) exprList).getExpr();
    }
    final String message = "Expected the default (Z) implementation of ExprList" +
      " but found " + String.valueOf(exprList);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }

}
