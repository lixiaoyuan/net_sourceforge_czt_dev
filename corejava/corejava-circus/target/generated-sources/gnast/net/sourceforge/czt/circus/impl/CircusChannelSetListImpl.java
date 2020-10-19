
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
 * {@link net.sourceforge.czt.circus.ast.CircusChannelSetList}.
 *
 * @author GnAST version 1.6-cdh
 */
// net.sourceforge.czt.circus.ast.ChannelSet + net.sourceforge.czt.circus.ast

public class CircusChannelSetListImpl
  extends java.util.AbstractList<net.sourceforge.czt.circus.ast.ChannelSet>
  implements net.sourceforge.czt.circus.ast.CircusChannelSetList
{
  private net.sourceforge.czt.base.impl.BaseFactory factory_;

  /**
   * The list containing the data.
   */
  /*@ non_null @*/
  private java.util.List<net.sourceforge.czt.circus.ast.ChannelSet> list_;

  /**
   * A list of annotations.
   */
  private java.util.List<Object> anns_;
  
    /**
   * static instance count for CircusChannelSetListImpl
   */
  private static long instanceCount_ = 0;

  /**
   * public attribute determining whether to log to the 
   * standard output information about who is creating 
   * this instance of CircusChannelSetListImpl (e.g., ic >= sl)
   */
  //TODO: investigate: findbugs doesn't like it ; made private instead; no-one changes; 
  //	  net.sourceforge.czt.base.util.TermInstanceCountManager.log uses it via reflection
  //private static final long startLoggingFrom_ = Long.MAX_VALUE;

  public static final long instanceCount()
  {
    return instanceCount_;
  }
   
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
  protected CircusChannelSetListImpl()
  {
    this(null);
  }

  protected CircusChannelSetListImpl(net.sourceforge.czt.base.impl.BaseFactory factory)
  {
    super();
    factory_ = factory;
    anns_ = null;
    list_ = null;
        countInstance();
    }
  
  private static synchronized void countInstance()
  {
	  instanceCount_++;
  }

  protected java.util.List<net.sourceforge.czt.circus.ast.ChannelSet> getList()
  {
    if (list_ == null) list_ = new java.util.ArrayList<net.sourceforge.czt.circus.ast.ChannelSet>(net.sourceforge.czt.base.util.PerformanceSettings.INITIAL_ARRAY_CAPACITY);
    return list_;
  }

  @Override
  public String toString()
  {
    try {
      if (factory_ != null) {
        final String result = factory_.toString(this);
        if (result != null) return result;
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    return super.toString();
  }

  /**
   * Returns a list of annotiations.
   */
  @Override
  public java.util.List<Object> getAnns()
  {
    // synchronise the creation bit to avoid races - rare cases? TODO-CHECK
    //synchronized(this)
    //{
      if (anns_ == null) anns_ = new java.util.ArrayList<Object>(net.sourceforge.czt.base.util.PerformanceSettings.INITIAL_ARRAY_CAPACITY);
    //}
    assert anns_ != null;
    return anns_;
  }

  @Override
  public int annsSize()
  {
    return anns_ == null ? 0 : anns_.size();
  }

  @Override
  public boolean hasAnn()
  {
    return annsSize() > 0;
  }

  public net.sourceforge.czt.circus.ast.CircusChannelSetList getChannelSet()
  {
    return this;
  }

  @Override
  @SuppressWarnings("unchecked")
  public <T> T getAnn(Class<T> aClass)
  {
    if (hasAnn()) {
      for (Object annotation : getAnns()) {
        if (aClass.isInstance(annotation)) {
          return (T)annotation;
        }
      }
    }
    return null;
  }
  
  @Override
  public <T> boolean hasAnn(Class<T> aClass)
  {
    return getAnn(aClass) != null;
  }

  @Override
  public <T> void removeAnn(Class<T> aClass)
  {
    if (hasAnn()) {
      java.util.List<Object> anns = getAnns();
      java.util.Iterator<Object> iter = anns.iterator();
      
      while (iter.hasNext()) {
        Object ann = iter.next();
        if (aClass.isInstance(ann)) {
          iter.remove();
        }
      }
      iter = null;
    }
  }

  @Override
  public <T> boolean removeAnn(T annotation)
  {
    boolean result = false;
    if (hasAnn()) {
      java.util.List<Object> anns = getAnns();
      java.util.Iterator<Object> iter = anns.iterator();
      
      while (iter.hasNext() && !result) {
        Object ann = iter.next();
        result = ann.equals(annotation);
      }
      
      if (result) {
        iter.remove();
      }
      iter = null;
    }
    return result;
  }

  /**
   * Inserts the specified element at the specified position in this list.
   * Shifts the element currently at that position (if any) and any
   * subsequent elements to the right (adds one to their indices).
   *
   * @param index the index at which the specified element is to be inserted.
   * @param element the element to be inserted.
   * @throws IndexOutOfBoundsException if the index is out of range
   *         <code>(index < 0 || index > size())</code>.
   */
  @Override
  public void add(int index, net.sourceforge.czt.circus.ast.ChannelSet element)
  {
    getList().add(index, element);
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index the index of the elment to be returned.
   * @return the element at the specified position in this list.
   * @throws IndexOutOfBoundsException if the index is out of range
   *         <code>(index < 0 || index >= size())</code>.
   */
  @Override
  public net.sourceforge.czt.circus.ast.ChannelSet get(int index)
  {
    return getList().get(index);
  }

  /**
   * Removes the element at the specified position in this list.
   * Shifts any subsequent elements to the left
   * (subtracts one from their indices).
   * Returns the element that was removed from the list.
   *
   * @param index the index of the element to be removed.
   * @return the element previously at the specified position.
   * @throws IndexOutOfBoundsException if the index is out of range
   *         <code>(index < 0 || index >= size())</code>.
   */
  @Override
  public net.sourceforge.czt.circus.ast.ChannelSet remove(int index)
  {
    return getList().remove(index);
  }

  /**
   * Replaces the elment at the specifed position
   * in this list with the specified element.
   *
   * @param index the position of the element to replace.
   * @param element the new element to be stored at the specified position.
   * @return the element previously at the specified position.
   * @throws ArrayIndexOutOfBoundsException if <code>index</code>
   *         is out of range <code>(index < 0 || index >= size())</code>.
   */
  @Override
  public net.sourceforge.czt.circus.ast.ChannelSet set(int index, net.sourceforge.czt.circus.ast.ChannelSet element)
  {
    return getList().set(index, element);
  }

  /**
   * Returns the number of components in this list.
   */
  @Override
  public int size()
  {
    return getList().size();
  }

  @Override
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof net.sourceforge.czt.circus.visitor.CircusChannelSetListVisitor) {
      net.sourceforge.czt.circus.visitor.CircusChannelSetListVisitor<R> visitor = 
      		(net.sourceforge.czt.circus.visitor.CircusChannelSetListVisitor<R>) v;
      return visitor.visitCircusChannelSetList(this);
    }
    if (v instanceof net.sourceforge.czt.base.visitor.TermVisitor) {
      net.sourceforge.czt.base.visitor.TermVisitor<R> visitor = (net.sourceforge.czt.base.visitor.TermVisitor<R>) v;
      return visitor.visitTerm(this);
    }
    return null;
  }

  @Override
  public Object[] getChildren()
  {
    return getList().isEmpty() ? new Object[0] : getList().toArray();
  }

  @Override
  public CircusChannelSetListImpl create(Object[] args)
  {
    CircusChannelSetListImpl result = new CircusChannelSetListImpl(factory_);
    for (int i = 0; i < args.length; i++) {
      result.add((net.sourceforge.czt.circus.ast.ChannelSet) args[i]);
    }
    return result;
  }
}
