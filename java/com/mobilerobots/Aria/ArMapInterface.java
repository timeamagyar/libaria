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

public class ArMapInterface extends ArMapInfoInterface {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArMapInterface(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArMapInterfaceUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArMapInterface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArMapInterface(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public static void setMAP_CATEGORY_2D(String value) {
    AriaJavaJNI.ArMapInterface_MAP_CATEGORY_2D_set(value);
  }

  public static String getMAP_CATEGORY_2D() {
    return AriaJavaJNI.ArMapInterface_MAP_CATEGORY_2D_get();
  }

  public static void setMAP_CATEGORY_2D_MULTI_SOURCES(String value) {
    AriaJavaJNI.ArMapInterface_MAP_CATEGORY_2D_MULTI_SOURCES_set(value);
  }

  public static String getMAP_CATEGORY_2D_MULTI_SOURCES() {
    return AriaJavaJNI.ArMapInterface_MAP_CATEGORY_2D_MULTI_SOURCES_get();
  }

  public static void setMAP_CATEGORY_2D_EXTENDED(String value) {
    AriaJavaJNI.ArMapInterface_MAP_CATEGORY_2D_EXTENDED_set(value);
  }

  public static String getMAP_CATEGORY_2D_EXTENDED() {
    return AriaJavaJNI.ArMapInterface_MAP_CATEGORY_2D_EXTENDED_get();
  }

  public static String createRealFileName(String baseDirectory, String fileName, boolean isIgnoreCase) {
    return AriaJavaJNI.ArMapInterface_createRealFileName__SWIG_0(baseDirectory, fileName, isIgnoreCase);
  }

  public void clear() {
    AriaJavaJNI.ArMapInterface_clear(swigCPtr, this);
  }

  public boolean set(ArMapInterface other) {
    return AriaJavaJNI.ArMapInterface_set(swigCPtr, this, ArMapInterface.getCPtr(other), other);
  }

  public ArMapInterface cloneMap() {
    long cPtr = AriaJavaJNI.ArMapInterface_cloneMap(swigCPtr, this);
    return (cPtr == 0) ? null : new ArMapInterface(cPtr, false);
  }

  public SWIGTYPE_p_std__listT_std__string_t getScanTypes() {
    return new SWIGTYPE_p_std__listT_std__string_t(AriaJavaJNI.ArMapInterface_getScanTypes(swigCPtr, this), true);
  }

  public boolean setScanTypes(SWIGTYPE_p_std__listT_std__string_t scanTypeList) {
    return AriaJavaJNI.ArMapInterface_setScanTypes(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(scanTypeList));
  }

  public int lock() {
    return AriaJavaJNI.ArMapInterface_lock(swigCPtr, this);
  }

  public int tryLock() {
    return AriaJavaJNI.ArMapInterface_tryLock(swigCPtr, this);
  }

  public int unlock() {
    return AriaJavaJNI.ArMapInterface_unlock(swigCPtr, this);
  }

  public void mapChanged() {
    AriaJavaJNI.ArMapInterface_mapChanged(swigCPtr, this);
  }

  public void addMapChangedCBPos(ArFunctor functor, ArListPos.Pos position) {
    AriaJavaJNI.ArMapInterface_addMapChangedCBPos(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addMapChangedCB(ArFunctor functor) {
    AriaJavaJNI.ArMapInterface_addMapChangedCB(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remMapChangedCB(ArFunctor functor) {
    AriaJavaJNI.ArMapInterface_remMapChangedCB(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addPreMapChangedCBPos(ArFunctor functor, ArListPos.Pos position) {
    AriaJavaJNI.ArMapInterface_addPreMapChangedCBPos(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addPreMapChangedCB(ArFunctor functor) {
    AriaJavaJNI.ArMapInterface_addPreMapChangedCB(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remPreMapChangedCB(ArFunctor functor) {
    AriaJavaJNI.ArMapInterface_remPreMapChangedCB(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void setMapChangedLogLevel(ArLog.LogLevel level) {
    AriaJavaJNI.ArMapInterface_setMapChangedLogLevel(swigCPtr, this, level.swigValue());
  }

  public ArLog.LogLevel getMapChangedLogLevel() {
    return ArLog.LogLevel.swigToEnum(AriaJavaJNI.ArMapInterface_getMapChangedLogLevel(swigCPtr, this));
  }

  public void writeToFunctor(ArFunctor1_CString functor, String endOfLineChars) {
    AriaJavaJNI.ArMapInterface_writeToFunctor(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars);
  }

  public void writeObjectsToFunctor(ArFunctor1_CString functor, String endOfLineChars, boolean isOverrideAsSingleScan, String maxCategory) {
    AriaJavaJNI.ArMapInterface_writeObjectsToFunctor__SWIG_0(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars, isOverrideAsSingleScan, maxCategory);
  }

  public void writeObjectsToFunctor(ArFunctor1_CString functor, String endOfLineChars, boolean isOverrideAsSingleScan) {
    AriaJavaJNI.ArMapInterface_writeObjectsToFunctor__SWIG_1(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars, isOverrideAsSingleScan);
  }

  public void writeObjectsToFunctor(ArFunctor1_CString functor, String endOfLineChars) {
    AriaJavaJNI.ArMapInterface_writeObjectsToFunctor__SWIG_2(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars);
  }

  public void addPreWriteFileCB(ArFunctor functor, ArListPos.Pos position) {
    AriaJavaJNI.ArMapInterface_addPreWriteFileCB__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addPreWriteFileCB(ArFunctor functor) {
    AriaJavaJNI.ArMapInterface_addPreWriteFileCB__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remPreWriteFileCB(ArFunctor functor) {
    AriaJavaJNI.ArMapInterface_remPreWriteFileCB(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addPostWriteFileCB(ArFunctor functor, ArListPos.Pos position) {
    AriaJavaJNI.ArMapInterface_addPostWriteFileCB__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addPostWriteFileCB(ArFunctor functor) {
    AriaJavaJNI.ArMapInterface_addPostWriteFileCB__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remPostWriteFileCB(ArFunctor functor) {
    AriaJavaJNI.ArMapInterface_remPostWriteFileCB(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public boolean getMapId(ArMapId mapIdOut, boolean isInternalCall) {
    return AriaJavaJNI.ArMapInterface_getMapId__SWIG_0(swigCPtr, this, ArMapId.getCPtr(mapIdOut), mapIdOut, isInternalCall);
  }

  public boolean getMapId(ArMapId mapIdOut) {
    return AriaJavaJNI.ArMapInterface_getMapId__SWIG_1(swigCPtr, this, ArMapId.getCPtr(mapIdOut), mapIdOut);
  }

  public boolean calculateChecksum(SWIGTYPE_p_unsigned_char md5DigestBuffer, long md5DigestBufferLen) {
    return AriaJavaJNI.ArMapInterface_calculateChecksum(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(md5DigestBuffer), md5DigestBufferLen);
  }

  public String getBaseDirectory() {
    return AriaJavaJNI.ArMapInterface_getBaseDirectory(swigCPtr, this);
  }

  public void setBaseDirectory(String baseDirectory) {
    AriaJavaJNI.ArMapInterface_setBaseDirectory(swigCPtr, this, baseDirectory);
  }

  public String getTempDirectory() {
    return AriaJavaJNI.ArMapInterface_getTempDirectory(swigCPtr, this);
  }

  public void setTempDirectory(String tempDirectory) {
    AriaJavaJNI.ArMapInterface_setTempDirectory(swigCPtr, this, tempDirectory);
  }

  public String createRealFileName(String fileName) {
    return AriaJavaJNI.ArMapInterface_createRealFileName__SWIG_1(swigCPtr, this, fileName);
  }

  public String getFileName() {
    return AriaJavaJNI.ArMapInterface_getFileName(swigCPtr, this);
  }

  public void setSourceFileName(String sourceName, String fileName, boolean isInternalCall) {
    AriaJavaJNI.ArMapInterface_setSourceFileName__SWIG_0(swigCPtr, this, sourceName, fileName, isInternalCall);
  }

  public void setSourceFileName(String sourceName, String fileName) {
    AriaJavaJNI.ArMapInterface_setSourceFileName__SWIG_1(swigCPtr, this, sourceName, fileName);
  }

  public boolean refresh() {
    return AriaJavaJNI.ArMapInterface_refresh(swigCPtr, this);
  }

  public void setIgnoreEmptyFileName(boolean ignore) {
    AriaJavaJNI.ArMapInterface_setIgnoreEmptyFileName(swigCPtr, this, ignore);
  }

  public boolean getIgnoreEmptyFileName() {
    return AriaJavaJNI.ArMapInterface_getIgnoreEmptyFileName(swigCPtr, this);
  }

  public void setIgnoreCase(boolean ignoreCase) {
    AriaJavaJNI.ArMapInterface_setIgnoreCase__SWIG_0(swigCPtr, this, ignoreCase);
  }

  public void setIgnoreCase() {
    AriaJavaJNI.ArMapInterface_setIgnoreCase__SWIG_1(swigCPtr, this);
  }

  public boolean getIgnoreCase() {
    return AriaJavaJNI.ArMapInterface_getIgnoreCase(swigCPtr, this);
  }

  public ArMapInfoInterface getInactiveInfo() {
    long cPtr = AriaJavaJNI.ArMapInterface_getInactiveInfo(swigCPtr, this);
    return (cPtr == 0) ? null : new ArMapInfoInterface(cPtr, false);
  }

  public ArMapObjectsInterface getInactiveObjects() {
    long cPtr = AriaJavaJNI.ArMapInterface_getInactiveObjects(swigCPtr, this);
    return (cPtr == 0) ? null : new ArMapObjectsInterface(cPtr, false);
  }

  public ArArgumentBuilder findMapObjectParams(String mapObjectName) {
    long cPtr = AriaJavaJNI.ArMapInterface_findMapObjectParams(swigCPtr, this, mapObjectName);
    return (cPtr == 0) ? null : new ArArgumentBuilder(cPtr, false);
  }

  public boolean setMapObjectParams(String mapObjectName, ArArgumentBuilder params, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    return AriaJavaJNI.ArMapInterface_setMapObjectParams__SWIG_0(swigCPtr, this, mapObjectName, ArArgumentBuilder.getCPtr(params), params, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public boolean setMapObjectParams(String mapObjectName, ArArgumentBuilder params) {
    return AriaJavaJNI.ArMapInterface_setMapObjectParams__SWIG_1(swigCPtr, this, mapObjectName, ArArgumentBuilder.getCPtr(params), params);
  }

  public ArArgumentBuilderPtrList getRemainder() {
    long cPtr = AriaJavaJNI.ArMapInterface_getRemainder(swigCPtr, this);
    return (cPtr == 0) ? null : new ArArgumentBuilderPtrList(cPtr, false);
  }

  public void setQuiet(boolean isQuiet) {
    AriaJavaJNI.ArMapInterface_setQuiet(swigCPtr, this, isQuiet);
  }

  public boolean parseLine(String line) {
    return AriaJavaJNI.ArMapInterface_parseLine(swigCPtr, this, line);
  }

  public void parsingComplete() {
    AriaJavaJNI.ArMapInterface_parsingComplete(swigCPtr, this);
  }

  public boolean isLoadingDataStarted() {
    return AriaJavaJNI.ArMapInterface_isLoadingDataStarted(swigCPtr, this);
  }

  public boolean isLoadingLinesAndDataStarted() {
    return AriaJavaJNI.ArMapInterface_isLoadingLinesAndDataStarted(swigCPtr, this);
  }

  public final static int MAX_MAP_NAME_LENGTH = AriaJavaJNI.ArMapInterface_MAX_MAP_NAME_LENGTH_get();

}
