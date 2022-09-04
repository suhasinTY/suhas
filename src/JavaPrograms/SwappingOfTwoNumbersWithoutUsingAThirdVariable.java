package JavaPrograms;

public class SwappingOfTwoNumbersWithoutUsingAThirdVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("a before swapping is "+a);
		System.out.println("b before swapping is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
//		b=b-a;
//		a=a+b;
		System.out.println("a after swapping is "+a);
		System.out.println("b after swapping is "+b);
		
		

	}

}
