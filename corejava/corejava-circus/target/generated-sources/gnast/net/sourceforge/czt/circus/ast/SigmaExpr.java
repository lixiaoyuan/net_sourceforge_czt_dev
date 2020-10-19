
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
          Expression for channel selections, such as c.x or c.true for channel c. 
          It is set of pairs, where the first element is the channel reference and 
          the second element is the expression corresponding to the value to be
          communicaticated. The channel reference is a RefExpr, as channel can 
          contain generic actuals. It denotes set of the all the possible values a 
          channel can communicate.
        </p>
        <p>
          These expressions require special typechecking to ensure that elements are 
          well typed with respect to the (RefExpr X Expr) pair, rather than the structure 
          of the expressions. That is, SigmaExpr unify even when the expression have different
          types, so that we can create the Sigma environment.
        </p>
 *
 * @author GnAST version 1.6-cdh
 */ 
 



public interface SigmaExpr extends 		 						net.sourceforge.czt.z.ast.Expr
						 			{

  /**
   * Returns the Channel element.
   *
   * @return the Channel element.
   */
  net.sourceforge.czt.z.ast.RefExpr getChannel();


  /**
   * Sets the Channel element.
   *
   * @param channel   the Channel element.
   * @see #getChannel
   */
  void setChannel(net.sourceforge.czt.z.ast.RefExpr channel);

  /**
   * Returns the Value element.
   *
   * @return the Value element.
   */
  net.sourceforge.czt.z.ast.Expr getValue();


  /**
   * Sets the Value element.
   *
   * @param value   the Value element.
   * @see #getValue
   */
  void setValue(net.sourceforge.czt.z.ast.Expr value);
}