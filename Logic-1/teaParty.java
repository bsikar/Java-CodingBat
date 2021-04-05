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

/* We are having a party with amounts of tea and candy. Return the int outcome of the party
 * encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at
 * least 5. However, if either tea or candy is at least double the amount of the other one, the
 * party is great (2). However, in all cases, if either tea or candy is less than 5, the party is
 * always bad (0).
 *
 * teaParty(6, 8) → 1
 * teaParty(3, 8) → 0
 * teaParty(20, 6) → 2
 */

public int teaParty(int tea, int candy) {
    if (tea <= 4 || candy <= 4) {
        return 0;
    }
    if (candy >= (2 * tea) || tea >= (2 * candy)) {
        return 2;
    }
    return 1;
}
