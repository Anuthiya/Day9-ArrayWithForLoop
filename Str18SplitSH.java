package trainingday9ARRAYwithFORLOOP;

public class Str18SplitSH {
	public static void main(String[] args) {
		String a = "viji,Surya,Suji,Visu";
		String[] b=a.split(",");
		for(int i=b.length/2;i<b.length;i++) {
			System.out.println(b[i].toLowerCase());
			//System.out.println(b[i].length());
			System.out.println("Viji is UpperCase="+b[i].toUpperCase());
			//System.out.println(b[i].charAt(b[i].length()-1));
		}
	}

}


