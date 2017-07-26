package huaweisoftmatch;

import java.util.List;

public class Graph {
	
	private int nol;                          //����ڵ������
	private int noc;                          //���ѽڵ�����
	private int E;                            //�ߵ�����
	private Bag<Edge>[] adj;                  //�ڽӱ�
	private int[] con;                        //���ѽڵ��¼
	private int[] flow;	                      //��������
	
	public Graph(List<String> list){
		
		String line1 = list.get(0);
		String[] head = line1.split(" ");
		
		this.nol = Integer.parseInt(head[0]);
		this.E   = Integer.parseInt(head[1]);
		this.noc = Integer.parseInt(head[2]);
		
		con = new int[noc];
		
		adj = (Bag<Edge>[])new Bag[nol];
		for(int i = 0; i < nol; i++){
			adj[i] = new Bag<>();
		}
		
		for (int k = 4; k < E+4; k++) {                       //��ʼ��������·
			
			String line2 = list.get(k);
			String[] body = line2.split(" ");
			
			int i    = Integer.parseInt(body[0]);
			int j    = Integer.parseInt(body[1]);
			int bw   = Integer.parseInt(body[2]);
			int cost = Integer.parseInt(body[3]);
			
			Edge e = new Edge(i, j, bw, cost);
			addEdge(e);
		}
		
		for(int m = E+5; m < E+5+noc; m++){                   //��ʼ�����ѽڵ�
			
			String line3 = list.get(m);
			String[] trail = line3.split(" ");
			int i = m-E-5;
			con[i] = Integer.parseInt(trail[1]); 
			flow[i] =Integer.parseInt(trail[2]); 
		}
	}
	
	public int nol(){                                          //��������ڵ���
		return nol;
	}
	
	public int E(){                                            //������·��
		return E;
	}
	
	public int noc(){                                          //�������ѽڵ���
		return noc;
	}
	
	private void addEdge(Edge e){
		int i = e.from();
		int j = e.to();
		adj[i].add(e);
		e = this.reverse(e);
		adj[j].add(e);
	}
	
	private Edge reverse(Edge e){
		Edge e1 = new Edge(e.to(),e.from(),e.bw(),e.cost());
		return e1;
	}
	
	public Iterable<Edge> adj(int v){
		return adj[v];
	}
	
	public Iterable<Edge> edges(){                              //��ȡ������·
		Bag<Edge> list = new Bag<Edge>();
		for(int i = 0; i < nol; i++){
			for(Edge e : adj(i)){
				list.add(e);
			}
		}
		return list;
	}
	
	public int[] con(){                                         //��ȡ���ѽڵ�
		return con;
	}
	
	public int[] flow(){
		return flow;                                          //��ȡ����
	}
}
