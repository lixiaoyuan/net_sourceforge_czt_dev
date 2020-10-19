
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

package net.sourceforge.czt.zeves.impl;

																																																				

/**
 * An implementation of the interface
 * {@link net.sourceforge.czt.zeves.ast.ZEvesLabel}.
 *
 * @author GnAST version 1.6-cdh
 */
public class ZEvesLabelImpl
extends   		net.sourceforge.czt.base.impl.TermImpl
	  implements net.sourceforge.czt.zeves.ast.ZEvesLabel
{





  /**
   * static instance count for ZEvesLabelImpl
   */
   private static long instanceCount_ = 0;
   
  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of ZEvesLabelImpl (e.g., ic >= sl)
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
   * {@link net.sourceforge.czt.zeves.ast.ZEvesFactory object factory}.
   */
  protected ZEvesLabelImpl()
  {
    this(null);
  }

  protected ZEvesLabelImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super(factory);
    countInstance();
  }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }
  
  /**
   * Compares the specified object with this ZEvesLabelImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ZEvesLabelImpl and all the getter methods except getAnns
   * return equal objects.
   */
  @Override
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
      	// if foreach on meta-model (.vm) file is empty, this won't be used.
      	//@SuppressWarnings("unused")
        //ZEvesLabelImpl object = ((ZEvesLabelImpl) obj);
        if (name_ != null) {
          if (!name_.equals(((ZEvesLabelImpl) obj).name_)) {
            return false;
          }
        }
        else {
          if (((ZEvesLabelImpl) obj).name_ != null) {
            return false;
          }
        }
        if (labelAbility_ != null) {
          if (!labelAbility_.equals(((ZEvesLabelImpl) obj).labelAbility_)) {
            return false;
          }
        }
        else {
          if (((ZEvesLabelImpl) obj).labelAbility_ != null) {
            return false;
          }
        }
        if (labelUsage_ != null) {
          if (!labelUsage_.equals(((ZEvesLabelImpl) obj).labelUsage_)) {
            return false;
          }
        }
        else {
          if (((ZEvesLabelImpl) obj).labelUsage_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ZEvesLabelImpl.
   */
  @Override
  public int hashCode()
  {
    //final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ZEvesLabelImpl".hashCode();
    if (name_ != null) {
      hashCode += 31 * name_.hashCode();
    }
    if (labelAbility_ != null) {
      hashCode += 31 * labelAbility_.hashCode();
    }
    if (labelUsage_ != null) {
      hashCode += 31 * labelUsage_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.zeves.visitor.ZEvesLabelVisitor) {
      net.sourceforge.czt.zeves.visitor.ZEvesLabelVisitor<R> visitor = 
      	  (net.sourceforge.czt.zeves.visitor.ZEvesLabelVisitor<R>) v;
      return visitor.visitZEvesLabel(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public ZEvesLabelImpl create(Object[] args)
  {
    ZEvesLabelImpl zedObject = null;
    try {
	  	  			  	net.sourceforge.czt.z.ast.Name name = (
						net.sourceforge.czt.z.ast.Name) args[0];
	  	  	  									net.sourceforge.czt.zeves.ast.
						  	LabelAbility labelAbility = (
												net.sourceforge.czt.zeves.ast.
										LabelAbility) args[1];
	  	  	  									net.sourceforge.czt.zeves.ast.
						  	LabelUsage labelUsage = (
												net.sourceforge.czt.zeves.ast.
										LabelUsage) args[2];
	        zedObject = new ZEvesLabelImpl(getFactory());
      zedObject.setName(name);
      zedObject.setLabelAbility(labelAbility);
      zedObject.setLabelUsage(labelUsage);
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
    Object[] erg = { getName(), getLabelAbility(), getLabelUsage() };
    return erg;
  }
  
  /** Only concrete classes get the instance count method visible */
  // JokerCommunication in circuspatt extends CommunicationImpl which is not abstract? weird...
  public static /*final*/ long instanceCount()
  {
    return instanceCount_;
  }


  private
            		net.sourceforge.czt.z.ast.Name
  name_;

  public 
		net.sourceforge.czt.z.ast.Name
  getName()
  {
    return name_;
  }

  public void setName(
		net.sourceforge.czt.z.ast.Name
	name)
  {
                          name_ = name;
    }


  private
            						net.sourceforge.czt.zeves.ast.
				LabelAbility
  labelAbility_;

  public 
						net.sourceforge.czt.zeves.ast.
				LabelAbility
  getLabelAbility()
  {
    return labelAbility_;
  }

  public void setLabelAbility(
						net.sourceforge.czt.zeves.ast.
				LabelAbility
	labelAbility)
  {
                          labelAbility_ = labelAbility;
    }


  private
            						net.sourceforge.czt.zeves.ast.
				LabelUsage
  labelUsage_;

  public 
						net.sourceforge.czt.zeves.ast.
				LabelUsage
  getLabelUsage()
  {
    return labelUsage_;
  }

  public void setLabelUsage(
						net.sourceforge.czt.zeves.ast.
				LabelUsage
	labelUsage)
  {
                          labelUsage_ = labelUsage;
    }
public net.sourceforge.czt.z.ast.ZName getZName()
  {
    net.sourceforge.czt.z.ast.Name declName = getName();
    if (declName instanceof net.sourceforge.czt.z.ast.ZName) {
      return (net.sourceforge.czt.z.ast.ZName) declName;
    }
    final String message = "Expected the default (Z) implementation of Name" +
      " but found " + String.valueOf(declName);
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException(message);
  }}
