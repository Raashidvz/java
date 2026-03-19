import java.util.Scanner;

public class SortDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Strings: ");
        int n = sc.nextInt();

        String[] strs = new String[n];
        System.out.println("Enter Strings:");
        for (int i = 0; i < n; i++) {
            strs[i]=sc.next();
        }

        GBubbleSort<String> strArr = new GBubbleSort<>(strs);


        System.out.println("Sorted Strings:");
        strArr.sort();
        strArr.display();


        // --------- INTEGER SORT ---------
        System.out.print("\nEnter number of Integers: ");
        n = sc.nextInt();

        Integer[] ints = new Integer[n];
        System.out.println("Enter Integers:");
        for (int i = 0; i < n; i++) {
            ints[i]=sc.nextInt();
        }

        GBubbleSort<Integer> intArr = new GBubbleSort<>(ints);


        System.out.println("Sorted Integers:");
        intArr.sort();
        intArr.display();
    }
}
