package Assignments;



public class AbcStringMigration {

	public static void main(String[] args) {
		String a="abcdef";  
		String b="xyz1234";  
		String c="abcxy";
		
		int len1 = a.length();
        int len2 = b.length();
        int len3 = c.length();
		
        //Verify the length of the ‘a’ variable should be greater than the length of the c variable
        //and should be less than the length of the b variable.
		if (len1 > len3) {
			if (len1 < len2)
            System.out.println(
                "The length of a is greater than c but smaller than b. Length of a is: "
                + len1);
        }
        else {
            System.out.println(
                "The length of a is incorrect");
        }
		
		//‘a’ variable should not be the same as the ‘b’ variable and ‘c’ variable.
		
		if (len1 == len2) {
			if (len1 == len3)
            System.out.println("The length of a is equal to b and c Length of a is: "+ len1);
        }
        else {
            System.out.println(
                "The length of a is not equal to b and c Length of a is: "+ len1);
        }
		
		//‘c’ variable should be the same as a variable irrespective of the case.
		
		if (len1 == len3) {
            System.out.println(" Length of a is: "+ len1);
        }
        else {
            System.out.println("‘c’ variable is should be same as a variable irrespective of the case");
		
        }
		
		//‘a’ variable should contain cd and should not contain xy.
		
		boolean isContains = a.contains("cd");  
        System.out.println(isContains);  
        // Case Sensitive  
        System.out.println(a.contains("xy")); 
        
        //Convert the ‘b’ variable into uppercase and verify it should contain “Z” and should not contains “z”.
 
        String bupper=b.toUpperCase();  
        System.out.println(bupper); 
        
        boolean bisContains = bupper.contains("Z");  
        System.out.println(bisContains); 
        
        //Validated if the length of the ‘a’ variable is greater than the length of‘b’ 
        //and less than the length of the ‘c’ variable.
        
        if (len1 > len2) {
			if (len1 < len3) {
            System.out.println(
                "The length of a is greater than b but smaller than c. Length of a is: "
                + len1);
        }
        else {
            System.out.println(
                "The length of a is incorrect");
        }
	}
        //Perform concatenate on ‘a’ and ‘b’ variables 
        //and verify the length is less than the ‘c’ variable’s length or greater than 5
        
        String d = a.concat(b);          
        System.out.println(d);
        int len4 = d.length();
        
        if (len4 < len3) {
        	if (len4 > 5) {
        		System.out.println("The length of d is less than c");
        	}
        }
        else {
            System.out.println("The length of d is greater than 5");
        }
        
        //Validate if the ‘a’ variable start with “ab” and the ‘b’ variable should not ends with “yz”.
         
        	boolean bool1 = a.startsWith("ab"); 
            boolean bool2 = b.endsWith("yz"); 
            System.out.println(bool1); 
            System.out.println(bool2); 
        
        //Validate if the ‘c’ variable contains space and should not contain9.
            
          System.out.println(onlyDigits(c, len3));
	}
         		


	public static boolean onlyDigits(String c, int n){
    // Traverse the string from
    // start to end
    for (int i = 0; i < n; i++) {

        if (c.charAt(i) == ' '
            || c.charAt(i) == '9') {
            return false;
        }
    }
      // If we reach here, that means
      // all characters were digits.
    return true;


	}
}