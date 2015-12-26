public class MultInh{
	public static void main(String args[]){
		test a=new test("Aravind");
		a.display();
		a.display1();
	}
}

class test extends test1 implements test2{
	test(String s){
		super(s);
	}
	void display(){
		super.display();
	}
	public void display1(){
		System.out.println("YOLO");
		super.display();
		System.out.println("YOLO");
	}
}

class test1{
	String name;
	test1(String s){
		name=s;
	}
	void display(){
		System.out.println(name);
	}
}

interface test2{
	void display1();
}