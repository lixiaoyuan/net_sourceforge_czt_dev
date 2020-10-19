
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstVisitor.vm.
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

package net.sourceforge.czt.circuspatt.visitor;

/**
 * An interface that collects all single visitor interfaces
 * contained in this package.
 *
 * @author GnAST version 1.6-cdh
 */
public interface CircusPatternVisitor<R>
  extends
    net.sourceforge.czt.circuspatt.visitor.JokerCommunicationBindingVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerChannelSetBindingVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerCommunicationVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerProcessBindingVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerNameSetVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerActionBindingVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerActionVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerChannelSetVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.CircusJokersVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerNameSetBindingVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerParaVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerParaBindingVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerParaListBindingVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerProcessVisitor<R>,
    net.sourceforge.czt.circuspatt.visitor.JokerParaListVisitor<R>,
    net.sourceforge.czt.util.Visitor<R>
{
}