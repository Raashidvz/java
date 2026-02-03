class CPU{
	double price;
	
	CPU(double price){
		this.price=price;
	}
	
	class Processor{
		int noOfCores;
		String manufacturer;
		
		Processor(int noOfCores, String manufacturer){
			this.noOfCores = noOfCores;
			this.manufacturer = manufacturer;
		}
		
		void display(){
			System.out.println("Number of corese : "+noOfCores);
			System.out.println("Manufacturer : "+manufacturer);
		}
	}
	
	static class Ram{
		int memory;
		String manufacturer;
		
		Ram(int memory, String manufacturer){
			this.memory=memory;
			this.manufacturer=manufacturer;
		}
		
		void display(){
			System.out.println("Memory : "+memory);
			System.out.println("Manufacturer : "+manufacturer);
		}
		
	}
}