public class OrderedSuperArray extends SuperArray {
    public void add(int index,String i){
	System.out.println("Sorry, this can't be used.");
    }

    public boolean add(String i){
	int loc = 0;
	String[] newdata;

	for (int x = 1; x < data.length; x++){
	    if (data[x-1] == null){
		System.out.println("1.");
		data[x-1] = i;
		break;
	    }
	    else if (data[x] == null && i.compareTo(data[x-1]) >= 0){
	    	System.out.println("2.");
	    	data[x] = i;
	    	break;
	    }
	    else if (i.compareTo(data[x-1]) < 0){
		loc = x-1;
		System.out.println("size: " + super.size());
	        if (super.size() == data.length){
		    System.out.println("3.");
	    	    newdata = new String[size()+100];
	    	    for (int a = data.length-1; a > loc; a--){
	    		data[a] = data[a-1];
	    	    }
	    	    data[loc] = i;
	    	    data = newdata;
	    	    break;
	    	}
	    	else{
		    System.out.println("4.");
	    	    for (int a = data.length-1; a > loc; a--){
	    		data[a] = data[a-1];
	    	    }
	    	    data[loc] = i;
		    break;
	    	}
	    }
	}
	return true;
    }

    public String set(int index, String i){
	// sets the item at location index to value i
	// returns the old value.
	super.IndexBounds(index);
	String oldvalue = data[index];
	super.remove(index);
	add(i);
	return oldvalue;
    }

}
