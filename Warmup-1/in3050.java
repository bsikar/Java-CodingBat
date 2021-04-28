/* Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range
 * 40..50 inclusive.
 *
 * in3050(30, 31) → true
 * in3050(30, 41) → false
 * in3050(40, 50) → true
 */

public boolean in3050(int a, int b) {
    return ((a(a, b) || b(a, b)));
}

private boolean a(int a, int b) {
    return ((a <= 40 && a >= 30) && (b <= 40 && b >= 30));
}

private boolean b(int a, int b) {
    return ((a <= 50 && a >= 40) && (b <= 50 && b >= 40));
}
