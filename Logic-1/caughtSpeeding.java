public int caughtSpeeding(int speed, boolean isBirthday) {
  int x = (isBirthday) ? 5 : 0;
  if (speed <= 60 + x) {
    return 0;
  } else if (speed >= 61 + x && speed <= 80 + x) {
    return 1;
  } else {
    return 2;
  }
}
