import java.text.DecimalFormat;
import java.util.Scanner;

public class Balok{
    Scanner input = new Scanner(System.in);
    private float panjang,lebar,tinggi;

    public Balok(){
        System.out.print("Masukan panjang : ");
        panjang = input.nextFloat();
        System.out.print("Masukan lebar : ");
        lebar = input.nextFloat();
        System.out.print("Masukan tinggi : ");
        tinggi = input.nextFloat();
    }

    private float hitungKeliling(){
        return 4 * (panjang + lebar + tinggi);
    }
    private float hitungLuas(){
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    private float hitungVolume(){
        return panjang * lebar * tinggi;
    }
    public static void main(String[] args) {
        System.out.println("\t<<<<< PROGRAM OOP-BALOK >>>>>");

        System.out.println("\n1. Form Input - Balok Kecil");
        Balok balokKecil = new Balok();
        System.out.println("\n2. Form Input - Balok Sedang");
        Balok balokSedang = new Balok();
        System.out.println("\n3. Form Input - Balok Besar");
        Balok balokBesar = new Balok();

        System.out.println("\n=======================================");
        System.out.println("========== HASIL PERHITUNGAN ==========");
        System.out.println("=======================================");

        System.out.println("\n1. Balok Kecil");
        System.out.println("\tKeliling: "+ balokKecil.hitungKeliling());
        System.out.println("\tLuas: "+ balokKecil.hitungLuas());
        System.out.println("\tVolume: "+ balokKecil.hitungVolume());

        System.out.println("\n2. Balok Sedang");
        System.out.println("\tKeliling: "+ balokSedang.hitungKeliling());
        System.out.println("\tLuas: "+ balokSedang.hitungLuas());
        System.out.println("\tVolume: "+ balokSedang.hitungVolume());

        System.out.println("\n3. Balok Besar");
        System.out.println("\tKeliling: "+ balokBesar.hitungKeliling());
        System.out.println("\tLuas: "+ balokBesar.hitungLuas());
        System.out.println("\tVolume: "+ balokBesar.hitungVolume());

    }
}
