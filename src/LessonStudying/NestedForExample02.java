package LessonStudying;

import java.util.Scanner;

public class NestedForExample02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number= scanner.nextInt();
        for(int i=1;i<=number;i++){
            System.out.println();
            for(int j=i; j<=number;j++){
                System.out.print(" *");
            }
        }
    }
}
