public boolean endsLy(String str) {
  if (str.length() >  1) {
    return str.substring(str.length()-2, str.length()).equals("ly");
  }
  return false;
}
