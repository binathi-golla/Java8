package epam.palindrome;
import java.util.*;
import java.util.stream.Stream;
@FunctionalInterface
interface fun{
	void palindrome(List<String> a);
}
public class Palindrome 
{
	public static void palindrome(List<String> l) {
		Stream<String> out=l.stream();
		out.filter(i->i.equals(new StringBuilder(i).reverse().toString())).forEach(i->System.out.println(i));
		
	}
	public static void check(fun f,List<String> l) {
		f.palindrome(l);	
	}
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter number of strings");
    	int n=sc.nextInt();
    	List<String> l=new ArrayList<String>();
    	sc.nextLine();
    	for(int i=0;i<n;i++) {
    		System.out.println("Enter the value of string "+(i+1));
    		l.add(sc.nextLine());
    	}
    	System.out.println("palindromes present in the list are");
    	check(Palindrome::palindrome,l);
    }
}
