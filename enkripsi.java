import java.util.Scanner;
public class enkripsi{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while(true){
            String hasil = "";
            scan.nextLine();
            System.out.print("masukkan teks : ");
            String teks = scan.nextLine();
            System.out.print("masukkan jumlah geser (1-25) : ");
            int jumlahGeser = scan.nextInt();
            if(jumlahGeser<1 || jumlahGeser>25){
                System.out.println("masukkan jumlah geser sesuai permintaan program");
            } else{
                for(int i=0; i<teks.length(); i++){
                    char alphabet = teks.charAt(i);

                    if(alphabet >= 'a' && alphabet <= 'z'){
                        alphabet = (char) (alphabet + jumlahGeser);
                        if(alphabet > 'z'){
                            alphabet = (char) (alphabet+'a'-'z'-1);
                        }
                        hasil = hasil + alphabet;
                    }

                    else if(alphabet >= 'A' && alphabet <= 'Z'){
                        alphabet = (char) (alphabet + jumlahGeser);
                        if(alphabet > 'Z') {
                            alphabet = (char) (alphabet+'A'-'Z'-1);
                        }
                        hasil = hasil + alphabet;
                    }

                    else {
                        hasil = hasil + alphabet;  
                    }
                
                }
                System.out.println("hasil : " + hasil);
            }
            System.out.println();
        }
    }
}