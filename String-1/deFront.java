public String deFront(String str) {
  if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
    return str;
  }
  if (str.charAt(0) == 'a') {
    return "a" + str.substring(2, str.length());
  }
  if (str.charAt(1) == 'b') {
      return str.substring(1, str.length());
  }
  return str.substring(2, str.length()); 
}
