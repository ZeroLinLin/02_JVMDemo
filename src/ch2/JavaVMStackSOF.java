package ch2;
/**
 * �����嵥2-4 �����ջ�ͱ��ط���ջOOM���ԣ�����Ϊջ������Գ���
 * VM Args: -Xss128k
 * @author Administrator
 *
 */
public class JavaVMStackSOF {
	private int stackLength = 1;
	
	public void stackLeak() {
		stackLength++;
		stackLeak();
	}
	
	public static void main(String[] args) {
		JavaVMStackSOF sof = new JavaVMStackSOF();
		try {
			sof.stackLeak();
		} catch (Throwable e) {
			System.out.println("stack length:" + sof.stackLength);
			throw e;
		}
	}
}
