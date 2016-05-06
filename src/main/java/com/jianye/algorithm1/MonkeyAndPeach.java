package com.jianye.algorithm1;

/**
 * 猴子吃桃问题
 * @author jianye
 *
 */
public class MonkeyAndPeach {

	/**
	 * 	题目：<br>
	 * 	猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 <br>
	 *  第二天早上又将剩下的桃子吃掉一半，又多吃了一个。<br>
	 *  以后每天早上都吃了前一天剩下   的一半零一个。<br/>
	 *  到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。<br/>   
	 *	1.程序分析：采取逆向思维的方法，从后往前推断。   <br/>
	 */ 
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int day = 10;
		System.out.println("猴子在第"+day+"天吃的桃");
		System.out.println("总共吃桃："+getTotalPeachNum(day)+"个");
	}
	
	/**
	 * 获取实际的值
	 * @param day
	 * 		吃桃的天数
	 * @return
	 * 		总共桃子的数量
	 */
	public final static int getTotalPeachNum(int day){
		if(day == 1){
			return 1;
		}
		return (getTotalPeachNum(day-1)+1) * 2;
	}
	
	

}
