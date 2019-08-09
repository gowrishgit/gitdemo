package Array;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		int a[] = new int[5]; // Declared the array and allocate memory for 5 values
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		a[4] = 10;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		int b[]= {1,3,5,7,9}; // Declared the array and dynamic allocation memory
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	a[0] = 2;
	a[1] = 4;
	a[2] = 6;
	a[3] = 8;
	a[4] = 10;
}	int a[][] = new int[2][3]; // Decalred multidimentional array with 2 rows and 3 columns
a[0][0] = 2; 
a[0][1] = 4;
a[0][2] = 8;
a[1][0] = 4;
a[1][1] = 8;
a[1][2] = 16;
