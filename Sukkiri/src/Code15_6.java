import java.util.Arrays;

public class Code15_6 {

	public static void main(String[] args) {
		String name = "A1234567";
		if (isValidPlayerName(name)) {
			System.err.println("OK");
		} else {
			System.err.println("NG");
		}
		String s = "Javaj";
		if (s.matches("Java")) {
			System.err.println("OK");
		}
		if (s.matches("JavaJava")) {
			System.err.println("OK");
		}
		if (s.matches("java")) {
			System.err.println("OK");
		}
		if (s.matches("j.va")) {
			System.err.println("OK");
			s = "Jaaaava";
		}
		if (s.matches("ja*va")) {
			System.err.println("OK");
			s = "あいうxx019";
		}
		if (s.matches(".*")) {
			System.err.println("OK");
			s = "146-0092";
		}
		if (s.matches("[0-9]{3}-?[9]{4}")) {
			System.err.println("OK");
			s = "URI";
		}
		if (s.matches("UR[LIN]")) {
			System.err.println("OK");
		}
		if (s.matches("[A-Z]{3}")) {
			System.err.println("OK");
		}
		if (s.matches("[A-Za-z0-9]{3}")) {
			System.err.println("OK");
		}
		s = "abc,def:ghi";
		String[] words = s.split("[,;]");
		System.out.println(Arrays.toString(words));
		String w = s.replaceAll("[ben]","X");
		System.out.println(w);//aXc,dXf:gXi
	}

	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
