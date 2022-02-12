class Assignment3RethrowException{  
	   void method1() throws ArithmeticException{  
		  try
        {
            throw new ArithmeticException();
        }
        catch(ArithmeticException e)
        {
            throw e; // rethrowing the exception
        }
	   }  
	   public static void main(String args[]){  
		   Arithmeticexception obj=new Arithmeticexception();  
		obj.method1();  
	   }  
	}
