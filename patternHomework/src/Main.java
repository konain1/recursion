public class Main {
    public static void main(String[] args) {
        pattern(3);
    }
    public static void pattern(int n){

        for(int i = 1;i<=n;i++){

//            space loop
            for(int space = (3-i);space>=1;space--){
                System.out.print(" ");
            }

//            star loop
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }

            

            System.out.println();
        }
    }

}