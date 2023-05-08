/*
Java döngüler ile girilen sayıya kadar olan
4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        n = input.nextInt();

        System.out.println(n + "'ye kadar olan 4'ün ve 5'in katları şunlardır :");
        System.out.println("");


        System.out.println("4'ün Katları : ");
        for (int i=1; i <=n; i *=4){ //4'ün katları
            System.out.println(i );
        }

        System.out.println("");

        System.out.println("5'in Katları :");
        for (int i=1; i <=n; i *=5){  //5'in katları
            System.out.println(i );
        }
    }
}