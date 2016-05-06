package com.jianye.algorithm1;

/**
 * java运算符测试
 * @author jianye
 *
 */
public class OperatorsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ^运算符，相同为0，相反为1
		// 1 0000001,2 00000010
		System.out.println(1^2);
		
		// | 有1则为1
		System.out.println(1|2);
		
		// &运算符，有0则为0
		System.out.println(1&2);
		
		// ~运算符，正数求反，负数是绝对值求反加1b
		// 5 00000101 11111010 +1 -> 11111011 ->1000100+1
		// -6 11111010
		//    00000101+1
		System.out.println(~5);
		System.out.println(~22);
		System.out.println(~(-6));
		System.out.println("位移运算符------------");
		// >>n右移运算符，右移n位，不足正数补0，负数补1，正数x/(2^n) 
		// 15 00001111
		System.out.println(15>>2);
		// <<n左移运算符，左移n位，不足正数补0，负数补1，正数x*(2^n)
		// 15 00001111 -> 00111100
		System.out.println(15<<2);
		// >>>n不带符号右移运算符，不带符号右移n位，32位系统不足补32个0,64位系统不足补64个0
		System.out.println(-5>>>2);
	}
}
