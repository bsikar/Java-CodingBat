/* Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the
 * second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
 *
 * mixString("abc", "xyz") → "axbycz"
 * mixString("Hi", "There") → "HTihere"
 * mixString("xxxx", "There") → "xTxhxexre"
 */

public String mixString(String a, String b) {
    String z = "";
    for (int i = 0, aLen = a.length(), bLen = b.length(); i < Math.max(aLen, bLen); ++i) {
        if (i < aLen) {
            z i+= a.charAt(i);
        }
        if (i < bLen) {
            z += b.charAt(i);
        }
    }

    return z;
}
