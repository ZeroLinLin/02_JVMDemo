package ch2;
/**
 * 代码清单2-7 String.intern()返回引用的测试
* VM Args：-XX:PermSize=10M -XX:MaxPermSize=10M
 * @author Administrator
 *
 */
public class RuntimeConstantPoolOOMStringIntern {
	public static void main(String[] args) {
		String str1 = new StringBuilder("计算机").append("软件").toString();
		System.out.println(str1.intern() == str1);
		
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);		
	}
}
