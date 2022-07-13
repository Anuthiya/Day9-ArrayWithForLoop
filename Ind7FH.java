package trainingday9ARRAYwithFORLOOP;

public class Ind7FH {
	public static void main(String[] args) {
		String[] a = new String[3];
		a[0]="abcd";
		a[1]="efgh";
		a[2]="ijkl";
		//for(int i=0;i<a.length;i++) {
		for(int i=0;i<a.length/2;i++) {
			System.out.println(a[i].toUpperCase());
		}
		
		
	}

}
