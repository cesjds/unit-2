public class booleanWorksheet
{
	public static void main(String[] args) 
	{
		System.out.println((3*4 == 12) && (8<= 9));
		System.out.println((2/2 ==1) || (9 <= 8));
		System.out.println(!(3==5) && (6+1<=7));
		System.out.println((3==5) && !(6+1<=7));
		System.out.println(!(3 == 5) && (6+1<=7));
		System.out.println((8/2 == 4) || (3==4));
		System.out.println((8/2 == 4) && (3==4));
		
		int n1 = 3;
		int n2 = 15;
		
		System.out.println((n1 * 8 >= n2) && (n1 == 13));
		System.out.println((n1 * 8 >= n2) || (n1 == 3));
		
		char c1 = 'h';
		char c2 = 'g';
		
		System.out.println((c1 ==c2) || (c2 == 'g'));
		System.out.println((c1 ==c2) && (c2 == 'g'));
		
		boolean b1 =true;
		boolean b2 = false;
		
		System.out.println((!b1 || b1) && (b1));
		System.out.println(b1 || (!b2 && b1) || !b1);
		System.out.println(b2 && (b1 || !b2) && (b1&&b2));
		
		
		
		
	}
}