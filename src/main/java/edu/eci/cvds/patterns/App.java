package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		//int l = args.length();
		String s =new String();
		for (int i =0; i<3 ;i++){
			s+=args[i] + " ";
		}
        System.out.println( "Hello "+ s );
    }
}
