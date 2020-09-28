import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class main_PTIkios {
    public static void main(String[] args) throws IOException {
        int biaya_admin, kasir, total_pembayaran=0;
        String tiket = "";
        proses_PTIkios pesan = new proses_PTIkios();

        while (true) {
            pesan.setTeks("        Program PTI-kios        \n  Universitas Negeri Yogyakarta  \n=================================\n1.   PTI-pulsa\n2.   PTI-tiket\n3.   PLN PRABAYAR\n4.   keluar");
            pesan.setpilihan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan menu utama")));
            if (pesan.getpilihan()==1) {
                pesan.setNomor(JOptionPane.showInputDialog(null, "Masukkan nomor HP"));
                pesan.Provider();
                while (true) {
                    pesan.setpilihan(Integer.parseInt(JOptionPane.showInputDialog(null, "TIPE PULSA\n1.   Reguler\n2.   Internet", "pilihan tipe")));
                    if (pesan.getpilihan()==1) { // Reguler
                        biaya_admin = 2000;
                        pesan.setTeks("Pilihan Voucher   :   \n1. 5000\n2. 10000\n3. 20000\n4. 50000\n5. 100000");
                        while (true) {
                            pesan.setVoucher(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan voucher")));
                            if (pesan.getVoucher() >= 1 && pesan.getVoucher() <=5) {
                                break;
                            } else {
                                pesan.Polymorphsim("Inputan salah !");
                            }
                        }
                        pesan.setTeks("NOMOR HP   :   " + pesan.getNomor() + 
                                      "\nPROVIDER    :   " + pesan.jenis +
                                      "\nPULSA           :   " + pesan.operator + " , V-ELECTRIC " + pesan.Get_voucherReguler() + 
                                      "\nHARGA           :   Rp " + (pesan.Get_voucherReguler()+biaya_admin));
                        try {
                            pesan.Polymorphsim(pesan.getTeks(), "DATA");
                        } catch (Exception e) {
                            pesan.Polymorphsim("Terjadi kesalahan !");
                        }
                        pesan.setTeks("PTI UNIVERSITAS NEGERI YOGYAKARTA\nPULSA REGULER\n" + pesan.operator + " , V-ELECTRIC Rp " + pesan.Get_voucherReguler() + "\nHarap segera bayar di kasir\n|||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||\nMasa berlaku 30 menit");
                        try {
                            pesan.Polymorphsim(pesan.getTeks(), "STRUK PEMBELIAN");
                        } catch (Exception e) {
                            pesan.Polymorphsim("Terjadi kesalahan !");
                        }
                        kasir = JOptionPane.showOptionDialog(null, "Apakah anda ingin membayar ke kasir ?", "KONFIRMASI", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                        if(kasir == JOptionPane.YES_OPTION){
                            pesan.setTeks("Pembayaran SUKSES,\nNominal pembayaran Rp " + (pesan.Get_voucherReguler()+biaya_admin) + "\nTerimakasih telah melakukan pengisian ulang senilai " + pesan.Get_voucherReguler());
                            pesan.Polymorphsim(pesan.getTeks(), "PULSA REGULER PTI UNIVERSITAS NEGERI YOGYAKARTA");
                        } break;
                    } 
                    else if (pesan.getpilihan()==2) { // Internet
                        String gb = "";
                        biaya_admin = 3000;
                        pesan.setTeks("Pilihan Voucher   :   \n1. 2GB Rp 30K\n2. 3GB Rp 50K\n3. 4GB Rp 65K\n4. 5GB Rp 80K\n5. 6GB Rp 90K");
                        while (true) {
                            pesan.setVoucher(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan voucher")));
                            if (pesan.getVoucher() >= 1 && pesan.getVoucher() <=5) {
                                break;
                            } else {
                                pesan.Polymorphsim("Inputan salah !");
                            }
                        }
                        if (pesan.getVoucher()==1) {
                            gb = "2GB";
                        } else if (pesan.getVoucher()==2) {
                            gb = "3GB";
                        } else if (pesan.getVoucher()==3) {
                            gb = "4GB";
                        } else if (pesan.getVoucher()==4) {
                            gb = "5GB";
                        } else if (pesan.getVoucher()==5) {
                            gb = "6GB";
                        }
                        pesan.setTeks("NOMOR HP   :   " + pesan.getNomor() + 
                                      "\nPROVIDER    :   " + pesan.jenis +
                                      "\nPULSA           :   " + pesan.operator + " , V-ELECTRIC " + gb + " " + pesan.Get_voucherInternet() + 
                                      "\nHARGA          :   Rp " + (pesan.Get_voucherInternet()+biaya_admin));
                        try {
                            pesan.Polymorphsim(pesan.getTeks(), "DATA");
                        } catch (Exception e) {
                            pesan.Polymorphsim("Terjadi kesalahan !");
                        }       
                        pesan.setTeks("PTI UNIVERSITAS NEGERI YOGYAKARTA\nPULSA INTERNET\n" + pesan.operator + " , V-ELECTRIC Rp " + pesan.Get_voucherInternet() + "\nHarap segera bayar di kasir\n|||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||\nMasa berlaku 30 menit");
                        try {
                            pesan.Polymorphsim(pesan.getTeks(), "STRUK PEMBELIAN");
                        } catch (Exception e) {
                            pesan.Polymorphsim("Terjadi kesalahan !");
                        }
                        kasir = JOptionPane.showOptionDialog(null, "Apakah anda ingin membayar ke kasir ?", "KONFIRMASI", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                        if(kasir == JOptionPane.YES_OPTION){
                            pesan.setTeks("Pembayaran SUKSES,\nNominal pembayaran Rp " + (pesan.Get_voucherInternet()+biaya_admin) + "\nSelamat paket " + gb + " Rp " + pesan.Get_voucherInternet() + " telah aktif,\nterimakasih telah berlangganan");
                            pesan.Polymorphsim(pesan.getTeks(), "PULSA INTERNET PTI UNIVERSITAS NEGERI YOGYAKARTA");
                        } break;
                    }
                    else {
                        pesan.Polymorphsim("Inputan salah !");
                    }
                }
            } 

            else if (pesan.getpilihan()==2) {
                while (true) {
                    pesan.setpilihan(Integer.parseInt(JOptionPane.showInputDialog(null, "TIPE TIKET\n1.   Tiket Pesawat\n2.   Tiket Kereta Api", "pilihan tipe")));
                    if (pesan.getpilihan()==1) { // Tiket pesawat
                        biaya_admin=10000;
                        pesan.setTeks("Pilihan Tujuan   :   \n1. Jakarta (2 jam)\n2. Bali (2 jam)\n3. Palu (3 jam)\n4. Gorontalo (4 jam)\n5. Makassar (2 jam)");
                            while (true) {
                                pesan.setTujuan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan tujuan")));
                                if (pesan.getTujuan() >= 1 && pesan.getTujuan() <=5) {
                                    break;
                                } else {
                                    pesan.Polymorphsim("Inputan salah !");
                                }
                            }
                            pesan.setTeks("Pilihan Waktu   :   \n1. 6.00\n2. 9.00\n3. 12.00\n4. 15.00\n5. 18.00\n6. 21.00");
                            while (true) {
                                pesan.setWaktuKeberangkatan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan waktu keberangkatan")));
                                if (pesan.getWaktuKeberangkatan() >= 1 && pesan.getWaktuKeberangkatan() <= 6) {
                                    break;
                                } else {
                                    pesan.Polymorphsim("Inputan salah !");
                                }
                            }                    
                        pesan.setJumlahPenumpang(Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah penumpang")));
                        String[] title = new String[pesan.getJumlahPenumpang()];
                        String[] nama = new String[pesan.getJumlahPenumpang()];
                        String[] kelasString = new String[pesan.getJumlahPenumpang()];
                        int[] harga = new int[pesan.getJumlahPenumpang()];
                        int[] total_biaya = new int[pesan.getJumlahPenumpang()];
                        for (int i = 0; i < pesan.getJumlahPenumpang(); i++) {
                            while (true) {
                                pesan.setTeks("Title Penumpang   :   \n1. Mr.\n2. Mrs.\n3. Ms.\nMasukan title penumpang(" + (i+1) + ")   :   ");
                                pesan.setpilihan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan title penumpang")));
                                if (pesan.getpilihan() >= 1 && pesan.getpilihan() <= 3){
                                    title[i] = pesan.Get_title();
                                    break;
                                } else {
                                    pesan.Polymorphsim("Inputan salah !");
                                }
                            }
                            pesan.setTeks(JOptionPane.showInputDialog(null, "Masukkan nama penumpang(" + (i+1) + ")"));
                            nama[i] = pesan.getTeks();
                            while (true) {
                                pesan.setTeks("Pilihan kelas   :   \n1. Eksekutif\n2. Bisnis\n3. Ekonomi\nMasukan kelas penumpang(" + (i+1) + ")");
                                pesan.setpilihan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan kelas penumpang")));
                                if (pesan.getpilihan() >= 1 && pesan.getpilihan() <= 3){
                                    kelasString[i] = pesan.Get_kelas();
                                    harga[i] = pesan.Get_hargaTP();
                                    break;
                                } else {
                                    pesan.Polymorphsim("Inputan salah !");
                                }
                            } 
                            total_biaya[i] = harga[i] + biaya_admin;
                            total_pembayaran += total_biaya[i];
                        }
                        for (int j = 0; j < pesan.getJumlahPenumpang(); j++) {
                            pesan.setTeks(
                            "\nPENUMPANG             :   " + (j+1) + 
                            "\nNAMA                           :   " + title[j] + " " + nama[j] + 
                            "\nKELAS                         :   " + kelasString[j] +
                            "\nKEBERANGKATAN   :   Yogyakarta - " + pesan.Get_tujuanPesawat() +
                            "\nTANGGAL                   :   " + pesan.Date() +
                            "\nWAKTU                       :   " + pesan.Get_waktuBerangkat() + ".00 - " + pesan.Get_waktuPesawat() + ".00" + 
                            "\nHARGA                        :   Rp " + harga[j] +
                            "\nBIAYA ADMIN             :   Rp " + biaya_admin +
                            "\nTOTAL BIAYA             :   Rp " + total_biaya[j] ); 
                            try {
                                pesan.Polymorphsim(pesan.getTeks(), "DATA");
                            } catch (Exception e) {
                                pesan.Polymorphsim("Terjadi kesalahan !");
                            }
                        }
                        pesan.setTeks("PTI UNIVERSITAS NEGERI YOGYAKARTA\nTIKET PESAWAT\nHarap segera bayar di kasir\n|||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||\nMasa berlaku 30 menit");
                        pesan.Polymorphsim(pesan.getTeks(), "STRUK PEMBELIAN");
                        kasir = JOptionPane.showOptionDialog(null, "Apakah anda ingin membayar ke kasir ?", "KONFIRMASI", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                        if(kasir == JOptionPane.YES_OPTION){                        
                            for (int j = 0; j < pesan.getJumlahPenumpang(); j++) {
                                tiket += "\n TIKET PESAWAT PTI UNIVERSITAS NEGERI YOGYAKARTA\n===================================================\n" + title[j] + " " + nama[j] + "\n" + kelasString[j] + "\nYogyakarta - " + pesan.Get_tujuanPesawat() + "\n" + pesan.Date() + "/ " + pesan.Get_waktuBerangkat() + ".00 - " + pesan.Get_waktuPesawat() + ".00\n                ||||||||||||||||||                \n                ||||||||||||||||||                \n==================================================\n           SEMOGA SELAMAT SAMPAI TUJUAN           ";
                            }
                            pesan.setTeks("Pembayaran SUKSES,\nNominal pembayaran Rp " + total_pembayaran + "\nterimakasih telah berlangganan" + tiket);
                            pesan.Polymorphsim(pesan.getTeks(), "TIKET PESAWAT PTI UNIVERSITAS NEGERI YOGYAKARTA");
                        } break;
                    } 
                    else if (pesan.getpilihan()==2) { // tiket kereta
                        biaya_admin=7500;
                        pesan.setTeks("Pilihan Asal   :   \n1. Jakarta\n2. Bandung\n3. Malang\n4. Surabaya\n5. Bogor\n6. Yogyakarta");
                            while (true) {
                                pesan.setAwal(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan Awal Keberangkatan")));
                                if (pesan.getAwal() == 1) {
                                    pesan.setTeks("Pilihan Tujuan   :   \n1. Yogyakarta (12 jam)\n2. Bandung (8 jam)\n3. Malang (14 jam)\n4. Surabaya (8 jam)\n5. Bogor (2 jam)");
                                    while (true) {
                                        pesan.setTujuan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan tujuan")));
                                        if (pesan.getTujuan() >= 1 && pesan.getTujuan() <=5) {
                                            break;
                                        } else {
                                            pesan.Polymorphsim("Inputan salah !");
                                        }
                                    }
                                    break;
                                }else if (pesan.getAwal() == 2) {
                                    pesan.setTeks("Pilihan Tujuan   :   \n1. Jakarta (4 jam)\n2. Yogyakarta (8 jam)\n3. Malang (10 jam)\n4. Surabaya (6 jam)\n5. Bogor (4 jam)");
                                    while (true) {
                                        pesan.setTujuan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan tujuan")));
                                        if (pesan.getTujuan() >= 1 && pesan.getTujuan() <=5) {
                                            break;
                                        } else {
                                            pesan.Polymorphsim("Inputan salah !");
                                        }
                                    }
                                    break;
                                }else if (pesan.getAwal() == 3) {
                                    pesan.setTeks("Pilihan Tujuan   :   \n1. Jakarta (14 jam)\n2. Bandung (10 jam)\n3. Yogyakarta (7 jam)\n4. Surabaya (9 jam)\n5. Bogor (14 jam)");
                                    while (true) {
                                        pesan.setTujuan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan tujuan")));
                                        if (pesan.getTujuan() >= 1 && pesan.getTujuan() <=5) {
                                            break;
                                        } else {
                                            pesan.Polymorphsim("Inputan salah !");
                                        }
                                    }
                                    break;
                                }else if (pesan.getAwal() == 4) {
                                    pesan.setTeks("Pilihan Tujuan   :   \n1. Jakarta (12 jam)\n2. Bandung (8 jam)\n3. Malang (8 jam)\n4. Yogyakarta (5 jam)\n5. Bogor (12 jam)");
                                    while (true) {
                                        pesan.setTujuan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan tujuan")));
                                        if (pesan.getTujuan() >= 1 && pesan.getTujuan() <=5) {
                                            break;
                                        } else {
                                            pesan.Polymorphsim("Inputan salah !");
                                        }
                                    }
                                    break;
                                }else if (pesan.getAwal() == 5) {
                                    pesan.setTeks("Pilihan Tujuan   :   \n1. Jakarta (2 jam)\n2. Bandung (4 jam)\n3. Malang (14 jam)\n4. Surabaya (8 jam)\n5. Yogyakarta (12 jam)");
                                    while (true) {
                                        pesan.setTujuan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan tujuan")));
                                        if (pesan.getTujuan() >= 1 && pesan.getTujuan() <=5) {
                                            break;
                                        } else {
                                            pesan.Polymorphsim("Inputan salah !");
                                        }
                                    }
                                    break;
                                }else if (pesan.getAwal() == 6) {
                                    pesan.setTeks("Pilihan Tujuan   :   \n1. Jakarta (12 jam)\n2. Bandung (8 jam)\n3. Malang (7 jam)\n4. Surabaya (5 jam)\n5. Bogor (12 jam)");
                                    while (true) {
                                        pesan.setTujuan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan tujuan")));
                                        if (pesan.getTujuan() >= 1 && pesan.getTujuan() <=5) {
                                            break;
                                        } else {
                                            pesan.Polymorphsim("Inputan salah !");
                                        }
                                    }
                                    break;
                                } else {
                                    pesan.Polymorphsim("Inputan salah !");
                                }
                            }
                            pesan.setTeks("Pilihan Waktu   :   \n1. 6.00\n2. 9.00\n3. 12.00\n4. 15.00\n5. 18.00\n6. 21.00");
                            while (true) {
                                pesan.setWaktuKeberangkatan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan waktu keberangkatan")));
                                if (pesan.getWaktuKeberangkatan() >= 1 && pesan.getWaktuKeberangkatan() <= 6) {
                                    break;
                                } else {
                                    pesan.Polymorphsim("Inputan salah !");
                                }
                            }                    
                        pesan.setJumlahPenumpang(Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah penumpang")));
                        String[] nama = new String[pesan.getJumlahPenumpang()];
                        String[] kelasString = new String[pesan.getJumlahPenumpang()];
                        int[] harga = new int[pesan.getJumlahPenumpang()];
                        int[] total_biaya = new int[pesan.getJumlahPenumpang()];
                        for (int i = 0; i < pesan.getJumlahPenumpang(); i++) {
                            pesan.setTeks(JOptionPane.showInputDialog(null, "Masukkan nama penumpang(" + (i+1) + ")"));
                            nama[i] = pesan.getTeks();
                            while (true) {
                                pesan.setTeks("Pilihan kelas   :   \n1. Eksekutif\n2. Bisnis\n3. Ekonomi\nMasukan kelas penumpang(" + (i+1) + ")");
                                pesan.setpilihan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan kelas penumpang")));
                                if (pesan.getpilihan() >= 1 && pesan.getpilihan() <= 3){
                                    kelasString[i] = pesan.Get_kelas();
                                    harga[i] = pesan.Get_hargaTK();
                                    break;
                                } else {
                                    pesan.Polymorphsim("Inputan salah !");
                                }
                            } 
                            total_biaya[i] = harga[i] + biaya_admin;
                            total_pembayaran += total_biaya[i];
                        }
                        for (int j = 0; j < pesan.getJumlahPenumpang(); j++) {
                            pesan.setTeks(
                            "\nPENUMPANG             :   " + (j+1) +
                            "\nNAMA                           :   " + nama[j] +
                            "\nKELAS                         :   " + kelasString[j] +
                            "\nKEBERANGKATAN   :   " + pesan.Get_awalKereta() + " - " + pesan.Get_tujuanKereta() +
                            "\nTANGGAL                   :   " + pesan.Date() +
                            "\nWAKTU                       :   " + pesan.Get_waktuBerangkat() + ".00 - " + pesan.Get_waktuKereta() + ".00" + 
                            "\nHARGA                        :   Rp " + harga[j] +
                            "\nBIAYA ADMIN             :   Rp " + biaya_admin +
                            "\nTOTAL BIAYA             :   Rp " + total_biaya[j]);
                            try {
                                pesan.Polymorphsim(pesan.getTeks(), "DATA");
                            } catch (Exception e) {
                                pesan.Polymorphsim("Terjadi kesalahan !");
                            }
                        }
                        pesan.setTeks("PTI UNIVERSITAS NEGERI YOGYAKARTA\nTIKET KERETA API\nHarap segera bayar di kasir\n|||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||\nMasa berlaku 30 menit");
                        pesan.Polymorphsim(pesan.getTeks(), "STRUK PEMBELIAN");
                        kasir = JOptionPane.showOptionDialog(null, "Apakah anda ingin membayar ke kasir ?", "KONFIRMASI", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                        if(kasir == JOptionPane.YES_OPTION){                        
                            for (int j = 0; j < pesan.getJumlahPenumpang(); j++) {
                                tiket += "\n TIKET KERETA API PTI UNIVERSITAS NEGERI YOGYAKARTA\n===================================================\n" + nama[j] + "\n" + kelasString[j] + "\n" + pesan.Get_awalKereta() + " - " + pesan.Get_tujuanKereta() + "\n" + pesan.Date() + "/ " + pesan.Get_waktuBerangkat() + ".00 - " + pesan.Get_waktuKereta() + ".00\n                ||||||||||||||||||                \n                ||||||||||||||||||                \n==================================================\n           SEMOGA SELAMAT SAMPAI TUJUAN           ";
                            }
                            pesan.setTeks("Pembayaran SUKSES,\nNominal pembayaran Rp " + total_pembayaran + "\nterimakasih telah berlangganan" + tiket);
                            pesan.Polymorphsim(pesan.getTeks(), "TIKET KERETA API PTI UNIVERSITAS NEGERI YOGYAKARTA");
                        } break;
                    }
                    else {
                        pesan.Polymorphsim("Inputan salah !");
                    }
                }
            }
            
            else if (pesan.getpilihan()==3) { // PLN prabayar
                biaya_admin = 2500;
                while (true) {
                    pesan.setNomor(JOptionPane.showInputDialog(null, "Masukkan nomor Meter"));
                    if (pesan.Get_dataRumah()!=null) {
                        break;
                    } else {
                        pesan.Polymorphsim("Inputan data tidak ditemukan");
                    }
                }
                pesan.setTeks("Pilihan Denom   :   \n1. Rp 20000\n2. Rp 50000\n3. Rp 100000\n4. Rp 500000\n5. Rp 1000000");
                    while (true) {
                        pesan.setpilihan(Integer.parseInt(JOptionPane.showInputDialog(null, pesan.getTeks(), "pilihan nilai denom")));
                        if (pesan.getpilihan() >= 1 && pesan.getpilihan() <= 5) {
                            break;
                        } else {
                            pesan.Polymorphsim("Inputan salah !");
                        }
                    }
                pesan.setTeks(pesan.Get_dataRumah() + "\nHARGA                 :   Rp " + pesan.Get_denom() + "\nADMIN BANK      :   Rp " + biaya_admin + "\nTOTAL HARGA   :   Rp " + (pesan.Get_denom()+biaya_admin));
                try {
                    pesan.Polymorphsim(pesan.getTeks(), "DATA");
                } catch (Exception e) {
                    pesan.Polymorphsim("Terjadi kesalahan !");
                }
                pesan.setTeks("PTI UNIVERSITAS NEGERI YOGYAKARTA\nPLN PRABAYAR\nHarap segera bayar di kasir\n|||||||||||||||||||||||||||||||||\n|||||||||||||||||||||||||||||||||\nMasa berlaku 30 menit");
                pesan.Polymorphsim(pesan.getTeks(), "STRUK PEMBELIAN");
                kasir = JOptionPane.showOptionDialog(null, "Apakah anda ingin membayar ke kasir ?", "KONFIRMASI", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if(kasir == JOptionPane.YES_OPTION){
                    pesan.setTeks("Pembayaran SUKSES,\nNominal pembayaran Rp " + (pesan.Get_denom()+biaya_admin) + "\nterimakasih telah berlangganan\n\ncode angka   :  " + pesan.Get_codeAcak() + "\n ");
                    pesan.Polymorphsim(pesan.getTeks(), "TOKEN PLN PRABAYAR PTI UNIVERSITAS NEGERI YOGYAKARTA");
                }
            }  

            else if (pesan.getpilihan()==4) { // Keluar
                pesan.Polymorphsim("Terimakasih telah berkunjung di PTI-kios, jaga kesehatan selalu :)", "PTI-kios UNIVERSITAS NEGERI YOGYAKARTA");
                System.exit(0);
            } 
            
            else { 
                pesan.Polymorphsim("Inputan salah !");
            }
        }
    }
} 