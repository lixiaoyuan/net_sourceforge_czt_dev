
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

package net.sourceforge.czt.circustime.impl;

																																																				

/**
 * An implementation of the interface
 * {@link net.sourceforge.czt.circustime.ast.TimedinterruptAction}.
 *
 * @author GnAST version 1.6-cdh
 */
public class TimedinterruptActionImpl
extends 		 		net.sourceforge.czt.circustime.impl.ActionTime2Impl
 	  implements net.sourceforge.czt.circustime.ast.TimedinterruptAction
{





  /**
   * static instance count for TimedinterruptActionImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of TimedinterruptActionImpl (e.g., ic >= sl)
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
   * {@link net.sourceforge.czt.circustime.ast.CircusTimeFactory object factory}.
   */
  protected TimedinterruptActionImpl()
  {
    this(null);
  }

  protected TimedinterruptActionImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this TimedinterruptActionImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) TimedinterruptActionImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //TimedinterruptActionImpl object = ((TimedinterruptActionImpl) obj);
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this TimedinterruptActionImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "TimedinterruptActionImpl".hashCode();
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.circustime.visitor.TimedinterruptActionVisitor) {
      net.sourceforge.czt.circustime.visitor.TimedinterruptActionVisitor<R> visitor = 
      	  (net.sourceforge.czt.circustime.visitor.TimedinterruptActionVisitor<R>) v;
      return visitor.visitTimedinterruptAction(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public TimedinterruptActionImpl create(Object[] args)
  {
    TimedinterruptActionImpl zedObject = null;
    try {
	  		  @SuppressWarnings("unchecked")
	  	  	  java.util.List<net.sourceforge.czt.circus.ast.CircusAction>
	  	circusAction = (java.util.List<net.sourceforge.czt.circus.ast.CircusAction>) args[0];
	  	  	  			  	net.sourceforge.czt.z.ast.Expr expr = (
						net.sourceforge.czt.z.ast.Expr) args[1];
	        zedObject = new TimedinterruptActionImpl(getFactory());
      if (circusAction != null) {
        zedObject.getCircusAction().addAll(circusAction);
      }
      zedObject.setExpr(expr);
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
    Object[] erg = { getCircusAction(), getExpr() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }
}
