import java.util.*;

class TugasStrudat01 {
    static Scanner scan = new Scanner(System.in);
    static int menu;
    static int[] data;
    public static void main(String[] args){
        while(true){
            MenuProgram();
            switch(menu){
                case 1:
                    LihatData();
                    break;
                case 2:
                    TambahData();
                    break;
                case 3:
                    CariData();
                    break;
                case 4:
                    HapusData();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Yang Anda Masukan Salah...\nHarap Memilih Sesuai Menu Utama!!!!");
                    break;
            }
        }
    }
    static void MenuProgram() {
        System.out.println("\n<<< PROGRAM STRUKTUR DATA 01 >>>");
        System.out.println("1. Lihat Data\n2. Tambah Data\n3. Cari Data\n4. Hapus Data\n5. Keluar Program");
        System.out.print("Pilihan Menu (1/2/3/4/5) : ");
        menu = scan.nextInt();
        scan.nextLine();
    }
    static void LihatData(){
        System.out.println("\n<<< Lihat Data >>>");
        if (data!=null){
            for(int i=0;i<data.length;i++){
                System.out.println("Data ke ("+(i+1)+") : "+data[i]);
            }
        } else{
            System.out.println("Belum ada data!");
        }
    }
    static void TambahData() {
        System.out.println("\n<<< Tambah Data >>>");
        int ntambah, n;
        System.out.print("Banyak data yang ingin ditambahkan : ");
        ntambah = scan.nextInt();
        if (data!=null){
            n=data.length;
            int aaa=1;
            int[] bantu = new int[data.length+ntambah];
            for (int i=0; i<data.length; i++) {
                bantu[i]=data[i];
            }
            for (int i=data.length; i<bantu.length; i++) {
                System.out.print("Data "+aaa+" : ");
                bantu[n]=scan.nextInt();
                n++;
                aaa++;
            }
            data=new int[data.length+ntambah];
            data=bantu;
        } else{
            data=new int[ntambah];
            for (int i=0; i<ntambah; i++) {
                System.out.print("Data "+(i+1)+" : ");
                data[i]=scan.nextInt();
            }
        }
    }
    static void CariData(){
        System.out.println("\n<<< Cari Data >>>");
        if (data!=null){
            System.out.print("Data yang dicari : ");
            int cari=scan.nextInt();
            int ketemu=0;
            for (int i=0; i<data.length; i++) {
                if (cari==data[i]){
                    ketemu=1;
                    System.out.println("Data "+cari+" ditemukan di data ke ("+(i+1)+")");
                }
            }
            if (ketemu==0){
                System.out.println("Data tidak ditemukan");
            }
        } else{
            System.out.println("Belum ada data!");
        }
    }
    static void HapusData(){
        System.out.println("\n<<< Hapus Data >>>");
        if (data!=null){
            System.out.print("Data yang ingin dihapus : ");
            int hapus=scan.nextInt();
            int ketemu=0;
            for (int i=data.length-1; i>=0; i--) {
                if (hapus==data[i]){
                    ketemu=1;
                    for(int j=i; j<data.length-1; j++){
                        data[j] = data[j+1];
                    }
                    int[] bantu = new int[data.length-1];
                    for (int k=0; k<bantu.length; k++) {
                        bantu[k]=data[k];
                    }
                    data=bantu;
                    System.out.println("Data "+hapus+" di data ke ("+(i+1)+") telah dihapus");
                }
            }
            if (ketemu==0){
                System.out.println("Data tidak ditemukan");
            }
        } else{
            System.out.println("Belum ada data!");
        }
    }
}