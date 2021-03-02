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

/* Given a string and a non-empty word string, return a version of the original String where all chars have
 * been replaced by pluses ("+"), except for appearances of the word string which are preserved
 * unchanged.
 *
 * plusOut("12xy34", "xy") → "++xy++"
 * plusOut("12xy34", "1") → "1+++++"
 * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */

public String plusOut(String str, String word) {
    String z = "";
    for (int i = 0; i < str.length(); ++i) {
        if (i + word.length() <= str.length() && str.substring(i, i + word.length()).equals(word)) {
            z += word;
            i += word.length() - 1;
        } else {
            z += "+";
        }
    }

    return z;
}
