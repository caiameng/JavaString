
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello");
		Mystring();
	}

	/**
	 * 
	 */
	private static void Mystring() {
		
		String str = "abc";
		String s = "abc";
		String str1 = new String("abc");
		System.out.println(str==str1);//ctrl+alt+方向键下：向下复制
		System.out.println(str==s);//
		System.out.println(str.equals(str1));//str.equals():比较字符串内容
		System.out.println(str==str1);//ctrl+alt+方向键下：向下复制
		System.out.println(str==s);//
		System.out.println(str.equals(str1));//str.equals():比较字符串内容
	}

}
