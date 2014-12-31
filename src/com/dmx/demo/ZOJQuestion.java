/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年12月31日,下午4:31:25
 */
package com.dmx.demo;

import java.util.Scanner;

/**
 * @author lyz
 * @date 2014年12月31日,下午4:31:25
 * @version 1.0.0
 * @Description: TODO
 */
public class ZOJQuestion {

	public static void main( String [] args ) {
		Scanner cin = new Scanner( System.in );
		while ( cin.hasNext() ) {
			String str = cin.next();
			int zindex = str.indexOf( 'z' );
			int a = zindex ;
			int jindex = str.indexOf( 'j' );
			int b = jindex-a-1;
			int length = str.length() ; 
			int c = length-jindex-1;
			System.out.println(a +" "+ b +" " +c);
			if(check(a,b,c)){
				System.out.println("Accepted");
			}else{
				System.out.println("Wrong Answer");
			}
		}

	}

	/**
	 * @Description: TODO
	 *
	 * @date 2014年12月31日,下午4:44:41
	 * @author lyz
	 * @version 1.0.0
	 *
	 * @param a
	 * @param b
	 * @param c
	 */
	private static boolean check( int a, int b, int c ) {
		boolean flag =false; 
		
		if(b==1&&a==c){
			flag = true;
		}else{
			b=b-1;
			c=c-a;
			if(b==1&&(c==a||c==0)){
				flag = true ;
			}else{
				flag = false ;
			}
		}
		return flag ; 
	}

}
