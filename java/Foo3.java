public class Foo3 { 
	final int x;
	public void go() { 
		System.out.println(x);//variable x might not have been initialized
	}
}
