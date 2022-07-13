package trainingday9ARRAYwithFORLOOP;

public class Str17splitFH {
	public static void main(String[] args) {
		String a = "viji,Surya,Suji,Visu";
		String[] b=a.split(",");
		for(int i=0;i<b.length/2;i++) {
			System.out.println(b[i].toUpperCase());
		}
	}

}



