package trainingday9ARRAYwithFORLOOP;

public class Exer1lencharAt {
	public static void main(String[] args) {
		String a = "Hai Hello Good";
		String[] b = a.split(" ");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i].charAt(b[i].length()-1));
			
		}
	}

}
