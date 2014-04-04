class DogObjectTestDrive {
	public static void main (String[] args) { 
		DogObject one = new DogObject();
		one.size = 70;
		DogObject two = new DogObject();
		two.size = 8;
		DogObject three = new DogObject(); 
		three.size = 35;
		one.bark(); 		
		two.bark(); 
		three.bark();
	} 
}
