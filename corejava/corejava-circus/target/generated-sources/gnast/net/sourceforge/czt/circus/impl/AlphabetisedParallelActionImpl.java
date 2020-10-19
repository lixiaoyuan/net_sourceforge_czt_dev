
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
 * {@link net.sourceforge.czt.circus.ast.AlphabetisedParallelAction}.
 *
 * @author GnAST version 1.6-cdh
 */
public class AlphabetisedParallelActionImpl
extends 		 		net.sourceforge.czt.circus.impl.ParActionImpl
 	  implements net.sourceforge.czt.circus.ast.AlphabetisedParallelAction
{





  /**
   * static instance count for AlphabetisedParallelActionImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of AlphabetisedParallelActionImpl (e.g., ic >= sl)
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
  protected AlphabetisedParallelActionImpl()
  {
    this(null);
  }

  protected AlphabetisedParallelActionImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this AlphabetisedParallelActionImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) AlphabetisedParallelActionImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //AlphabetisedParallelActionImpl object = ((AlphabetisedParallelActionImpl) obj);
        if (channelSet_ != null) {
          if (!channelSet_.equals(((AlphabetisedParallelActionImpl) obj).channelSet_)) {
            return false;
          }
        }
        else {
          if (((AlphabetisedParallelActionImpl) obj).channelSet_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this AlphabetisedParallelActionImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "AlphabetisedParallelActionImpl".hashCode();
    if (channelSet_ != null) {
      hashCode += 31 * channelSet_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.circus.visitor.AlphabetisedParallelActionVisitor) {
      net.sourceforge.czt.circus.visitor.AlphabetisedParallelActionVisitor<R> visitor = 
      	  (net.sourceforge.czt.circus.visitor.AlphabetisedParallelActionVisitor<R>) v;
      return visitor.visitAlphabetisedParallelAction(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public AlphabetisedParallelActionImpl create(Object[] args)
  {
    AlphabetisedParallelActionImpl zedObject = null;
    try {
	  		  @SuppressWarnings("unchecked")
	  	  	  java.util.List<net.sourceforge.czt.circus.ast.CircusAction>
	  	circusAction = (java.util.List<net.sourceforge.czt.circus.ast.CircusAction>) args[0];
	  	  		  @SuppressWarnings("unchecked")
	  	  	  java.util.List<net.sourceforge.czt.circus.ast.NameSet>
	  	nameSet = (java.util.List<net.sourceforge.czt.circus.ast.NameSet>) args[1];
	  	  		  @SuppressWarnings("unchecked")
	  	  	  java.util.List<net.sourceforge.czt.circus.ast.ChannelSet>
	  	channelSet = (java.util.List<net.sourceforge.czt.circus.ast.ChannelSet>) args[2];
	        zedObject = new AlphabetisedParallelActionImpl(getFactory());
      if (circusAction != null) {
        zedObject.getCircusAction().addAll(circusAction);
      }
      if (nameSet != null) {
        zedObject.getNameSet().addAll(nameSet);
      }
      if (channelSet != null) {
        zedObject.getChannelSet().addAll(channelSet);
      }
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
    Object[] erg = { getCircusAction(), getNameSet(), getChannelSet() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }


  private net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.circus.ast.ChannelSet> channelSet_ =
    new net.sourceforge.czt.base.impl.ListTermImpl<net.sourceforge.czt.circus.ast.ChannelSet>();

  public net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.circus.ast.ChannelSet> getChannelSet()
  {
    return channelSet_;
  }
  public net.sourceforge.czt.circus.ast.ChannelSet getLeftAlpha()
  {
	  net.sourceforge.czt.circus.ast.ChannelSet result = null;
    if (getChannelSet().size() > 0) {
      result = getChannelSet().get(0);
    }
    return result;
  }

  public void setLeftAlpha(net.sourceforge.czt.circus.ast.ChannelSet alpha)
  {
    if (getChannelSet().size() > 0) {
      getChannelSet().set(0, alpha);
    }
    else {
      getChannelSet().add(alpha);
    }
  }

  public net.sourceforge.czt.circus.ast.ChannelSet getRightAlpha()
  {
	  net.sourceforge.czt.circus.ast.ChannelSet result = null;
    if (getChannelSet().size() > 1) {
      result = getChannelSet().get(1);
    }
    return result;
  }

  public void setRightAlpha(net.sourceforge.czt.circus.ast.ChannelSet alpha)
  {
    if (getChannelSet().size() == 0) {
      getChannelSet().add(null);
    }
    if (getChannelSet().size() > 1) {
      getChannelSet().set(1, alpha);
    }
    else {
      getChannelSet().add(alpha);
    }
  }
}