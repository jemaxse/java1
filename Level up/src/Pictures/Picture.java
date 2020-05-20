package Pictures;

public class Picture {
    public static void main(String[] args) {
        int length = 10, weight = 5;
        char c = '+';
        print(c, length);
        System.out.println();
        for (int i = 0; i < weight - 2; i++) {
            System.out.print(c);
            print(' ', length - 2);
            System.out.println(c);
        }
        print(c, length);
        System.out.println();
    }

    public static void print(char c, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(c);
    }
}