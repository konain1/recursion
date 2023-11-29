import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        int n = scan.nextInt();
        int n = 5;
        int m = 1;
//        Reversecounting(n);
        counting(m);

    }
    public static void counting(int m){
        if(m == 6){
            return;
        }

//        System.out.println(m);

        counting(m+1);
        System.out.println(m);
    }
    public static void Reversecounting(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);

        Reversecounting(n-1);
    }
}