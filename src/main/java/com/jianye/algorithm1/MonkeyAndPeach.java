package com.jianye.algorithm1;

/**
 * ���ӳ�������
 * @author jianye
 *
 */
public class MonkeyAndPeach {

	/**
	 * 	��Ŀ��<br>
	 * 	���ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ�� <br>
	 *  �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����<br>
	 *  �Ժ�ÿ�����϶�����ǰһ��ʣ��   ��һ����һ����<br/>
	 *  ����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�<br/>   
	 *	1.�����������ȡ����˼ά�ķ������Ӻ���ǰ�ƶϡ�   <br/>
	 */ 
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int day = 10;
		System.out.println("�����ڵ�"+day+"��Ե���");
		System.out.println("�ܹ����ң�"+getTotalPeachNum(day)+"��");
	}
	
	/**
	 * ��ȡʵ�ʵ�ֵ
	 * @param day
	 * 		���ҵ�����
	 * @return
	 * 		�ܹ����ӵ�����
	 */
	public final static int getTotalPeachNum(int day){
		if(day == 1){
			return 1;
		}
		return (getTotalPeachNum(day-1)+1) * 2;
	}
	
	

}
