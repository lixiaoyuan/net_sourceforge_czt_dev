
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE CoreFactoryImpl.vm.
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

package net.sourceforge.czt.circustime.impl;


/**
 * <p>An implementation of the object factory for constructing
 * concrete Z terms.  Each factory method returns an instance
 * of the corresponding class provided in this package.</p>
 *
 * @author GnAST version 1.6-cdh
 */
public class CircusTimeFactoryImpl
  extends net.sourceforge.czt.circuspatt.impl.CircusPatternFactoryImpl
  implements net.sourceforge.czt.circustime.ast.CircusTimeFactory
{
  protected CircusTimeFactoryImpl(net.sourceforge.czt.util.Visitor<String> toStringVisitor)
  {
    super(toStringVisitor);
  }

  public CircusTimeFactoryImpl()
  {
    super(new net.sourceforge.czt.circustime.util.PrintVisitor());
  }

  public net.sourceforge.czt.circustime.ast.TimeEndByProcess createTimeEndByProcess()
  {
    net.sourceforge.czt.circustime.ast.TimeEndByProcess zedObject = new net.sourceforge.czt.circustime.impl.TimeEndByProcessImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimeEndByProcess createTimeEndByProcess( net.sourceforge.czt.circus.ast.CircusProcess  circusProcess, net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.circustime.ast.TimeEndByProcess zedObject = createTimeEndByProcess();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimeoutProcess createTimeoutProcess()
  {
    net.sourceforge.czt.circustime.ast.TimeoutProcess zedObject = new net.sourceforge.czt.circustime.impl.TimeoutProcessImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimeoutProcess createTimeoutProcess(java.util.List<? extends net.sourceforge.czt.circus.ast.CircusProcess>
 circusProcess, net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.circustime.ast.TimeoutProcess zedObject = createTimeoutProcess();
    if (circusProcess != null) {
      zedObject.getCircusProcess().addAll(circusProcess);
    }
    zedObject.setExpr(expr);
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.WaitExprAction createWaitExprAction()
  {
    net.sourceforge.czt.circustime.ast.WaitExprAction zedObject = new net.sourceforge.czt.circustime.impl.WaitExprActionImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.WaitExprAction createWaitExprAction( net.sourceforge.czt.circus.ast.CircusAction  circusAction, net.sourceforge.czt.z.ast.Expr  expr, net.sourceforge.czt.z.ast.Name  name)
  {
    net.sourceforge.czt.circustime.ast.WaitExprAction zedObject = createWaitExprAction();
    zedObject.setCircusAction(circusAction);
    zedObject.setExpr(expr);
    zedObject.setName(name);
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimeEndByAction createTimeEndByAction()
  {
    net.sourceforge.czt.circustime.ast.TimeEndByAction zedObject = new net.sourceforge.czt.circustime.impl.TimeEndByActionImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimeEndByAction createTimeEndByAction( net.sourceforge.czt.circus.ast.CircusAction  circusAction, net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.circustime.ast.TimeEndByAction zedObject = createTimeEndByAction();
    zedObject.setCircusAction(circusAction);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimeStartByProcess createTimeStartByProcess()
  {
    net.sourceforge.czt.circustime.ast.TimeStartByProcess zedObject = new net.sourceforge.czt.circustime.impl.TimeStartByProcessImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimeStartByProcess createTimeStartByProcess( net.sourceforge.czt.circus.ast.CircusProcess  circusProcess, net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.circustime.ast.TimeStartByProcess zedObject = createTimeStartByProcess();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimeoutAction createTimeoutAction()
  {
    net.sourceforge.czt.circustime.ast.TimeoutAction zedObject = new net.sourceforge.czt.circustime.impl.TimeoutActionImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimeoutAction createTimeoutAction(java.util.List<? extends net.sourceforge.czt.circus.ast.CircusAction>
 circusAction, net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.circustime.ast.TimeoutAction zedObject = createTimeoutAction();
    if (circusAction != null) {
      zedObject.getCircusAction().addAll(circusAction);
    }
    zedObject.setExpr(expr);
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimeStartByAction createTimeStartByAction()
  {
    net.sourceforge.czt.circustime.ast.TimeStartByAction zedObject = new net.sourceforge.czt.circustime.impl.TimeStartByActionImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimeStartByAction createTimeStartByAction( net.sourceforge.czt.circus.ast.CircusAction  circusAction, net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.circustime.ast.TimeStartByAction zedObject = createTimeStartByAction();
    zedObject.setCircusAction(circusAction);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.PrefixingTimeAction createPrefixingTimeAction()
  {
    net.sourceforge.czt.circustime.ast.PrefixingTimeAction zedObject = new net.sourceforge.czt.circustime.impl.PrefixingTimeActionImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.PrefixingTimeAction createPrefixingTimeAction( net.sourceforge.czt.circus.ast.CircusAction  circusAction, net.sourceforge.czt.circus.ast.Communication  communication, net.sourceforge.czt.z.ast.Name  channelElapsedTime, net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.circustime.ast.PrefixingTimeAction zedObject = createPrefixingTimeAction();
    zedObject.setCircusAction(circusAction);
    zedObject.setCommunication(communication);
    zedObject.setChannelElapsedTime(channelElapsedTime);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.WaitAction createWaitAction()
  {
    net.sourceforge.czt.circustime.ast.WaitAction zedObject = new net.sourceforge.czt.circustime.impl.WaitActionImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.WaitAction createWaitAction( net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.circustime.ast.WaitAction zedObject = createWaitAction();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimedinterruptAction createTimedinterruptAction()
  {
    net.sourceforge.czt.circustime.ast.TimedinterruptAction zedObject = new net.sourceforge.czt.circustime.impl.TimedinterruptActionImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimedinterruptAction createTimedinterruptAction(java.util.List<? extends net.sourceforge.czt.circus.ast.CircusAction>
 circusAction, net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.circustime.ast.TimedinterruptAction zedObject = createTimedinterruptAction();
    if (circusAction != null) {
      zedObject.getCircusAction().addAll(circusAction);
    }
    zedObject.setExpr(expr);
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimedinterruptProcess createTimedinterruptProcess()
  {
    net.sourceforge.czt.circustime.ast.TimedinterruptProcess zedObject = new net.sourceforge.czt.circustime.impl.TimedinterruptProcessImpl(this);
    countInstance();
    return zedObject;
  }

  public net.sourceforge.czt.circustime.ast.TimedinterruptProcess createTimedinterruptProcess(java.util.List<? extends net.sourceforge.czt.circus.ast.CircusProcess>
 circusProcess, net.sourceforge.czt.z.ast.Expr  expr)
  {
    net.sourceforge.czt.circustime.ast.TimedinterruptProcess zedObject = createTimedinterruptProcess();
    if (circusProcess != null) {
      zedObject.getCircusProcess().addAll(circusProcess);
    }
    zedObject.setExpr(expr);
    return zedObject;
  }


// c?x@N ---> A
public net.sourceforge.czt.circustime.ast.PrefixingTimeAction createAtPrefixingAction( net.sourceforge.czt.circus.ast.CircusAction  circusAction, net.sourceforge.czt.circus.ast.Communication  communication, net.sourceforge.czt.z.ast.Name name)
{
	return createPrefixingTimeAction(circusAction, communication, name, null);
}

// c?x --expr--> A
public net.sourceforge.czt.circustime.ast.PrefixingTimeAction createPrefixingExprAction( net.sourceforge.czt.circus.ast.CircusAction  circusAction, net.sourceforge.czt.circus.ast.Communication  communication, net.sourceforge.czt.z.ast.Expr expr)
{
	return createPrefixingTimeAction(circusAction, communication, null, expr);
}

//c?x@N --expr--> A
public net.sourceforge.czt.circustime.ast.PrefixingTimeAction createAtPrefixingExprAction( net.sourceforge.czt.circus.ast.CircusAction  circusAction, net.sourceforge.czt.circus.ast.Communication  communication, net.sourceforge.czt.z.ast.Name name, net.sourceforge.czt.z.ast.Expr expr)
{
	return createPrefixingTimeAction(circusAction, communication, name, expr);
}
}
