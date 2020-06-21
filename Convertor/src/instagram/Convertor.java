package instagram;

public class Convertor {

	public static void convert(String str) {
		char[] ch = str.toCharArray();
		
		for (int i=0;i<ch.length;i++) {
			char c = ch[i];
			int intval=(int)c;
		if (intval > 95) {
		int value = 122-(int)c;
		value+=97;
		System.out.print((char)value+" ");
		}else {
		int value = 90-intval;
		value+=65;
		System.out.print((char)value + " ");
		}
	}
		
	}
	public static void main(String[] args) {
		convert("abcdAB");
	}
}
