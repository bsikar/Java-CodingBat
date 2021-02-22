public String seeColor(String str) {
  if (str.length() >= 4) {
    if (str.substring(0, 4).equals("blue")) {
      return "blue";
    }
  }
  if (str.length() >= 3) {
    if (str.substring(0, 3).equals("red")) {
      return "red";
    }
  }
  return "";
}
