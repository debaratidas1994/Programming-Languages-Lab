import java.util.*;
public class arrays
{
	public static void main(String[] args)
	{
		/*		
		int[] a={1,23,4};
		int[] b ={1,23,4};
		String x="xyz";
		String y="xyz";
		if(a==b)
			System.out.println("==\n");
		if(x.equals(y))		
			System.out.println("equal\n");		
		b = a;
		a[0]=10;
		for(int i:b)
			System.out.println(i);
		
		ArrayList<Integer> a  = new ArrayList<Integer>();
		a.add(3);
		a.add(55);
		ArrayList b = (ArrayList)a.clone();
		a.remove(1);
		a.set(0,10);
		System.out.println(a);
		for(Object i:b)
			System.out.println(i);			
		*/
		int a[] = {1,2,3,4,5};
		int b[] = new int[5];	
		System.arraycopy(a,0,b,0,4);
		a[0]=10;
		for(int i:b)
			System.out.println(i);
			
	}
}

