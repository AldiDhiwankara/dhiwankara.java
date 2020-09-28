import java.util.Scanner;
class digitKehidupan{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            int angka=0,count=0;
            boolean ulang=true;
            System.out.print("masukkan tanggal lahir (YYYYMMDD) : ");
            int input = scan.nextInt();
            int bantu = input;
            while(bantu>0){
                bantu = bantu/10;
                count++;
            }
            String cek = String.valueOf(input);
            if(count!=8){
                System.out.println("data tidak valid!! masukkan tanggal lahir yang sesuai dan benar\n");
            }else if(Character.getNumericValue(cek.charAt(4))>0 && Character.getNumericValue(cek.charAt(5))>2){
                System.out.println("data tidak valid!! masukkan tanggal lahir yang sesuai dan benar\n");
            }else if(Character.getNumericValue(cek.charAt(6))>2 && Character.getNumericValue(cek.charAt(7))>1){
                System.out.println("data tidak valid!! masukkan tanggal lahir yang sesuai dan benar\n");
            }else{
                while(ulang){
                    String str = String.valueOf(input);
                    for(int i=0; i<str.length(); i++){
                        if(i<str.length()-1){
                            System.out.print(str.charAt(i)+ " + ");
                        }else{
                            System.out.print(str.charAt(i)+ " = ");
                        }
                        angka += Character.getNumericValue(str.charAt(i));
                    }
                    System.out.print(angka+"\n");
                    input = angka;
                    angka = 0;
                    if(input>9){
                        ulang=true;
                    }else{
                        System.out.println("--> "+input+" adalah digit kehidupan");
                        ulang=false;
                    }
                }System.out.println();
            }
        }
    }
}