package com.jianye.algorithm.stack;

public class StackTest {

	int[] data;
	int maxSize;
	int top;
	
	public StackTest(int maxSize){
		this.maxSize = maxSize;
		data = new int[maxSize];
		top = -1;
	}
	
	/**
	 * 添加数据
	 * @param data 数据
	 * @return true 添加数据成功 false 添加数据失败
	 */
	public boolean push(int data){
		if(top + 1 == maxSize){
			System.err.println("栈已满");
			return false;
		}
		this.data[++top] = data;
		return true;
	}
	
	/**
	 * 从栈中取出数据
	 * @return 栈中取出的数据
	 * @throws Exception 
	 */
	public int pop() throws Exception{
		if(top == -1) {
			throw new Exception("栈已空");
		}
		return data[top--];
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		StackTest stack = new StackTest(1000);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		while (stack.top >= 0) {
			System.out.println(stack.pop());
		}
	}

}
