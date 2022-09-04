package JavaPrograms;

public class NumberOfOccuranceOfCharacter {
	
	
	public static void main(String[] args) {
		int count = 0;
		
		String s = "SUHAS";
		char[] sarray = s.toCharArray();
		System.out.println(sarray.length);
//		char cha = sarray[0];
		char CharacterToSearch = 'S';
//		System.out.println(cha);
		System.out.println(sarray);
		
//		System.out.println(characterToSearch);
		for(int i=0;i<sarray.length;i++) {
			char cha = sarray[i];
			if(cha==CharacterToSearch) {
				count++;
			}
			}
		if(count==0) {
			System.out.println("NO CHARACTER PRESENT");
		}else {
			System.out.println(count+" TIMES THE GIVEN CHARACTER IS REPEATED");
		}
		

}
}
