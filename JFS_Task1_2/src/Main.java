import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n>0) {
            System.out.println("Value: "+ n+ " The given number positive.");
        } else {
            System.out.println("Value: "+ n+ " The given number negative.");
        }
    }
}