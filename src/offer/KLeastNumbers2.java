package offer;
/*ʹ��TreeSet�洢��С��k��Ԫ�أ����øı�������Ԫ�ص�λ�ã�ʱ�临�Ӷ�ΪO(nlogk)*/
import java.util.ArrayList;
import java.util.TreeSet;

public class KLeastNumbers2 {
	public ArrayList<Integer> getLeastNumbers(int[] input, int k){
		ArrayList<Integer> output = new ArrayList<Integer>();
		if(input.length == 0 || k <= 0 || input.length < k)
			return output;
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i = 0; i < input.length; i++){
			if(ts.size() < k)
				ts.add(input[i]);
			else{
				if(input[i] < ts.last()){
					ts.pollLast();
					ts.add(input[i]);
				}
			}
		}
		while(ts.size()!=0){
			output.add(ts.pollLast());
		}
		return output;
	}
}
