
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

package net.sourceforge.czt.zeves.visitor;

/**
 * An interface that collects all single visitor interfaces
 * contained in this package.
 *
 * @author GnAST version 1.6-cdh
 */
public interface ZEvesVisitor<R>
  extends
    net.sourceforge.czt.zeves.visitor.SimplificationCommandVisitor<R>,
    net.sourceforge.czt.zeves.visitor.InstantiationListVisitor<R>,
    net.sourceforge.czt.zeves.visitor.ZEvesLabelVisitor<R>,
    net.sourceforge.czt.zeves.visitor.ApplyCommandVisitor<R>,
    net.sourceforge.czt.zeves.visitor.QuantifiersCommandVisitor<R>,
    net.sourceforge.czt.zeves.visitor.ProofCommandInfoVisitor<R>,
    net.sourceforge.czt.zeves.visitor.ProofScriptVisitor<R>,
    net.sourceforge.czt.zeves.visitor.UseCommandVisitor<R>,
    net.sourceforge.czt.zeves.visitor.ProofCommandInfoListVisitor<R>,
    net.sourceforge.czt.zeves.visitor.SorryCommandVisitor<R>,
    net.sourceforge.czt.zeves.visitor.ProofTypeVisitor<R>,
    net.sourceforge.czt.zeves.visitor.WithCommandVisitor<R>,
    net.sourceforge.czt.zeves.visitor.SubstitutionCommandVisitor<R>,
    net.sourceforge.czt.zeves.visitor.ZEvesNoteVisitor<R>,
    net.sourceforge.czt.zeves.visitor.NormalizationCommandVisitor<R>,
    net.sourceforge.czt.zeves.visitor.ProofCommandListVisitor<R>,
    net.sourceforge.czt.zeves.visitor.InstantiationVisitor<R>,
    net.sourceforge.czt.zeves.visitor.CaseAnalysisCommandVisitor<R>,
    net.sourceforge.czt.util.Visitor<R>
{
}
