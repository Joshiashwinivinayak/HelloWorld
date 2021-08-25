//Write a program in JAVA to check overflow/underflow during various arithmetical operation.

class IncrementDecrement {
	public static void main(String args[]) {
		int num = 45;
		System.out.println("Display the operation of pre and post increment and decrement:");
		System.out.println("-------------------------------------");
		System.out.println("The number is:" + num);
		num++;
		System.out.println("After post increment by 1 the number is:" + num);
		++num;
		System.out.println("After pre increment by 1 the number is:" + num);
		num = num + 1;
		System.out.println("After increasing by 1 the number is:" + num);
		num--;
		System.out.println("After post decrement by 1 the number is:" + num);
		--num;
		System.out.println("After pre decrement by 1 the number is:" + num);
		num = num - 1;
		System.out.println("After decreasing by 1 the number is:" + num);
	}
}