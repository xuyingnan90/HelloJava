package com.varnb;


import java.util.Scanner;
import java.util.Arrays;

public class varnb {
	// main函数为程序的入口，相当于你回家时的大门
	  public static void main(String[] args) {
	        
		// 定义两行三列的二维数组并赋值
		
		  String[][] names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
		                 
				// 通过二重循环输出二维数组中元素的值
				for (int i = 0; i <names.length ; i++) {
		            
					for (int j = 0; j < names[i].length; j++) {
		                
						System.out.print( names[i][j]+" ");
					}
		            
					System.out.println();
				}
		}
}
