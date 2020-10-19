
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
 * A (generic) conjecture paragraph (C.4.11, C.4.12).
 *
 * @author GnAST version 1.6-cdh
 */ 
 



public interface ConjPara extends 		 		net.sourceforge.czt.z.ast.Para
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
   * Returns the Pred element.
   *
   * @return the Pred element.
   */
  net.sourceforge.czt.z.ast.Pred getPred();


  /**
   * Sets the Pred element.
   *
   * @param pred   the Pred element.
   * @see #getPred
   */
  void setPred(net.sourceforge.czt.z.ast.Pred pred);

  /**
   * This is a convenience method for getting the name of a conjecture.
   * Conjecture names are currently optional at the Unicode level, and 
   * are stored as annotations rather than as normal entries in the
   * CZT XML format.  This method returns a non-null String if the conjecture
   * has a name annotation, or null otherwise.  If the Z standard is
   * extended in the future so that conjecture names are compulsory
   * in the Unicode markup (as they are in the LaTeX markup), then
   * this method may be replaced by an equivalent method that
   * is automatically generated from the CZT XML schema.
   */
  String getName();
  
  void setName(Name name);
}
