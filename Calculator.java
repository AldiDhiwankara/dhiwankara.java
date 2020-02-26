import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculator{

    static double penjumlahan(double a,double b){
        return a+b;
    }

    static double pengurangan(double a,double b){
        return a-b;
    }

    static double perkalian(double a,double b){
        return a*b;
    }

    static double pembagian(double a,double b){
        return a/b;
    }
    
    public static void main(String[] args) {
        while(true){
            String map=(JOptionPane.showInputDialog(null, "masukan angka pertama"));
            double ap = Integer.parseInt(map);
            String mak=(JOptionPane.showInputDialog(null, "masukan angka kedua"));
            double ak = Integer.parseInt(mak);
            String pilih = JOptionPane.showInputDialog(null, "masukan operator (+-*/) ");
            switch (pilih) {
                case "+":
                    JOptionPane.showMessageDialog(null,("hasil penjumlahan : "+penjumlahan(ap,ak)));
                    break;
                case "-":
                    JOptionPane.showMessageDialog(null,("hasil pengurangan : "+pengurangan(ap,ak)));
                    break;
                case "*":
                    JOptionPane.showMessageDialog(null,("hasil perkalian : "+perkalian(ap,ak)));
                    break;
                case "/":
                    JOptionPane.showMessageDialog(null,("hasil pembagian : "+pembagian(ap,ak)));
                    break;
                default:
                    break;
            }
            String kata =  "apakah anda ingin lagi???";
            int replay=JOptionPane.showOptionDialog(null,kata,"confirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if(replay==JOptionPane.NO_OPTION){
                System.exit(0);
            }
        }
    }
}
