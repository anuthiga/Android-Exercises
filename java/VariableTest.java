class VariableTest{
	
	int calcArea(int height, int width) { 
		return height * width;
	}

	public static void main (String [] args){
		VariableTest vt = new VariableTest();
		
		int a = vt.calcArea(7, 12); 
		short c = 7; 
		vt.calcArea(c,15);
		//int d = vt.calcArea(57); 		//2 parameters required
		vt.calcArea(2,3);
		long t = 42;
		//int f = vt.calcArea(t,17); 		//1st para should be long
		//int g = vt.calcArea(); 		//2 parameters required
		//vt.calcArea();			//2 parameters required
		//byte h = vt.calcArea(4,20); 		//return type holder should be int or larger
		//int j = vt.calcArea(2,3,5);		//2 parameters required
	}
}
