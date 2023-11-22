// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,6,7,9};

//   test();
//   reverse(1234567);
    reverArr(arr);

    }
    public static void reverArr(int [] arr){

        int y [] = new int [arr.length];
        int idx = 0;

        for(int i = arr.length-1;i>= 0;i--){

            y[idx++] = arr[i];
         }

        for (int i = 0;i<y.length;i++){
            System.out.print(y[i]);
        }
    }
    public static void test(){
        for(int i = 0;i<10;i++){
            if(i ==5){
                return;
            }
            System.out.println(i);
        }
        System.out.println("after break");

    }
    public static void reverse(int n){

        int y = 0;

        while(n != 0){
            int r = n%10;
            n = n / 10;
            y = (y*10) + r;
        }

        System.out.println(y);
    }
}