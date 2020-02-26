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

// class balokKecil {
//     static Double hitungKeliling(Double p,Double l,Double t){
//         //rumus
//         double keliling = 4*(p+l+t);
//         DecimalFormat df = new DecimalFormat("#.##");
//         //output
//         System.out.println("Keliling Balok = " + df.format(keliling));
//         return keliling;
//     }

//     static Double hitungLuas(Double p,Double l,Double t){
//         double luas = 2*(p*l+p*t+l*t);
//         DecimalFormat df = new DecimalFormat("#.##");
//         //output
//         System.out.println("luas Balok = " + df.format(luas));
//         return luas;
//     }

//     static Double hitungVolume(Double p,Double l,Double t){
//         double volume = p*l*t;
//         DecimalFormat df = new DecimalFormat("#.##");
//         //output
//         System.out.println("luas Balok = " + df.format(volume));
//         return volume;
//     }
// }

// class balokSedang {
//     static Double hitungKeliling(Double p,Double l,Double t){
//         //rumus
//         double keliling = 4*(p+l+t);
//         DecimalFormat df = new DecimalFormat("#.##");
//         //output
//         System.out.println("Keliling Balok = " + df.format(keliling));
//         return keliling;
//     }

//     static Double hitungLuas(Double p,Double l,Double t){
//         double luas = 2*(p*l+p*t+l*t);
//         DecimalFormat df = new DecimalFormat("#.##");
//         //output
//         System.out.println("luas Balok = " + df.format(luas));
//         return luas;
//     }

//     static Double hitungVolume(Double p,Double l,Double t){
//         double volume = p*l*t;
//         DecimalFormat df = new DecimalFormat("#.##");
//         //output
//         System.out.println("luas Balok = " + df.format(volume));
//         return volume;
//     }
// }

// class balokBesar {
//     static Double hitungKeliling(Double p,Double l,Double t){
//         //rumus
//         double keliling = 4*(p+l+t);
//         DecimalFormat df = new DecimalFormat("#.##");
//         //output
//         System.out.println("Keliling Balok = " + df.format(keliling));
//         return keliling;
//     }

//     static Double hitungLuas(Double p,Double l,Double t){
//         double luas = 2*(p*l+p*t+l*t);
//         DecimalFormat df = new DecimalFormat("#.##");
//         //output
//         System.out.println("luas Balok = " + df.format(luas));
//         return luas;
//     }

//     static Double hitungVolume(Double p,Double l,Double t){
//         double volume = p*l*t;
//         DecimalFormat df = new DecimalFormat("#.##");
//         //output
//         System.out.println("luas Balok = " + df.format(volume));
//         return volume;
//     }
// }

// import java.text.DecimalFormat;
// import java.util.Scanner;

// class balok
// {
//     private double panjang, lebar, tinggi, keliling, luas, volume;
//     public void setPanjang(Double p)
//     {
//     panjang = p;
//     }
//     public void setLebar(double l)
//     {
//     lebar = l;
//     }
//     public void setTinggi(double t)
//     {
//     tinggi = t;
//     }
//     public void setKeliling()
//     {
//     keliling = 4 * panjang + 4 * lebar + 4 * tinggi;
//     }
//     public void setLuas()
//     {
//     luas = 2 * panjang * lebar + 2 * panjang * tinggi + 2 * lebar * tinggi;
//     }
//     public void setVolume()
//     {
//     volume = panjang * tinggi * lebar;
//     }
//     public double getPanjang()
//     {
//     return panjang;
//     }
//     public double getLebar()
//     {
//     return lebar;
//     }
//     public double getTinggi()
//     {
//     return tinggi;
//     }
//     public double getKeliling()
//     {
//     return keliling;
//     }
//     public double getLuas()
//     {
//     return luas;
//     }
//     public double getVolume()
//     {
//     return volume;
//     }
// }
 
// class Balok{
//     public static void main(String[] balok){
//     balok B = new balok();
//     System.out.println("<<< BALOK >>>");

//     System.out.println("Panjang balok = "+ B.getPanjang());
//     System.out.println("Lebar balok = " + B.getLebar());
//     System.out.println("Tinggi balok = "+ B.getTinggi());
//     System.out.println("Keliling balok = "+ B.getKeliling());
//     System.out.println("Luas balok = "+ B.getLuas());
//     System.out.println("Volume balok = "+ B.getVolume());
//     }
// }

