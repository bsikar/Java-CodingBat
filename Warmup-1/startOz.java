public String startOz(String str) {
  String x = "";
  if (str.length() >= 1 && str.charAt(0) == 'o') {
    x += "o";
  }
  if (str.length() >= 2 && str.charAt(1) == 'z') {
    x += 'z';
  }
  return x;
}