import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		HashSet<String> hash = new HashSet<String>();

		
		// добавление элементов
		hash.add("A");
		hash.add("B");
		hash.add("C");
		hash.add("D");
		hash.add("E");
		// этот элемент не отобразиться на выходе, т.к он дублируется
		hash.add("B");
		System.out.print(hash);

	}

}