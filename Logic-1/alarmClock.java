public String alarmClock(int day, boolean vacation) {
  if (day == 0 || day == 6) {
    if (vacation) {
      return "off";
    }
    return "10:00";
  }
  if (vacation) {
    return "10:00";
  }
  return "7:00";
}
