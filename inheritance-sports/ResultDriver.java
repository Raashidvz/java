import java.util.Scanner;
class ResultDriver {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter Academic Score: ");
        int academic = sc.nextInt();

        System.out.print("Enter Sports Score: ");
        int sports = sc.nextInt();

        Result r = new Result(name, roll, academic);
        r.setSportsScore(sports);
        r.display();

        sc.close();
    }
}