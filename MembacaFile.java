import java.io.*;
import java.util.*;

class MembacaFile {
    public static void main(String[] args){
        String teks = null;
        try (Scanner scan = new Scanner(new File("D:\\tugas.txt"))){
            String getDataString;
            while((getDataString=scan.nextLine())!=null){
                teks = getDataString;
            }
        } catch(Exception e) {

        }
        System.out.println("\n=============== Menampilkan Teks ===============\n");
        System.out.println(teks);
        System.out.println("\n================ Analisis Teks =================\n");
        teks = teks.toLowerCase();
        jumlahKalimat(teks);
        jumlahKata(teks);
        frekuensiKemunculanKata(teks);
        banyakBilangan(teks);
        System.out.println("");
    }

    static void jumlahKalimat(String kalimat){
        int jumlahkalimat = 0;
        char[] arrKalimat = kalimat.toCharArray();
        for(int i = 0; i < arrKalimat.length; i++){
            if(arrKalimat[i]=='.' || arrKalimat[i]=='?' || arrKalimat[i]=='!'){
                jumlahkalimat++;
            }
        }
        System.out.println("a.  Jumlah kalimat pada teks = " + jumlahkalimat + " buah");
    }

    static void jumlahKata(String kata){
        int jumlahkata = 1;
        kata = kata.replaceAll(".,?!", "");
        char[] arrKata = kata.toCharArray(); 
        for(int i = 0; i < arrKata.length; i++){
            if(arrKata[i]==' '){
                jumlahkata++;
            }
        }
        int bantu = 0;
        TreeMap<String, Integer> peta = new TreeMap<String, Integer>();
        kata = kata.replaceAll("[-.,?!abcdefghijklmnopqrstuvwxyz]", "");
        String[] array = kata.split("\\s");
        for(int i=0; i<array.length; i++){
            String jumlah = array[i];
            if(jumlah.length()>0){
                if(peta.get(jumlah)==null){
                    peta.put(jumlah, 1);
                }
                else{
                    int nilai = peta.get(jumlah).intValue();
                    nilai++;
                    peta.put(jumlah, nilai);
                }
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = peta.entrySet();
        for(Map.Entry<String, Integer> entry: entrySet){
            bantu += entry.getValue();
        }
        jumlahkata = jumlahkata - bantu;
        System.out.println("b.  Jumlah kata keseluruhan = " + jumlahkata + " buah");
    }

    static void frekuensiKemunculanKata(String frekuensi){
        System.out.println("c.  Frekuensi kemunculan setiap kata :");
        TreeMap<String, Integer> peta = new TreeMap<String, Integer>();
        frekuensi = frekuensi.replaceAll("[.,?!0123456789]", "");
        String[] kata = frekuensi.split("\\s");
        for(int i=0; i<kata.length; i++){
            String kemunculan = kata[i];
            if(kemunculan.length()>0){
                if(peta.get(kemunculan)==null){
                    peta.put(kemunculan, 1);
                }
                else{
                    int nilai = peta.get(kemunculan).intValue();
                    nilai++;
                    peta.put(kemunculan, nilai);
                }
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = peta.entrySet();
        for(Map.Entry<String, Integer> entry: entrySet){
            System.out.println("\t( " + entry.getValue() + " )\t" + entry.getKey());
        }
    }

    static void banyakBilangan(String bilangan){
        int bantu=0;
        TreeMap<String, Integer> peta = new TreeMap<String, Integer>();
        bilangan = bilangan.replaceAll("[-.,?!abcdefghijklmnopqrstuvwxyz]", "");
        String[] banyak = bilangan.split("\\s");
        for(int i=0; i<banyak.length; i++){
            String banbil = banyak[i];
            if(banbil.length()>0){
                if(peta.get(banbil)==null){
                    peta.put(banbil, 1);
                }
                else{
                    int nilai = peta.get(banbil).intValue();
                    nilai++;
                    peta.put(banbil, nilai);
                }
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = peta.entrySet();
        for(Map.Entry<String, Integer> entry: entrySet){
            bantu += entry.getValue();
        }
        System.out.println("d.  Banyak bilangan dalam teks = " + bantu + " buah");
    }
}