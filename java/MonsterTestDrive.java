public class MonsterTestDrive {
	public static void main(String [] args) {
		Monster [] ma = new Monster[3];
		ma[0] = new Vampire();
		ma[1] = new Dragon();
		ma[2] = new Monster();
		for(int x = 0; x < 3; x++) {
			ma[x].frighten(x);
		}
	}
}

class Monster {
	/* 
	1 - Success
	boolean frighten(int d) {
		System.out.println("arrrgh");
		return true;
	}
	
	2 - Error
	boolean frighten(int x) {
		  System.out.println("arrrgh");
		  return true;
	}
	
	3 - different result
	boolean frighten(int x) {
		  System.out.println("arrrgh");
		  return false;
	}
	*/
	
	//3 - different result
	boolean frighten(int z) {
		  System.out.println("arrrgh");
		  return true;
	}
}

class Vampire extends Monster {
	/*
	1 - Success
	boolean frighten(int x) {
		System.out.println("a bite?");
		return false;
	}
	
	2 - Error
	int frighten(int f) {
		System.out.println("a bite?");
		return 1; 
	}
	
	3 - different result
	boolean scare(int x) {
		System.out.println("a bite?");
  		return true;
  	}
  	*/
  	
  	//3 - different result
  	boolean frighten(byte b) {
		  System.out.println("a bite?");
		  return true;
  	}
}

class Dragon extends Monster {
	boolean frighten(int degree) {
		System.out.println("breath fire");
		return true;
	}
}
