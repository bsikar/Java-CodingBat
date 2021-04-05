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

/* Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
 * upper/lower case differences (in other words, the computation should not be "case sensitive"). Note:
 * str.toLowerCase() returns the lowercase version of a string.
 *
 * endOther("Hiabc", "abc") → true
 * endOther("AbC", "HiaBc") → true
 * endOther("abc", "abXabc") → true
 */

public boolean endOther(String a, String b) {
    int aLen = a.length();
    int bLen = b.length();
    a = a.toLowerCase();
    b = b.toLowerCase();

    if (aLen < bLen) {
        if (b.substring(bLen - aLen, bLen).equals(a)) {
          return true;
        }
    } else if (a.substring(aLen - bLen, aLen).equals(b)) {
        return true;
    }

    return false;
}
