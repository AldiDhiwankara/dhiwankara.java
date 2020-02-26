import java.util.Scanner;

class GanjilGenap{
    static boolean apakahGanjil(int paramBil){
        return (paramBil % 2)==1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("masukan bilangan : ");
        int bilangan = scan.nextInt();

        System.out.println("\n===== PROGRAM GANJIL GENAP =====");
        System.out.println("bilangan yang anda masukan : "+bilangan);
        if(apakahGanjil(bilangan)){
            System.out.println(bilangan+" merupakan bilangan ganjil");
        }
        else{
            System.out.println(bilangan+" merupakan bilangan genap");
        }
        System.out.println("");
    }
}

// class GanjilGenap{
//     static String apakahGanjil(int paramBil){
//         String hasil = ""; 
//         if((paramBil % 2)==1){
//             hasil = "ganjil";
//         }
//         else{
//             hasil = "genap";
//         }
//         return hasil;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
        
//         System.out.print("masukan bilangan : ");
//         int bilangan = scan.nextInt();

//         System.out.println("\n===== PROGRAM GANJIL GENAP =====");
//         System.out.println("bilangan yang anda masukan : "+bilangan);
//         System.out.println(bilangan+" merupakan bilangan "+apakahGanjil(bilangan)); 
//         System.out.println("");
//     }
// }