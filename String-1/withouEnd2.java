public String withouEnd2(String str) {
  if (str.length() >= 3) {
    return str.substring(1, str.length()-1);
  }
  return "";
}
