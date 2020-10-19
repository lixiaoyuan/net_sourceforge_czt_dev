
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
 * {@link net.sourceforge.czt.z.ast.MemPred}.
 *
 * @author GnAST version 1.6-cdh
 */
public class MemPredImpl
extends 		 		net.sourceforge.czt.z.impl.PredImpl
 	  implements net.sourceforge.czt.z.ast.MemPred
{





  /**
   * static instance count for MemPredImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of MemPredImpl (e.g., ic >= sl)
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
   * {@link net.sourceforge.czt.z.ast.ZFactory object factory}.
   */
  protected MemPredImpl()
  {
    this(null);
  }

  protected MemPredImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this MemPredImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) MemPredImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //MemPredImpl object = ((MemPredImpl) obj);
        if (expr_ != null) {
          if (!expr_.equals(((MemPredImpl) obj).expr_)) {
            return false;
          }
        }
        else {
          if (((MemPredImpl) obj).expr_ != null) {
            return false;
          }
        }
        if (mixfix_ != null) {
          if (!mixfix_.equals(((MemPredImpl) obj).mixfix_)) {
            return false;
          }
        }
        else {
          if (((MemPredImpl) obj).mixfix_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this MemPredImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "MemPredImpl".hashCode();
    if (expr_ != null) {
      hashCode += 31 * expr_.hashCode();
    }
    if (mixfix_ != null) {
      hashCode += 31 * mixfix_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.z.visitor.MemPredVisitor) {
      net.sourceforge.czt.z.visitor.MemPredVisitor<R> visitor = 
      	  (net.sourceforge.czt.z.visitor.MemPredVisitor<R>) v;
      return visitor.visitMemPred(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public MemPredImpl create(Object[] args)
  {
    MemPredImpl zedObject = null;
    try {
	  		  @SuppressWarnings("unchecked")
	  	  	  java.util.List<net.sourceforge.czt.z.ast.Expr>
	  	expr = (java.util.List<net.sourceforge.czt.z.ast.Expr>) args[0];
	  	  	  								  	Boolean mixfix = (
													Boolean) args[1];
	        zedObject = new MemPredImpl(getFactory());
      if (expr != null) {
        zedObject.getExpr().addAll(expr);
      }
      zedObject.setMixfix(mixfix);
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
    Object[] erg = { getExpr(), getMixfix() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }


  private net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.z.ast.Expr> expr_ =
    new net.sourceforge.czt.base.impl.ListTermImpl<net.sourceforge.czt.z.ast.Expr>();

  public net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.z.ast.Expr> getExpr()
  {
    return expr_;
  }


  private
            					Boolean
  mixfix_;

  public 
					Boolean
  getMixfix()
  {
    return mixfix_;
  }

  public void setMixfix(
					Boolean
	mixfix)
  {
                          mixfix_ = mixfix;
    }
  public net.sourceforge.czt.z.ast.Expr getLeftExpr()
  {
	  net.sourceforge.czt.z.ast.Expr result = null;
    if (getExpr().size() > 0) {
      result = getExpr().get(0);
    }
    return result;
  }

  public void setLeftExpr(net.sourceforge.czt.z.ast.Expr expr)
  {
    if (getExpr().size() > 0) {
      getExpr().set(0, expr);
    }
    else {
      getExpr().add(expr);
    }
  }

  public net.sourceforge.czt.z.ast.Expr getRightExpr()
  {
	  net.sourceforge.czt.z.ast.Expr result = null;
    if (getExpr().size() > 1) {
      result = getExpr().get(1);
    }
    return result;
  }

  public void setRightExpr(net.sourceforge.czt.z.ast.Expr expr)
  {
    if (getExpr().size() == 0) {
      getExpr().add(null);
    }
    if (getExpr().size() > 1) {
      getExpr().set(1, expr);
    }
    else {
      getExpr().add(expr);
    }
  }
}