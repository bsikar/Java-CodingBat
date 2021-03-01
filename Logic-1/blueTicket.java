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

/* You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which
 * we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to
 * exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac
 * sums, the result is 5. Otherwise the result is 0.
 *
 * blueTicket(9, 1, 0) → 10
 * blueTicket(9, 2, 0) → 0
 * blueTicket(6, 1, 4) → 10
 */

public int blueTicket(int a, int b, int c) {
    if (a + b == 10 || b + c == 10 || c + a == 10) {
        return 10;
    }
    if (a == c + 10 || b == c + 10) {
        return 5;
    }
    return 0;
}
