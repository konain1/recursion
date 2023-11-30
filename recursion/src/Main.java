public class Main {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        int n = scan.nextInt();
        int n = 2;
        int m = 1;
        String [] arr ={ "zero","one","two","three","four","five","six","seven","eight","nine"};
        int pow = 6;
        int [] sortedArr = {1,2,2, 3,4,5};

        String str = "abc";
        String ans = "";

//        Reversecounting(n);
//        counting(m);

//        int resutlt =fact(n);
//        System.out.println(resutlt);

//        int ans = fibo(n);


//        System.out.println(ans);

//        printSpell(n, arr);

//        int result = exponent(pow);
//        System.out.println(result);
//        int optResult = OptimizeExponent(pow);
//        System.out.println(optResult);

//        boolean res = sortedRec(sortedArr,1);
//        System.out.println(res);

//        subsequence(str,ans);
        int steps = stairscase(n);
        System.out.println(steps);
    }

    public static int stairscase(int n){
        if(n <= 0 ){
            return 1;
        }


        return stairscase(n-1) + stairscase(n-2) + stairscase(n-3);
    }
    public static void subsequence(String str,String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

//        take
        subsequence(str.substring(1),ans+str.charAt(0));

//        not take
        subsequence(str.substring(1),ans);

    }
    public static boolean sortedRec(int [] arr,int index){
        if(index >= arr.length){
            return true;
        }


        if(arr[index] < arr[index-1]){
            return false;
        }

       return sortedRec(arr,index+1);
    }
    public static int OptimizeExponent(int n){
        if(n == 0) return 1;

        int half = OptimizeExponent(n/2);

        if(n % 2 != 0){
            return 2 *half * half;
        }else{
            return half * half;
        }
    }
    public static int exponent(int pow){

        if(pow == 0){
            return 1;
        }

         int n = 2 * exponent(pow-1);
        return n;
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