import java.util.Scanner;
class piramida{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            int jumlahBalok, tinggi=0;
            System.out.print("masukan jumlah balok : ");
            jumlahBalok = scan.nextInt();
            for(int i=1; i<=jumlahBalok; i++){
                jumlahBalok = jumlahBalok-i;
                tinggi = i;
            }
            System.out.println("tinggi piramida adalah : " +tinggi);
        }
    }
}