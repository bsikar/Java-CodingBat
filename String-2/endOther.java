/* Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
 * upper/lower case differences (in other words, the computation should not be "case sensitive"). Note:
 * str.toLowerCase() returns the lowercase version of a string.
 *
 * endOther("Hiabc", "abc") → true
 * endOther("AbC", "HiaBc") → true
 * endOther("abc", "abXabc") → true
 */

public boolean endOther(String a, String b) {
    int aLen = a.length();
    int bLen = b.length();
    a = a.toLowerCase();
    b = b.toLowerCase();

    if (aLen < bLen) {
        if (b.substring(bLen - aLen, bLen).equals(a)) {
          return true;
        }
    } else if (a.substring(aLen - bLen, aLen).equals(b)) {
        return true;
    }

    return false;
}
