package huaweisoftmatch;

import java.util.ArrayList;
import java.util.List;

public class Deploy {
	
	private static Graph graph;
	
	public static int[] findPosition(Graph g ,int a){                    //推测服务器位置，通过参数a调节
		
		int[] flow = g.flow();
		int sumflow = 0;
		int len = g.nol();
		int[] bandw = new int[len];
		int[] flag = new int[len];
		int[] index = new int[len];
		int sumflow1 = 0;
		
		for(int k = 0; k < g.noc(); k++){
			sumflow += flow[k];
		}
		
		for(int m =0; m < g.nol(); m++){
			for(Edge e : g.adj(m)){
				bandw[m] += e.bw();
			}
			for(int n=0; n < g.con().length; n++){
				if(m == g.con()[n]){
					bandw[m] += flow[n];
				}
			}
		}
		
		for(int m = 0; m < len; m++){
			index[m] = m;
			flag[m] = 0;
		}
		sort(bandw, index, 0, bandw.length-1);
		
		for(int m = 0; m < bandw.length; m++){
			sumflow1 += bandw[m];
			flag[index[m]] = 1;
			if(sumflow1 > a*sumflow){
				break;
			}
		}
		
		return flag;
		
	}
	
	public static void findPath(Graph g, int[] site){                     //寻找到指定服务器的最优路径
		
	}
	
	public static void singlePathCost(String[] path){                     //计算单条路径费用
		
	}
	
	public static void sumCost(){                                         //计算总的花费
		
	}
	
	public static void sort(int[] a, int[] index, int low, int high){
		if(low < high){
			int i = low;
			int key1 = a[low];
			int key2 = index[low];
			int j;
			for(j=low+1; j<=high; j++){
				if(a[j] > key1){
					int temp1 = a[j];
					a[j] = a[i+1];
					a[i+1] = temp1;
					int temp2 = index[j];
					index[j] = index[i+1];
					index[i+1] = temp2;
					
					i++;	
				}
			}
			a[low] = a[i];
			a[i] = key1;
			index[low] = index[i];
			index[i] = key2;
			sort(a, index, low, i-1);
			sort(a, index, i+1, high);
		}
	}
	
	public static String[] deployServer(String[] graphContent){
	
		String[] content = new String[graphContent.length];
		List<String> list = new ArrayList<String>();
		
		graph = new Graph(list);
		
		content[0] = String.valueOf(list.size());
    	content[1] = "";
    	
    	for (int i = 0; i < list.size(); i++)
    	{
			content[i + 2] = list.get(i);
    	}
    	
        return content;
	}
	
}
