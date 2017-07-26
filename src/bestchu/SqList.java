package bestchu;

interface IList{
	
	public void clear();         //清空操作
	
	public boolean isEmpty();    //判断操作
	
	public int length();         //获取表长
	
	public Object get(int i) throws Exception;               //取表元素
	
	public int Indexof(Object x); //获取元素位置
	
	public void insert(int i, Object x) throws Exception;    //插入元素
	
	public void remove(int i) throws Exception;    //删除元素
	
	public void display();        //显示表
}

public class SqList implements IList {
	
	public Object[] listElem;             //线性存储空间
	private int curlen;                   //线性表当前长度
	
	public SqList(int maxSize){
		curlen = 0;
		listElem = new Object[maxSize];
	}
	
	public static void main(String[] args) throws Exception{
		SqList mlist = new SqList(10);
		mlist.insert(0, "a");
	}

	public void clear() {
		curlen = 0;
	}

	public boolean isEmpty() {
		return curlen==0;
	}

	public int length() {
		return curlen;
	}

	public Object get(int i) throws Exception {
		//判断i是否合法
		if(i<0||i>curlen-1){
			throw new Exception("第"+i+"个元素不存在");
		}
		return listElem[i];
	}

	public int Indexof(Object x) {
		int j = 0;
		while(j < curlen && !listElem[j].equals(x)){
			j++;
		}
		return j;
	}

	public void insert(int i, Object x) throws Exception {
		if(curlen == listElem.length)
			throw new Exception("顺序表以填满");
		if(i<0||i>curlen){
			throw new Exception("插入位置不和法");
		}
		//从尾部开始遍历
		for(int j=curlen;j>i;j--){
			curlen++;
			listElem[curlen] = listElem[j];
			listElem[j] = listElem[j-1];
			listElem[i] = x;
		}
	}

	public void remove(int i) throws Exception {
		if(i < 0 || i > curlen-1){
			throw new Exception("删除位置不合法");
		}
		for(int j = i; j < curlen-1; j++){
			listElem[j] = listElem[j++];
		}
		curlen--;
	}

	public void display() {
		//遍历顺序列表
		for(int i = 0; i < curlen; i++){
			System.out.println(listElem[i]);
		}
	}
}
