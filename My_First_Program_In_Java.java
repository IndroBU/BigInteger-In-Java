package Introduction_To_Java_Applications;

import java.math.BigInteger;
import java.util.Scanner;

/*public class My_First_Program_In_Java {
	private static final String R = null;
	public static int a=1;
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Java Programming");
		a =2;
		System.out.println(a);
		System.out.println( 2 << 4);
		
	

	



}
}*/

import javax.swing.*;  
public class My_First_Program_In_Java {  

public static void main(String[] args) {  
   // new My_First_Program_In_Java(); 
	

	Scanner sc = new Scanner(System.in);
	BigInteger E1 ,E2,E3,E4,E5,E6;
	
	int I,res,P,Q,R,S;
	   // while(cin>>P>>Q>>R>>S)
	   // {
	      P=sc.nextInt();
	      Q=sc.nextInt();
	      R=sc.nextInt();
	      S=sc.nextInt();
	      E1=BigInteger.valueOf(1);
	        E2=BigInteger.valueOf(1);
	        E3=BigInteger.valueOf(1);
	        E4=BigInteger.valueOf(1);
	        E5=BigInteger.valueOf(1);
	        E6=BigInteger.valueOf(1);
	       
	        if(P>Q)
	        {
	      
	            for( I=R+1; I<=P; I++ )
	            {
	              
	                E1=E1.multiply(BigInteger.valueOf(I));
	            }
	        }
	       if(R>P)
	        {
	           
	            for( I=P+1; I<=R; I++)
	            {
	             
	             
	                		
	                		 E6=E6.multiply(BigInteger.valueOf(I));

	            }
	        }
	        if((R-S)>(P-Q))
	        {
	            
	            for(I=(P-Q)+1; I<=(R-S); I++)
	            {
	             
	               E2=E2.multiply(BigInteger.valueOf(I));
	            }
	        }
	        if((P-Q)>(R-S))
	        {
	           
	            for(I=(R-S)+1; I<=(P-Q); I++)
	            {
	              
	                E4=E4.multiply(BigInteger.valueOf(I));
	            }
	        }
	        if(S>Q)
	        {
	            
	            for(I=Q+1; I<=S; I++)
	            {
	              
	                E3=E3.multiply(BigInteger.valueOf(I));
	            }
	        }
	         if(Q>S)
	        {
	           
	            for(I=S+1; I<=Q; I++)
	            {
	               //E5*=I;
	             
	               E5=E5.multiply(BigInteger.valueOf(I));
	            }
	        }
	         
	         E1=E1.multiply(E2);
	         E1=E1.multiply(E3);
	         
	         
	         
	         E4=E4.multiply(E5);
	         E4=E4.multiply(E6);
	         String str="hdvbgh";
	         
	         double a,b,ans;
	         a=E1.doubleValue();
	         b=E4.doubleValue();
	        		 
	        	ans=a/b;
	         System.out.printf ("%.5f", ans);
	    
	         //System.out.println(E1.divide(E4));
	         
	         
	         
	       /* double ans,ck;
	       cout<<E1<<" "<<E2<<" "<<E3<<endl;
	      cout<<E4<<" "<<E5<<" "<<E6<<endl;

	        ans=(double)((double)E1*(double)E2*(double)E3)/(double)((double)E4*(double)E5*(double)E6);

	       printf("%.5f\n",ans);*/
	    

	

}  
}