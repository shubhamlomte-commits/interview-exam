package in.shubham.besics;

public class ZeroAndOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 0, 1, 0, 1, 0, 1 };

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			while (arr[left] == 0 && left < right) {

				left++;
			}

			while (arr[right] == 1 && left < right) {

				right--;
			}

			
			if(left<right) {
				
				
				arr[left]=0;
				arr[right]=1;
				left++;
				right--;
				
			}
			
			
			
			
		}

		for (int num : arr) {
			
			System.out.print(num);
			
		}
		
		
		
		
	}

}
