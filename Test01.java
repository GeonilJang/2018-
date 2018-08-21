/*
 *n	5
arr1	[9, 20, 28, 18, 11]
arr2	[30, 1, 21, 17, 28]
출력	["#####","# # #", "### #", "# ##", "#####"]
 * 
 * 
 * 
 * n	6
arr1	[46, 33, 33 ,22, 31, 50]
arr2	[27 ,56, 19, 14, 14, 10]
출력	["######", "### #", "## ##", " #### ", " #####", "### # "]
 * */
public class Test01 {
	public static void main(String [] args) {
		int n = 6;
		int [] arr1 = {46, 33, 33 ,22, 31, 50};
		int [] arr2 = {27 ,56, 19, 14, 14, 10};
		String [] newArr = new String[n];
		String [] result = new String[n];
		for(int i = 0 ; i < n ; i++) {
			newArr[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
			result[i] = newArr[i].replaceAll("1", "#").replaceAll("0", " ");
			if(result[i].length() < n) {
				result[i] = " "+result[i];
			}
			System.out.println(result[i]);
		}
	}
}
