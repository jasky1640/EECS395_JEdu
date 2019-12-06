package jedu.debugger.event;

import com.sun.jdi.event.StepEvent;
import com.sun.jdi.event.ExceptionEvent;
import com.sun.jdi.event.MethodExitEvent;
import com.sun.jdi.event.VMDeathEvent;
import com.sun.jdi.event.Event;
import com.sun.jdi.event.BreakpointEvent;
import com.sun.jdi.event.WatchpointEvent;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.ThreadStartEvent;
import com.sun.jdi.event.ClassUnloadEvent;
import com.sun.jdi.event.VMStartEvent;
import com.sun.jdi.event.LocatableEvent;
import com.sun.jdi.event.ThreadDeathEvent;
import com.sun.jdi.event.ClassPrepareEvent;
import com.sun.jdi.event.VMDisconnectEvent;

public interface EventListener extends java.util.EventListener {
  public void vmStartEvent(VMStartEvent evt);

  public void vmDeathEvent(VMDeathEvent evt);

  public void vmDisconnectEvent(VMDisconnectEvent evt);

  public void threadStartEvent(ThreadStartEvent evt);

  public void threadDeathEvent(ThreadDeathEvent evt);

  public void classPrepareEvent(ClassPrepareEvent evt);

  public void classUnloadEvent(ClassUnloadEvent evt);

  public void breakpointEvent(BreakpointEvent evt);

  public void watchpointEvent(WatchpointEvent evt);

  public void exceptionEvent(ExceptionEvent evt);

  public void stepEvent(StepEvent evt);

  public void methodEntryEvent(MethodEntryEvent evt);

  public void methodExitEvent(MethodExitEvent evt);

  // Other Helper Methods
  public void event(Event evt); // Called on Every Event.

  public void locatableEvent(LocatableEvent evt); // Event with location

  // Not an event Generated by the Virtual Machine
  public void vmInterrupted();

  public void vmSuspended();
}
