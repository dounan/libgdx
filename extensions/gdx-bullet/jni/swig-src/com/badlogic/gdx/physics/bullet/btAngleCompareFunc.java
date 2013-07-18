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

public class btAngleCompareFunc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btAngleCompareFunc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btAngleCompareFunc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btAngleCompareFunc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_anchor(btVector3 value) {
    gdxBulletJNI.btAngleCompareFunc_m_anchor_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_anchor() {
    long cPtr = gdxBulletJNI.btAngleCompareFunc_m_anchor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public btAngleCompareFunc(Vector3 anchor) {
    this(gdxBulletJNI.new_btAngleCompareFunc(anchor), true);
  }

}
