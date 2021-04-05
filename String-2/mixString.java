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

/* Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the
 * second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
 *
 * mixString("abc", "xyz") → "axbycz"
 * mixString("Hi", "There") → "HTihere"
 * mixString("xxxx", "There") → "xTxhxexre"
 */

public String mixString(String a, String b) {
    String z = "";
    for (int i = 0, aLen = a.length(), bLen = b.length(); i < Math.max(aLen, bLen); ++i) {
        if (i < aLen) {
            z i+= a.charAt(i);
        }
        if (i < bLen) {
            z += b.charAt(i);
        }
    }

    return z;
}
