
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
 * {@link net.sourceforge.czt.z.ast.QntPred}.
 *
 * @author GnAST version 1.6-cdh
 */
public abstract class QntPredImpl
extends 		 		net.sourceforge.czt.z.impl.PredImpl
 	  implements net.sourceforge.czt.z.ast.QntPred
{






  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.z.ast.ZFactory object factory}.
   */
  protected QntPredImpl()
  {
    this(null);
  }

  protected QntPredImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
  }
  
  
  /**
   * Compares the specified object with this QntPredImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) QntPredImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //QntPredImpl object = ((QntPredImpl) obj);
        if (schText_ != null) {
          if (!schText_.equals(((QntPredImpl) obj).schText_)) {
            return false;
          }
        }
        else {
          if (((QntPredImpl) obj).schText_ != null) {
            return false;
          }
        }
        if (pred_ != null) {
          if (!pred_.equals(((QntPredImpl) obj).pred_)) {
            return false;
          }
        }
        else {
          if (((QntPredImpl) obj).pred_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this QntPredImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "QntPredImpl".hashCode();
    if (schText_ != null) {
      hashCode += 31 * schText_.hashCode();
    }
    if (pred_ != null) {
      hashCode += 31 * pred_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.z.visitor.QntPredVisitor) {
      net.sourceforge.czt.z.visitor.QntPredVisitor<R> visitor = 
      	  (net.sourceforge.czt.z.visitor.QntPredVisitor<R>) v;
      return visitor.visitQntPred(this);
    }
    return super.accept(v);
  }



  private
            		net.sourceforge.czt.z.ast.SchText
  schText_;

  public 
		net.sourceforge.czt.z.ast.SchText
  getSchText()
  {
    return schText_;
  }

  public void setSchText(
		net.sourceforge.czt.z.ast.SchText
	schText)
  {
                          schText_ = schText;
    }


  private
            		net.sourceforge.czt.z.ast.Pred
  pred_;

  public 
		net.sourceforge.czt.z.ast.Pred
  getPred()
  {
    return pred_;
  }

  public void setPred(
		net.sourceforge.czt.z.ast.Pred
	pred)
  {
                          pred_ = pred;
    }

  /**
   * This is a convenience method.
   * It returns the ZSchText if SchText is an instance of
   * ZSchText and throws an UnsupportedAstClassException otherwise.
   */
  public net.sourceforge.czt.z.ast.ZSchText getZSchText()
  {
	  net.sourceforge.czt.z.ast.SchText schText = getSchText();
    if (schText instanceof net.sourceforge.czt.z.ast.ZSchText) {
      return (net.sourceforge.czt.z.ast.ZSchText) schText;
    }
    final String message = "Expected the default (Z) implementation of SchText" +
      " but found " + String.valueOf(schText);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }
}