import java.util.Scanner;

class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a;

        for (int i = 0; i < count; i++) {
            System.out.print(2 * i + 1);
            if (i < count - 1) System.out.print(", ");
        }
        sc.close();
    }
}
