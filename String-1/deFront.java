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

/* Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the
 * second char if it is 'b'. The string may be any length. Harder than it looks.
 *
 * deFront("Hello") → "llo"
 * deFront("java") → "va"
 * deFront("away") → "aay"
 */

public String deFront(String str) {
    if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
        return str;
    }
    if (str.charAt(0) == 'a') {
        return "a" + str.substring(2, str.length());
    }
    if (str.charAt(1) == 'b') {
         return str.substring(1, str.length());
    }
    return str.substring(2, str.length());
}
