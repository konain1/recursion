public class Main {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        int n = scan.nextInt();
        int n = 432;
        int m = 1;
        String [] arr ={ "zero","one","two","three","four","five","six","seven","eight","nine"};

//        Reversecounting(n);
//        counting(m);

//        int resutlt =fact(n);
//        System.out.println(resutlt);

//        int ans = fibo(n);


//        System.out.println(ans);

        printSpell(n, arr);
    }
    public static void printSpell(int n, String[] str){
        if(n == 0){
            return;
        }

         printSpell(n/10,str);
        System.out.println(str[n%10]);
    }
public static int fibo(int n){
        if(n == 0|| n ==1){
            return n;
        }

        int res =  fibo(n-1) + fibo(n-2);

    return res;

}
    public static int fact(int n){
        if(n <=1){
            return 1;
        }
//        int aagekaFact = fact(n-1);
//        int ans = n * aagekaFact;
//        return ans;

        return n * fact(n-1);
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