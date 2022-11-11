import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle.radius= scanner.nextInt();
        Circle.area();
        Circle.circumference();
    }
}