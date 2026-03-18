public class GStack<T> {
	Object[] arr = new Object[100];
	int top=-1;
	
	
	void push(T e){
		arr[++top]=e;
	}
	
	void pop(){
		if(top==-1){
			System.out.println("Stack Empty, nothing to delete");
		}else{
            System.out.println("Popped Element : "+arr[top]);
        }
		top--;
        
	}

    void display(){
        if(top==-1){
            System.out.println("Stack is empty!");
        }else{
            System.out.println(" _______________");
            for(int i=top;i>-1;i--){
                System.out.println("|\t"+arr[i]+"\t|");
            }
            System.out.println(" ---------------");
        }
    }
}
