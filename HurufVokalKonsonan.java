import java.util.Scanner;

class HurufVokalKonsonan
{
    static String hapusHurufVokal(String paramTeks)
    {
        paramTeks = paramTeks.replaceAll(" ", "");
        String konsonan = "";
        for(char karakter:paramTeks.toCharArray()){
            if (karakter != 'a' && karakter != 'i' && karakter != 'u' && karakter != 'e' && karakter != 'o'){
                konsonan += karakter;
            }
        }
        return konsonan;
    }

    public static void main(String[] args) 
    {
        System.out.println("<<<< PROGRAM HAPUS HURUF VOKAL >>>>");
        Scanner scan = new Scanner(System.in);

        System.out.print("masukan teks : ");
        String teks = scan.nextLine();
        teks = teks.toLowerCase();
        System.out.println("teks yang anda masukan : " + teks);

        
        System.out.println("teks huruf konsonan : " + hapusHurufVokal(teks));
    }
}