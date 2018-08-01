import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
       String s="lappal";
       String s1= new StringBuffer(s).reverse().toString();
       if(s1.equals(s))
       System.out.print("Yes");
       else
       System.out.print("No");
	}
}
