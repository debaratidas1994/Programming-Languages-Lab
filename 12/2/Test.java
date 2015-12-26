public class Test{
	public static void main(String args[]){
		display("hello","world");
		display();
	}
	static void display(String... values){
		System.out.println("display method invoked");
		for(String s:values){
			System.out.println(s);
		}
	}
}