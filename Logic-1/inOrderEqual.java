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

/* Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or
 * 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true,
 * equality is allowed, such as 5 5 7 or 5 5 5.
 *
 * inOrderEqual(2, 5, 11, false) → true
 * inOrderEqual(5, 7, 6, false) → false
 * inOrderEqual(5, 5, 7, true) → true
 */

public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    if (equalOk) {
        return c >= b && b >= a;
    }
    return c > b && b > a;
}
