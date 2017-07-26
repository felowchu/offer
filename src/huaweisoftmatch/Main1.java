package huaweisoftmatch;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main1{


/*请完成下面这个函数，实现题目要求的功能*/
/*当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ */
/******************************开始写代码******************************/
    static int maxProfit(int[] stockPrices, int k) {
    	
    	int len = stockPrices.length/(2*k);
    	
    	//每隔k天交易的收益
    	int[] sell = new int[len];
    	for(int i = 0 ; i < len; i++){
    		sell[i] = 0;
    	}
    	//每隔k天交易的支出
    	int[] buy = new int[len];
    	for(int i = 0; i < len; i++){
    		buy[i] = Integer.MIN_VALUE;
    	}
    	
    	for(int prices : stockPrices){
    		
    		buy[0] = Math.min(buy[0],-prices);
			sell[0] = Math.max(sell[0],buy[0] + prices);
    		
    		for(int i = 1; i < len; i++){
    			buy[i] = Math.min(buy[i],sell[i-1]-prices);
    			sell[i] = Math.max(sell[i],buy[i] + prices);
    		}
    	}
    	
    	return sell[len-1];
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
            
        int _stockPrices_size = 0;
        _stockPrices_size = Integer.parseInt(in.nextLine().trim());
        int[] _stockPrices = new int[_stockPrices_size];
        int _stockPrices_item;
        for(int _stockPrices_i = 0; _stockPrices_i < _stockPrices_size; _stockPrices_i++) {
            _stockPrices_item = Integer.parseInt(in.nextLine().trim());
            _stockPrices[_stockPrices_i] = _stockPrices_item;
        }
        
        int _k;
        _k = Integer.parseInt(in.nextLine().trim());
  
        res = maxProfit(_stockPrices, _k);
        System.out.println(String.valueOf(res));    

    }
}
