/* Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and
 * otherwise return the string unchanged. This is a little harder than it looks.
 *
 * withoutX2("xHi") → "Hi"
 * withoutX2("Hxi") → "Hi"
 * withoutX2("Hi") → "Hi"
 */

public String withoutX2(String str) {
    switch (str.length()) {
    case 0:
        return "";
    case 1:
        if (str.charAt(0) == 'x') {
            return "";
        }
        return str;
    default:
        if (str.charAt(0) == 'x') {
            if (str.charAt(1) == 'x') {
                return str.substring(2, str.length());
            }
            return str.substring(1, str.length());
        } else if (str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2, str.length());
        }
    }
    return str;
}
