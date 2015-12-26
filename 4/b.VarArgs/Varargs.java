public class Varargs{
	public static void main(String args[]){
		test("hello","world","yolo");

	}
	static void test(String... a){
		String temp="";
		for (String s:a){
			temp+=s;
		}
		System.out.println(temp);
	}
}