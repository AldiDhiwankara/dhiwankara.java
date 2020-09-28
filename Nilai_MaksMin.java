import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Nilai_MaksMin {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Float> dataNilai = new ArrayList<Float>();
    static int menu,peringkat;
    static float nilai;
    static String ulangi;

    static void menuUtama() {
        System.out.println("### PROGRAM NILAI MAKS_MIN ###");
        System.out.println("1. Input Nilai\n2. Lihat Nilai\n3. Cari Nilai Tertinggi\n4. Cari Nilai Terendah\n5. Keluar");
        System.out.print("Masukan Pilihan: ");
        menu = scan.nextInt();
        System.out.println("");
    }

    static void inputNilai() {
        System.out.println("=== 1. Input Nilai ===");
        while(true) {
            System.out.print("masukan nilai : ");
            nilai = scan.nextFloat();
            scan.nextLine();
            dataNilai.add(nilai);

            System.out.print("lanjut input nilai? (y/n) : ");
            ulangi= scan.next();
            ulangi = ulangi.toLowerCase();
            if(ulangi.equals("n")) {
                break;
            }
        }        
        System.out.println("");
    }

    static void lihatNilai() {
        System.out.println("=== 2. Lihat Nilai ===");
        if(dataNilai.size()!=0) {
            for (int i=1; i<=dataNilai.size(); i++) {
                System.out.print(dataNilai.get(i-1)+" ");
                if((i%5)==0) {
                    System.out.print("\n");
                }
            }
            System.out.println("");
        }
        else{
            System.out.println("tidak ada data nilai, silahkan masukkan data nilai terlebih dahulu pada menu Input Nilai!");
        }
        System.out.println("");
    }

    static void cariNilaiTertinggi(){
        System.out.println("=== 3. Cari Nilai Tertinggi ===");
        if(dataNilai.size()!=0) {
            while(true) {
                System.out.print("masukkan peringkat: ");
                peringkat = scan.nextInt();
                if(peringkat==0 || peringkat>dataNilai.size()){
                    System.out.println("peringkat yang diinputkan tidak valid, silahkan masukkan peringkat > 0 dan <= jumlah data nilai yang sudah dimasukkan!!");
                }
                else{
                    System.out.println("proses cari nilai tertinggi ke-"+peringkat+"....");
                    Collections.sort(dataNilai, Collections.reverseOrder());
                    System.out.println("nilai tertinggi ke-"+peringkat+": "+dataNilai.get(peringkat-1));
                    System.out.print("apakah mau mencari nilai terbesar lainnya? (y/n) : ");
                    ulangi= scan.next();
                    ulangi = ulangi.toLowerCase();
                    if(ulangi.equals("n")) {
                        break;
                    }
                }
            }
        }
        else{
            System.out.println("tidak ada data nilai, silahkan masukkan data nilai terlebih dahulu pada menu Input Nilai!");
        }        
        System.out.println("");
    }

    static void cariNilaiTerendah(){
        System.out.println("=== 4. Cari Nilai Terendah ===");
        if(dataNilai.size()!=0) {
            while(true) {
                System.out.print("masukkan peringkat: ");
                peringkat = scan.nextInt();
                if(peringkat==0 || peringkat>dataNilai.size()){
                    System.out.println("peringkat yang diinputkan tidak valid, silahkan masukkan peringkat > 0 dan <= jumlah data nilai yang sudah dimasukkan!!");
                }
                else{
                    System.out.println("proses cari nilai terendah ke-"+peringkat+"....");
                    Collections.sort(dataNilai);
                    System.out.println("nilai terendah ke-"+peringkat+": "+dataNilai.get(peringkat-1));
                    System.out.print("apakah mau mencari nilai terbesar lainnya? (y/n) : ");
                    ulangi= scan.next();
                    ulangi = ulangi.toLowerCase();
                    if(ulangi.equals("n")) {
                        break;
                    }
                }
            }
        }
        else{
            System.out.println("tidak ada data nilai, silahkan masukkan data nilai terlebih dahulu pada menu Input Nilai!");
        }        
        System.out.println("");
    }

    public static void main(String[] args) {
        while(true) {
            menuUtama();
            switch(menu){
                case 1:
                    inputNilai();
                    break;
                case 2:
                    lihatNilai();
                    break;
                case 3:
                    cariNilaiTertinggi();
                    break;
                case 4:
                    cariNilaiTerendah();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid...\nHarap Memilih Sesuai Menu Utama!!!!");
                    break;
            }
        }
    }
}