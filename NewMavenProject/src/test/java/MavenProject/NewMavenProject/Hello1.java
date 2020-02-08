package MavenProject.NewMavenProject;

import java.util.Scanner;

import org.junit.Test;

public class Hello1 {

	  @Test
	  public void testHello() {
		Scanner s =new Scanner(System.in);
			 
		System.out.println("Enter the number of chocolates gifted :");
		int x=s.nextInt();
		Gift[] g=new Gift[x];
		float k=0;
			  
		for(int i=0;i<g.length;i++) {
		    System.out.println("Enter the name of the chocolate :");
		    g[i]=new Gift();
		    String a=s.next();
		    g[i].setName(a);
		    	  
		    System.out.println("Enter the weight of the chocolate in grams:");
		    float b=s.nextFloat();
		    g[i].setWeight(b);
		    k=k+b;
		    	 
		    System.out.println("Enter the quantity of the chocolate:");
		    int c=s.nextInt();
		    g[i].setQuantity(c);

		}
         

		 String n;
		 float x1;
		 int y;
		 for(int t=0;t<g.length-1;t++) {
		     for(int i=0;i<g.length-t-1;i++){
		    	if(g[i+1].getName().compareTo(g[i].getName())<0){
		    		n=g[i].getName();
		    		x1=g[i].getWeight();
		    		y=g[i].getQuantity();
		    	    g[i].setName(g[i+1].getName());
		    	    g[i].setWeight(g[i+1].getWeight());
		    		g[i].setQuantity(g[i+1].getQuantity());
		    		g[i+1].setName(n);
		    		g[i+1].setWeight(x1);
		    		g[i+1].setQuantity(y);
		    		 }
		    	 }
		     }
		     
		 System.out.println("Sorted based on name:");
		 for(int i=0;i<g.length;i++) {
			System.out.println("Name of the chocolate :"+g[i].getName());
		    System.out.println("Weight of the chocolate in grams:"+g[i].getWeight()); 
		    System.out.println("Quantity of the chocolate :"+g[i].getQuantity()); 
		 }
		 System.out.println("Total weight of the chocolates gifted:"+k);
		     
	}
}
