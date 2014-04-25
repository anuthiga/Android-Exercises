public class GC {
	public static GC doStuff() {
		GC newGC = new GC();
		doStuff2(newGC);
		return newGC;
	}
	
	public static void main(String [] args) {
		GC gc1;
		GC gc2 = new GC();
		GC gc3 = new GC();
		GC gc4 = gc3;
		gc1 = doStuff();
		
		//copyGC = null;	// out of scope
		//newGC = gc3;	// out of scope
		//newGC = null;	// out of scope
		
		gc2 = null;	//yes		
		gc1 = null;	//yes		
		gc4 = null;	//yes
		gc3 = null;	//yes
		
		gc3 = gc2;	
		gc1 = gc4;
		
	}
	
	public static void doStuff2(GC copyGC) {
		GC localGC = copyGC;
	}
}  
