package com.jianye.algorithm.maopao;

/**
 * 冒泡算法
 * @author jianye
 *
 */
public class MaoPaoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaoPaoTest mp = new MaoPaoTest();
		System.out.println("排序前：");
		display(al);
		for (int i = 0; i < al.length; i++) {
			for (int j = 0; j < al.length - 1 - i; j++){
				if(al[j] > al[j + 1]){
					swap(j, j + 1);
				}
			}
		}
		System.out.println();
		System.out.println("排序后：");
		display(al);
	}

	/**
	 * 大小为10数组
	 */
	private static int al[] = new int[10];
	
	public MaoPaoTest() {
		al[0] = 12;
		al[1] = 23;
		al[2] = 21;
		al[3] = 22;
		al[4] = 1;
		al[5] = 14;
		al[6] = 7;
		al[7] = 45;
		al[8] = 18;
		al[9] = 29;
	}
	
	/**
	 * 显示数组元素
	 * @param al2
	 */
	public static void display(int al2[]){
		for (int i = 0; i < al2.length; i++) {
			System.out.print(al2[i] +" ");
		}
	}
	
	/**
	 * 交换数组元素位置
	 * @param i
	 * @param j
	 */
	public static void swap(int i, int j){
		int temp = al[i];
		al[i] = al[j];
		al[j] = temp;
	}
}
