import java.io.Console;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.print("1.Sayı: ");
        double number1 = input.nextDouble();
        System.out.print("2.Sayı: ");
        double number2 = input.nextDouble();
        System.out.println("Lütfen İşlem Seçiniz\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        int islem = input.nextInt();
        switch(islem){
            case 1:
                System.out.print("Sonuç:" +(number1+number2));
                break;
            case 2:
                System.out.println("Sonuç:" +(number1-number2));
                break;
            case 3:
                System.out.println("Sonuç:" +(number1*number2));
                break;
            case 4:
                System.out.println("Sonuç:" +(number1/number2));
                break;
            default:
                System.out.print("Lütfen Geçerli İşlem Giriniz");
        }











    }
}
