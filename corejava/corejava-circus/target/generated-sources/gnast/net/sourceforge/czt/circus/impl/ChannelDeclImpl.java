
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
 * {@link net.sourceforge.czt.circus.ast.ChannelDecl}.
 *
 * @author GnAST version 1.6-cdh
 */
public class ChannelDeclImpl
extends 		 						net.sourceforge.czt.z.impl.DeclImpl
						 	  implements net.sourceforge.czt.circus.ast.ChannelDecl
{





  /**
   * static instance count for ChannelDeclImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of ChannelDeclImpl (e.g., ic >= sl)
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
  protected ChannelDeclImpl()
  {
    this(null);
  }

  protected ChannelDeclImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this ChannelDeclImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ChannelDeclImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //ChannelDeclImpl object = ((ChannelDeclImpl) obj);
        if (nameList_ != null) {
          if (!nameList_.equals(((ChannelDeclImpl) obj).nameList_)) {
            return false;
          }
        }
        else {
          if (((ChannelDeclImpl) obj).nameList_ != null) {
            return false;
          }
        }
        if (expr_ != null) {
          if (!expr_.equals(((ChannelDeclImpl) obj).expr_)) {
            return false;
          }
        }
        else {
          if (((ChannelDeclImpl) obj).expr_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ChannelDeclImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ChannelDeclImpl".hashCode();
    if (nameList_ != null) {
      hashCode += 31 * nameList_.hashCode();
    }
    if (expr_ != null) {
      hashCode += 31 * expr_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.circus.visitor.ChannelDeclVisitor) {
      net.sourceforge.czt.circus.visitor.ChannelDeclVisitor<R> visitor = 
      	  (net.sourceforge.czt.circus.visitor.ChannelDeclVisitor<R>) v;
      return visitor.visitChannelDecl(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public ChannelDeclImpl create(Object[] args)
  {
    ChannelDeclImpl zedObject = null;
    try {
	  		  @SuppressWarnings("unchecked")
	  	  	  java.util.List<net.sourceforge.czt.z.ast.NameList>
	  	nameList = (java.util.List<net.sourceforge.czt.z.ast.NameList>) args[0];
	  	  	  			  	net.sourceforge.czt.z.ast.Expr expr = (
						net.sourceforge.czt.z.ast.Expr) args[1];
	        zedObject = new ChannelDeclImpl(getFactory());
      if (nameList != null) {
        zedObject.getNameList().addAll(nameList);
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
    Object[] erg = { getNameList(), getExpr() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }


  private net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.z.ast.NameList> nameList_ =
    new net.sourceforge.czt.base.impl.ListTermImpl<net.sourceforge.czt.z.ast.NameList>();

  public net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.z.ast.NameList> getNameList()
  {
    return nameList_;
  }


  private
            		net.sourceforge.czt.z.ast.Expr
  expr_;

  public 
		net.sourceforge.czt.z.ast.Expr
  getExpr()
  {
    return expr_;
  }

  public void setExpr(
		net.sourceforge.czt.z.ast.Expr
	expr)
  {
                          expr_ = expr;
    }
  public net.sourceforge.czt.z.ast.ZNameList getZGenFormals()
  {
    if (getNameList().size() > CHANNEL_GENFORMAL_INDEX) {
      net.sourceforge.czt.z.ast.NameList rnl = getNameList().get(CHANNEL_GENFORMAL_INDEX);
      if (rnl instanceof net.sourceforge.czt.z.ast.ZNameList) {
        return (net.sourceforge.czt.z.ast.ZNameList) rnl;
      }
      final String message = "Expected the default (Z) implementation of NameList" +
        " but found " + String.valueOf(rnl);
      throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
    }
    final String message = "Invalid channel declaration name list size. Expected a value greater than " + 
        CHANNEL_GENFORMAL_INDEX + " but found " + getNameList().size();
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }

  public net.sourceforge.czt.z.ast.ZNameList getZChannelNameList()
  {
    if (getNameList().size() > CHANNEL_NAMELIST_INDEX) {
      net.sourceforge.czt.z.ast.NameList rnl = getNameList().get(CHANNEL_NAMELIST_INDEX);
      if (rnl instanceof net.sourceforge.czt.z.ast.ZNameList) {
        return (net.sourceforge.czt.z.ast.ZNameList) rnl;
      }
      final String message = "Expected the default (Z) implementation of NameList" +
        " but found " + String.valueOf(rnl);
      throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
    }
    final String message = "Invalid channel declaration name list size. Expected a value greater than " + 
        CHANNEL_NAMELIST_INDEX + " but found " + getNameList().size();
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }
}
