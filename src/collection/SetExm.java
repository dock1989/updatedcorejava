package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExm {
public static void main(String[] args) {
	Set<Integer> set = new HashSet<>();
	set.add(7);
	set.add(6);
	set.add(4);
	set.add(4);
	set.add(5);
	System.out.println(set);
	int c=0;
	
	for(int i:set) {
		c+=i;
	}
	System.out.println(c);
}
}
