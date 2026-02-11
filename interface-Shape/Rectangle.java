class Rectangle{
	double length,width;
	
	Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	double area(){
		return length*width;
	}
	
	double perimeter(){
		return 2*(length+width);
	}
}
