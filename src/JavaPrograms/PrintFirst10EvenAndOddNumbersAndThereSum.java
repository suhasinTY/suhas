package JavaPrograms;

public class PrintFirst10EvenAndOddNumbersAndThereSum {

	public static void main(String[] args) {
		int sum=0;
		int diff=0;
		for(int a=0;a<=10;a++) {
			if(a%2==0) {
				System.out.println(a);
				sum=sum+a;
			}
		}
		System.out.println(sum);

		for(int a=0;a<=10;a++) {
			if(a%2==1) {
				System.out.println(a);
				diff=diff+a;
			}
		}
		System.out.println(diff);


	}

}
