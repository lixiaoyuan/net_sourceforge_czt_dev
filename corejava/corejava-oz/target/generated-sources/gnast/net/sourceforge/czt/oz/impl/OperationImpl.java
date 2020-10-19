
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
 * {@link net.sourceforge.czt.oz.ast.Operation}.
 *
 * @author GnAST version 1.6-cdh
 */
public class OperationImpl
extends   		net.sourceforge.czt.base.impl.TermImpl
	  implements net.sourceforge.czt.oz.ast.Operation
{





  /**
   * static instance count for OperationImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of OperationImpl (e.g., ic >= sl)
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
  protected OperationImpl()
  {
    this(null);
  }

  protected OperationImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this OperationImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) OperationImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //OperationImpl object = ((OperationImpl) obj);
        if (name_ != null) {
          if (!name_.equals(((OperationImpl) obj).name_)) {
            return false;
          }
        }
        else {
          if (((OperationImpl) obj).name_ != null) {
            return false;
          }
        }
        if (opExpr_ != null) {
          if (!opExpr_.equals(((OperationImpl) obj).opExpr_)) {
            return false;
          }
        }
        else {
          if (((OperationImpl) obj).opExpr_ != null) {
            return false;
          }
        }
        if (box_ != null) {
          if (!box_.equals(((OperationImpl) obj).box_)) {
            return false;
          }
        }
        else {
          if (((OperationImpl) obj).box_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this OperationImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "OperationImpl".hashCode();
    if (name_ != null) {
      hashCode += 31 * name_.hashCode();
    }
    if (opExpr_ != null) {
      hashCode += 31 * opExpr_.hashCode();
    }
    if (box_ != null) {
      hashCode += 31 * box_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.oz.visitor.OperationVisitor) {
      net.sourceforge.czt.oz.visitor.OperationVisitor<R> visitor = 
      	  (net.sourceforge.czt.oz.visitor.OperationVisitor<R>) v;
      return visitor.visitOperation(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public OperationImpl create(Object[] args)
  {
    OperationImpl zedObject = null;
    try {
	  	  			  	net.sourceforge.czt.z.ast.Name name = (
						net.sourceforge.czt.z.ast.Name) args[0];
	  	  	  			  	net.sourceforge.czt.oz.ast.OpExpr opExpr = (
						net.sourceforge.czt.oz.ast.OpExpr) args[1];
	  	  	  			  	net.sourceforge.czt.z.ast.Box box = (
						net.sourceforge.czt.z.ast.Box) args[2];
	        zedObject = new OperationImpl(getFactory());
      zedObject.setName(name);
      zedObject.setOpExpr(opExpr);
      zedObject.setBox(box);
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
    Object[] erg = { getName(), getOpExpr(), getBox() };
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
            		net.sourceforge.czt.z.ast.Box
  box_;

  public 
		net.sourceforge.czt.z.ast.Box
  getBox()
  {
    return box_;
  }

  public void setBox(
		net.sourceforge.czt.z.ast.Box
	box)
  {
                          box_ = box;
    }

  public net.sourceforge.czt.z.ast.ZName getZName()
  {
	  net.sourceforge.czt.z.ast.Name name = getName();
    if (name instanceof net.sourceforge.czt.z.ast.ZName) {
      return (net.sourceforge.czt.z.ast.ZName) name;
    }
    final String message = "Expected the default (Z) implementation of Name" +
      " but found " + String.valueOf(name);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }

}