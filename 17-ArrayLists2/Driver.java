import java.util.*;
public class Driver{
    public static void main(String[] args){

	// Randomize ArrayList
	ArrayList<Integer> ai = new ArrayList<Integer>();

	int len = 20;
	for (int i = 0; i < len; i++){
	    ai.add(i);
	}
	System.out.println(ai);

	ArrayList<Integer> ai2 = new ArrayList<Integer>();

	Random r = new Random();
        while(ai.size()>0){
	    int index = r.nextInt(ai.size());
	    ai2.add(ai.remove(index));
	}
	ai = ai2;

	System.out.println(ai);

	// Randomize Array
	int[] array1 = new int[len];
	for (int i = 0; i < array1.length; i++){
	    array1[i] = i;
	}

	System.out.println("\n" + new Driver().toString(array1));

	int swap1, swap1val, swap2, swap2val;
	for (int i = 0; i < array1.length; i++){
	    swap1 = r.nextInt(array1.length);
	    swap1val = array1[swap1];
	    swap2 = r.nextInt(array1.length);
	    swap2val = array1[swap2];
	    array1[swap1] = swap2val;
	    array1[swap2] = swap1val;
	}

	System.out.println(new Driver().toString(array1));
    }

    public String toString(int[] a){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;
    }
}
