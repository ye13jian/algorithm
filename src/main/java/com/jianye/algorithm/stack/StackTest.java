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
	 * �������
	 * @param data ����
	 * @return true ������ݳɹ� false �������ʧ��
	 */
	public boolean push(int data){
		if(top + 1 == maxSize){
			System.err.println("ջ����");
			return false;
		}
		this.data[++top] = data;
		return true;
	}
	
	/**
	 * ��ջ��ȡ������
	 * @return ջ��ȡ��������
	 * @throws Exception 
	 */
	public int pop() throws Exception{
		if(top == -1) {
			throw new Exception("ջ�ѿ�");
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
