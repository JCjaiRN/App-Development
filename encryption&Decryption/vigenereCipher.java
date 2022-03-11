public class vigenereCipher {
 static String encode(String text, final String key) {
 String res = "";
 text = text.toUpperCase();
 for (int i = 0, j = 0; i < text.length(); i++) {
 char c = text.charAt(i);
 if (c < 'A' || c > 'Z') {
 continue;
 }
 res += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
 j = ++j % key.length();
 }
 return res;
 }
 static String decode(String text, final String key) {
 String res = "";
 text = text.toUpperCase();
for (int i = 0, j = 0; i < text.length(); i++) {
 char c = text.charAt(i);
 if (c < 'A' || c > 'Z') {
 continue;
 }
 res += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
 j = ++j % key.length();
 }
 return res;
 }
 public static void main(String[] args) throws java.lang.Exception {
 String key = "VIGENERECIPHER";
 String msg = "SecurityLaboratory";
 System.out.println("Simulating Vigenere Cipher\n------------------------");
 System.out.println("Input Message : " + msg);
 String enc = encode(msg, key);
 System.out.println("Encrypted Message : " + enc);
 System.out.println("Decrypted Message : " + decode(enc, key));
 } }