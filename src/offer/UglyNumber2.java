package offer;

public class UglyNumber2 {
	public static void main(String[] args){
		System.out.println(getUglyNumber(1400));
	}
	public static int getUglyNumber(int index){
		if(index <= 0)
			return 0;
		int[] uglyNumber = new int[index];
		uglyNumber[0] = 1;
		int mutiplay2 = 0;
		int mutiplay3 = 0;
		int mutiplay5 = 0;
		int current = 1;
		while(current < index){
			int min = uglyNumber[mutiplay2]*2 < uglyNumber[mutiplay3]*3 ? uglyNumber[mutiplay2]*2 : uglyNumber[mutiplay3]*3;
			min = (min) < uglyNumber[mutiplay5]*5 ? min : uglyNumber[mutiplay5]*5;
			uglyNumber[current] = min;
			while(uglyNumber[mutiplay2]*2 <= uglyNumber[current])
				mutiplay2++;
			while(uglyNumber[mutiplay3]*3 <= uglyNumber[current])
				mutiplay3++;
			while(uglyNumber[mutiplay5]*5 <= uglyNumber[current])
				mutiplay5++;
			current++;
		}
		int ugly = uglyNumber[current-1];
		return ugly;
	}
}
