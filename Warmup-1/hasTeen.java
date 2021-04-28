/* We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or
 * more of them are teen.
 *
 * hasTeen(13, 20, 10) → true
 * hasTeen(20, 19, 10) → true
 * hasTeen(20, 10, 13) → true
 */

public boolean hasTeen(int a, int b, int c) {
    return (t(a) || t(b) || t(c));
}

private boolean t(int t) {
    return (t <= 19 && t >= 13);
}
