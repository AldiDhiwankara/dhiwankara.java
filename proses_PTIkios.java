import java.io.IOException;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.JOptionPane;

public class proses_PTIkios extends entitas_PTIkios{
    private int harga, waktu;
    private String awal, tujuan, data, title, kelas, code="";
    ArrayList<Integer> arr = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9));
    String jenis, operator;

    @Override
    public String Date(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd MMM yyyy"); 
        return myDateObj.format(myFormatObj);
    }
    
    public void Polymorphsim(String param, String p){
        JOptionPane.showMessageDialog(null, param, p, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void Polymorphsim(String param){
        JOptionPane.showMessageDialog(null, param, "EROR", JOptionPane.ERROR_MESSAGE);
    }

    public void Provider(){
        String bantu = "";
        for (int i = 0; i <= 3; i++) {
            bantu += getNomor().charAt(i);
        }
        if (bantu.equals("0811") || bantu.equals("0812") || bantu.equals("0813") || bantu.equals("0821") || bantu.equals("0822")) {
            operator = "TELKOMSEL";
            jenis = "SIMPATI";
        } else if (bantu.equals("0823") || bantu.equals("0851") || bantu.equals("0852") || bantu.equals("0853")) {
            operator = "TELKOMSEL";
            jenis = "AS";
        } else if (bantu.equals("0814") || bantu.equals("0815") || bantu.equals("0816") || bantu.equals("0855") || bantu.equals("0858")) {
            operator = "INDOSAT";
            jenis = "MATRIX";
        } else if (bantu.equals("0856") || bantu.equals("0857")) {
            operator = "INDOSAT";
            jenis = "IM3";
        } else if (bantu.equals("0817") || bantu.equals("0818") || bantu.equals("0819") || bantu.equals("0859") || bantu.equals("0877") || bantu.equals("0878")) {
            operator = "XL";
            jenis = "XL";
        } else if (bantu.equals("0888") || bantu.equals("0889")) {
            jenis = "FREN";
        } else if (bantu.equals("0831") || bantu.equals("0832") || bantu.equals("0833") || bantu.equals("0838")) {
            operator = "AXIS";
            jenis = "AXIS";
        } else if (bantu.equals("0881") || bantu.equals("0882") || bantu.equals("0883") || bantu.equals("0884") || bantu.equals("0885") || bantu.equals("0886") || bantu.equals("0887")) {
            jenis = "SMART";
        } else if (bantu.equals("0895") || bantu.equals("0896") || bantu.equals("0897") || bantu.equals("0898") || bantu.equals("0899")) {
            operator = "THREE";
            jenis = "THREE";
        } else if (bantu.equals("0828")) {
            operator = "CERIA";
            jenis = "CERIA";
        } else {
            operator = "-";
            jenis = "-";
        }
    }

    public int Get_voucherReguler(){
        if (getVoucher()==1) {
            harga = 5000;
        } else if (getVoucher()==2) {
            harga = 10000;
        } else if (getVoucher()==3) {
            harga = 20000;
        } else if (getVoucher()==4) {
            harga = 50000;
        } else if (getVoucher()==5) {
            harga = 100000;
        } return harga;
    }

    public int Get_voucherInternet(){
        if (getVoucher()==1) {
            harga = 30000;
        } else if (getVoucher()==2) {
            harga = 50000;
        } else if (getVoucher()==3) {
            harga = 65000;
        } else if (getVoucher()==4) {
            harga = 80000;
        } else if (getVoucher()==5) {
            harga = 90000;
        } return harga;
    }

    public String Get_tujuanPesawat(){
        if (getTujuan()==1) {
            tujuan = "Jakarta";
        } else if (getTujuan()==2) {
            tujuan = "Bali";
        } else if (getTujuan()==3) {
            tujuan = "Palu";
        } else if (getTujuan()==4) {
            tujuan = "Gorontalo";
        } else if (getTujuan()==5) {
            tujuan = "Makassar";
        } return tujuan;
    }

    public String Get_awalKereta(){
        if (getAwal()==1) {
            awal = "Jakarta";
        } else if (getAwal()==2) {
            awal = "Bandung";
        } else if (getAwal()==3) {
            awal = "Malang";
        } else if (getAwal()==4) {
            awal = "Surabaya";
        } else if (getAwal()==5) {
            awal = "Bogor";
        } else if (getAwal()==6) {
            awal = "Yogyakarta";
        } return awal;
    }

    public String Get_tujuanKereta(){
        if (getAwal()==1) {
            if (getTujuan()==1) {
                tujuan = "Yogyakarta";
            } else if (getTujuan()==2) {
                tujuan = "Bandung";
            } else if (getTujuan()==3) {
                tujuan = "Malang";
            } else if (getTujuan()==4) {
                tujuan = "Surabaya";
            } else if (getTujuan()==5) {
                tujuan = "Bogor";
            }
        } else if (getAwal()==2) {
            if (getTujuan()==1) {
                tujuan = "Jakarta";
            } else if (getTujuan()==2) {
                tujuan = "Yogyakarta";
            } else if (getTujuan()==3) {
                tujuan = "Malang";
            } else if (getTujuan()==4) {
                tujuan = "Surabaya";
            } else if (getTujuan()==5) {
                tujuan = "Bogor";
            }
        } else if (getAwal()==3) {
            if (getTujuan()==1) {
                tujuan = "Jakarta";
            } else if (getTujuan()==2) {
                tujuan = "Bandung";
            } else if (getTujuan()==3) {
                tujuan = "Yogyakarta";
            } else if (getTujuan()==4) {
                tujuan = "Surabaya";
            } else if (getTujuan()==5) {
                tujuan = "Bogor";
            }
        } else if (getAwal()==4) {
            if (getTujuan()==1) {
                tujuan = "Jakarta";
            } else if (getTujuan()==2) {
                tujuan = "Bandung";
            } else if (getTujuan()==3) {
                tujuan = "Malang";
            } else if (getTujuan()==4) {
                tujuan = "Yogyakarta";
            } else if (getTujuan()==5) {
                tujuan = "Bogor";
            }
        } else if (getAwal()==5) {
            if (getTujuan()==1) {
                tujuan = "Jakarta";
            } else if (getTujuan()==2) {
                tujuan = "Bandung";
            } else if (getTujuan()==3) {
                tujuan = "Malang";
            } else if (getTujuan()==4) {
                tujuan = "Surabaya";
            } else if (getTujuan()==5) {
                tujuan = "Yogyakarta";
            }
        } else if (getAwal()==6) {
            if (getTujuan()==1) {
                tujuan = "Jakarta";
            } else if (getTujuan()==2) {
                tujuan = "Bandung";
            } else if (getTujuan()==3) {
                tujuan = "Malang";
            } else if (getTujuan()==4) {
                tujuan = "Surabaya";
            } else if (getTujuan()==5) {
                tujuan = "Bogor";
            }
        } return tujuan;
    }

    public int Get_hargaJarakPesawat(){
        if (getTujuan()==1) {
            harga = 1000000;
        } else if (getTujuan()==2) {
            harga = 1000000;
        } else if (getTujuan()==3) {
            harga = 1200000;
        } else if (getTujuan()==4) {
            harga = 1500000;
        } else if (getTujuan()==5) {
            harga = 1000000;
        } return harga;
    }

    public int Get_hargaJarakKereta(){
        if (getAwal()==1) {
            if (getTujuan()==1) {
                harga = 50000;
            } else if (getTujuan()==2) {
                harga = 30000;
            } else if (getTujuan()==3) {
                harga = 60000;
            } else if (getTujuan()==4) {
                harga = 50000;
            } else if (getTujuan()==5) {
                harga = 20000;
            }
        } else if (getAwal()==2) {
            if (getTujuan()==1) {
                harga = 20000;
            } else if (getTujuan()==2) {
                harga = 40000;
            } else if (getTujuan()==3) {
                harga = 50000;
            } else if (getTujuan()==4) {
                harga = 30000;
            } else if (getTujuan()==5) {
                harga = 20000;
            }
        } else if (getAwal()==3) {
            if (getTujuan()==1) {
                harga = 60000;
            } else if (getTujuan()==2) {
                harga = 50000;
            } else if (getTujuan()==3) {
                harga = 30000;
            } else if (getTujuan()==4) {
                harga = 30000;
            } else if (getTujuan()==5) {
                harga = 60000;
            }
        } else if (getAwal()==4) {
            if (getTujuan()==1) {
                harga = 50000;
            } else if (getTujuan()==2) {
                harga = 40000;
            } else if (getTujuan()==3) {
                harga = 30000;
            } else if (getTujuan()==4) {
                harga = 20000;
            } else if (getTujuan()==5) {
                harga = 50000;
            }
        } else if (getAwal()==5) {
            if (getTujuan()==1) {
                harga = 20000;
            } else if (getTujuan()==2) {
                harga = 30000;
            } else if (getTujuan()==3) {
                harga = 60000;
            } else if (getTujuan()==4) {
                harga = 40000;
            } else if (getTujuan()==5) {
                harga = 50000;
            }
        } else if (getAwal()==6) {
            if (getTujuan()==1) {
                harga = 50000;
            } else if (getTujuan()==2) {
                harga = 40000;
            } else if (getTujuan()==3) {
                harga = 30000;
            } else if (getTujuan()==4) {
                harga = 20000;
            } else if (getTujuan()==5) {
                harga = 50000;
            }
        } return harga;
    }

    public int Get_waktuBerangkat(){
        if (getWaktuKeberangkatan()==1) {
            waktu = 6;
        } else if (getWaktuKeberangkatan()==2) {
            waktu = 9;
        } else if (getWaktuKeberangkatan()==3) {
            waktu = 12;
        } else if (getWaktuKeberangkatan()==4) {
            waktu = 15;
        } else if (getWaktuKeberangkatan()==5) {
            waktu = 18;
        } else if (getWaktuKeberangkatan()==6) {
            waktu = 21;
        } return waktu;
    }

    public int Get_waktuPesawat(){
        if (getTujuan()==1) {
            waktu += 2;
        } else if (getTujuan()==2) {
            waktu += 2;
        } else if (getTujuan()==3) {
            waktu += 3;
        } else if (getTujuan()==4) {
            waktu += 4;
        } else if (getTujuan()==5) {
            waktu += 2;
        }
        if (waktu>24) {
            waktu = waktu-24;
        } return waktu;
    }

    public int Get_waktuKereta(){
        if (getAwal()==1) {
            if (getTujuan()==1) {
                waktu += 12;
            } else if (getTujuan()==2) {
                waktu += 8;
            } else if (getTujuan()==3) {
                waktu += 14;
            } else if (getTujuan()==4) {
                waktu += 8;
            } else if (getTujuan()==5) {
                waktu += 2;
            }
        } else if (getAwal()==2) {
            if (getTujuan()==1) {
                waktu += 4;
            } else if (getTujuan()==2) {
                waktu += 8;
            } else if (getTujuan()==3) {
                waktu += 10;
            } else if (getTujuan()==4) {
                waktu += 6;
            } else if (getTujuan()==5) {
                waktu += 4;
            }
        } else if (getAwal()==3) {
            if (getTujuan()==1) {
                waktu += 14;
            } else if (getTujuan()==2) {
                waktu += 10;
            } else if (getTujuan()==3) {
                waktu += 7;
            } else if (getTujuan()==4) {
                waktu += 9;
            } else if (getTujuan()==5) {
                waktu += 14;
            }
        } else if (getAwal()==4) {
            if (getTujuan()==1) {
                waktu += 12;
            } else if (getTujuan()==2) {
                waktu += 8;
            } else if (getTujuan()==3) {
                waktu += 8;
            } else if (getTujuan()==4) {
                waktu += 5;
            } else if (getTujuan()==5) {
                waktu += 12;
            }
        } else if (getAwal()==5) {
            if (getTujuan()==1) {
                waktu += 2;
            } else if (getTujuan()==2) {
                waktu += 4;
            } else if (getTujuan()==3) {
                waktu += 14;
            } else if (getTujuan()==4) {
                waktu += 8;
            } else if (getTujuan()==5) {
                waktu += 12;
            }
        } else if (getAwal()==6) {
            if (getTujuan()==1) {
                waktu += 12;
            } else if (getTujuan()==2) {
                waktu += 8;
            } else if (getTujuan()==3) {
                waktu += 7;
            } else if (getTujuan()==4) {
                waktu += 5;
            } else if (getTujuan()==5) {
                waktu += 12;
            }
        } 
        if (waktu>24) {
            waktu = waktu-24;
        } return waktu;
    }

    public String Get_title(){
        if (getpilihan()==1) {
            title = "Mr.";
        } else if (getpilihan()==2) {
            title = "Mrs.";
        } else if (getpilihan()==3) {
            title = "Ms.";
        } return title;
    }

    public String Get_kelas(){
        if (getpilihan()==1) {
            kelas = "Eksekutif";
        } else if (getpilihan()==2) {
            kelas = "Bisnis";
        } else if (getpilihan()==3) {
            kelas = "Ekonomi";
        } return kelas;
    }

    public int Get_hargaTP(){
        if (getpilihan()==1) {
            harga = 500000 + Get_hargaJarakPesawat();
        } else if (getpilihan()==2) {
            harga = 350000 + Get_hargaJarakPesawat();
        } else if (getpilihan()==3) {
            harga = 200000 + Get_hargaJarakPesawat();
        } return harga;
    }

    public int Get_hargaTK(){
        if (getpilihan()==1) {
            harga = 150000 + Get_hargaJarakKereta();
        } else if (getpilihan()==2) {
            harga = 100000 + Get_hargaJarakKereta();
        } else if (getpilihan()==3) {
            harga = 50000 + Get_hargaJarakKereta();
        } return harga;
    }

    public String Get_dataRumah(){
        if (getNomor().equals("19520249001")) {
            data = "NO METER         :   "+getNomor()+"\nNAMA                   :   Rumah Aldhy\nALAMAT               :   Jl. Persatuan Condong Catur\nDAYA                    :   5500 VA";
        } else if (getNomor().equals("19520244010")) {
            data = "NO METER         :   "+getNomor()+"\nNAMA                   :   Rumah Fisya\nALAMAT               :   Jl. Colombo samirono\nDAYA                    :   4500 VA";
        } else if (getNomor().equals("19520241013")) {
            data = "NO METER         :   "+getNomor()+"\nNAMA                   :   Rumah Mufida\nALAMAT               :   Gg. Anyelir Karangasem\nDAYA                    :   900 VA";
        } return data;
    }

    public int Get_denom(){
        if (getpilihan()==1) {
            harga = 20000;
        } else if (getpilihan()==2) {
            harga = 50000;
        } else if (getpilihan()==3) {
            harga = 100000;
        } else if (getpilihan()==4) {
            harga = 500000;
        } else if (getpilihan()==5) {
            harga = 1000000;
        } return harga;
    }

    public String Get_codeAcak(){
        for (int i=0; i<20 ; i++) {
            Collections.shuffle(arr);
            code += String.valueOf(arr.get(0));
            if ((i+1)%4==0 && i!=19) {
                code += " - ";
            }
        } return code;
    }
}