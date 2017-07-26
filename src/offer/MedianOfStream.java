package offer;

import java.util.NoSuchElementException;
import java.util.TreeSet;

public class MedianOfStream {
	
	public TreeSet<Integer> maxHeap = new TreeSet<Integer>();
	public TreeSet<Integer> minHeap = new TreeSet<Integer>();
	
	public void Insert(Integer num){
		if(((maxHeap.size() + minHeap.size()) & 1) == 0){
			if(maxHeap.size() > 0 && maxHeap.last() > num){
				maxHeap.add(num);
				num = maxHeap.pollLast();
			}
			minHeap.add(num);
		}else{
			if(minHeap.size() > 0 && num > minHeap.first()){
				minHeap.add(num);
				num = minHeap.pollFirst();
			}
			maxHeap.add(num);
		}
	}
	
	public Double getMedian(){
		double median = 0;
		if(minHeap.size() == 0)
			throw new NoSuchElementException();
		if(((minHeap.size()+maxHeap.size()) & 1) == 1)
			median = minHeap.first();
		else
			median = ((double)minHeap.first() + (double)maxHeap.last())/2;
		return median;
	}
}
