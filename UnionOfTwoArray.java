package online.practise.programes;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		int b[]= {2,4,6,8,0};
	Set<Integer> ans= new HashSet<>();
		for(int i=0; i<a.length; i++)
			ans.add(a[i]);
		for (int j=0; j<b.length; j++)
			ans.add(b[j]);
		System.out.println(ans.size());

	}
}