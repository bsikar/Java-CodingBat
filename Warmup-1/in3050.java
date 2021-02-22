public boolean in3050(int a, int b) {
  return ((a(a, b) || b(a, b)));
}

private boolean a(int a, int b) {
  return ((a <= 40 && a >= 30) && (b <= 40 && b >= 30));
}

private boolean b(int a, int b) {
  return ((a <= 50 && a >= 40) && (b <= 50 && b >= 40));
}
