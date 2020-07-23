package epam.average;

import java.util.*;
import java.util.stream.Stream;
@FunctionalInterface
interface getAvg{
	double check(Stream<Integer> a);
}

public class Avg 
{
	public static double avgg(Stream<Integer> n) {
		return n.mapToInt(i->i).average().getAsDouble();
	}
	public static double Avgof(getAvg y,Stream<Integer> a) {
		return y.check(a);
	}
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter number of elements");
    	int n=sc.nextInt();
    	ArrayList<Integer> l=new ArrayList<Integer>();
    	for(int i=0;i<n;i++) {
    		System.out.println("Enter element "+(i+1));
    		l.add(sc.nextInt());
    	}
    	Stream<Integer> ll=l.stream();
    	double out=Avgof(Avg::avgg,ll);
        System.out.printf("Average of given numbers is %.2f",out);
    }
}
