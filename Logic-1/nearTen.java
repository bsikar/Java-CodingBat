public boolean nearTen(int num) {
  return num % 10 <= 2 || 10 - num % 10 <= 2;
}
