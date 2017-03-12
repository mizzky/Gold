package other;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrency {
	public static void main(String[] args) {
		//listTest();
		concurrencyTest();
	}

	static void listTest() {
		// ArrayListのイテレート中にリスト要素に対して操作をするとConcurrentModificationExceptionがスローされる
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);

		for (int list : intList) {
			System.out.println(list);
			intList.remove(list);
		}
	}

	static void concurrencyTest(){
		//CopyonwriteArrayList<E>がスレッドセーフであることの確認
		CopyOnWriteArrayList<Integer> concList = new CopyOnWriteArrayList<>();
		concList.add(1);
		concList.add(2);
		concList.add(3);
		concList.add(4);

		for(int list : concList){
			System.out.println(list);
			concList.remove(list);
		}

	}
}
