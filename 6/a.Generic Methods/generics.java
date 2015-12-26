public class generics{
	public static <T> void compare(T a, T b){
		if(a.equals(b)){
			System.out.println("equal");
		}
		else System.out.println("not equal");
	}
	public static void main(String args[]){
		String a="hello";
		String b="hellO";
		compare(a,b);
		comp c= new comp(10);
		comp d= new comp(20);
		if(c.equals(d)){
			System.out.println("equal");
		}
		else System.out.println("not equal");
	}
	
}

class comp{
	int a;
	comp(int n){
		a=n;
	}
	@Override
	public boolean equals(Object b){
		return this.a == ((comp)b).a;
	}

}