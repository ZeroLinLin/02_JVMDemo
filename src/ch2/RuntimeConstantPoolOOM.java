package ch2;
import java.util.ArrayList;
import java.util.List;

/**
 * �����嵥2-6 ����ʱ�����ص��µ��ڴ�����쳣
 * VM Args��-XX:PermSize=10M -XX:MaxPermSize=10M
 * Java HotSpot(TM) 64-Bit Server VM warning: ignoring option PermSize=10M; support was removed in 8.0
 * Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=10M; support was removed in 8.0
 * ����Ҫʹ��jdk1.7ȥ���ԣ�jdk8�Ѿ���֧���������
 * ����ʱ�����Լ���������̫�ߣ����ó�3M�źܿ�����쳣
 * @author Administrator
 *
 */
public class RuntimeConstantPoolOOM {
	public static void main(String[] args) {
		// ʹ��List���ֳ��������ã�����Full GC���ճ�������Ϊ
		List<String> list = new ArrayList<String>();
		// 10M��PermSize��integer��Χ���㹻����OOM��
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}
	}
}
