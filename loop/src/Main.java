public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for(int i = 1;i<=3;i++){
            for(int j = 0;j<=(3-i);j++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}