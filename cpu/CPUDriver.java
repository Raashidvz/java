import java.util.Scanner;

class CPUDriver{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Price of CPU : ");
        double price = sc.nextDouble();
		CPU cpu = new CPU(price);

        System.out.print("Enter the number of cores : ");
        int cores = sc.nextInt();
        System.out.print("Enter the manufacturer of processor : ");
        String manufacturer = sc.next();
		CPU.Processor processor = cpu.new Processor(cores,manufacturer);

        System.out.print("Enter the Memory (GB): ");
        int memory = sc.nextInt();
        System.out.print("Enter the manufacturer of RAM : ");
        manufacturer = sc.next();

		CPU.Ram ram = new CPU.Ram(memory,manufacturer);
		
		processor.display();
		ram.display();
	}
}