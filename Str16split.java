package trainingday9ARRAYwithFORLOOP;

public class Str16split {
	public static void main(String[] args) {
		String a = "viji,Surya,Suji,Visu";
		String[] b=a.split(",");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
