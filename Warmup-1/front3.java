public String front3(String str) {
  String x = str;
  if (str.length() >= 3) {
    x = str.substring(0, 3);
  }
  return x + x + x;
}
