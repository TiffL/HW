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
	System.out.println(this.toString(backwards));

	int fronti = 0;
	int backi = 0;
	while (backi < nums.length){
	    while (fronti < nums.length){
		if (nums[fronti] == backwards[backi]){
		    int indivlargest = 0;
		    for (int i = 0; i < nums.length-fronti; i++){
			//System.out.println(nums[fronti+i]);
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
		    //System.out.println("indivlargest" + indivlargest);
		}
		// else{
		//     backi += 1;
		// }
		fronti += 1;
		//System.out.println(fronti);
	    }
	    backi += 1;
	    //System.out.println(backi);
	}
	return largest;
    }

    public static void main(String[] args){
	CodingBatC c = new CodingBatC();
	int[] a = new int[]{1, 2, 3, 3, 8};
	System.out.println(c.maxMirror(a));
    }
}
