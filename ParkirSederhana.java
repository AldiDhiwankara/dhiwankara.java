import java.util.Scanner;

class ParkirSederhana {
    public static void main(String[] args) {
        while(true){
            Scanner scan = new Scanner(System.in);
            int pilih, durasi;
            double biaya=0;
            double bantu=0;
            double denda=100000;
            String ulangi;
            System.out.println("# PROGRAM PARKIR SEDERHANA #");
            System.out.println("1. Parkir Motor\n2. Parkir Mobil");
            System.out.print("pilih jenis kendaraan (1/2) : ");
            pilih = scan.nextInt();
            if(pilih==1){
                System.out.print("durasi parkir : ");
                durasi = scan.nextInt();
                if(durasi>0 && durasi<=2) {
                    biaya = biaya+3000;
                }
                else if(durasi>2 && durasi<=24) {
                    biaya = biaya+3000+((durasi-2)*2000);
                }
                else if(durasi>24){
                    if((durasi%24)!=0){
                        denda = denda*(durasi/24);
                        if(denda==100000){                        
                            biaya = biaya+denda+6000+((durasi-4)*2000);
                        }
                        else if(denda>100000){
                            for(int i=1;i<=durasi/24;i++){
                                bantu = bantu+3000+((24-2)*2000);
                                biaya += bantu;
                                bantu = bantu*0;
                            }
                            biaya = biaya+denda+3000+(((durasi%24)-2)*2000);
                        }
                    }
                    else{
                        denda = (denda*(durasi/24))-denda;
                        if(denda==100000){                        
                            biaya = biaya+denda+6000+((durasi-4)*2000);
                        }
                        else if(denda>100000){
                            for(int i=1;i<=durasi/24;i++){
                                bantu = bantu+3000+((24-2)*2000);
                                biaya += bantu;
                                bantu = bantu*0;
                            }
                            biaya = biaya+denda;
                        }
                    }
                }
            }
            else if(pilih==2){
                System.out.print("durasi parkir : ");
                durasi = scan.nextInt();
                if(durasi>0 && durasi<=2){
                    biaya = biaya+3000;
                }
                else if(durasi>2 && durasi<=24) {
                    biaya = biaya+3000+((durasi-2)*4000);
                }
                else if(durasi>24){
                    if((durasi%24)!=0){
                        denda = denda*(durasi/24);
                        if(denda==100000){                        
                            biaya = biaya+denda+6000+((durasi-4)*4000);
                        }
                        else if(denda>100000){
                            for(int i=1;i<=durasi/24;i++){
                                bantu = bantu+3000+((24-2)*4000);
                                biaya += bantu;
                                bantu = bantu*0;
                            }
                            biaya = biaya+denda+3000+(((durasi%24)-2)*4000);
                        }
                    }
                    else{
                        denda = (denda*(durasi/24))-denda;
                        if(denda==100000){                        
                            biaya = biaya+denda+6000+((durasi-4)*4000);
                        }
                        else if(denda>100000){
                            for(int i=1;i<=durasi/24;i++){
                                bantu = bantu+3000+((24-2)*4000);
                                biaya += bantu;
                                bantu = bantu*0;
                            }
                            biaya = biaya+denda;
                        }
                    }
                }
            }
            else{
                System.out.println("jenis kendaraan tidak valid !!");
                break;
            }
            System.out.println("biaya parkir : Rp "+biaya);
            System.out.print("apakah admin perlu menghitung biaya parkir pelanggan lainnya? (y/t) : ");
            ulangi= scan.next();
            ulangi = ulangi.toLowerCase();
            if(ulangi.equals("t")) {
                System.exit(0);
            }
            System.out.println("");
        }
    }
}