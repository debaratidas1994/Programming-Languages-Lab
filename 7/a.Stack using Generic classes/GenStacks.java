import java.util.*;
public class GenStacks<T>{
	List<T> s;
	GenStacks(){
		s=new ArrayList<T>();
	}
	void push(T e){
		s.add(e);
	}
	void pop(){
		s.remove(s.size()-1);
	}
	void print(){
		System.out.println(s);
	}
	public static void main(String args[]){
		GenStacks<Integer> a=new GenStacks<Integer>();
		GenStacks<String> b= new GenStacks<String>();
		a.push(10);
		a.push(20);
		a.pop();
		a.print();
		b.push("hello");
		b.push("yolo");
		b.print();
		b.pop();
		b.print();
	}
}