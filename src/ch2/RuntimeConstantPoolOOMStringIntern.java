package ch2;
/**
 * �����嵥2-7 String.intern()�������õĲ���
* VM Args��-XX:PermSize=10M -XX:MaxPermSize=10M
 * @author Administrator
 *
 */
public class RuntimeConstantPoolOOMStringIntern {
	public static void main(String[] args) {
		String str1 = new StringBuilder("�����").append("���").toString();
		System.out.println(str1.intern() == str1);
		
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);		
	}
}
