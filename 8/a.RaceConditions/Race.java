public class Race extends Thread{
	static int x=2;
	public void run(){
		fun();
	}
	synchronized public static void fun(){
		x=x*x+x*x;
		System.out.println(currentThread().getName()+":"+x);
	}
	public static void main(String args[]){
		Race t1=new Race();
		Race t2=new Race();
		Race t3	=new Race();
		t1.start();
		t2.start();
		t3.start();
	}
}

/* 
Race condition eliminated by making method synchronized
*/
