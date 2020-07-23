package epam.len3;
import java.util.*;
import java.util.stream.Stream;
@FunctionalInterface
interface fun{
	List<String> check(List<String> a);
}
public class App 
{
	
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
    	fun res=(li)->{ 
    		List<String> out=new ArrayList<String>();
    		for(String i:li) {
    			if(i.charAt(0)=='a' && i.length()==3) {
    				out.add(i);
    			}
    		}
    		return out;
    	};
    	System.out.println("strings that start with letter a and has length 3 using lambdas are "+res.check(l));
    	Stream<String> st=l.stream();
    	System.out.println("strings that start with letter a and has length 3 using streams are");
    	st.filter(j->j.startsWith("a")).filter(j->j.length()==3).forEach(j->System.out.println(j));
    }
}
