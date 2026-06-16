package com.tka.ArrayBasicQuestion;

public class NumberBased {
//	RevNum → Reverse number
	public void reverseNumber(int num) {
		int rev = 0;
		int num2 = num;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		System.out.println("reverse number of " + num2 + " is " + rev);

	}

//	NumPalindrome → Check palindrome number
	public void checkingPalindrome(int num) {
		int check = num;
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		if (rev == check) {
			System.out.println(check + " is palindrome number");
		} else {
			System.out.println(check + " is not palindrome number");
		}

	}

//	PrimeNo → Check prime number
	public void checkPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {

				count++;
			}

		}
		if (count == 2) {
			System.out.println(num + " is prime number");

		} else {
			System.out.println(num + " is not prime number");
		}

	}

//	Fibonacci Series
	public void fibonacciSeries(int num) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <= num; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}

	}

//	HCF
	public void hcfFinding(int num1, int num2) {
		int smallest = 0;
		int hcf = 0;
		if (num1 > num2) {
			smallest = num2;

		} else {
			smallest = num1;
		}
		for (int i = 1; i <= smallest; i++) {
			if (num1%10 == 0 && num2%10 == 0) {
				hcf = i;

			}

		}

		System.out.println("hcf =" + hcf);
	}

//	LCM
	public void lcmFinding(int num1, int num2) {
		int smallest = 0;
		int hcf = 0;
		int lcm =( num1 * num2) / hcf;

		if (num1 > num2) {
			smallest = num2;

		} else {
			smallest = num1;
		}
		for (int i = 0; i <= smallest; i++) {
			if (smallest % num1 == 0 && smallest % num2 == 0) {
				hcf = i;

			}

		}

		System.out.println("lcm =" + lcm);
	}
//	PowerNum (Power of 3)

//	CountCarry
	public void countCarry(int num1, int num2) {
		int carrycount = 0;
		int sum = 0;
		int carry=0;
		while (num1 > 0 || num2 > 0) {
			int digit1 = num1 % 10;
			int digit2 = num2 % 10;
			sum = digit1 + digit2 + carry;
			if (sum > 9) {
				carrycount++;
              carry=1;
			} else {
				carry=0;
			}
			num1 = num1 / 10;
			num2 = num2 / 10;
		}
		System.out.println("CarryCount =" + carrycount);

	}

//	Difference
	public void differnce(int arr[],int num,int diff) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int differnce=Math.abs(arr[i]-num);
			if(differnce<=diff) {
				count++;
				
			}
		}
		System.out.println(count);
		
	}
//	GooglyPno
	public void googlypno(int num) {
		int sum=0;
		int count=0;
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
			
		}
	  for(int i=1;i<=sum;i++) {
		  if(sum%i==0) {
			  count++;
			  
		  }
		  
	  }
	  if(count==2) {
		  System.out.println(sum+ "is prime number ");
	  }else {
		  System.out.println(sum+ "is not prime number ");
	  }

		
	}
//	Strong Number
	public void strongNnumber(int num) {

		int origion = num;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;

			}
			sum = sum + fact;

			num = num / 10;

		}
		if (origion == sum) {
			System.out.println(origion + " is strong number");

		} else {
			System.out.println(origion + " is not strong number");
		}
		System.out.println();
	}

//	ReverseString
	public void reverseString(String str) {
		int start = 0;
		int end = str.length() - 1;
		char arr[] = str.toCharArray();
		while (start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
		for (char c : arr) {
			System.out.print(c);
		}

		System.out.println();
	}

//	ReplaceChar (replace/swap characters)
//	String = "banana"
//			Replace 'a' with 'o'
	public void replace(String str, char oldchar, char newchar) {
		String store = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == oldchar) {
				store = store + newchar;

			} else {
				store = store + str.charAt(i);
			}

		}
		System.out.println(store);

	}

//	DivisibleSum
	public void divisibleSum(int num, int num1, int num2) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i%num1== 0 && i%num2 == 0) {
				sum += i;

			}

		}
		System.out.println("Sum of divisible =" + sum);

	}

//	SumOfNum
	public void sumOfNum(int num) {
		int sum = 0;
		int origion = num;
		while (num > 0) {
			int digit = num % 10;

			sum += digit;
			num = num / 10;
		}
		System.out.println("Sum of " + origion + " =" + sum);
	}

//	Table (print table and sum)
	public void printSum(int n) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(n * i + " ");
			sum = sum + n * i;
		}
		System.out.println();
		System.out.println(sum);
	}

//	Pattern Questions
//	Pattern1 (square stars)
	public void startSquare() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("* ");

			}
			System.out.println();

		}
	}

//	Pattern2 (hollow square)
	public void hollowsquare() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if ((i == 2 && j == 2)) {
					System.out.print(" ");

				} else {
					System.out.print("*");
				}

			}
			System.out.println();

		}

	}

//	Pattern3 (shifted square)
	public void shifted() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");

			}
			for (int j = 1; j <= 3; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

//	Pattern4 (triangle/star patter
	public void traingleStart() {
		int num = 4;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		NumberBased n = new NumberBased();
		n.reverseNumber(123);
		n.checkingPalindrome(121);
		n.checkPrime(11);
		n.fibonacciSeries(3);
		n.reverseString("payal");
		n.strongNnumber(145);
		n.replace("banana", 'a', 'o');
		n.sumOfNum(123);
		n.startSquare();
		n.traingleStart();
		n.hollowsquare();
		System.out.println(" ");
		n.shifted();
		n.printSum(2);
		n.countCarry(11, 19);
	}
}
