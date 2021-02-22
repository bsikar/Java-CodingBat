public int sumLimit(int a, int b) {
  if (String.valueOf(a).length() == String.valueOf(a + b).length()) {
    return a + b;
  }
  
  return a;
}
