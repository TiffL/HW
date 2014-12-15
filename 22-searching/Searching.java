import java.util.*;

public class Searching{
    Comparable[] a;
    boolean found = false;
	
    public Searching(int e){
	a = new Comparable[e];
    }
	
    public void additem(int index, Comparable c){
	a[index] = c;
    }

    public Comparable lsearch(Comparable item){
	for (int i = 0; i < a.length; i++){
	    if (item.compareTo(a[i]) == 0){
		return a[i];
	    }
	}
	return null;
    }

    public void sort(){
	Arrays.sort(a);
    }

    public Comparable bsearch(Comparable item){
	int low = 0;
	int high = a.length-1;
	int middle;

	middle = (high + low)/2;
		
	while (high >= low){
	    System.out.println("bsearch middle:  " + middle + "     low: " + low + "     high: " + high);

	    if (item.compareTo(a[middle]) == 0){
		return a[middle];
	    }
	    else if (item.compareTo(a[middle]) < 0){
		high = middle-1;
	    }
	    else{
		low = middle+1;
	    }
			
	    middle = (high + low)/2;
	}
	return null;
    }
	
    public Comparable rbsearch(Comparable item){
	int middle = a.length / 2;
	int low = 0;
	int high = a.length-1;
		
	//System.out.println("rbsearch middle: " + middle + "     low: " + low + "     high: " + high);

	if (item.compareTo(a[middle]) == 0){
	    return a[middle];
	}
	else{
	    if (item.compareTo(a[middle]) < 0){
		rbsearch(item, low, middle-1);
		if (found) {
		    return item;
		} 
		else {
		    return null;
		}
					
	    }
	    else{
		rbsearch(item, middle+1, high);
		if (found) {
		    return item;
		} 
		else {
		    return null;
		}	
	    }
	}
    }

    public Comparable rbsearch(Comparable item, int low, int high){
	int middle = (high + low)/2;
		
	//System.out.println("rbsearch(3 parameters) middle: " + middle + "     low: " + low + "     high: " + high);
		
	if (low > high) {
	    return null;
	}				
		
	if (item.compareTo(a[middle]) == 0){
	    found = true;
	    return a[middle];
	}
	else{
	    if (item.compareTo(a[middle]) < 0){
		rbsearch(item, low, middle-1);
	    }
	    else{
		rbsearch(item, middle+1, high);
	    }
	}
	return null;
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i] + ", ";
	}
	return "[" + s.substring(0,s.length()-2) + "]";
    }

    public static void main(String[] args){
	int len = 10;
	Searching s = new Searching(len);
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	Random r = new Random();
			
	for (int i = 0; i < len; i++){
	    s.additem(i,alphabet.charAt(r.nextInt(alphabet.length())));
	}
	System.out.println(s.toString());

	System.out.println("lsearch result:     " + s.lsearch('b')+"\n");

	s.sort();
	System.out.println(s.toString());

	System.out.println("bsearch result:     " + s.bsearch('b')+"\n");

	System.out.println("rbsearch result:    " + s.rbsearch('b')+"\n");
    }
}
