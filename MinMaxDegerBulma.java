import com.sun.jdi.Value;

import javax.imageio.ImageTranscoder;
import javax.management.StandardEmitterMBean;
import java.util.Scanner;

public class MinMaxDegerBulma {
    public static void main(String[] args) {
        int sayi = 0,enBuyuk=0,enKucuk=0,sayiAdedi;
        Scanner inp= new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz : ");
        sayiAdedi=inp.nextInt();

        for (int i = 1 ; i <= sayiAdedi;i++){
            System.out.print(i+". sayıyı giriniz : ");
            sayi=inp.nextInt();
            if (i == 1 ){
                enBuyuk=sayi;
                enKucuk=sayi;
            }
            if (sayi>=enBuyuk){
                enBuyuk=sayi;
            }
            if (sayi<enKucuk){
                enKucuk=sayi;
            }

        }
        System.out.println("Girilen en küçük sayı :"+" "+enKucuk);
        System.out.println("Girilen en büyük sayı :"+" "+enBuyuk);


    }

   }

