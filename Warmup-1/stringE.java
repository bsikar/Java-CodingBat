public boolean stringE(String str) {
 int e = 0;
 for (int i = 0; i < str.length(); ++i) {
   if (str.charAt(i) == 'e') {
     ++e;
   }
 }
 return (e >= 1 && e <= 3);
}
