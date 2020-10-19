
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
          A channel set paragraph that declares a name for a channel set.
          A channel set encapsulates a Z <code>Expr</code>.
        </p>
        <p>
          It represents the <b>channelset</b> <code>N == CSExpression</code> grammar rule, 
          where <code>N</code> is a <code>Name</code>
        </p>
 *
 * @author GnAST version 1.6-cdh
 */ 
 



public interface ChannelSetPara extends 		 						net.sourceforge.czt.z.ast.Para
						 			{

  /**
   * Returns the GenFormals element.
   *
   * @return the GenFormals element.
   */
  net.sourceforge.czt.z.ast.NameList getGenFormals();


  /**
   * Sets the GenFormals element.
   *
   * @param genFormals   the GenFormals element.
   * @see #getGenFormals
   */
  void setGenFormals(net.sourceforge.czt.z.ast.NameList genFormals);

  /**
   * Returns the Name element.
   *
   * @return the Name element.
   */
  net.sourceforge.czt.z.ast.Name getName();


  /**
   * Sets the Name element.
   *
   * @param name   the Name element.
   * @see #getName
   */
  void setName(net.sourceforge.czt.z.ast.Name name);

  /**
   * Returns the ChannelSet element.
   *
   * @return the ChannelSet element.
   */
  net.sourceforge.czt.circus.ast.ChannelSet getChannelSet();


  /**
   * Sets the ChannelSet element.
   *
   * @param channelSet   the ChannelSet element.
   * @see #getChannelSet
   */
  void setChannelSet(net.sourceforge.czt.circus.ast.ChannelSet channelSet);
  /**
   * This is a convenience method.
   * It returns the ZNameList if NameList is an instance of
   * ZNameList or throws an UnsupportedAstClassException otherwise.
   */
  net.sourceforge.czt.z.ast.ZNameList getZGenFormals();


  /**
   * This is a convenience method.
   * It returns the ZName if Name is an instance of
   * ZName and throws an UnsupportedAstClassException otherwise.
   */
  net.sourceforge.czt.z.ast.ZName getZName();
}