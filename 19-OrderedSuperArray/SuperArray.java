public class SuperArray {
    String[] data;
    int last; // index of last item in list
    public SuperArray() {
	data = new String[10];
	last = 0;
    }
    public SuperArray(int len){
	data = new String[len];
	last = 0;
    }
    public boolean add(String i){
	// adds an item to the end of the list, grow if needed
	// returns true
	String[] newdata;
	if (size() == data.length){
	    newdata = new String[size() + 100];
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
    public void add(int index, String i){
	// adds item i at index, shifting everything down as needed.
	// also grows as needed
	IndexBounds(index);
	String[] newdata;
	if (size() == data.length){
	    newdata = new String[size() + 100];
	    for (int a = 0; a < index; a++){
		newdata[a] = data[a];
	    }
	    newdata[index] = i;
	    for (int a = index+1; a < data.length+1; a++){
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
	    if (data[i]!=null){
		return i + 1;
	    }
	}
	return 0;
    }
    public String get(int index) {
	// returns the item at location index of the list
	IndexBounds(index);
	return data[index];
    }
    public String set(int index, String i){
	// sets the item at location index to value i
	// returns the old value.
	IndexBounds(index);
	String oldvalue = data[index];
	data[index] = i;
	return oldvalue;
    }
    public String remove(int index){
	// removes the item at index i
	// returns the old value
	IndexBounds(index);
	String old = data[index];
	last = size()-1;
	for (int i = index; i < last; i++){
	    data[i] = data[i+1];
	}
	data[last] = null;
	return old;
    }
    public void IndexBounds(int index){
	if (index > data.length-1){
	    throw new IndexOutOfBoundsException();
	}
    }
    public String toString(){
	String s = "";
	for (int i = 0; i < data.length; i++) {
	    s = s + data[i]+", ";
	}
	return s;
    }
}
