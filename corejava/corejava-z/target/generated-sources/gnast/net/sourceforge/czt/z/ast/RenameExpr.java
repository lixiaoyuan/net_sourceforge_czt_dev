
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
 * A schema renaming expression (C.6.24).
	The schema does not check that the RenameList is non-empty, but
        code should.
 *
 * @author GnAST version 1.6-cdh
 */ 
 



public interface RenameExpr extends 		 		net.sourceforge.czt.z.ast.Expr1
 			{

  /**
   * Returns the RenameList element.
   *
   * @return the RenameList element.
   */
  net.sourceforge.czt.z.ast.RenameList getRenameList();


  /**
   * This is a convenience method.
   * It returns a ZRenameList if #getRenameList
   * returns an instance of ZRenameList
   * and throws an UnsupportedAstClassException otherwise.
   */
  net.sourceforge.czt.z.ast.ZRenameList getZRenameList();

  /**
   * Sets the RenameList element.
   *
   * @param renameList   the RenameList element.
   * @see #getRenameList
   */
  void setRenameList(net.sourceforge.czt.z.ast.RenameList renameList);
}
