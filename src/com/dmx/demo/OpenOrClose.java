/**Copyright 2015 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date Jan 8, 2015,10:59:02 PM
 */
package com.dmx.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * @author lyz
 * @date Jan 8, 2015,10:59:02 PM
 * @version 1.0.0
 * @Description: TODO
 */
public class OpenOrClose {

	/**
	 * @Description: TODO
	 *
	 * @date Jan 8, 2015,10:59:02 PM
	 * @author lyz
	 * @version 1.0.0
	 *
	 * @param args
	 * @throws ParseException 
	 */
	public static void main( String [] args ) throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int day = cin.nextInt();
			String[] result = new String[day];
			for ( int i = 0; i < day; i++ ) {
				String re = "";
				int row = cin.nextInt();
				String max = "";
				String min = "";
				long start = Long.MAX_VALUE ; 
				long end = Long.MIN_VALUE ; 
				cin.nextLine();
				for ( int j = 0; j < row; j++ ) {
					String str = cin.nextLine();
					String[] data = str.split( " " );
					long tmps = formatter.parse( data[1] ).getTime();
					long tmpe = formatter.parse( data[2] ).getTime();
					if(tmps<start){
						min = data[0];
						start = tmps ;
					}
					if(tmpe>end){
						max = data[0];
						end = tmpe; 
					}
					re = min +" "+max;
				}
				result[i] = re; 
			}
			for ( int i = 0; i < result.length; i++ ) {
				System.out.println(result[i]);
			}
		}
	}

}
