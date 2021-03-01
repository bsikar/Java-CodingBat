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

/* Given a string, if a length 2 substring appears at both its beginning and end, return a string without the
 * substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi"
 * yields "". Otherwise, return the original string unchanged.
 *
 * without2("HelloHe") → "lloHe"
 * without2("HelloHi") → "HelloHi"
 * without2("Hi") → ""
 */

public String without2(String str) {
    if (str.length() == 1) {
        return str;
    } else if (str.length() <= 2) {
        return "";
    }
    if (str.substring(0, 2).equals(str.substring(str.length()-2, str.length()))) {
        return str.substring(2, str.length());
    }
    return str;
}
