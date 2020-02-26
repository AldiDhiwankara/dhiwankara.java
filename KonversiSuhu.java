import java.text.DecimalFormat;
import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        double celcius, fahrenheit, kelvin, hasilcelcius, hasilfahrenheit, hasilkelvin;
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner hitung = new Scanner(System.in);

        String ulang = "y";
        while (ulang.equals("y")){
            System.out.println("1. celcius\n2. Fahrenheit\n3. Kelvin");
            System.out.print("Masukan Jenis Suhu Awal : ");
            int input = hitung.nextInt();
            System.out.println(" ");

            if(input==1){
                System.out.print("Masukan Suhu Dalam Celcius  : ");
                celcius = hitung.nextDouble();
                System.out.println("");
                System.out.println("Pilihlah Suhu Yang Ingin Anda Ketahui Nilainya!");
                System.out.println("1. Fahrenheit\n2. Kelvin");
                System.out.print("Masukan Pilihan : ");
                int pilih = hitung.nextInt();
                System.out.println("");
                switch(pilih){
                    case 1 :
                    hasilfahrenheit = (celcius*9/5)+32;
                    System.out.println("<<<<< HASIL >>>>>");
                    System.out.println(celcius + " Celcius = " + df.format(hasilfahrenheit) +" Fahrenheit");
                    break;
                    case 2 :
                    hasilkelvin = celcius+273.15;
                    System.out.println("<<<<< HASIL >>>>>");
                    System.out.println(celcius + " Celcius = " + df.format(hasilkelvin) +" Kelvin");
                    break;
                    default :
                    System.out.println("Pilihan Yang Anda Masukan Salah!!!!");
                    break;
                }
                System.out.println(" ");
            }
            else if(input==2){
                System.out.print("Masukan Suhu Dalam Fahrenheit  : ");
                fahrenheit = hitung.nextDouble();
                System.out.println("");
                System.out.println("Pilihlah Suhu Yang Ingin Anda Ketahui Nilainya!");
                System.out.println("1. Celcius\n2. Kelvin");
                System.out.print("Masukan Pilihan : ");
                int pilih = hitung.nextInt();
                System.out.println("");
                switch(pilih){
                    case 1 :
                    hasilcelcius = (fahrenheit-32)*5/9;
                    System.out.println("<<<<< HASIL >>>>>");
                    System.out.println(fahrenheit + " Fahrenheit = " + df.format(hasilcelcius) +" Celcius");
                    break;
                    case 2 :
                    hasilkelvin = ((fahrenheit-32)*5/9) + 273.15;
                    System.out.println("<<<<< HASIL >>>>>");
                    System.out.println(fahrenheit + " Fahrenheit = " + df.format(hasilkelvin) +" Kelvin");
                    break;
                    default :
                    System.out.println("Pilihan Yang Anda Masukan Salah!!!!");
                    break;
                }
                System.out.println(" ");
            }
            else if(input==3){
                System.out.print("Masukan Suhu Dalam Kelvin  : ");
                kelvin = hitung.nextDouble();
                System.out.println("");
                System.out.println("Pilihlah Suhu Yang Ingin Anda Ketahui Nilainya!");
                System.out.println("1. Celcius\n2. Fahrenheit");
                System.out.print("Masukan Pilihan : ");
                int pilih = hitung.nextInt();
                System.out.println("");
                switch(pilih){
                    case 1 :
                    hasilcelcius = kelvin-273.15;
                    System.out.println("<<<<< HASIL >>>>>");
                    System.out.println(kelvin + " Kelvin = " + df.format(hasilcelcius) +" Celcius");
                    break;
                    case 2 :
                    hasilfahrenheit = fahrenheit= ((kelvin-273.15)*9/5) + 32;
                    System.out.println("<<<<< HASIL >>>>>");
                    System.out.println(kelvin + " Kelvin = " + df.format(hasilfahrenheit) +" Fahrenheit");
                    break;
                    default :
                    System.out.println("Pilihan Yang Anda Masukan Salah!!!!");
                    break;
                }
                System.out.println(" ");
            }
            else{
                System.out.println("Pilihan Yang Anda Masukan Salah!!!!");
                System.out.println(" ");
            }
            System.out.print("Apakah Anda Ingin Mengonversi Suhu Lagi? (y/t) : ");
            ulang = hitung.next();
            System.out.println(" ");
        }
    }
}