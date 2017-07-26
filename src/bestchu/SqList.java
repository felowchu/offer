package bestchu;

interface IList{
	
	public void clear();         //��ղ���
	
	public boolean isEmpty();    //�жϲ���
	
	public int length();         //��ȡ��
	
	public Object get(int i) throws Exception;               //ȡ��Ԫ��
	
	public int Indexof(Object x); //��ȡԪ��λ��
	
	public void insert(int i, Object x) throws Exception;    //����Ԫ��
	
	public void remove(int i) throws Exception;    //ɾ��Ԫ��
	
	public void display();        //��ʾ��
}

public class SqList implements IList {
	
	public Object[] listElem;             //���Դ洢�ռ�
	private int curlen;                   //���Ա�ǰ����
	
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
		//�ж�i�Ƿ�Ϸ�
		if(i<0||i>curlen-1){
			throw new Exception("��"+i+"��Ԫ�ز�����");
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
			throw new Exception("˳���������");
		if(i<0||i>curlen){
			throw new Exception("����λ�ò��ͷ�");
		}
		//��β����ʼ����
		for(int j=curlen;j>i;j--){
			curlen++;
			listElem[curlen] = listElem[j];
			listElem[j] = listElem[j-1];
			listElem[i] = x;
		}
	}

	public void remove(int i) throws Exception {
		if(i < 0 || i > curlen-1){
			throw new Exception("ɾ��λ�ò��Ϸ�");
		}
		for(int j = i; j < curlen-1; j++){
			listElem[j] = listElem[j++];
		}
		curlen--;
	}

	public void display() {
		//����˳���б�
		for(int i = 0; i < curlen; i++){
			System.out.println(listElem[i]);
		}
	}
}
