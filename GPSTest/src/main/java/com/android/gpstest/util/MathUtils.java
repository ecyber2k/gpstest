/*
 * Copyright (C) 2013-2018 The Android Open Source Project, Sean J. Barbeau (sjbarbeau@gmail.com)
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
package com.android.gpstest.util;

/**
 * A utility class containing arithmetic and geometry helper methods.
 *
 */
public class MathUtils {

    /**
     * Calculates {@code a mod b} in a way that respects negative values (for example,
     * {@code mod(-1, 5) == 4}, rather than {@code -1}).
     *
     * (from Glass Compass sample)
     *
     * @param a the dividend
     * @param b the divisor
     * @return {@code a mod b}
     */
    public static float mod(float a, float b) {
        return (a % b + b) % b;
    }

    /**
     * Converts the provided number in Hz to MHz
     * @param hertz value to be converted
     * @return value converted to MHz
     */
    public static float toMhz(float hertz) {
        return hertz / 1000000.00f;
    }
}
