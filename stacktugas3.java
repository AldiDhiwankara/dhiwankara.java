import java.util.*;
public class stacktugas3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        int full=0;
        while(true){
            System.out.println("\n<<< PROGRAM STACK >>>");
            System.out.println("1. Tambah Data(push)\n2. Ambil Data(pop)\n3. Lihat Data Teratas(peek)\n4. Lihat Semua Data(display)\n5. Buat Stack Baru(clear)\n6. Keluar Program(exit)");
            System.out.print("Pilihan (1/2/3/4/5/6) : ");
            int menu = scan.nextInt();
            switch(menu){
                case 1:
                    if (stack.isEmpty() || full<10){
                        System.out.print("\nMasukan data : ");
                        stack.push(scan.next());
                        full++;
                    } else{
                        System.out.println("\n=====Data Full=====");
                    }
                    break;
                case 2:
                    if (!stack.isEmpty()){
                        System.out.println("\n=====Data ["+stack.peek()+"] Diambil=====");
                        stack.pop();
                        full--;
                    } else{
                        System.out.println("\n=====Belum Ada Data=====");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()){
                        System.out.println("Data Teratas : ["+stack.peek()+"]");
                    } else{
                        System.out.println("\n=====Belum Ada Data=====");
                    }
                    break;
                case 4:
                    if (!stack.isEmpty()){
                        System.out.println("\nData : "+stack);
                    } else{
                        System.out.println("\n=====Belum Ada Data=====");
                    }
                    break;
                case 5:
                    if (!stack.isEmpty()){
                        stack.clear();
                        System.out.println("\n=====Sukses Membuat Stack Baru=====");   
                    } else{
                        System.out.println("\n=====Belum Ada Data=====");
                    }
                    break;
                case 6:
                    System.out.println("\n=====Sukses Keluar Dari Program=====\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n=====Pilihan Yang Anda Masukan Salah, Harap Memilih 1/2/3/4/5/6=====");
                    break;
            }
        }
    }
}
