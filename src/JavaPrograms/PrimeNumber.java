package JavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int count=0, num=10;
		System.out.println("Start");
		for(int a=2;a<num;a++) {
			if(num%a==0) {
				count++;
				break;
			}
			if(count==0) {
				System.out.println(a);
			}
//			if(a/a==1&&a%2!=0&&a%3!=0)  {
//				System.out.println(a);
//				
//			}
		}

	}

}
