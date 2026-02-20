class Bill implements BillOperations{
	int orderNo;
	String date;
	double netAmount=0;
	
	public double calculate(Product[] products){
		for(int i=0;i<products.length;i++){
			netAmount+=products[i].total;
		}
		return netAmount;
	}
}
