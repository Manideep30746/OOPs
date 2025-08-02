package skill_lab;

public class StringJoinExample {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		System.out.println(a.concat(" ").concat(b));
		String joined = String.join("-", "A","B","C");
		System.out.println(joined);
		
	}

}
