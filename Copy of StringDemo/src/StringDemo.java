
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
		System.out.println(str==str1);//ctrl+alt+������£����¸���
		System.out.println(str==s);//
		System.out.println(str.equals(str1));//str.equals():�Ƚ��ַ�������
		System.out.println(str==str1);//ctrl+alt+������£����¸���
		System.out.println(str==s);//
		System.out.println(str.equals(str1));//str.equals():�Ƚ��ַ�������
	}

}
