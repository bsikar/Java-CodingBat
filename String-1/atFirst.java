public String atFirst(String str) {
  if (str.length() >= 2) {
    return str.substring(0, 2);
  }
  for (int i = 0; i <= 2-str.length(); ++i) {
    str += '@';
  } 
  return str;
}
