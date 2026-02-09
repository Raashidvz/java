class Shape{
	double area;
	
	//Circle
	double area(double radius){
		return 3.14*radius*radius;
	}
	
	//Rectangle
	double area(double length,double breadth){
		return length*breadth;
	}
	
	//Square
	int area (int side){
		return side*side;
	}
	
	//Triangle
	float area(float base,float height){
		return (base*height)/2;
	}
}
