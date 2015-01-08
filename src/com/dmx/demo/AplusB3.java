/**Copyright 2015 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date Jan 7, 2015,9:37:08 PM
 */
package com.dmx.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * @author lyz
 * @date Jan 7, 2015,9:37:08 PM
 * @version 1.0.0
 * @Description: TODO
 */
public class AplusB3 {

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
		Map<String, Integer> map = new HashMap<String , Integer>();
		map.put( "one", 1 );
		map.put( "two", 2 );
		map.put( "three", 3 );
		map.put( "four", 4 );
		map.put( "five", 5 );
		map.put( "six", 6 );
		map.put( "seven", 7 );
		map.put( "eight", 8 );
		map.put( "nine", 9 );
		map.put( "zero", 0 );
		
		
		Scanner cin = new Scanner(System.in);
		String a =""; 
		String result =""; 
		 while(cin.hasNext()){
			 String str = cin.next();
			 if(str.equals( "+" )){
				 result = a ;
				 a ="";
			 }else if(str.equals( "=" )){
				 int ai = Integer.parseInt( result );
				 int bi = Integer.parseInt( a );
				 if(result.equals( "0" )&&a.equals( "0" )){
					 break;
				 }
				 System.out.println(ai+bi);
				 a = "";
				 result="";
			 }else{
				 a=a+map.get( str );
			 }
		 }

	}

}
