package ch2;
import java.util.ArrayList;
import java.util.List;

/**
 * 代码清单2-6 运行时常量池导致的内存溢出异常
 * VM Args：-XX:PermSize=10M -XX:MaxPermSize=10M
 * Java HotSpot(TM) 64-Bit Server VM warning: ignoring option PermSize=10M; support was removed in 8.0
 * Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=10M; support was removed in 8.0
 * 这里要使用jdk1.7去测试，jdk8已经不支持这个参数
 * 测试时发现自己电脑配置太高，设置成3M才很快就有异常
 * @author Administrator
 *
 */
public class RuntimeConstantPoolOOM {
	public static void main(String[] args) {
		// 使用List保持常量池引用，避免Full GC回收常量池行为
		List<String> list = new ArrayList<String>();
		// 10M的PermSize在integer范围内足够产生OOM了
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}
	}
}
