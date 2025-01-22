public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = 0;
        if (j != 0) {
            k = i / j;
        } else {
            System.out.println("Division by zero error!");
        }
        System.out.println(k);
    }
}