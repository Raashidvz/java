class Product{
	int productID,quantity;
	String name;
	double unitPrice,total;
	
	Product(int productID, int quantity,String name, double unitPrice){
		this.productID=productID;
		this.quantity=quantity;
		this.name=name;
		this.unitPrice=unitPrice;
		this.total=quantity*unitPrice;
	}	
}
