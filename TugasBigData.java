import java.util.ArrayList;
import java.util.Scanner;

class TugasBigData {
    static Scanner scan = new Scanner(System.in);
    static int menu;
    static ArrayList<Float> data = new ArrayList<Float>();
    static float nilai;
    static String yaTidak;

    static void menuUtama() {
        System.out.println("\n========== PROGRAM BIG DATA ==========");
        System.out.println("\n<<< Menu Utama >>>");
        System.out.println("1. Input Data\n2. Lihat Data\n3. Keluar");
        System.out.print("Pilih Menu (1/2/3) : ");
        menu = scan.nextInt();
        scan.nextLine();
    }

    static void InputData() {
        System.out.println("<<< Menginput Data >>>");
        while(true) {
            System.out.print("Input Data : ");
            nilai = scan.nextFloat();
            scan.nextLine();
            data.add(nilai);

            System.out.print("Mau Input Data Lagi?? (y/t) : ");
            yaTidak= scan.next();
            yaTidak = yaTidak.toLowerCase();
            if(yaTidak.equals("t")){
                break;
            }
        }
    }

    static void LihatData(){
        System.out.println("<<< Menampilkan Data >>>");
        for(int i=0;i<data.size();i++){
            System.out.println("Data ke-"+(i+1)+" : "+data.get(i));
        }
    }

    public static void main(String[] args) {
        while(true) {
            menuUtama();
            switch(menu){
                case 1:
                    InputData();
                    break;
                case 2:
                    LihatData();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Yang Anda Masukan Salah...\nHarap Memilih Sesuai Menu Utama!!!!");
                    break;
            }
        }
    }
}