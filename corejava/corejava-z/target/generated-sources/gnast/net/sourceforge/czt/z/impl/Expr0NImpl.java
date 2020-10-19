
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

package net.sourceforge.czt.z.impl;

																																																				

/**
 * An implementation of the interface
 * {@link net.sourceforge.czt.z.ast.Expr0N}.
 *
 * @author GnAST version 1.6-cdh
 */
public abstract class Expr0NImpl
extends 		 		net.sourceforge.czt.z.impl.ExprImpl
 	  implements net.sourceforge.czt.z.ast.Expr0N
{






  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.z.ast.ZFactory object factory}.
   */
  protected Expr0NImpl()
  {
    this(null);
  }

  protected Expr0NImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
  }
  
  
  /**
   * Compares the specified object with this Expr0NImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) Expr0NImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //Expr0NImpl object = ((Expr0NImpl) obj);
        if (exprList_ != null) {
          if (!exprList_.equals(((Expr0NImpl) obj).exprList_)) {
            return false;
          }
        }
        else {
          if (((Expr0NImpl) obj).exprList_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this Expr0NImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "Expr0NImpl".hashCode();
    if (exprList_ != null) {
      hashCode += 31 * exprList_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.z.visitor.Expr0NVisitor) {
      net.sourceforge.czt.z.visitor.Expr0NVisitor<R> visitor = 
      	  (net.sourceforge.czt.z.visitor.Expr0NVisitor<R>) v;
      return visitor.visitExpr0N(this);
    }
    return super.accept(v);
  }



  private
            		net.sourceforge.czt.z.ast.ExprList
  exprList_;

  public 
		net.sourceforge.czt.z.ast.ExprList
  getExprList()
  {
    return exprList_;
  }

  public void setExprList(
		net.sourceforge.czt.z.ast.ExprList
	exprList)
  {
                          exprList_ = exprList;
    }
  /**
   * This is a convenience method.
   * It returns a ZExprList if #getExprList
   * returns an instance of ZExprList
   * and throws an UnsupportedAstClassException otherwise.
   */
  public net.sourceforge.czt.z.ast.ZExprList getZExprList()
  {
    net.sourceforge.czt.z.ast.ExprList object = getExprList();
    if (object instanceof net.sourceforge.czt.z.ast.ZExprList) {
      return (net.sourceforge.czt.z.ast.ZExprList) object;
    }
    final String message = "Expected the Z implementation of net.sourceforge.czt.z.ast.ExprList" +
      " but found " + String.valueOf(object);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }
}