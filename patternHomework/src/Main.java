public class Main {
    public static void main(String[] args) {
        pattern(3);
    }
    public static void pattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j= n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}