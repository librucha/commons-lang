/*
 * Copyright 2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.lang.mutable;

/**
 * A mutable <code>int</code> wrapper.
 * 
 * @see Integer
 * @since 2.1
 * @version $Id: MutableInt.java,v 1.4 2004/10/08 19:45:46 ggregory Exp $
 */
public class MutableInt extends Number implements Comparable, Mutable {

    /** Serialization lock. */
    private static final long serialVersionUID = 512176391864L;

    /** The mutable value. */
    private int value;

    /**
     * Constructs a new MutableInt with the default value of zero.
     */
    public MutableInt() {
        super();
    }

    /**
     * Constructs a new MutableInt with the specified value.
     * 
     * @param value
     *                  a value.
     */
    public MutableInt(int value) {
        super();
        this.value = value;
    }

    /**
     * Constructs a new MutableInt with the specified value.
     * 
     * @param value
     *                  a value.
     * @throws NullPointerException
     *                  if the object is null
     */
    public MutableInt(Number value) {
        super();
        this.value = value.intValue();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a Integer instance.
     * 
     * @return the value as a Integer
     */
    public Object getValue() {
        return new Integer(this.value);
    }

    /**
     * Sets the value.
     * 
     * @param value
     *                  the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Sets the value from any Number instance.
     * 
     * @param value
     *                  the value to set
     * @throws NullPointerException
     *                  if the object is null
     * @throws ClassCastException
     *                  if the type is not a {@link Number}
     */
    public void setValue(Object value) {
        setValue(((Number) value).intValue());
    }

    //-----------------------------------------------------------------------
    public int intValue() {
        return value;
    }

    public long longValue() {
        return value;
    }

    public float floatValue() {
        return value;
    }

    public double doubleValue() {
        return value;
    }

    //-----------------------------------------------------------------------
    /**
     * Compares this object to the specified object. The result is <code>true</code> if and only if the argument is
     * not <code>null</code> and is an <code>MutableInt</code> object that contains the same <code>int</code> value
     * as this object.
     * 
     * @param obj
     *                  the object to compare with.
     * @return <code>true</code> if the objects are the same; <code>false</code> otherwise.
     */
    public boolean equals(Object obj) {
        if (obj instanceof MutableInt) {
            return (value == ((MutableInt) obj).intValue());
        }
        return false;
    }

    /**
     * Returns a suitable hashcode for this mutable.
     * 
     * @return a suitable hashcode
     */
    public int hashCode() {
        return value;
    }

    /**
     * Compares this mutable to another in ascending order.
     * 
     * @param obj
     *                  the mutable to compare to
     * @return negative if this is less, zero if equal, positive if greater
     * @throws ClassCastException if the argument is not a MutableInt
     */
    public int compareTo(Object obj) {
        MutableInt other = (MutableInt) obj;
        int anotherVal = other.value;
        return (value < anotherVal ? -1 : (value == anotherVal ? 0 : 1));
    }

    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    public String toString() {
        return String.valueOf(value);
    }

}
