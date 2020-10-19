
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

package net.sourceforge.czt.zeves.impl;

																																																				

/**
 * An implementation of the interface
 * {@link net.sourceforge.czt.zeves.ast.SimplificationCommand}.
 *
 * @author GnAST version 1.6-cdh
 */
public class SimplificationCommandImpl
extends 		 		net.sourceforge.czt.zeves.impl.ProofCommandImpl
 	  implements net.sourceforge.czt.zeves.ast.SimplificationCommand
{





  /**
   * static instance count for SimplificationCommandImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of SimplificationCommandImpl (e.g., ic >= sl)
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
   * {@link net.sourceforge.czt.zeves.ast.ZEvesFactory object factory}.
   */
  protected SimplificationCommandImpl()
  {
    this(null);
  }

  protected SimplificationCommandImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this SimplificationCommandImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) SimplificationCommandImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //SimplificationCommandImpl object = ((SimplificationCommandImpl) obj);
        if (rewriteKind_ != null) {
          if (!rewriteKind_.equals(((SimplificationCommandImpl) obj).rewriteKind_)) {
            return false;
          }
        }
        else {
          if (((SimplificationCommandImpl) obj).rewriteKind_ != null) {
            return false;
          }
        }
        if (rewritePower_ != null) {
          if (!rewritePower_.equals(((SimplificationCommandImpl) obj).rewritePower_)) {
            return false;
          }
        }
        else {
          if (((SimplificationCommandImpl) obj).rewritePower_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this SimplificationCommandImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "SimplificationCommandImpl".hashCode();
    if (rewriteKind_ != null) {
      hashCode += 31 * rewriteKind_.hashCode();
    }
    if (rewritePower_ != null) {
      hashCode += 31 * rewritePower_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.zeves.visitor.SimplificationCommandVisitor) {
      net.sourceforge.czt.zeves.visitor.SimplificationCommandVisitor<R> visitor = 
      	  (net.sourceforge.czt.zeves.visitor.SimplificationCommandVisitor<R>) v;
      return visitor.visitSimplificationCommand(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public SimplificationCommandImpl create(Object[] args)
  {
    SimplificationCommandImpl zedObject = null;
    try {
	  	  								  	java.math.BigInteger proofStep = (
													java.math.BigInteger) args[0];
	  	  	  									net.sourceforge.czt.zeves.ast.
						  	RewriteKind rewriteKind = (
												net.sourceforge.czt.zeves.ast.
										RewriteKind) args[1];
	  	  	  									net.sourceforge.czt.zeves.ast.
						  	RewritePower rewritePower = (
												net.sourceforge.czt.zeves.ast.
										RewritePower) args[2];
	        zedObject = new SimplificationCommandImpl(getFactory());
      zedObject.setProofStep(proofStep);
      zedObject.setRewriteKind(rewriteKind);
      zedObject.setRewritePower(rewritePower);
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
    Object[] erg = { getProofStep(), getRewriteKind(), getRewritePower() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }


  private
            						net.sourceforge.czt.zeves.ast.
				RewriteKind
  rewriteKind_;

  public 
						net.sourceforge.czt.zeves.ast.
				RewriteKind
  getRewriteKind()
  {
    return rewriteKind_;
  }

  public void setRewriteKind(
						net.sourceforge.czt.zeves.ast.
				RewriteKind
	rewriteKind)
  {
                          rewriteKind_ = rewriteKind;
    }


  private
            						net.sourceforge.czt.zeves.ast.
				RewritePower
  rewritePower_;

  public 
						net.sourceforge.czt.zeves.ast.
				RewritePower
  getRewritePower()
  {
    return rewritePower_;
  }

  public void setRewritePower(
						net.sourceforge.czt.zeves.ast.
				RewritePower
	rewritePower)
  {
                          rewritePower_ = rewritePower;
    }
}