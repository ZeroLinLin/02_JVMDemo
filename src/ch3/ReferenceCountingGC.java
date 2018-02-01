package ch3;
/**
 * �����嵥3-1 ���ü����㷨��ȱ��
 * 
 * testGC()����ִ�к�objA��objB�᲻�ᱻGC�أ�
 * @author Administrator
 *
 */
public class ReferenceCountingGC {
	public Object instance = null;
	private static final int _1M = 1024*1024;
	/**
	 * �����Ա���Ե�Ψһ�������ռ���ڴ棬�Ա�����GC��־�п�����Ƿ񱻻��չ�
	 */
	private byte[] bigSize = new byte[2*_1M];
	
	public static void testGC() {
		ReferenceCountingGC objA = new ReferenceCountingGC();
		ReferenceCountingGC objB = new ReferenceCountingGC();
		objA.instance = objB;
		objB.instance = objA;
		
		objA = null;
		objB = null;
		
		// ���������з���GC��objA��objB�Ƿ��ܱ����գ�
		System.gc();
	}
	
	public static void main(String[] args) {
		testGC();
	}
}
