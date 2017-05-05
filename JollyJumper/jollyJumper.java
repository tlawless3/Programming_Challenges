package jollyJumpers;
import java.util.Arrays;

public class jollyJumper {
	public static void main(String[] args){
		int[] first = {4, 1, 4, 2, 3,};
		int[] second = {5, 1, 4, 2, -1, 6};
		int[] third = {4, 19, 22, 24, 21};
		int[] fourth = {4, 19, 22, 24, 25};
		int[] fifth= {4, 2, -1, 0, 2};
		
		System.out.println(jollyJumperCheck(first));
	    System.out.println(jollyJumperCheck(second));
	    System.out.println(jollyJumperCheck(third));
	    System.out.println(jollyJumperCheck(fourth));
	    System.out.println(jollyJumperCheck(fifth));
	}
	
	public static String jollyJumperCheck(int[] i){
		
		String x = "Jolly";
		int absDiffs[] = new int[i.length-1];
		
		//DONE store abs(differences) to array, check differences between numbers in array
		//TODO re-read challenge understand it do it.
		for (int j = 1; j < i.length - 1; j++){
			absDiffs[j] = Math.abs(i[j] - i[j+1]);
		}
		
		Arrays.sort(absDiffs);
		
		for(int k = 0; k < absDiffs.length - 1; k++){
			if(absDiffs[k] != absDiffs[k + 1] - 1){
				x ="Not Jolly";
			}
		}
		
		return(Arrays.toString(i) + " " + x);
	}
	
}
