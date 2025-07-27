package IkinciHafta;
import java.util.Scanner;
public class NotOrt {
    //ToDO son da hepsini göstersin.(YAPILDI)

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        System.out.print("Öğrenci Sayısını Giriniz:");
        int ogrenciSayisi = input.nextInt();

        int [][] not = new int [ogrenciSayisi][3];
        double [] ortalama = new double[ogrenciSayisi];

        for(int i=0 ; i < ogrenciSayisi; i++){
            int toplam = 0;

            for(int  j = 0; j < 3; j++) {
                System.out.print((i + 1) + ".Öğrencinin " + (j + 1) + ".Notunu Giriniz:");
                not[i][j] = input.nextInt();
                toplam += not [i][j];

            }
            ortalama [i] = toplam / 3;
        }
        System.out.println("=== Öğrencilerin Ortalamaları===");
        for(int i = 0; i< ogrenciSayisi; i++){
            System.out.println((i+1)+".Öğrencinin Ortalaması: "+ortalama[i]);
        }


    }
}
