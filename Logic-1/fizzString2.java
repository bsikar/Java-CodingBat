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

/* Given an int n, return the string form of the number followed by "!". So the int 6 yields
 * "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the
 * number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note:
 * the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. What
 * will the remainder be when one number divides evenly into another? (See also: FizzBuzz
 * Code and Introduction to Mod)
 *
 * fizzString2(1) → "1!"
 * fizzString2(2) → "2!"
 * fizzString2(3) → "Fizz!"
 */

public String fizzString2(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
        return "FizzBuzz!";
    }
    if (n % 3 == 0) {
        return "Fizz!";
    }
    if (n % 5 == 0) {
        return "Buzz!";
    }
    return n + "!";
}
