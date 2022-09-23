import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args){
        double  fiyat,kdvTutari18,kdvTutari8,kdvliFiyat18,kdvliFiyat8, kdv1= 0.18, kdv2= 0.08, limit =1000;
        boolean kontrol;
        Scanner giris = new Scanner(System.in);

        System.out.print("Ürünün fiyatını giriniz: ");
        fiyat = giris.nextFloat();
        kontrol = fiyat<=limit;

        kdvTutari18= fiyat*kdv1;
        kdvliFiyat18=fiyat+kdvTutari18;

        kdvTutari8= fiyat*kdv2;
        kdvliFiyat8=fiyat+kdvTutari8;
        String hFiyat = kontrol ? ("%18 KDV'li Fiyat:" +kdvliFiyat18): ("%8 KDV'li Fiyat:"+kdvliFiyat8);
        System.out.print(hFiyat);

    }
}
