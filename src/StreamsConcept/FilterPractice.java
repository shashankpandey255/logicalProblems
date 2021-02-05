package StreamsConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FilterPractice {
	ArrayList<Integer> l = new ArrayList<>();
	List<Integer> l2;

	public void filterMethod() {

		l.add(100);
		l.add(10);
		l.add(25);
		l.add(27);
		l.add(30);
		l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
		// Count the even number
		long count = l.stream().filter(i -> i % 2 == 0).count();
		System.out.println(count);
	}

	public void MapMethod() {
		l2 = l.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(l2);

	}

	public void sortMethod() {
		l2 = l.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);

	}

	public void forEachPractice() {
		l.stream().forEach(System.out::println);
		Consumer<Integer> c=i->{
			System.out.println("The square of "+i+" is:"+(i*i));
			};
		l.stream().forEach(c);
	}
}
