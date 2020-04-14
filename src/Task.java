import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите X: ");
        int X = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите Y: ");
        int Y = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите Z: ");
        int Z = in2.nextInt();
        int C = (X+Y+Z)/3;
        System.out.print("Среднее арифметическое: "+ C);

    }
}
