import java.util.*;
import java.lang.*;

class Proj1 {
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 1 ; 3*i < 1000 ; i++) {
				sum += 3*i;
if(5*i<1000 && (5*i)%3 !=0)
sum+=5*i;
				
		}

		System.out.println(sum);
	}
}