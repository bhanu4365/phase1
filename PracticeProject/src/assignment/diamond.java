package assignment;

interface one 
{  
    default void show() 
    { 
        System.out.println("Default one"); 
    } 
} 
interface two 
{  
    default void show() 
    { 
        System.out.println("Default two"); 
    } 
}  
public class diamond implements one, two 
{  
    public void show() 
    {  
        one.super.show(); 
        two.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        diamond ob = new diamond(); 
        ob.show(); 
    } 
}
