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

public class ArSerialConnection extends ArDeviceConnection {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArSerialConnection(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArSerialConnectionUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArSerialConnection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArSerialConnection(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public ArSerialConnection(boolean is422) {
    this(AriaJavaJNI.new_ArSerialConnection__SWIG_0(is422), true);
  }

  public ArSerialConnection() {
    this(AriaJavaJNI.new_ArSerialConnection__SWIG_1(), true);
  }

  public int open(String port) {
    return AriaJavaJNI.ArSerialConnection_open__SWIG_0(swigCPtr, this, port);
  }

  public int open() {
    return AriaJavaJNI.ArSerialConnection_open__SWIG_1(swigCPtr, this);
  }

  public void setPort(String port) {
    AriaJavaJNI.ArSerialConnection_setPort__SWIG_0(swigCPtr, this, port);
  }

  public void setPort() {
    AriaJavaJNI.ArSerialConnection_setPort__SWIG_1(swigCPtr, this);
  }

  public String getPort() {
    return AriaJavaJNI.ArSerialConnection_getPort(swigCPtr, this);
  }

  public boolean openSimple() {
    return AriaJavaJNI.ArSerialConnection_openSimple(swigCPtr, this);
  }

  public int getStatus() {
    return AriaJavaJNI.ArSerialConnection_getStatus(swigCPtr, this);
  }

  public boolean close() {
    return AriaJavaJNI.ArSerialConnection_close(swigCPtr, this);
  }

  public int read(String data, long size, long msWait) {
    return AriaJavaJNI.ArSerialConnection_read__SWIG_0(swigCPtr, this, data, size, msWait);
  }

  public int read(String data, long size) {
    return AriaJavaJNI.ArSerialConnection_read__SWIG_1(swigCPtr, this, data, size);
  }

  public int write(String data, long size) {
    return AriaJavaJNI.ArSerialConnection_write(swigCPtr, this, data, size);
  }

  public String getOpenMessage(int messageNumber) {
    return AriaJavaJNI.ArSerialConnection_getOpenMessage(swigCPtr, this, messageNumber);
  }

  public boolean setBaud(int baud) {
    return AriaJavaJNI.ArSerialConnection_setBaud(swigCPtr, this, baud);
  }

  public int getBaud() {
    return AriaJavaJNI.ArSerialConnection_getBaud(swigCPtr, this);
  }

  public boolean setHardwareControl(boolean hardwareControl) {
    return AriaJavaJNI.ArSerialConnection_setHardwareControl(swigCPtr, this, hardwareControl);
  }

  public boolean getHardwareControl() {
    return AriaJavaJNI.ArSerialConnection_getHardwareControl(swigCPtr, this);
  }

  public boolean getCTS() {
    return AriaJavaJNI.ArSerialConnection_getCTS(swigCPtr, this);
  }

  public boolean getDSR() {
    return AriaJavaJNI.ArSerialConnection_getDSR(swigCPtr, this);
  }

  public boolean getDCD() {
    return AriaJavaJNI.ArSerialConnection_getDCD(swigCPtr, this);
  }

  public boolean getRing() {
    return AriaJavaJNI.ArSerialConnection_getRing(swigCPtr, this);
  }

  public int internalOpen() {
    return AriaJavaJNI.ArSerialConnection_internalOpen(swigCPtr, this);
  }

  public ArTime getTimeRead(int index) {
    return new ArTime(AriaJavaJNI.ArSerialConnection_getTimeRead(swigCPtr, this, index), true);
  }

  public boolean isTimeStamping() {
    return AriaJavaJNI.ArSerialConnection_isTimeStamping(swigCPtr, this);
  }

  public final static class Open {
    public final static Open OPEN_COULD_NOT_OPEN_PORT = new Open("OPEN_COULD_NOT_OPEN_PORT", AriaJavaJNI.ArSerialConnection_OPEN_COULD_NOT_OPEN_PORT_get());
    public final static Open OPEN_COULD_NOT_SET_UP_PORT = new Open("OPEN_COULD_NOT_SET_UP_PORT");
    public final static Open OPEN_INVALID_BAUD_RATE = new Open("OPEN_INVALID_BAUD_RATE");
    public final static Open OPEN_COULD_NOT_SET_BAUD = new Open("OPEN_COULD_NOT_SET_BAUD");
    public final static Open OPEN_ALREADY_OPEN = new Open("OPEN_ALREADY_OPEN");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Open swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Open.class + " with value " + swigValue);
    }

    private Open(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Open(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Open(String swigName, Open swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Open[] swigValues = { OPEN_COULD_NOT_OPEN_PORT, OPEN_COULD_NOT_SET_UP_PORT, OPEN_INVALID_BAUD_RATE, OPEN_COULD_NOT_SET_BAUD, OPEN_ALREADY_OPEN };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
