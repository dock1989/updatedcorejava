package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExm {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(6);
		list.add(4);
		list.add(5);
		System.out.println(list);
		int c=0;
		
		for(int i:list) {
			c+=i;
		}
		System.out.println(c);
		
	}

}



