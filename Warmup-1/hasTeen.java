public boolean hasTeen(int a, int b, int c) {
  return (t(a) || t(b) || t(c));
}

private boolean t(int t) {
  return (t <= 19 && t >= 13);
}
