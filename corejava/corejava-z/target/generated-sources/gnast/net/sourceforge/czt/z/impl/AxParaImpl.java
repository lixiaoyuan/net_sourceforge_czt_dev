
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
 * {@link net.sourceforge.czt.z.ast.AxPara}.
 *
 * @author GnAST version 1.6-cdh
 */
public class AxParaImpl
extends 		 		net.sourceforge.czt.z.impl.ParaImpl
 	  implements net.sourceforge.czt.z.ast.AxPara
{





  /**
   * static instance count for AxParaImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of AxParaImpl (e.g., ic >= sl)
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
  protected AxParaImpl()
  {
    this(null);
  }

  protected AxParaImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this AxParaImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) AxParaImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //AxParaImpl object = ((AxParaImpl) obj);
        if (nameList_ != null) {
          if (!nameList_.equals(((AxParaImpl) obj).nameList_)) {
            return false;
          }
        }
        else {
          if (((AxParaImpl) obj).nameList_ != null) {
            return false;
          }
        }
        if (schText_ != null) {
          if (!schText_.equals(((AxParaImpl) obj).schText_)) {
            return false;
          }
        }
        else {
          if (((AxParaImpl) obj).schText_ != null) {
            return false;
          }
        }
        if (box_ != null) {
          if (!box_.equals(((AxParaImpl) obj).box_)) {
            return false;
          }
        }
        else {
          if (((AxParaImpl) obj).box_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this AxParaImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "AxParaImpl".hashCode();
    if (nameList_ != null) {
      hashCode += 31 * nameList_.hashCode();
    }
    if (schText_ != null) {
      hashCode += 31 * schText_.hashCode();
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
    if (v instanceof net.sourceforge.czt.z.visitor.AxParaVisitor) {
      net.sourceforge.czt.z.visitor.AxParaVisitor<R> visitor = 
      	  (net.sourceforge.czt.z.visitor.AxParaVisitor<R>) v;
      return visitor.visitAxPara(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public AxParaImpl create(Object[] args)
  {
    AxParaImpl zedObject = null;
    try {
	  	  			  	net.sourceforge.czt.z.ast.NameList nameList = (
						net.sourceforge.czt.z.ast.NameList) args[0];
	  	  	  			  	net.sourceforge.czt.z.ast.SchText schText = (
						net.sourceforge.czt.z.ast.SchText) args[1];
	  	  	  									net.sourceforge.czt.z.ast.
						  	Box box = (
												net.sourceforge.czt.z.ast.
										Box) args[2];
	        zedObject = new AxParaImpl(getFactory());
      zedObject.setNameList(nameList);
      zedObject.setSchText(schText);
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
    Object[] erg = { getNameList(), getSchText(), getBox() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }


  private
            		net.sourceforge.czt.z.ast.NameList
  nameList_;

  public 
		net.sourceforge.czt.z.ast.NameList
  getNameList()
  {
    return nameList_;
  }

  public void setNameList(
		net.sourceforge.czt.z.ast.NameList
	nameList)
  {
                          nameList_ = nameList;
    }
  /**
   * This is a convenience method.
   * It returns a ZNameList if #getNameList
   * returns an instance of ZNameList
   * and throws an UnsupportedAstClassException otherwise.
   */
  public net.sourceforge.czt.z.ast.ZNameList getZNameList()
  {
    net.sourceforge.czt.z.ast.NameList object = getNameList();
    if (object instanceof net.sourceforge.czt.z.ast.ZNameList) {
      return (net.sourceforge.czt.z.ast.ZNameList) object;
    }
    final String message = "Expected the Z implementation of net.sourceforge.czt.z.ast.NameList" +
      " but found " + String.valueOf(object);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
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
            						net.sourceforge.czt.z.ast.
				Box
  box_;

  public 
						net.sourceforge.czt.z.ast.
				Box
  getBox()
  {
    return box_;
  }

  public void setBox(
						net.sourceforge.czt.z.ast.
				Box
	box)
  {
                          box_ = box;
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

  public net.sourceforge.czt.z.ast.ZNameList getName()
  {
	  net.sourceforge.czt.z.ast.NameList dnl = getNameList();
    if (dnl instanceof net.sourceforge.czt.z.ast.ZNameList) {
      return (net.sourceforge.czt.z.ast.ZNameList) dnl;
    }
    final String message = "Expected the default (Z) implementation of NameList" +
      " but found " + String.valueOf(dnl);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }
}
