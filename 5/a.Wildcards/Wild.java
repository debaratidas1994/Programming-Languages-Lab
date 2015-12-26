import java.util.*;
public class Wild{
	public static void main(String args[]){
		List<B> b=new ArrayList<B>();
		b.add(new B());
		b.add(new B());
		List<C> c=new ArrayList<C>();
		c.add(new C());
		c.add(new C());
		printem(b);
		printem(c);
		List<A> a=new ArrayList<A>();
		a.add(new A());
		a.add(new B());
		printemall(a);

	}
	public static void printem(List<? extends A> l){
		for (A a:l){
			System.out.println(a);
		}
	}
	public static void printemall(List<?> l){
		for (Object a:l){
			System.out.println(a);
		}
	}
}

class A extends D{
	public String toString(){
		return "A";
	}
}

class B extends A{
	public String toString(){
		return "B";
	}
}

class C extends A{
	public String toString(){
		return "C";
	}
}

class D{

}