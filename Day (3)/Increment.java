import java.util.*;
import java.lang.*;

public class Increment
{
public static void main(String args[])
{
int a=5;
int b=++a * 8;
int c=--a;
System.out.println(a);
System.out.println(b);
System.out.println(c);
c=a++;
System.out.println(c);
c=++a;
System.out.println(c);
b=a * 8;
System.out.println(b);
}
}