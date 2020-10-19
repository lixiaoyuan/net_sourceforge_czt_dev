
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstInterface.vm.
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

package net.sourceforge.czt.circus.ast;

																																																				

/**
 * <p>
          A channel declaration is a Z declaration that accepts generic types.
          It represents the <b>SimpleCDeclaration</b> grammar rule.
        </p>
        <p>
          Channels can be declared either as typed or synchronisation. 
          They can als have generic types or come from a previously declared schema.
        </p>
        <p>
          The structure of the complex type associated with this class is a follows:
          <ul>
            <li>Typed  channels = optional generics, nonempty list of declnames, non-null Expr. </li>
            <li>Synch. channels = empty generics, nonempty list of declnames, RefExpr(SYNCH), where SYNCH is a given type. </li>
            <li>Schema channels = optional generics, empty list of declnames, non-null RefExpr. </li>          
          </ul>
          This invariant is to be enforced by the parser, and further unfolded by the typechecker.
          That is, channels declared through schemas must be expanded to their typed declaration form.
          Such unfolding must take into account both sets of generic formals comming from the channel 
          declaration as well as the schema generic formals. In this sense, the user is allowed to
          change the pattern of generic formals inside the schema through the generic formals of the
          channel declaration (see <code>./parser/tests/cirus/channels.tex</code> for an example).
        </p>
        <p>
          The <code>getNameList()</code> method contains a list of non-null <code>NameList </code> 
          objects with size two. The first element is the (possibly empty) list of generic formal 
          parameters, whereas the second element is the (possibly empty) list of declared channel names.
          If the second list is empty, that means the <code>ChannelDecl</code> represents a <em>channelfrom</em>
          (i.e., channel declaration from a schema expression found in the <code>getExpr()</code> method).
        </p>
 *
 * @author GnAST version 1.6-cdh
 */ 
 



public interface ChannelDecl extends 		 						net.sourceforge.czt.z.ast.Decl
						 			{

  /**
   * <p>Returns the NameList elements.</p>
   * <p>To add or remove elements, use the methods provided by
   * the List interface (that's why there is no need for a setter
   * method).</p>
   *
   * @return a list of NameList elements.
   */
  net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.z.ast.NameList> getNameList();

  /**
   * Returns the Expr element.
   *
   * @return the Expr element.
   */
  net.sourceforge.czt.z.ast.Expr getExpr();


  /**
   * Sets the Expr element.
   *
   * @param expr   the Expr element.
   * @see #getExpr
   */
  void setExpr(net.sourceforge.czt.z.ast.Expr expr);
  final static int CHANNEL_GENFORMAL_INDEX = 0;
  final static int CHANNEL_NAMELIST_INDEX = 1;

  /**
   * This is a convenience method. It represents the non-null (possibly empty)
   * list of generic formal parameters for this channel declaration.
   * 
   * It returns the ZNameList from getNameList().get(0) if it is an instance of
   * ZNameList, or throws an UnsupportedAstClassException otherwise.
   */
  net.sourceforge.czt.z.ast.ZNameList getZGenFormals();

  /**
   * This is a convenience method. It represents the non-null (possibly empty)
   * list of declared channel names for this channel declaration. If the list is
   * empty, this represennt a "channelfrom" declaration, where the getExpr() returns
   * the SchExpr the delcared channels can be found.
   *
   * It returns the ZNameList if NameList is an instance of
   * ZNameList or throws an UnsupportedAstClassException otherwise.
   */
  net.sourceforge.czt.z.ast.ZNameList getZChannelNameList();
}