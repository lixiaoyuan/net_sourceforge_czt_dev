
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

package net.sourceforge.czt.zeves.ast;

																																																				

/**
 * List of possible instantiations. It appears in proof commands (e.g., instantiate and use), as well
        as part of schema construction renaming like (THETA S [x := 10]), hence the RenameList substition group.
 *
 * @author GnAST version 1.6-cdh
 */ 
 



public interface InstantiationList extends 		 						net.sourceforge.czt.z.ast.RenameList
			 		, java.util.List<net.sourceforge.czt.zeves.ast.Instantiation>	{
  InstantiationList getInstantiation();
}
