import java.lang.Math;

public class MathP2Q1 {
	
    public static void main(String [] args) {
    	
    	int number;
    	double root;
    	
    	System.out.println("Number" + "   " + "SquareRoot");
    	for (number = 0; number <= 20 ; number+=2)
    	{
    		
    		root = Math.sqrt(number);
    		System.out.printf("%d \t\t %.4f \n", number, root);
    	}
    }
    
    
}