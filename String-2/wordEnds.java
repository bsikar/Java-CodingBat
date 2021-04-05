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

/* Given a string and a non-empty word string, return a string made of each char just before and just after
 * every appearance of the word in the string. Ignore cases where there is no char before or after the word,
 * and a char may be included twice if it is between two words.
 *
 * wordEnds("abcXY123XYijk", "XY") → "c13i"
 * wordEnds("XY123XY", "XY") → "13"
 * wordEnds("XY1XY", "XY") → "11"
 */

public String wordEnds(String str, String word) {
    String z = "";
    for (int i = str.indexOf(word); i != -1; i = str.indexOf(word, ++i)) {
        if (i != 0) {
            z += str.charAt(i-1);
        }
        if (i + word.length() == str.length()) {
            break;
        }
        z += str.charAt(i + word.length());
    }

    return z;
}
