package coding.mentor.be5;

public class single_number {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2, 5 };
		int[] new_arr = new int[arr.length + 1];
		// {0,0,0,0,0,0}
		// new_arr[0] =0
		// new_arr[1] =2
		// new_arr[2] =2
		// new_arr[3] =0
		// new_arr[4] =0
		// new_arr[5] =1

		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
			new_arr[value]++;
		}

		for (int i = 0; i < new_arr.length; i++) {
			if (new_arr[i] == 1) {
				System.out.println("Single number is " + i);
				break;
			}
		}
	}

}
