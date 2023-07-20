package homework;

import java.util.Scanner;

public class SherlockSquares {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Başlangıç sayısını giriniz: ");
        double startNumber=scanner.nextInt();
        System.out.print("Son sayıyı giriniz: ");
        double endNumber= scanner.nextInt();
        double sqrtStartNumber=Math.ceil(Math.sqrt(startNumber));
        double sqrtEndNumber=Math.floor(Math.sqrt(endNumber));
        int sayac=0;
        for(double i=sqrtStartNumber;i<=sqrtEndNumber;i++) {
            double square=i*i;
            if(square>=startNumber && square<=endNumber){
            sayac++;
            }
        }
        System.out.println(sayac);
    }

}
