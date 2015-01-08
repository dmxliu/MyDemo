/**Copyright 2015 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date Jan 7, 2015,9:37:08 PM
 */
package com.dmx.demo;

import java.util.Scanner;


/**
 * @author lyz
 * @date Jan 7, 2015,9:37:08 PM
 * @version 1.0.0
 * @Description: TODO
 */
public class AplusB2 {

	/**
	 * @Description: TODO
	 *
	 * @date Jan 7, 2015,9:37:08 PM
	 * @author lyz
	 * @version 1.0.0
	 *
	 * @param args
	 */
	public static void main( String [] args ) {
		Scanner cin = new Scanner(System.in);
		 while(cin.hasNext()){
			 
			 String a = cin.next();
			 long ai = Long.parseLong( a.replaceAll( ",", "") );
			 String b = cin.next();
			 long bi = Long.parseLong( b.replaceAll( ",", "") );
			 System.out.println(ai+bi);
		 }

	}

}
