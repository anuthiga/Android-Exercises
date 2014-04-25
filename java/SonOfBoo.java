class SonOfBoo extends Boo {
	
	// will compile
	public SonOfBoo() { 
		super("boo");
	}
	
	// will compile
	public SonOfBoo(int i){
		super("Fred");
	}
	
	// will compile
	public SonOfBoo(String s) { 
		super(42);
	}
	
	/*
	3rd error
	public SonOfBoo(int i, String s) { 
	}
	
	1st error
	public SonOfBoo(String a, String b, String c) { 
		super(a,b);
	}
	*/
	
	// will compile
	public SonOfBoo(int i, int j) {
		super("man", j);
	}
	
	/*
	2nd error
	public SonOfBoo(int i, int x, int y) {
		super(i, "star");
	}
	*/
}

