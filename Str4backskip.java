package trainingday9ARRAYwithFORLOOP;

public class Str4backskip {
	public static void main(String[] args) {
		String[] a= {"Murali" , "Anu" ,  "David" , "Gokul"};
		for(int i=a.length-1;i>=0;i=i-2) {
			System.out.println(a[i]);
		}
	}

}


