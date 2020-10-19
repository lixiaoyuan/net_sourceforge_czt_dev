
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
 * {@link net.sourceforge.czt.circus.ast.Action2}.
 *
 * @author GnAST version 1.6-cdh
 */
public abstract class Action2Impl
extends 		 		net.sourceforge.czt.circus.impl.CircusActionImpl
 	  implements net.sourceforge.czt.circus.ast.Action2
{






  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.circus.ast.CircusFactory object factory}.
   */
  protected Action2Impl()
  {
    this(null);
  }

  protected Action2Impl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
  }
  
  
  /**
   * Compares the specified object with this Action2Impl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) Action2Impl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //Action2Impl object = ((Action2Impl) obj);
        if (circusAction_ != null) {
          if (!circusAction_.equals(((Action2Impl) obj).circusAction_)) {
            return false;
          }
        }
        else {
          if (((Action2Impl) obj).circusAction_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this Action2Impl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "Action2Impl".hashCode();
    if (circusAction_ != null) {
      hashCode += 31 * circusAction_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.circus.visitor.Action2Visitor) {
      net.sourceforge.czt.circus.visitor.Action2Visitor<R> visitor = 
      	  (net.sourceforge.czt.circus.visitor.Action2Visitor<R>) v;
      return visitor.visitAction2(this);
    }
    return super.accept(v);
  }



  private net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.circus.ast.CircusAction> circusAction_ =
    new net.sourceforge.czt.base.impl.ListTermImpl<net.sourceforge.czt.circus.ast.CircusAction>();

  public net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.circus.ast.CircusAction> getCircusAction()
  {
    return circusAction_;
  }
  public net.sourceforge.czt.circus.ast.CircusAction getLeftAction()
  {
	  net.sourceforge.czt.circus.ast.CircusAction result = null;
    if (getCircusAction().size() > 0) {
      result = getCircusAction().get(0);
    }
    return result;
  }

  public void setLeftAction(net.sourceforge.czt.circus.ast.CircusAction action)
  {
    if (getCircusAction().size() > 0) {
      getCircusAction().set(0, action);
    }
    else {
      getCircusAction().add(action);
    }
  }

  public net.sourceforge.czt.circus.ast.CircusAction getRightAction()
  {
	  net.sourceforge.czt.circus.ast.CircusAction result = null;
    if (getCircusAction().size() > 1) {
      result = getCircusAction().get(1);
    }
    return result;
  }

  public void setRightAction(net.sourceforge.czt.circus.ast.CircusAction action)
  {
    if (getCircusAction().size() == 0) {
      getCircusAction().add(null);
    }
    if (getCircusAction().size() > 1) {
      getCircusAction().set(1, action);
    }
    else {
      getCircusAction().add(action);
    }
  }
}
