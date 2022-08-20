import java.util.Scanner;
public class Main {
    static  int result=1;
    static int exp(int sayi,int us){
        if (us ==0){
            return 1;
        }
        result*=sayi;
        exp(sayi,us-1);
        return result;

}

public static void main (String[]args){
    Scanner input =new Scanner(System.in);
    System.out.println("us bir sayı giriniz");
    int exp =input.nextInt();
    System.out.println("sayi sayisini giriniz;");
    int num = input.nextInt();
    }
}
