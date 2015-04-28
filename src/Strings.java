
public class Strings {
	public static void main(String[] args) {
		String s = args[0];
			System.out.println("params: " +s);
		StringBuilder result = new StringBuilder[];
		
		char[] charArr= s.toCharArray();
		char[] charArr2 = {'T', 'i', 't', 'a', 'n', 'i', 'c'};
		
//		char[] charArr = s.toCharArray();
//		for (int i =s.length() -1; i<s.length();i++){
//			result.append(charArr[i]);
//		}
		
		for (char c: s.toCharArray()){
			result.insert(0, c);
		}
		
		System.out.println("result: " +result);
	}
}
