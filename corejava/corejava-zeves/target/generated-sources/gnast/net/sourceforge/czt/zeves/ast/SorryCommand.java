
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
 * Sorry and Oops - virtual - commands; inspired by Isabelle's meanings: sorry is give up on proving,
      yet keep the theorem; oops, gives up on proving, but don't keep the theorem albeit leave the goal.
 *
 * @author GnAST version 1.6-cdh
 */ 
 



public interface SorryCommand extends 		 		net.sourceforge.czt.zeves.ast.ProofCommand
 			{

  /**
   * Returns the KeepGoal element.
   *
   * @return the KeepGoal element.
   */
  Boolean getKeepGoal();


  /**
   * Sets the KeepGoal element.
   *
   * @param keepGoal   the KeepGoal element.
   * @see #getKeepGoal
   */
  void setKeepGoal(Boolean keepGoal);
}