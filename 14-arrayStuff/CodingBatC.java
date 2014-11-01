public class CodingBatC{

    public String toString(int[] x){
	String s = "";
	for (int i = 0; i < x.length; i++) {
	    s = s + x[i]+", ";
	}
	return s;
    }

    public int maxMirror(int[] nums) {
	int largest = 0;

	int[] backwards = new int[nums.length];
	for (int i = nums.length-1; i >= 0; i--){
	    backwards[i] = nums[nums.length-1-i];
	}

        for (int backi = 0; backi < nums.length; backi++){
	    for (int fronti = 0; fronti < nums.length; fronti++){
		if (nums[fronti] == backwards[backi]){
		    int indivlargest = 0;
		    for (int i=0; i<nums.length-fronti && i<nums.length-backi; i++){
			if (nums[fronti + i] == backwards[backi + i]){
			    indivlargest += 1;
			}
			else{
			    break;
			}
		    }
		    if (indivlargest > largest){
			largest = indivlargest;
		    }
		}
	    }
	}
	return largest;
    }

    public static void main(String[] args){
	CodingBatC c = new CodingBatC();
	int[] a = new int[]{1, 2, 3, 3, 8};
	System.out.println(c.maxMirror(a));
    }
}
