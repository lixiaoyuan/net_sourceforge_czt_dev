
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
 * {@link net.sourceforge.czt.z.ast.ZSect}.
 *
 * @author GnAST version 1.6-cdh
 */
public class ZSectImpl
extends 		 		net.sourceforge.czt.z.impl.SectImpl
 	  implements net.sourceforge.czt.z.ast.ZSect
{





  /**
   * static instance count for ZSectImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of ZSectImpl (e.g., ic >= sl)
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
  protected ZSectImpl()
  {
    this(null);
  }

  protected ZSectImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this ZSectImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ZSectImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //ZSectImpl object = ((ZSectImpl) obj);
        if (name_ != null) {
          if (!name_.equals(((ZSectImpl) obj).name_)) {
            return false;
          }
        }
        else {
          if (((ZSectImpl) obj).name_ != null) {
            return false;
          }
        }
        if (parent_ != null) {
          if (!parent_.equals(((ZSectImpl) obj).parent_)) {
            return false;
          }
        }
        else {
          if (((ZSectImpl) obj).parent_ != null) {
            return false;
          }
        }
        if (paraList_ != null) {
          if (!paraList_.equals(((ZSectImpl) obj).paraList_)) {
            return false;
          }
        }
        else {
          if (((ZSectImpl) obj).paraList_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ZSectImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ZSectImpl".hashCode();
    if (name_ != null) {
      hashCode += 31 * name_.hashCode();
    }
    if (parent_ != null) {
      hashCode += 31 * parent_.hashCode();
    }
    if (paraList_ != null) {
      hashCode += 31 * paraList_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.z.visitor.ZSectVisitor) {
      net.sourceforge.czt.z.visitor.ZSectVisitor<R> visitor = 
      	  (net.sourceforge.czt.z.visitor.ZSectVisitor<R>) v;
      return visitor.visitZSect(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public ZSectImpl create(Object[] args)
  {
    ZSectImpl zedObject = null;
    try {
	  	  								  	String name = (
													String) args[0];
	  	  		  @SuppressWarnings("unchecked")
	  	  	  java.util.List<net.sourceforge.czt.z.ast.Parent>
	  	parent = (java.util.List<net.sourceforge.czt.z.ast.Parent>) args[1];
	  	  	  			  	net.sourceforge.czt.z.ast.ParaList paraList = (
						net.sourceforge.czt.z.ast.ParaList) args[2];
	        zedObject = new ZSectImpl(getFactory());
      zedObject.setName(name);
      if (parent != null) {
        zedObject.getParent().addAll(parent);
      }
      zedObject.setParaList(paraList);
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
    Object[] erg = { getName(), getParent(), getParaList() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }


  private
            					String
  name_;

  public 
					String
  getName()
  {
    return name_;
  }

  public void setName(
					String
	name)
  {
                          name_ = name;
    }


  private net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.z.ast.Parent> parent_ =
    new net.sourceforge.czt.base.impl.ListTermImpl<net.sourceforge.czt.z.ast.Parent>();

  public net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.z.ast.Parent> getParent()
  {
    return parent_;
  }


  private
            		net.sourceforge.czt.z.ast.ParaList
  paraList_;

  public 
		net.sourceforge.czt.z.ast.ParaList
  getParaList()
  {
    return paraList_;
  }

  public void setParaList(
		net.sourceforge.czt.z.ast.ParaList
	paraList)
  {
                          paraList_ = paraList;
    }
  public net.sourceforge.czt.z.ast.ZParaList getZParaList()
  {
    net.sourceforge.czt.z.ast.ParaList pl = getParaList();
    if (pl instanceof net.sourceforge.czt.z.ast.ZParaList) {
      return (net.sourceforge.czt.z.ast.ZParaList) pl;
    }
    final String message = "Expected the default (Z) implementation of ParaList" +
      " but found " + String.valueOf(pl);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }
}