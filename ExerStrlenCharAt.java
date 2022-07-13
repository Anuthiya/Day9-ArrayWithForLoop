package trainingday9ARRAYwithFORLOOP;

public class ExerStrlenCharAt {
	public static void main(String[] args) {
		String a="Meena Mary Maize";
		String c = "Vinu, Vibu,Vicky";
		
		String[] b=a.split(" ");
		String[] d = c.split(",");
		for(int i=0;i<b.length;i++) {
			//System.out.println(b[i].charAt(b[i].length()-1));
			System.out.println(d[i].charAt(d[i].length()-1));
		}
	}

}
