/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btStridingMeshInterfaceData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btStridingMeshInterfaceData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btStridingMeshInterfaceData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btStridingMeshInterfaceData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_meshPartsPtr(btMeshPartData value) {
    gdxBulletJNI.btStridingMeshInterfaceData_m_meshPartsPtr_set(swigCPtr, this, btMeshPartData.getCPtr(value), value);
  }

  public btMeshPartData getM_meshPartsPtr() {
    long cPtr = gdxBulletJNI.btStridingMeshInterfaceData_m_meshPartsPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btMeshPartData(cPtr, false);
  }

  public void setM_scaling(btVector3FloatData value) {
    gdxBulletJNI.btStridingMeshInterfaceData_m_scaling_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_scaling() {
    long cPtr = gdxBulletJNI.btStridingMeshInterfaceData_m_scaling_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_numMeshParts(int value) {
    gdxBulletJNI.btStridingMeshInterfaceData_m_numMeshParts_set(swigCPtr, this, value);
  }

  public int getM_numMeshParts() {
    return gdxBulletJNI.btStridingMeshInterfaceData_m_numMeshParts_get(swigCPtr, this);
  }

  public void setM_padding(String value) {
    gdxBulletJNI.btStridingMeshInterfaceData_m_padding_set(swigCPtr, this, value);
  }

  public String getM_padding() {
    return gdxBulletJNI.btStridingMeshInterfaceData_m_padding_get(swigCPtr, this);
  }

  public btStridingMeshInterfaceData() {
    this(gdxBulletJNI.new_btStridingMeshInterfaceData(), true);
  }

}
