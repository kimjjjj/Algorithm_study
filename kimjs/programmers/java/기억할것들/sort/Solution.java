import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Program{
	public static void main(String[] args) {
    /********** list sort **********/
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(8);
		list1.add(3);
		list1.add(1);
		List<Integer> list2 = new ArrayList<>(list1);
		
		System.out.println("before list1 => " + list1);
		System.out.println("before list2 => " + list2);
		
		list1.sort(null);
		list2.sort(Collections.reverseOrder());
		
		System.out.println("after list1 => " + list1);
		System.out.println("after list2 => " + list2);
		
		System.out.println("");
    /******************************/

    
    /********** map sort **********/
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(5, "a");
		map1.put(8, "g");
		map1.put(3, "d");
		map1.put(1, "r");
		
		System.out.println("before map1 => " + map1);
		
		System.out.println("after map1 => " +
				Arrays.toString(map1.entrySet().stream()
						.sorted(Map.Entry.comparingByKey())
						.toArray()));
		
		List<Entry<Integer, String>> listEntry = 
				map1.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toList());
		
		System.out.println("after listEntry => " + listEntry);
    /******************************/
	}
}
/*
before list1 => [5, 8, 3, 1]
before list2 => [5, 8, 3, 1]
after list1 => [1, 3, 5, 8]
after list2 => [8, 5, 3, 1]

before map1 => {1=r, 3=d, 5=a, 8=g}
after map1 => [1=r, 3=d, 5=a, 8=g]
after listEntry => [1=r, 8=g, 3=d, 5=a]
*/
