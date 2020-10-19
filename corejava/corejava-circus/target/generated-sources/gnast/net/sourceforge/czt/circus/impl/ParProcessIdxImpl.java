
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
 * {@link net.sourceforge.czt.circus.ast.ParProcessIdx}.
 *
 * @author GnAST version 1.6-cdh
 */
public abstract class ParProcessIdxImpl
extends 		 		net.sourceforge.czt.circus.impl.ProcessIdxImpl
 	  implements net.sourceforge.czt.circus.ast.ParProcessIdx
{






  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.circus.ast.CircusFactory object factory}.
   */
  protected ParProcessIdxImpl()
  {
    this(null);
  }

  protected ParProcessIdxImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
  }
  
  
  /**
   * Compares the specified object with this ParProcessIdxImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ParProcessIdxImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //ParProcessIdxImpl object = ((ParProcessIdxImpl) obj);
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ParProcessIdxImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ParProcessIdxImpl".hashCode();
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.circus.visitor.ParProcessIdxVisitor) {
      net.sourceforge.czt.circus.visitor.ParProcessIdxVisitor<R> visitor = 
      	  (net.sourceforge.czt.circus.visitor.ParProcessIdxVisitor<R>) v;
      return visitor.visitParProcessIdx(this);
    }
    return super.accept(v);
  }

}