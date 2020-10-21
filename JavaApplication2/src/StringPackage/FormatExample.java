/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author mahesh
 */
public class FormatExample {
    public static void main(String args[]){  
        
String name="sonoo";  

String sf1=String.format("name is %s",name);  

String sf2=String.format("value is %f",52.33434);  

String sf3=String.format("value is %42.12f",52.0);//returns 12 char fractional part filling with 0  
  
System.out.println(sf1);  
System.out.println(sf2);  
System.out.println(sf3);  


char ch;
ch = "abc".charAt(2);          //      char charAt(int where)
System.out.println(ch);            


char c[] = {'J', 'a', 'v', 'a'};
String s1 = new String(c);   // charcter array          String(char chars[ ])
String s2 = new String(s1);    // string object.      String(String strObj)     
System.out.println(s1);
System.out.println(s2);
try{
  String s = new String(c, 2, 3);  //String(char chars[ ], int startIndex, int numChars)
  System.out.println(s);
}catch(Exception e){
    System.out.println("Please enter only two charcrter size");

}
//System.out.println(s.length());         //int length( )





byte ascii[] = {65, 66, 67, 68, 69, 70 };    //String(byte asciiChars[ ])
String s11 = new String(ascii);
System.out.println(s11);
String s21 = new String(ascii, 2, 3);  //String(byte asciiChars[ ], int startIndex, int numChars)
System.out.println(s21);


String st1 = "Hello";
String st2 = "Hello";
String st3 = "Good-bye";
String st4 = "HELLO";
System.out.println(st1 + " equals " + st2 + " -> " +
st1.equals(s2));                                         //boolean equals(Object str)
System.out.println(st1 + " equals " + st3 + " -> " +
st1.equals(st3));
System.out.println(st1 + " equals " + st4 + " -> " +
st1.equals(st4));
System.out.println(st1 + " equalsIgnoreCase " + st4 + " -> " +
st1.equalsIgnoreCase(st4));                     //  boolean equalsIgnoreCase(String str)


String stt1 = "Hello";
String stt2 = new String(stt1);


System.out.println(stt1 + " equals " + stt2 + " -> " +
stt1.equals(stt2));
System.out.println(stt1 + " == " + stt2 + " -> " + (stt1 == stt2));


StringBuffer sb=new StringBuffer("Hello    ");  
sb.append("Java");//now original string is changed  
System.out.println(sb);//prints Hello Java    

System.out.println("buffer = " + sb);
System.out.println("length = " + sb.length());
System.out.println("capacity = " + sb.capacity());
    }
}
