/* MIT License
 *
 * Copyright (c) 2021 Brighton Sikarskie
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/* The squirrels in Palo Alto spend most of the day playing. In particular, they play if the
 * temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is
 * 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the
 * squirrels play and false otherwise.
 *
 * squirrelPlay(70, false) → true
 * squirrelPlay(95, false) → false
 * squirrelPlay(95, true) → true
 */

public boolean squirrelPlay(int temp, boolean isSummer) {
    return (isSummer && temp <= 100 && temp >= 60) || (!isSummer && temp <= 90 && temp >= 60);
}
