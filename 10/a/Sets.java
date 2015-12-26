import java.util.*;
public class Sets{
	public static void main(String args[]){
		Set<Integer> s= new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(59);
		s.remove(59);
		System.out.println(s+":"+s.size());
		Iterator i=s.iterator();  //iterator object
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}