/*
MobileRobots Advanced Robotics Interface for Applications (ARIA)
Copyright (C) 2004, 2005 ActivMedia Robotics LLC
Copyright (C) 2006, 2007, 2008, 2009, 2010 MobileRobots Inc.
Copyright (C) 2011, 2012 Adept Technology

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
MobileRobots Inc, 10 Columbia Drive, Amherst, NH 03031; 800-639-9481
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.36
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArGripperCommands {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArGripperCommands(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArGripperCommands obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArGripperCommands(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArGripperCommands() {
    this(AriaJavaJNI.new_ArGripperCommands(), true);
  }

  public final static class Commands {
    public final static Commands GRIP_OPEN = new Commands("GRIP_OPEN", AriaJavaJNI.ArGripperCommands_GRIP_OPEN_get());
    public final static Commands GRIP_CLOSE = new Commands("GRIP_CLOSE", AriaJavaJNI.ArGripperCommands_GRIP_CLOSE_get());
    public final static Commands GRIP_STOP = new Commands("GRIP_STOP", AriaJavaJNI.ArGripperCommands_GRIP_STOP_get());
    public final static Commands LIFT_UP = new Commands("LIFT_UP", AriaJavaJNI.ArGripperCommands_LIFT_UP_get());
    public final static Commands LIFT_DOWN = new Commands("LIFT_DOWN", AriaJavaJNI.ArGripperCommands_LIFT_DOWN_get());
    public final static Commands LIFT_STOP = new Commands("LIFT_STOP", AriaJavaJNI.ArGripperCommands_LIFT_STOP_get());
    public final static Commands GRIPPER_STORE = new Commands("GRIPPER_STORE", AriaJavaJNI.ArGripperCommands_GRIPPER_STORE_get());
    public final static Commands GRIPPER_DEPLOY = new Commands("GRIPPER_DEPLOY", AriaJavaJNI.ArGripperCommands_GRIPPER_DEPLOY_get());
    public final static Commands GRIPPER_HALT = new Commands("GRIPPER_HALT", AriaJavaJNI.ArGripperCommands_GRIPPER_HALT_get());
    public final static Commands GRIP_PRESSURE = new Commands("GRIP_PRESSURE", AriaJavaJNI.ArGripperCommands_GRIP_PRESSURE_get());
    public final static Commands LIFT_CARRY = new Commands("LIFT_CARRY", AriaJavaJNI.ArGripperCommands_LIFT_CARRY_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Commands swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Commands.class + " with value " + swigValue);
    }

    private Commands(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Commands(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Commands(String swigName, Commands swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Commands[] swigValues = { GRIP_OPEN, GRIP_CLOSE, GRIP_STOP, LIFT_UP, LIFT_DOWN, LIFT_STOP, GRIPPER_STORE, GRIPPER_DEPLOY, GRIPPER_HALT, GRIP_PRESSURE, LIFT_CARRY };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
