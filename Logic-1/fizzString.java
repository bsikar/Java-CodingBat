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

/* Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b"
 * return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other
 * cases, return the string unchanged. (See also: FizzBuzz Code)
 *
 * fizzString("fig") → "Fizz"
 * fizzString("dib") → "Buzz"
 * fizzString("fib") → "FizzBuzz"
 */

public String fizzString(String str) {
    if (str.charAt(0) == 'f') {
        if (str.charAt(str.length()-1) == 'b') {
            return "FizzBuzz";
        }
        return "Fizz";
    }
    if (str.charAt(str.length()-1) == 'b') {
        return "Buzz";
    }
    return str;
}
