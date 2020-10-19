
/*
  Copyright (C) 2004, 2005, 2006, 2007 Petra Malik
  This file is part of the CZT project.

  The CZT project contains free software;
  you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.

  The CZT project is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with CZT; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
package net.sourceforge.czt.parser.circus;

import java.io.IOException;
import java.util.Collection;
import java.util.Properties;

import java_cup.runtime.Symbol;

import net.sourceforge.czt.parser.util.ParseException;
import net.sourceforge.czt.parser.util.ScanException;
import net.sourceforge.czt.parser.util.CztScanner;
import net.sourceforge.czt.z.ast.Spec;
import net.sourceforge.czt.session.Key;
import net.sourceforge.czt.session.Source;
import net.sourceforge.czt.session.SectionInfo;
import net.sourceforge.czt.session.Dialect;

import net.sourceforge.czt.util.CztException;

/**
 * <p>A parser for unicode.  This class is a convenience class
 * that assembles the {@link UnicodeScanner} and the {@link Parser}.
 *
 * @author Petra Malik
 * @see net.sourceforge.czt.parser.z
 */
public class UnicodeParser
{
  private final Parser parser_;

  // dialect is a final attribute determined at construction time
  // depending on the extension being used (i.e. decided at XML transformation time).
  // this is useful for fine-tuned error information. If no extension is chosen we 
  // get a compilation error (i.e. final field not assigned).
  private final Dialect dialect_ = 
  						Dialect.CIRCUS
    				  // otherwise it will be unassigned, hence a compilation error
    				  ;
    				  
  public UnicodeParser(Source source, SectionInfo sectInfo, Properties properties, 
  	Collection<? extends Key<?>> explicitDeps)
    throws IOException
  {
    if (sectInfo == null) throw new NullPointerException();
    CztScanner scanner = new UnicodeScanner(source, properties);
    parser_ = new Parser(scanner, source, sectInfo, properties, explicitDeps);
    assert dialect_ != null;
    if (!dialect_.equals(sectInfo.getDialect()))
    	throw new IllegalArgumentException("Incompatible dialects in UnicodeParser. " + dialect_.toString() +
    		" expected, but section manager dialect " + sectInfo.getDialect() + " found.");    
  }

  public Spec parse()
    throws ParseException
  {
    try {
      Symbol parseTree = parser_.parse();
      return (Spec) parseTree.value;
    }
    catch (ParseException e) {
      throw e;
    }
    catch (ScanException e) {
      throw new ParseException(e.getDialect(), e);
    }
    // TODO: should we add PrintException here as well?
    catch (Exception e) {
      e.printStackTrace();
      throw new CztException("This exception should never happen (for " + dialect_ + " in LatexParser.", e);
    }
  }
}
