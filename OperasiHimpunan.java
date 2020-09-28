import java.util.Scanner;
class OperasiHimpunan{
    static Scanner scan = new Scanner(System.in);
    static boolean ulangA =true, ulangB =true, ulangC =true;

    static void menuUtama() {
        System.out.println("=================================");
        System.out.println("Menampilkan Menu Operasi Himpunan");
        System.out.println("1. irisan");
        System.out.println("2. gabungan");
        System.out.println("3. komplemen");
        System.out.println("4. selisih");
        System.out.println("5. beda setangkup");
        System.out.println("6. perkalian kartesian");
        System.out.println("=================================");
    }
    
    static String[] dataAnggota(String nama,int isi){
        String[] a =new String[isi];
        for(int i=0; i<isi; i++){
            System.out.print("anggota "+nama+" ke-"+(i+1)+" = ");
            a[i] =scan.next();
            scan.nextLine();
        }
        return a;
    }

    static void tampilAnggota(String[] a, String nama){
        System.out.print("Himpunan "+nama+" {");
        for(int i=0; i<(a.length-1); i++){
            System.out.print(a[i]+",");
        }
        System.out.println(a[a.length-1]+"}");
    }

    static String _irisan(String[] a,String[] b){
        String hasil = "";
        for(int i=0; i<b.length; i++){
            for(int j=0; j<a.length; j++){
                if(b[i].equals(a[j])){
                    hasil += (b[i]+",");
                }
            }
        }
        return hasil;
    }

    static String _gabungan(String[] a,String[] b){
        String hasil ="", bantuin ="";
        for(int indek=0; indek<a.length; indek++){
            hasil += (a[indek]+",");
        }
        for(int i=0; i<b.length; i++){
            for(int j=0; j<a.length; j++){
                if(b[i].equals(a[j])){   
                    bantuin ="";
                    j=a.length;          
                }else{
                    bantuin = (b[i]+",");
                }
            }
            hasil+=bantuin;
        }
        return hasil;
    }

    static String _komplemen(String[] a,String[] b){
        String hasil ="",bantuin ="";
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i].equals(b[j])){
                    bantuin ="";
                    j=b.length;
                }else{
                    bantuin = (a[i]+",");
                }
            }
            hasil+=bantuin;
        }
        return hasil;
    }

    static String _selisih(String[] a,String[] b){
        String hasil ="",bantuin ="";
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i].equals(b[j])){
                    bantuin ="";
                    j=b.length;
                }else{
                    bantuin = (a[i]+",");
                }
            }
            hasil+=bantuin;
        }
        return hasil;
    }

    static String _bedaSetangkup(String[] a,String[] b){
        String hasil ="",bantuin ="";
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i].equals(b[j])){
                    bantuin ="";
                    j=b.length;
                }else{
                    bantuin = (a[i]+",");
                }
            }
            hasil+=bantuin;
        }
        for(int i=0; i<b.length; i++){
            for(int j=0; j<a.length; j++){
                if(b[i].equals(a[j])){
                    bantuin ="";
                    j=a.length;
                }else{
                    bantuin = (b[i]+",");
                }
            }
            hasil+=bantuin;
        }
        return hasil;
    }

    static String _perkalianKartesian(String[] a,String[] b){
        String hasil ="";
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                hasil += ("("+a[i]+","+b[j]+"),");
            }
        }
        return hasil;
    }

    public static void main(String[] args) {

        String nama1,nama2, pilih;
        int jumAng1, jumAng2, menu;
        while(true) {
            System.out.println("\n=================================");
            System.out.print("clik enter to ready...");
            scan.nextLine();
            System.out.println("go.!!\n");
            System.out.print("Nama himpunan pertama : ");
            nama1 =scan.nextLine();
            System.out.print("Jumlah anggota "+nama1+" : ");
            jumAng1 =scan.nextInt();
            String[] himpunanA =dataAnggota(nama1,jumAng1);
            System.out.println("=================================");
            System.out.print("Nama himpunan kedua : ");
            nama2 =scan.nextLine();
            System.out.print("Jumlah anggota "+nama2+" : ");
            jumAng2 =scan.nextInt();
            String[] himpunanB =dataAnggota(nama2,jumAng2);

            ulangA =true;
            while(ulangA) {
                menuUtama();
                ulangB =true;
                while(ulangB) {
                    System.out.print("pilihan opersi himpunan : ");
                    menu = scan.nextInt();
                    System.out.println("=================================");
                    tampilAnggota(himpunanA, nama1);
                    tampilAnggota(himpunanB, nama2);                  
                    switch(menu) {
                        case 1:
                            System.out.println("operasi : irisan");
                            System.out.print("hasil "+nama1+" n "+nama2+" : ");
                            System.out.print(_irisan(himpunanA,himpunanB));
                            System.out.println();
                            ulangB =false;
                            break;
                        case 2:
                            System.out.println("operasi : gabungan");
                            System.out.print("hasil "+nama1+" u "+nama2+" : ");
                            System.out.print(_gabungan(himpunanA,himpunanB));                            
                            System.out.println();
                            ulangB =false;
                            break;
                        case 3:
                            System.out.println("operasi : komplemen");
                            System.out.print("hasil "+nama1+" komplemen : ");
                            System.out.print(_komplemen(himpunanB,himpunanA));    
                            System.out.print("\nhasil "+nama2+" komplemen : ");
                            System.out.print(_komplemen(himpunanA,himpunanB));
                            System.out.println();
                            ulangB =false;
                            break;
                        case 4:
                            System.out.println("operasi : selisih");
                            System.out.print("hasil "+nama1+" - "+nama2+" : ");
                            System.out.print(_selisih(himpunanA,himpunanB));                             
                            System.out.print("\nhasil "+nama2+" - "+nama1+" : ");
                            System.out.print(_selisih(himpunanB,himpunanA));                             
                            System.out.println();
                            ulangB =false;
                            break;
                        case 5:
                            System.out.println("operasi : beda setangkup");
                            System.out.print("hasil : ");
                            System.out.print(_bedaSetangkup(himpunanA,himpunanB));                             
                            System.out.println();
                            ulangB =false;
                            break;
                        case 6:
                            System.out.println("operasi : perkalian kartesian");
                            System.out.print("hasil "+nama1+" X "+nama2+" : ");
                            System.out.print(_perkalianKartesian(himpunanA,himpunanB));                             
                            System.out.println();
                            ulangB =false;
                            break;
                        default:
                            System.out.println("Pilihan tidak valid... Harap Memasukkan pilihan yang sesuai !!!!");
                            break;
                    } System.out.println("=================================");
                }

                ulangC =true;
                while(ulangC) {
                    System.out.print("Apakah anda ingin melakukan operasi lainnya (ol) atau memasukan himpunan baru (hb) atau keluar program (kp)?\n(ol/hb/kp) : ");
                    pilih = scan.next();
                    pilih =pilih.toLowerCase();
                    if (pilih.equals("ol")) {
                        ulangC =false;
                    }else if (pilih.equals("hb")) {
                        ulangC =false;
                        ulangA =false;
                    }else if (pilih.equals("kp")) {
                        System.out.println();
                        System.exit(0);
                    }else{
                        System.out.println("Pilihan tidak valid... Harap Memasukkan pilihan yang sesuai !!!!");
                        System.out.println("=================================");
                    }
                }
            }
        }
    }
}