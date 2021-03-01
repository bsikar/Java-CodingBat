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

/* Given a string and a second "word" string, we'll say that the word matches the string if it appears at the
 * front of the string, except its first char does not need to match exactly. On a match, return the front of the
 * string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and
 * "xip" returns "hip". The word will be at least length 1.
 *
 * startWord("hippo", "hi") → "hi"
 * startWord("hippo", "xip") → "hip"
 * startWord("hippo", "i") → "h"
 */

public String startWord(String str, String word) {
    if (str.length() < 1 || word.length() < 1 || word.length() > str.length()) {
        return "";
    }
    if (str.substring(1, word.length()).equals(word.substring(1, word.length()))) {
        return str.substring(0, word.length());
    }
    return "";
}
