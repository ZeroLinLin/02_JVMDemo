package ch2;
/**
 * 代码清单2-4 虚拟机栈和本地方法栈OOM测试（仅作为栈溢出测试程序）
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
