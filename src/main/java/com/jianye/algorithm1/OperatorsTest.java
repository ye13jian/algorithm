package com.jianye.algorithm1;

/**
 * java���������
 * @author jianye
 *
 */
public class OperatorsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ^���������ͬΪ0���෴Ϊ1
		// 1 0000001,2 00000010
		System.out.println(1^2);
		
		// | ��1��Ϊ1
		System.out.println(1|2);
		
		// &���������0��Ϊ0
		System.out.println(1&2);
		
		// ~������������󷴣������Ǿ���ֵ�󷴼�1b
		// 5 00000101 11111010 +1 -> 11111011 ->1000100+1
		// -6 11111010
		//    00000101+1
		System.out.println(~5);
		System.out.println(~22);
		System.out.println(~(-6));
		System.out.println("λ�������------------");
		// >>n���������������nλ������������0��������1������x/(2^n) 
		// 15 00001111
		System.out.println(15>>2);
		// <<n���������������nλ������������0��������1������x*(2^n)
		// 15 00001111 -> 00111100
		System.out.println(15<<2);
		// >>>n�������������������������������nλ��32λϵͳ���㲹32��0,64λϵͳ���㲹64��0
		System.out.println(-5>>>2);
	}
}
