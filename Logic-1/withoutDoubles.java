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

/* Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is
 * true, if the two dice show the same value, increment one die to the next value, wrapping
 * around to 1 if its value was 6.
 *
 * withoutDoubles(2, 3, true) → 5
 * withoutDoubles(3, 3, true) → 7
 * withoutDoubles(3, 3, false) → 6
 */

public int withoutDoubles(int die1, int die2, boolean noDoubles) {
    if (die1 == die2 && noDoubles) {
        if (die1 == 6) {
            die1 = 1;
        } else {
            ++die1;
        }
    }
    return die1 + die2;
}
