package skill_lab;

public class ConversionExample {

	public static void main(String[] args) {
		String s = "Java";
		char[] chars = s.toCharArray();
		for (char c : chars) System.out.println(c+" ");
		System.out.println();
		byte[] bytes = s.getBytes();
		for(byte b : bytes) System.out.println(b+" ");
		
	}

}
