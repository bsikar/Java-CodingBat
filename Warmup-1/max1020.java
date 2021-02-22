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
