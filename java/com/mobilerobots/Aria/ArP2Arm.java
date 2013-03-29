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

public class ArP2Arm {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArP2Arm(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArP2Arm obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArP2Arm(swigCPtr);
    }
    swigCPtr = 0;
  }

  public static int getArmJoint1() {
    return AriaJavaJNI.ArP2Arm_ArmJoint1_get();
  }

  public static int getArmJoint2() {
    return AriaJavaJNI.ArP2Arm_ArmJoint2_get();
  }

  public static int getArmJoint3() {
    return AriaJavaJNI.ArP2Arm_ArmJoint3_get();
  }

  public static int getArmJoint4() {
    return AriaJavaJNI.ArP2Arm_ArmJoint4_get();
  }

  public static int getArmJoint5() {
    return AriaJavaJNI.ArP2Arm_ArmJoint5_get();
  }

  public static int getArmJoint6() {
    return AriaJavaJNI.ArP2Arm_ArmJoint6_get();
  }

  public static int getArmGood() {
    return AriaJavaJNI.ArP2Arm_ArmGood_get();
  }

  public static int getArmInited() {
    return AriaJavaJNI.ArP2Arm_ArmInited_get();
  }

  public static int getArmPower() {
    return AriaJavaJNI.ArP2Arm_ArmPower_get();
  }

  public static int getArmHoming() {
    return AriaJavaJNI.ArP2Arm_ArmHoming_get();
  }

  public static void setNumJoints(int value) {
    AriaJavaJNI.ArP2Arm_NumJoints_set(value);
  }

  public static int getNumJoints() {
    return AriaJavaJNI.ArP2Arm_NumJoints_get();
  }

  public ArP2Arm() {
    this(AriaJavaJNI.new_ArP2Arm(), true);
  }

  public void setRobot(ArRobot robot) {
    AriaJavaJNI.ArP2Arm_setRobot(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public ArP2Arm.State init() {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_init(swigCPtr, this));
  }

  public ArP2Arm.State uninit() {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_uninit(swigCPtr, this));
  }

  public ArP2Arm.State powerOn(boolean doWait) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_powerOn__SWIG_0(swigCPtr, this, doWait));
  }

  public ArP2Arm.State powerOn() {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_powerOn__SWIG_1(swigCPtr, this));
  }

  public ArP2Arm.State powerOff() {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_powerOff(swigCPtr, this));
  }

  public ArP2Arm.State requestInfo() {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_requestInfo(swigCPtr, this));
  }

  public ArP2Arm.State requestStatus(ArP2Arm.StatusType status) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_requestStatus(swigCPtr, this, status.swigValue()));
  }

  public ArP2Arm.State requestInit() {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_requestInit(swigCPtr, this));
  }

  public ArP2Arm.State checkArm(boolean waitForResponse) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_checkArm__SWIG_0(swigCPtr, this, waitForResponse));
  }

  public ArP2Arm.State checkArm() {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_checkArm__SWIG_1(swigCPtr, this));
  }

  public ArP2Arm.State home(int joint) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_home__SWIG_0(swigCPtr, this, joint));
  }

  public ArP2Arm.State home() {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_home__SWIG_1(swigCPtr, this));
  }

  public ArP2Arm.State park() {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_park(swigCPtr, this));
  }

  public ArP2Arm.State moveTo(int joint, float pos, short vel) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_moveTo__SWIG_0(swigCPtr, this, joint, pos, vel));
  }

  public ArP2Arm.State moveTo(int joint, float pos) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_moveTo__SWIG_1(swigCPtr, this, joint, pos));
  }

  public ArP2Arm.State moveToTicks(int joint, short pos) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_moveToTicks(swigCPtr, this, joint, pos));
  }

  public ArP2Arm.State moveStep(int joint, float pos, short vel) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_moveStep__SWIG_0(swigCPtr, this, joint, pos, vel));
  }

  public ArP2Arm.State moveStep(int joint, float pos) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_moveStep__SWIG_1(swigCPtr, this, joint, pos));
  }

  public ArP2Arm.State moveStepTicks(int joint, byte pos) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_moveStepTicks(swigCPtr, this, joint, pos));
  }

  public ArP2Arm.State moveVel(int joint, int vel) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_moveVel(swigCPtr, this, joint, vel));
  }

  public ArP2Arm.State stop() {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_stop(swigCPtr, this));
  }

  public ArP2Arm.State setAutoParkTimer(int waitSecs) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_setAutoParkTimer(swigCPtr, this, waitSecs));
  }

  public ArP2Arm.State setGripperParkTimer(int waitSecs) {
    return ArP2Arm.State.swigToEnum(AriaJavaJNI.ArP2Arm_setGripperParkTimer(swigCPtr, this, waitSecs));
  }

  public void setStoppedCB(ArFunctor func) {
    AriaJavaJNI.ArP2Arm_setStoppedCB(swigCPtr, this, ArFunctor.getCPtr(func), func);
  }

  public void setPacketCB(SWIGTYPE_p_ArFunctor1T_ArP2Arm__PacketType_t func) {
    AriaJavaJNI.ArP2Arm_setPacketCB(swigCPtr, this, SWIGTYPE_p_ArFunctor1T_ArP2Arm__PacketType_t.getCPtr(func));
  }

  public String getArmVersion() {
    return AriaJavaJNI.ArP2Arm_getArmVersion(swigCPtr, this);
  }

  public float getJointPos(int joint) {
    return AriaJavaJNI.ArP2Arm_getJointPos(swigCPtr, this, joint);
  }

  public short getJointPosTicks(int joint) {
    return AriaJavaJNI.ArP2Arm_getJointPosTicks(swigCPtr, this, joint);
  }

  public boolean getMoving(int joint) {
    return AriaJavaJNI.ArP2Arm_getMoving__SWIG_0(swigCPtr, this, joint);
  }

  public boolean getMoving() {
    return AriaJavaJNI.ArP2Arm_getMoving__SWIG_1(swigCPtr, this);
  }

  public boolean isPowered() {
    return AriaJavaJNI.ArP2Arm_isPowered(swigCPtr, this);
  }

  public boolean isGood() {
    return AriaJavaJNI.ArP2Arm_isGood(swigCPtr, this);
  }

  public int getStatus() {
    return AriaJavaJNI.ArP2Arm_getStatus(swigCPtr, this);
  }

  public ArTime getLastStatusTime() {
    return new ArTime(AriaJavaJNI.ArP2Arm_getLastStatusTime(swigCPtr, this), true);
  }

  public ArRobot getRobot() {
    long cPtr = AriaJavaJNI.ArP2Arm_getRobot(swigCPtr, this);
    return (cPtr == 0) ? null : new ArRobot(cPtr, false);
  }

  public P2ArmJoint getJoint(int joint) {
    long cPtr = AriaJavaJNI.ArP2Arm_getJoint(swigCPtr, this, joint);
    return (cPtr == 0) ? null : new P2ArmJoint(cPtr, false);
  }

  public boolean convertDegToTicks(int joint, float pos, SWIGTYPE_p_unsigned_char ticks) {
    return AriaJavaJNI.ArP2Arm_convertDegToTicks(swigCPtr, this, joint, pos, SWIGTYPE_p_unsigned_char.getCPtr(ticks));
  }

  public boolean convertTicksToDeg(int joint, short pos, SWIGTYPE_p_float degrees) {
    return AriaJavaJNI.ArP2Arm_convertTicksToDeg(swigCPtr, this, joint, pos, SWIGTYPE_p_float.getCPtr(degrees));
  }

  public final static class State {
    public final static State SUCCESS = new State("SUCCESS");
    public final static State ALREADY_INITED = new State("ALREADY_INITED");
    public final static State NOT_INITED = new State("NOT_INITED");
    public final static State ROBOT_NOT_SETUP = new State("ROBOT_NOT_SETUP");
    public final static State NO_ARM_FOUND = new State("NO_ARM_FOUND");
    public final static State COMM_FAILED = new State("COMM_FAILED");
    public final static State COULD_NOT_OPEN_PORT = new State("COULD_NOT_OPEN_PORT");
    public final static State COULD_NOT_SET_UP_PORT = new State("COULD_NOT_SET_UP_PORT");
    public final static State ALREADY_CONNECTED = new State("ALREADY_CONNECTED");
    public final static State NOT_CONNECTED = new State("NOT_CONNECTED");
    public final static State INVALID_JOINT = new State("INVALID_JOINT");
    public final static State INVALID_POSITION = new State("INVALID_POSITION");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static State swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + State.class + " with value " + swigValue);
    }

    private State(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private State(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private State(String swigName, State swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static State[] swigValues = { SUCCESS, ALREADY_INITED, NOT_INITED, ROBOT_NOT_SETUP, NO_ARM_FOUND, COMM_FAILED, COULD_NOT_OPEN_PORT, COULD_NOT_SET_UP_PORT, ALREADY_CONNECTED, NOT_CONNECTED, INVALID_JOINT, INVALID_POSITION };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class PacketType {
    public final static PacketType StatusPacket = new PacketType("StatusPacket");
    public final static PacketType InfoPacket = new PacketType("InfoPacket");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static PacketType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + PacketType.class + " with value " + swigValue);
    }

    private PacketType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private PacketType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private PacketType(String swigName, PacketType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static PacketType[] swigValues = { StatusPacket, InfoPacket };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class StatusType {
    public final static StatusType StatusOff = new StatusType("StatusOff", AriaJavaJNI.ArP2Arm_StatusOff_get());
    public final static StatusType StatusSingle = new StatusType("StatusSingle", AriaJavaJNI.ArP2Arm_StatusSingle_get());
    public final static StatusType StatusContinuous = new StatusType("StatusContinuous", AriaJavaJNI.ArP2Arm_StatusContinuous_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static StatusType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + StatusType.class + " with value " + swigValue);
    }

    private StatusType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private StatusType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private StatusType(String swigName, StatusType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static StatusType[] swigValues = { StatusOff, StatusSingle, StatusContinuous };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
