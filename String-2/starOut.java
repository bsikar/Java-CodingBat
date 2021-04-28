/* Return a version of the given string, where for every star (*) in the string the star and the chars
 * immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 *
 * starOut("ab*cd") → "ad"
 * starOut("ab**cd") → "ad"
 * starOut("sm*eilly") → "silly"
 */

public String starOut(String str) {
    String z = "";
    if (str.length() > 0 && str.charAt(0) != '*') {
        z += str.charAt(0);
    }
    for (int i = 1; i < str.length(); ++i) {
        if (str.charAt(i) != '*' && str.charAt(i-1) != '*') {
            z += str.charAt(i);
        }
        if (str.charAt(i) == '*' && str.charAt(i-1) != '*') {
            z = z.substring(0, z.length()-1);
        }
    }

    return z;
}
