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

/* You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they
 * are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5.
 * Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result
 * is 0.
 *
 * redTicket(2, 2, 2) → 10
 * redTicket(2, 2, 1) → 0
 * redTicket(0, 0, 0) → 5
 */

public int redTicket(int a, int b, int c) {
    if (a == 2 && b == 2 && c == 2 ) {
        return 10;
    }
    if (a == b && a == c) {
        return 5;
    }
    if (a != b && a != c) {
        return 1;
    }
    return 0;
}
