package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( hello());
       
        System.out.println("Echo : "+echo("mouton"));
    }

    public static String hello(){
        
        return "Hello World!";
    }

    public static String echo(String pfMot){
        String mot ="";
        mot = pfMot;
        return mot;
    }
}
