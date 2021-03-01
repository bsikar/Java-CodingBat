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

/* Given three ints, a b c, return true if two or more of them have the same rightmost digit.
 * The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17
 * % 10 is 7.
 *
 * lastDigit(23, 19, 13) → true
 * lastDigit(23, 19, 12) → false
 * lastDigit(23, 19, 3) → true
 */

public boolean lastDigit(int a, int b, int c) {
    return (a % 10 == b % 10 || a % 10 == c % 10 || c % 10 == b % 10);
}
