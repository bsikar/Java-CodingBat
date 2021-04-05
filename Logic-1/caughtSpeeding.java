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

/* You are driving a little too fast, and a police officer stops you. Write code to compute the
 * result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or
 * less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81
 * or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5
 * higher in all cases.
 *
 * caughtSpeeding(60, false) → 0
 * caughtSpeeding(65, false) → 1
 * caughtSpeeding(65, true) → 0
 */

public int caughtSpeeding(int speed, boolean isBirthday) {
    int x = (isBirthday) ? 5 : 0;
    if (speed <= 60 + x) {
        return 0;
    }
    if (speed >= 61 + x && speed <= 80 + x) {
        return 1;
    }
    return 2;
}
