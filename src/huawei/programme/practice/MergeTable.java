package huawei.programme.practice;

import java.util.Scanner;
import java.util.TreeMap;

public class MergeTable {
	public static void main(String[] args){
		Scanner  sc = new Scanner(System.in);
		int count = sc.nextInt();
		TreeMap<Integer, Integer> tree = new TreeMap<Integer, Integer>();
		for(int i = 0; i < count; i++){
			int key = sc.nextInt();
			int value = sc.nextInt();
			if(tree.containsKey(key))
				value += tree.get(key);
			tree.put(key, value);
		}
		for(int i : tree.keySet()){
			System.out.println(i+" "+tree.get(i));
		}
		sc.close();
	}
}
