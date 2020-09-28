public abstract class entitas_PTIkios {
    private int awal, pilihan, voucher, tujuan, xwaktu, jumlahP;
    private String teks, nomor;

    public abstract String Date();

    public void setTeks(String param) {
        this.teks = param;
    }
    public String getTeks() {
        return teks;
    }

    public void setpilihan(int param) {
        this.pilihan = param;
    }
    public int getpilihan() {
        return pilihan;
    }

    public void setNomor(String param) {
        this.nomor = param;
    }
    public String getNomor() {
        return nomor;
    }
    
    public void setVoucher(int param) {
        this.voucher = param;
    }
    public int getVoucher() {
        return voucher;
    }

    public void setAwal(int param) {
        this.awal = param;
    }
    public int getAwal() { 
        return awal;
    }

    public void setTujuan(int param) {
        this.tujuan = param;
    }
    public int getTujuan() { 
        return tujuan;
    }

    public void setWaktuKeberangkatan(int param) {
        this.xwaktu = param;
    }
    public int getWaktuKeberangkatan() { 
        return xwaktu;
    }

    public void setJumlahPenumpang(int param){
        this.jumlahP = param;
    }
    public int getJumlahPenumpang(){
        return jumlahP;
    }
} 