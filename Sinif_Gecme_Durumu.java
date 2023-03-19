import java.util.Scanner;
public class Sinifi_Gecme_Durumu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a, b = 0;
        System.out.println("Matematik notunuzu giriniz.");
        a = inp.nextDouble();
        if(a>=0 && a<=100){
            b += a;
        }
        else{
            b +=0;
        }
        System.out.println("Fizik notunuzu giriniz.");
        a = inp.nextDouble();
        if(a>=0 && a<=100){
            b += a;
        }
        else{
            b +=0;
        }
        System.out.println("Kimya notunuzu giriniz.");
        a = inp.nextDouble();
        if(a>=0 && a<=100){
            b += a;
        }
        else{
            b +=0;
        }
        System.out.println("Türkçe notunuzu giriniz.");
        a = inp.nextDouble();
        if(a>=0 && a<=100){
            b += a;
        }
        else{
            b +=0;
        }
        System.out.println("Müzik notunuzu giriniz.");
        a = inp.nextDouble();
        if(a>=0 && a<=100){
            b += a;
        }
        else{
            b += 0;
        }
        if((b/5)>=55){
            System.out.println("Sınıfı geçtiniz. Ortalamanız : "+(b/5));
        }
        else{
            System.out.println("Sınıfı geçemediniz. Ortalamanız : "+(b/5));
        }

    }
}
