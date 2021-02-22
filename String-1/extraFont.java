public String extraFront(String str) {
  if (str.length() >= 2) {
    return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
  } else if (str.length() >= 1) {
    return str.substring(0, 1) + str.substring(0, 1) + str.substring(0, 1);
  }
  return "";
}
