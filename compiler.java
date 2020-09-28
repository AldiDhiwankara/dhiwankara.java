 import java.io.BufferedReader;  
 import java.io.FileNotFoundException;  
 import java.io.FileReader;  
 import java.io.PrintWriter;  
 public class compiler{  
   private static final int JUMLAH_KARAKTER = 256;  
   private static int[] total_per_karakter = new int[JUMLAH_KARAKTER];  
   public static void main(String args[]) throws FileNotFoundException {  
     PrintWriter output = new PrintWriter("D:\\tugas.txt");  
     String kata = null;  
     try (BufferedReader buffer = new BufferedReader(new FileReader("D:\\tugas.txt"))) {  
       String sCurrentLine;  
       while ((sCurrentLine = buffer.readLine()) != null) {  
         kata = sCurrentLine;  
         kata = kata.toLowerCase();  
       }  
     } catch (Exception e) {  
     }  
     // inisialisasikan setiap karakter berjumlah 0 buah   
     for (int i = 0; i < JUMLAH_KARAKTER; i++) {  
       total_per_karakter[i] = 0;  
     }  
     // hitung jumlah setiap karakter  
     int kata_len = kata.length();  
     for (int i = 0; i < kata_len; i++) {  
       total_per_karakter[(int) kata.charAt(i)]++;  
     }  
     // tampilkan jumlah setiap karakter  
     System.out.println();  
     output.println("VARIABLE");  
     char cTemp;  
     for (int i = 0; i < JUMLAH_KARAKTER; i++) {  
       if (total_per_karakter[i] > 0) {  
         if (((char) i >= 'a' && (char) i <= 'z')) {  
           cTemp = (char) i;  
 //          System.out.println(cTemp + " : " + total_per_karakter[i]);  
           output.println(cTemp + " : " + total_per_karakter[i]);  
         }  
       }  
     }  
     output.println("DIGIT");  
     for (int i = 0; i < JUMLAH_KARAKTER; i++) {  
       if (total_per_karakter[i] > 0) {  
         if ((char) i >= '0' && (char) i <= '9') {  
           //System.out.println((char) i + " : " + total_per_karakter[i]);  
           output.println((char) i + " : " + total_per_karakter[i]);  
         }  
       }  
     }  
     output.println("OPERATOR");  
     for (int i = 0; i < JUMLAH_KARAKTER; i++) {  
       if (total_per_karakter[i] > 0) {  
         if (((char) i >= '(' && (char) i <= '/') || ((char) i >= '<' && (char) i <= '>')) {  
           //System.out.println((char) i + " : " + total_per_karakter[i]);  
           output.println((char) i + " : " + total_per_karakter[i]);  
         }  
       }  
     }  
     output.close();  
   }  
 }  