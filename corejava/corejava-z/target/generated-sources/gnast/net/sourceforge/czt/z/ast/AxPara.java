
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

package net.sourceforge.czt.z.ast;

																																																				

/**
 * A (generic) axiomatic paragraph, (generic) schema definition,
        or (generic) horizontal definition
        <ul>
        <li>C.4.3 (Axiomatic description) and C.4.5 (Generic description).
          In this case, Box=AxBox.  NameList contains the generic parameters,
          so is empty for an axiomatic description.  For example,
          <code>\begin{axdef}     x,y: \nat \where x \neq y \end{axdef}</code>
          <code>\begin{gendef}[T] x,y: T \where x \neq y \end{gendef}</code>
          both translate into an AxPara with Box=AxBox and SchText containing
          the declaration of x and y, and the predicate x \neq y.  For the axdef
          example, NameList is empty, whereas for the gendef example it
          contains T.
        </li>        
        <li>C.4.4 (Schema definition) and C.4.6 (Generic schema definition).
          In this case, Box=SchBox.  For example,
          <code>\begin{schema}{S} x,y: \nat \where x \neq y \end{schema}</code>
          is translated into a nongeneric AxPara (see 12.2.3.1 or C.4.4.2)
          whose SchText contains a single ConstDecl, S == [x,y:\nat | x \neq y].
          A generic schema definition is similar but has a non empty NameList
          (see 12.2.3.2 or C.4.6.2).
        </li>                
        <li>C.4.7 (Horizontal definition) and
            C.4.8 (Generic horizontal definition).
          In this case, Box=OmitBox.  For example,
          <code>\begin{zed}S == [x,y: \nat | x \neq y]\end{zed}</code>
          is translated into a nongeneric AxPara (see 12.2.3.3 or C.4.7.2)
          whose SchText contains a single ConstDecl, S == [x,y:\nat | x \neq y].
          A generic horizontal definition is similar but has a non empty
          NameList (see 12.2.3.4 or C.4.8.2).
        </li>        
        </ul>
 *
 * @author GnAST version 1.6-cdh
 */ 
 



public interface AxPara extends 		 		net.sourceforge.czt.z.ast.Para
 			{

  /**
   * Returns the NameList element.
   *
   * @return the NameList element.
   */
  net.sourceforge.czt.z.ast.NameList getNameList();


  /**
   * This is a convenience method.
   * It returns a ZNameList if #getNameList
   * returns an instance of ZNameList
   * and throws an UnsupportedAstClassException otherwise.
   */
  net.sourceforge.czt.z.ast.ZNameList getZNameList();

  /**
   * Sets the NameList element.
   *
   * @param nameList   the NameList element.
   * @see #getNameList
   */
  void setNameList(net.sourceforge.czt.z.ast.NameList nameList);

  /**
   * Returns the SchText element.
   *
   * @return the SchText element.
   */
  net.sourceforge.czt.z.ast.SchText getSchText();


  /**
   * Sets the SchText element.
   *
   * @param schText   the SchText element.
   * @see #getSchText
   */
  void setSchText(net.sourceforge.czt.z.ast.SchText schText);

  /**
   * Returns the Box element.
   *
   * @return the Box element.
   */
  Box getBox();


  /**
   * Sets the Box element.
   *
   * @param box   the Box element.
   * @see #getBox
   */
  void setBox(Box box);

  /**
   * This is a convenience method.
   * It returns the ZSchText if SchText is an instance of
   * ZSchText and throws an UnsupportedAstClassException otherwise.
   */
  ZSchText getZSchText();

  ZNameList getName();
}