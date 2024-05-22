package arrays;

public class RussianMultiplication 
			
			{


				public int multiply(){
				int a=25;
				int b=20;
		        int res = 0;
		        while(a> 0){
		            if(a% 2 != 0)
		            {
		                res=res+b;
		            }
		            a = a>>1;
		            b = b<<1;
		        }
		        return res;
		    }
		    
		    public static void main(String args[]){
		        RussianMultiplication rm = new RussianMultiplication();
		        System.out.println(rm.multiply());
		    }
		

	}


