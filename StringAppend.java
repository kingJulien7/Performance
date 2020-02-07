import java.util.ArrayList;
import java.util.List;

public class StringAppend {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		for(int i=0; i<100000000; i++) {
			list.add("Performance");
			System.out.println(i);
		}
		System.out.println("Done!");
	}
}
