package assignment;

public class searchString { 
        public static void main(String[] args) {  
            String[] strArray = { "hyderabad", "pune", "chennai","mumbai","delhi","noida", };  
            boolean x = false;
            //declaration of index variable
            int in = 0;
         // String to be searched  
            String s = "mumbai"; 
          
            for (int i = 0; i < strArray.length; i++) {  
                if(s.equals(strArray[i])) {  
                    in = i; x = true; break;  
                }  
            }  
            if(x)  
                System.out.println(s +" String is found at index "+in);  
            else  
                System.out.println(s +" String is not found in the array");  
        }  
}  

