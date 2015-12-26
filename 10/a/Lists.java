import java.util.List;
import java.util.ArrayList;
public class Lists{
	public static void main(String args[]){
		List<String> a=new ArrayList<String>();
		a.add("hello");
		a.add("yolo");
		System.out.println("ArrayList elements: "+a);
		a.add(1,"boo");
		System.out.println(a.get(1));
		a.remove(0);
		System.out.println("ArrayList elements: "+a);

	}
}