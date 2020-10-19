
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
 * {@link net.sourceforge.czt.z.ast.NumExpr}.
 *
 * @author GnAST version 1.6-cdh
 */
public class NumExprImpl
extends 		 		net.sourceforge.czt.z.impl.ExprImpl
 	  implements net.sourceforge.czt.z.ast.NumExpr
{





  /**
   * static instance count for NumExprImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of NumExprImpl (e.g., ic >= sl)
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
  protected NumExprImpl()
  {
    this(null);
  }

  protected NumExprImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this NumExprImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) NumExprImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //NumExprImpl object = ((NumExprImpl) obj);
        if (numeral_ != null) {
          if (!numeral_.equals(((NumExprImpl) obj).numeral_)) {
            return false;
          }
        }
        else {
          if (((NumExprImpl) obj).numeral_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this NumExprImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "NumExprImpl".hashCode();
    if (numeral_ != null) {
      hashCode += 31 * numeral_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.z.visitor.NumExprVisitor) {
      net.sourceforge.czt.z.visitor.NumExprVisitor<R> visitor = 
      	  (net.sourceforge.czt.z.visitor.NumExprVisitor<R>) v;
      return visitor.visitNumExpr(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public NumExprImpl create(Object[] args)
  {
    NumExprImpl zedObject = null;
    try {
	  	  			  	net.sourceforge.czt.z.ast.Numeral numeral = (
						net.sourceforge.czt.z.ast.Numeral) args[0];
	        zedObject = new NumExprImpl(getFactory());
      zedObject.setNumeral(numeral);
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
    Object[] erg = { getNumeral() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }


  private
            		net.sourceforge.czt.z.ast.Numeral
  numeral_;

  public 
		net.sourceforge.czt.z.ast.Numeral
  getNumeral()
  {
    return numeral_;
  }

  public void setNumeral(
		net.sourceforge.czt.z.ast.Numeral
	numeral)
  {
                          numeral_ = numeral;
    }

  /**
   * This is a convenience method.
   * It returns the net.sourceforge.czt.z.ast.ZNumeral if Numeral is an instance of
   * net.sourceforge.czt.z.ast.ZNumeral and throws an UnsupportedAstClassException otherwise.
   */
  public net.sourceforge.czt.z.ast.ZNumeral getZNumeral()
  {
	  net.sourceforge.czt.z.ast.Numeral numeral = getNumeral();
    if (numeral instanceof net.sourceforge.czt.z.ast.ZNumeral) {
      return (net.sourceforge.czt.z.ast.ZNumeral) numeral;
    }
    final String message = "Expected the default (Z) implementation of Numeral" +
      " but found " + String.valueOf(numeral);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }

  /**
   * This is a convenience method.
   * It returns the value of the net.sourceforge.czt.z.ast.ZNumeral if Numeral is an instance of
   * net.sourceforge.czt.z.ast.ZNumeral and throws an UnsupportedAstClassException otherwise.
   */
  public java.math.BigInteger getValue()
  {
    net.sourceforge.czt.z.ast.Numeral numeral = getNumeral();
    if (numeral instanceof net.sourceforge.czt.z.ast.ZNumeral) {
      return new java.math.BigInteger(((net.sourceforge.czt.z.ast.ZNumeral) numeral).getValue().toString());
    }
    final String message = "Expected the default (Z) implementation of Numeral" +
      " but found " + String.valueOf(numeral);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }

}