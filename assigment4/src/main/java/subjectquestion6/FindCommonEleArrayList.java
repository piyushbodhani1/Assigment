package subjectquestion6;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FindCommonEleArrayList {
	
	public int ans() {
		ArrayList<String> name1 = new ArrayList<>();

		name1.add("Shivam");
		name1.add("Mathur");
		name1.add("Sita");
		name1.add("Monty");
		name1.add("Harshad");

		ArrayList<String> name2 = new ArrayList<>();
		name2.add("Monty");

		ArrayList<String> name3 = new ArrayList<>();

		name3.add("Shivam");
		name3.add("Monty");

		ArrayList<String> name4 = new ArrayList<>();

		name4.add("Abhinav");
		name4.add("Sitaram");
		name4.add("Monty");

		ArrayList<String> name5 = new ArrayList<>();

		name5.add("Mitansh");

		name5.add("Kanha");
		name5.add("Prince");
		name5.add("Monty");

		ArrayList<String> result1 = new ArrayList<>();

		ArrayList<String> result2 = new ArrayList<>();

		ArrayList<String> result3 = new ArrayList<>();
		ArrayList<String> result4 = new ArrayList<>();
		ArrayList<String> result5 = new ArrayList<>();

		result1 = (ArrayList<String>) name1.stream().filter(name5::contains).collect(Collectors.toList());

		result2 = (ArrayList<String>) name2.stream().filter(result1::contains).collect(Collectors.toList());

		result3 = (ArrayList<String>) name3.stream().filter(result2::contains).collect(Collectors.toList());

		result4 = (ArrayList<String>) name4.stream().filter(result3::contains).collect(Collectors.toList());

		result5 = (ArrayList<String>) name5.stream().filter(result4::contains).collect(Collectors.toList());

		String ele = result5.get(0);

		int i1 = name1.contains(ele) ? name1.indexOf(ele) : -1;
		System.out.println("index of common element in list1:-" + i1);
		int i2 = name2.contains(ele) ? name2.indexOf(ele) : -1;
		System.out.println("index of common element in list2:-" + i2);
		int i3 = name3.contains(ele) ? name3.indexOf(ele) : -1;
		System.out.println("index of common element in list3:-" + i3);
		int i4 = name4.contains(ele) ? name4.indexOf(ele) : -1;
		System.out.println("index of common element in list4:-" + i4);
		int i5 = name5.contains(ele) ? name5.indexOf(ele) : -1;
		System.out.println("index of common element in list5:-" + i5);

		return i1;
	}


}
