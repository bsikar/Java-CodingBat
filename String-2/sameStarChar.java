/* Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the
 * star, they are the same.
 *
 * sameStarChar("xy*yzz") → true
 * sameStarChar("xy*zzz") → false
 * sameStarChar("*xa*az") → true
 */

public boolean sameStarChar(String str) {
    for (int i = 0; i < str.length() - 2; ++i) {
        if (str.charAt(i+1) == '*' && str.charAt(i) != str.charAt(i+2)) {
            return false;
        }
    }

    return true;
}
