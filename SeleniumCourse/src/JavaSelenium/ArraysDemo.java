package JavaSelenium;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] myIntArray1;
		myIntArray1 = new int[10];
		
		myIntArray1[0] = 100;
		myIntArray1[1] = 90;
		
		//Arrays con enteros (Int)
		System.out.println("0 index: " + myIntArray1[0]);
		System.out.println("1st index: " + myIntArray1[1]);
		System.out.println("2nd index: "+ myIntArray1[2]);
		
		//Arrays con texto (String)
		String[] myStringArray1 = {"bmw", "audi", "honda"};
		System.out.println("0 index: " + myStringArray1[0]);
		System.out.println("1st index: " + myStringArray1[1]);
		System.out.println("2nd index: "+ myStringArray1[2]);
		
	}

}
