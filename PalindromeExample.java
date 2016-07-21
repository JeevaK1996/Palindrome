# Palindrome
class PalindromeExample{  
     public static void main(String args[]){  
      int rem,sum=0,temp;    
      int in=10001;
      temp=in;    
      while(in>0){    
       rem=in%10;
       sum=(sum*10)+rem;    
       in=in/10;    
      }    
      if(temp==sum)    
       System.out.println("palindrome number ");    
      else    
       System.out.println("not palindrome");    
    }  
    }  
