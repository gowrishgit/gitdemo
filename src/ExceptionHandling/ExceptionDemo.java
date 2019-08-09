package ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;

		try {
			// int c=a/b; //ArithmeticException
			// System.out.println(c);

			int arr[] = new int[5]; // ArrayIndexOutOfBoundException
			System.out.println(arr[7]);
		} catch (ArithmeticException ae) {
			System.out.println("I catched an ArithmeticException error");
		} catch (ArrayIndexOutOfBoundsException ie) {
			System.out.println("I catched an ArrayIndexOutOfBoundException error");
		} catch (Exception e) {
			System.out.println("I catched an error");
		} finally {
			// Will execute will irrespective of any exception thrown
			// We can use to close the browser or delete cookies we can use as break.
			System.out.println("Finally is excecuted");
		}	int a[][] = new int[2][3]; // Decalred multidimentional array with 2 rows and 3 columns
		a[0][0] = 2; 
		a[0][1] = 4;
		a[0][2] = 8;
		a[1][0] = 4;
		a[1][1] = 8;
		a[1][2] = 16;

	}

}
