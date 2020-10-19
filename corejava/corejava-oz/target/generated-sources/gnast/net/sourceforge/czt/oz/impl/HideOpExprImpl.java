
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
 * {@link net.sourceforge.czt.oz.ast.HideOpExpr}.
 *
 * @author GnAST version 1.6-cdh
 */
public class HideOpExprImpl
extends 		 		net.sourceforge.czt.oz.impl.OpExprImpl
 	  implements net.sourceforge.czt.oz.ast.HideOpExpr
{





  /**
   * static instance count for HideOpExprImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of HideOpExprImpl (e.g., ic >= sl)
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
  protected HideOpExprImpl()
  {
    this(null);
  }

  protected HideOpExprImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this HideOpExprImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) HideOpExprImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //HideOpExprImpl object = ((HideOpExprImpl) obj);
        if (opExpr_ != null) {
          if (!opExpr_.equals(((HideOpExprImpl) obj).opExpr_)) {
            return false;
          }
        }
        else {
          if (((HideOpExprImpl) obj).opExpr_ != null) {
            return false;
          }
        }
        if (nameList_ != null) {
          if (!nameList_.equals(((HideOpExprImpl) obj).nameList_)) {
            return false;
          }
        }
        else {
          if (((HideOpExprImpl) obj).nameList_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this HideOpExprImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "HideOpExprImpl".hashCode();
    if (opExpr_ != null) {
      hashCode += 31 * opExpr_.hashCode();
    }
    if (nameList_ != null) {
      hashCode += 31 * nameList_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.oz.visitor.HideOpExprVisitor) {
      net.sourceforge.czt.oz.visitor.HideOpExprVisitor<R> visitor = 
      	  (net.sourceforge.czt.oz.visitor.HideOpExprVisitor<R>) v;
      return visitor.visitHideOpExpr(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public HideOpExprImpl create(Object[] args)
  {
    HideOpExprImpl zedObject = null;
    try {
	  	  			  	net.sourceforge.czt.oz.ast.OpExpr opExpr = (
						net.sourceforge.czt.oz.ast.OpExpr) args[0];
	  	  	  			  	net.sourceforge.czt.z.ast.NameList nameList = (
						net.sourceforge.czt.z.ast.NameList) args[1];
	        zedObject = new HideOpExprImpl(getFactory());
      zedObject.setOpExpr(opExpr);
      zedObject.setNameList(nameList);
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
    Object[] erg = { getOpExpr(), getNameList() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }


  private
            		net.sourceforge.czt.oz.ast.OpExpr
  opExpr_;

  public 
		net.sourceforge.czt.oz.ast.OpExpr
  getOpExpr()
  {
    return opExpr_;
  }

  public void setOpExpr(
		net.sourceforge.czt.oz.ast.OpExpr
	opExpr)
  {
                          opExpr_ = opExpr;
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

  public net.sourceforge.czt.z.ast.ZNameList getName()
  {
	  net.sourceforge.czt.z.ast.NameList refNameList = getNameList();
    if (refNameList instanceof net.sourceforge.czt.z.ast.ZNameList) {
      return ((net.sourceforge.czt.z.ast.ZNameList) refNameList).getName();
    }
    final String message = "Expected the default (Z) implementation of NameList" +
      " but found " + String.valueOf(refNameList);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }

}
