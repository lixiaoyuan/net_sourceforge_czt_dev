
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
 * {@link net.sourceforge.czt.circus.ast.InterleaveProcessIte}.
 *
 * @author GnAST version 1.6-cdh
 */
public class InterleaveProcessIteImpl
extends 		 		net.sourceforge.czt.circus.impl.ParProcessIteImpl
 	  implements net.sourceforge.czt.circus.ast.InterleaveProcessIte
{





  /**
   * static instance count for InterleaveProcessIteImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of InterleaveProcessIteImpl (e.g., ic >= sl)
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
  protected InterleaveProcessIteImpl()
  {
    this(null);
  }

  protected InterleaveProcessIteImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this InterleaveProcessIteImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) InterleaveProcessIteImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //InterleaveProcessIteImpl object = ((InterleaveProcessIteImpl) obj);
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this InterleaveProcessIteImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "InterleaveProcessIteImpl".hashCode();
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.circus.visitor.InterleaveProcessIteVisitor) {
      net.sourceforge.czt.circus.visitor.InterleaveProcessIteVisitor<R> visitor = 
      	  (net.sourceforge.czt.circus.visitor.InterleaveProcessIteVisitor<R>) v;
      return visitor.visitInterleaveProcessIte(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public InterleaveProcessIteImpl create(Object[] args)
  {
    InterleaveProcessIteImpl zedObject = null;
    try {
	  	  			  	net.sourceforge.czt.circus.ast.CircusProcess circusProcess = (
						net.sourceforge.czt.circus.ast.CircusProcess) args[0];
	  	  	  			  	net.sourceforge.czt.z.ast.DeclList declList = (
						net.sourceforge.czt.z.ast.DeclList) args[1];
	        zedObject = new InterleaveProcessIteImpl(getFactory());
      zedObject.setCircusProcess(circusProcess);
      zedObject.setDeclList(declList);
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
    Object[] erg = { getCircusProcess(), getDeclList() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }
}
