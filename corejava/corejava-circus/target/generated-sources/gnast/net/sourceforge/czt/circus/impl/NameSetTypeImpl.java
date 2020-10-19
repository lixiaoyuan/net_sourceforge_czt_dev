
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

package net.sourceforge.czt.circus.impl;

																																																				

/**
 * An implementation of the interface
 * {@link net.sourceforge.czt.circus.ast.NameSetType}.
 *
 * @author GnAST version 1.6-cdh
 */
public class NameSetTypeImpl
extends 		 		net.sourceforge.czt.circus.impl.CircusSigTypeImpl
 	  implements net.sourceforge.czt.circus.ast.NameSetType
{





  /**
   * static instance count for NameSetTypeImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of NameSetTypeImpl (e.g., ic >= sl)
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
   * {@link net.sourceforge.czt.circus.ast.CircusFactory object factory}.
   */
  protected NameSetTypeImpl()
  {
    this(null);
  }

  protected NameSetTypeImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this NameSetTypeImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) NameSetTypeImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //NameSetTypeImpl object = ((NameSetTypeImpl) obj);
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this NameSetTypeImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "NameSetTypeImpl".hashCode();
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.circus.visitor.NameSetTypeVisitor) {
      net.sourceforge.czt.circus.visitor.NameSetTypeVisitor<R> visitor = 
      	  (net.sourceforge.czt.circus.visitor.NameSetTypeVisitor<R>) v;
      return visitor.visitNameSetType(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public NameSetTypeImpl create(Object[] args)
  {
    NameSetTypeImpl zedObject = null;
    try {
	  	  			  	net.sourceforge.czt.z.ast.Signature signature = (
						net.sourceforge.czt.z.ast.Signature) args[0];
	        zedObject = new NameSetTypeImpl(getFactory());
      zedObject.setSignature(signature);
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
    Object[] erg = { getSignature() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }
}
