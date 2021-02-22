public int teaParty(int tea, int candy) {
  if (tea <= 4 || candy <= 4) {
    return 0;
  }
  if (candy >= (2 * tea) || tea >= (2 * candy)) {
    return 2;
  }
  return 1;
}
