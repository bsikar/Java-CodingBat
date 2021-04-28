/* Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if
 * neither is in that range.
 *
 * max1020(11, 19) → 19
 * max1020(19, 11) → 19
 * max1020(11, 9) → 11
 */

public int max1020(int a, int b) {
    if (t(a) && t(b)) {
        return Math.max(a, b);
    } else if (t(a)) {
        return a;
    } else if (t(b)) {
        return b;
    }

    return 0;
}

private boolean t(int a) {
    return (a <= 20 && a >= 10);
}
