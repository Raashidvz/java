public class GStack<T> {
	T arr[] = new T(100);
	int top=-1;
	
	
	boolean push(T e){
		arr[++top]=e;
	}
	
	void pop(){
		if(top==-1){
			System.out.println("Stack Empty, nothing to delete");
		}
		top--;
	}
}
