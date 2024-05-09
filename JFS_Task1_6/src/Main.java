import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i, j, n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                m = i<j ? j : j;
                System.out.print(n-m + 1 + " ");
            }
        }

        for (j = n - 1; j >= 1; j--) {
            m = i < j ? j : j;
            System.out.print(n-m + 1 + " ");
        }
        System.out.println();

        for (j = n - 1; j >= 1; j--) {
            m = i < j ? j : j;
            System.out.print(n-m + 1 + " ");
        }
        System.out.println();
    }
}