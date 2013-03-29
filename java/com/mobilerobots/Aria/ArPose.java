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

public class ArPose {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArPose(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArPose obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArPose(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArPose(double x, double y, double th) {
    this(AriaJavaJNI.new_ArPose__SWIG_0(x, y, th), true);
  }

  public ArPose(double x, double y) {
    this(AriaJavaJNI.new_ArPose__SWIG_1(x, y), true);
  }

  public ArPose(double x) {
    this(AriaJavaJNI.new_ArPose__SWIG_2(x), true);
  }

  public ArPose() {
    this(AriaJavaJNI.new_ArPose__SWIG_3(), true);
  }

  public ArPose(ArPose pose) {
    this(AriaJavaJNI.new_ArPose__SWIG_4(ArPose.getCPtr(pose), pose), true);
  }

  public void setPose(double x, double y, double th) {
    AriaJavaJNI.ArPose_setPose__SWIG_0(swigCPtr, this, x, y, th);
  }

  public void setPose(double x, double y) {
    AriaJavaJNI.ArPose_setPose__SWIG_1(swigCPtr, this, x, y);
  }

  public void setPose(ArPose position) {
    AriaJavaJNI.ArPose_setPose__SWIG_2(swigCPtr, this, ArPose.getCPtr(position), position);
  }

  public void setX(double x) {
    AriaJavaJNI.ArPose_setX(swigCPtr, this, x);
  }

  public void setY(double y) {
    AriaJavaJNI.ArPose_setY(swigCPtr, this, y);
  }

  public void setTh(double th) {
    AriaJavaJNI.ArPose_setTh(swigCPtr, this, th);
  }

  public void setThRad(double th) {
    AriaJavaJNI.ArPose_setThRad(swigCPtr, this, th);
  }

  public double getX() {
    return AriaJavaJNI.ArPose_getX(swigCPtr, this);
  }

  public double getY() {
    return AriaJavaJNI.ArPose_getY(swigCPtr, this);
  }

  public double getTh() {
    return AriaJavaJNI.ArPose_getTh(swigCPtr, this);
  }

  public double getThRad() {
    return AriaJavaJNI.ArPose_getThRad(swigCPtr, this);
  }

  public void getPose(double[] x, double[] y, double[] th) {
    AriaJavaJNI.ArPose_getPose__SWIG_0(swigCPtr, this, x, y, th);
  }

  public void getPose(double[] x, double[] y) {
    AriaJavaJNI.ArPose_getPose__SWIG_1(swigCPtr, this, x, y);
  }

  public double findDistanceTo(ArPose position) {
    return AriaJavaJNI.ArPose_findDistanceTo(swigCPtr, this, ArPose.getCPtr(position), position);
  }

  public double squaredFindDistanceTo(ArPose position) {
    return AriaJavaJNI.ArPose_squaredFindDistanceTo(swigCPtr, this, ArPose.getCPtr(position), position);
  }

  public double findAngleTo(ArPose position) {
    return AriaJavaJNI.ArPose_findAngleTo(swigCPtr, this, ArPose.getCPtr(position), position);
  }

  public void log() {
    AriaJavaJNI.ArPose_log(swigCPtr, this);
  }

}
