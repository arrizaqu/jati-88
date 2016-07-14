package java88logic.xsis.bootcamp88.logic.day3;

public class PostTest {
	
	static int fib(int x) {
		
		if(x == 0)
			return 1;
		
		int a = 0, b = 1, c = 0;
		
		for(int i = 1; i <= x; i++) {
			c = a + b;
			a = b;
			b = c;
		}
			
		return c;
	}

	static void show(int x) {
		int lebar = x * 2 - 1;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < lebar; j++) {
				if(i == j || i + j == 2 * (x - 1))
					System.out.print(fib(i));
				else if(i + j == x - 1 || i + x - 1 == j)
					System.out.print(fib(x - i - 1));
				else
					System.out.print(' ');
				
				System.out.print('\t');
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		show(9);
	}
	
}