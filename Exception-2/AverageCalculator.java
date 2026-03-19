import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            
            try {
                if(num < 0){
                    throw new NegativeNumberException("Negative number not allowed: " + num);
                }
                sum += num;
            } 
            catch(NegativeNumberException e){
                System.out.println(e.getMessage());
                i--;
            }
        }
        
        double avg = (double) sum / n;
        System.out.println("Average = " + avg);
    }
}
