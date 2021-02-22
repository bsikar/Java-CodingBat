public boolean loneTeen(int a, int b) {
  return ((t(a) && !t(b)) || (!t(a) && t(b)));
}

private boolean t(int t) {
  return (t <= 19 && t >= 13);
}