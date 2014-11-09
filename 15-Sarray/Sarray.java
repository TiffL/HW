public class Sarray {
    int[] data;
    int   last; // index of last item in list

    public Sarray() {
        // set up the initial instance variables
	data = new int[10];
	last = 0;
    }

    public boolean add(int i){
        // adds an item to the end of the list, grow if needed
        // returns true
	int[] newdata;
	if (size() == data.length){
	    newdata = new int[size() + 1];
	    for (int n = 0; n < data.length; n++){
		newdata[n] = data[n];
	    }
	    newdata[newdata.length - 1] = i;
	    data = newdata;
	}
	else {
	    data[size()] = i;
	}
	return true;
    }

    public void  add(int index, int i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed 
	int[] newdata;
	if (size() == data.length){
	    newdata = new int[size()+1];
	    for (int a = 0; a < index; a++){
		newdata[a] = data[a];
	    }
	    newdata[index] = i;
	    for (int a = index+1; a < newdata.length; a++){
		newdata[a] = data[a-1];
	    }
	    data = newdata;
	}
	else{
	    for (int a = data.length-1; a > index; a--){
		data[a] = data[a-1];
	    }
	    data[index] = i;
	}   
    }

    public int size() {
        // returns the number of items in the list (not the array size)
	for (int i = data.length - 1; i >= 0; i--){
	    if (data[i] != 0){
		return i + 1;
	    }
	}
	return 0;
    }

    public int get(int index) {
        // returns the item at location index of the list
	return data[index];
    }

    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value. 
	int oldvalue = data[index];
	data[index] = i;
	return oldvalue;
    }

    public int remove(int index){
        // removes the item at index i
        // returns the old value
	int old = data[index];
	last = size()-1;
        for (int i = index; i < last; i++){
	    data[i] = data[i+1];
	}
	data[last] = 0;
	return old;
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < data.length; i++) {
	    s = s + data[i]+", ";
	}
	return s;
    }
}
