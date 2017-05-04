package subsetSum;

public class subsetSum {
	public static void main(String[] args) {
	    int[] first = {1, 2, 3};
	    int[] second = {-5, -3, -1, 2, 4, 6};
	    int[] third = {};
	    int[] fourth = {-1, 1};
	    int[] fifth = {-97364, -71561, -69336, 19675, 71561, 97863};
	    int[] sixth = {-53974, -39140, -36561, -23935, -15680, 0};

	    System.out.println(subsetCheck(first));
	    System.out.println(subsetCheck(second));
	    System.out.println(subsetCheck(third));
	    System.out.println(subsetCheck(fourth));
	    System.out.println(subsetCheck(fifth));
	    System.out.println(subsetCheck(sixth));
	}
    
    public static boolean subsetCheck(int[] i){
    	for (int j = 0; j < i.length; j++){
    		int checked = i[j];
    		if (i[j]== 0) return true;
    		for (int k = 0; k < i.length; k++){
    			if (i[j] == -i[k]) return true;
    		}
    	}
    	return false;
    }
	
}
