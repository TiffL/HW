public class OrderedSuperArray extends SuperArray {
    public OrderedSuperArray(int len){
	super(len);
    }
    public void add(int index,String i){
	System.out.println("Sorry, this can't be used.");
    }
    public boolean add(String i){
	int loc = 0;
	String[] newdata;

	if (super.size() == data.length){
	    newdata = new String[size()+100];
	    for (int a = 0; a < data.length; a++){
		newdata[a] = data[a];
	    }
	    super.data = newdata;
	}
	
	for (int x = 1; x < data.length; x++){
	    if (data[x-1] == null){
		data[x-1] = i;
		break;
	    }
	    else if (data[x] == null && i.compareTo(data[x-1]) >= 0){
		data[x] = i;
		break;
	    }

	    else if (i.compareTo(data[x-1]) < 0){
		loc = x-1;
		for (int a = data.length-1; a > loc; a--){
		    data[a] = data[a-1];
		}
		data[loc] = i;
		break;
	    }

	    else if (i.compareTo(data[x]) < 0){
		loc = x;
		for (int a = data.length-1; a > loc; a--){
		    data[a] = data[a-1];
		}
		data[loc] = i;
		break;
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
