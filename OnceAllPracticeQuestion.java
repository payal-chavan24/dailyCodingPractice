package com;

public class OnceAllPracticeQuestion {
//	LargeNum → Find maximum element in array
	public void maxArray(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}

		}
		System.out.println("Max element from this arrray is =" + max);
	}

//	ReverseString → Reverse a string
	public void reverseString(String str) {

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

//	RevNum → Reverse a number
	public void reverseNumber(int num) {
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		System.out.println(num);

	}

//	NumPalindrome → Check palindrome numbers in range
	public void checkPalindrome(int num) {
		int rev = 0;
		int num1 = num;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		if (num1 == rev) {
			System.out.println("it is palindrome number");

		} else {
			System.out.println("It is not palindrome number");
		}

	}

//	PrimeNo → Check prime number
	public void checkPrimeNumber(int num) {
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

//	Pattern1 → Print star pattern (matrix style)
	public void starPattern(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

//	EvOddPrint → Print Even/Odd for array elements
	public void printEvenOdd(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + "Even number");
			} else {
				System.out.println(arr[i] + "odd number");
			}

		}

	}

//	DivisibleSum → Sum numbers divisible by 3 and 5
	public void sumNumber(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum = sum + i;

			}

		}
		System.out.println("Total sum=" + sum);

	}

//	StringPresent → Search string in array
	public void checkString(String str[]) {
		String str1 = "payal";
		boolean target = false;
		for (int i = 0; i < str.length; i++) {
			if (str1.equals(str[i])) {
				target = true;
				break;
			}
		}
		if (target == true) {
			System.out.println("string is persernt in given string");

		} else {
			System.out.println("string is not persernt in given string");
		}

	}

//	RevArr → Reverse an array
	public void reverArray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

//	ArrDropCount → Count drops in array
	public void arrdropCount(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				count++;

			}

		}
		System.out.println("Array drop count=" + count);

	}

//	difference → Count elements within range difference
	public void contDiffernce(int arr[], int num, int diff) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int differnce = Math.abs(arr[i]-num);
			if (differnce <= diff) {
				count++;
			}

		}
		System.out.println("Count=" + count);

	}

//	CountCarry → Count carry while addition
	public void countCarry(int num1,int num2) {
		int count=0;
		int carry=0;
		while(num1>0||num2>0) {
			int digit1=num1%10;
			int digit2=num2%10;
			int sum=digit1+digit2+carry;
			if(sum>=10) {
				count++;
				carry=1;
				
			}else {
				carry=0;
			}
			num1=num1/10;
			num2=num2/10;
			
		}
		System.out.println(count);
		
	}
//	HCF → Highest common factor
	public void hcf(int num1,int num2) {
		int hcfNumber=0;
		int smallest=Math.min(num1, num2);
		for(int i=1;i<=smallest;i++) {
			if(num1%i==0&&num2%i==0) {
			hcfNumber=i;
				
			}
			
		}
		System.out.println("Hcf ="+hcfNumber);
		
	}
//	LCM → Least common multiple
//	CardNo → Simple mathematical pattern
//	Fibbonaci → Fibonacci series
	public void fibonacciSeries(int num) {
		int a = 0;
		int b = 1;
		System.out.println(a + " " + b);
		for (int i = 2; i <= num; i++) {
			int c = a + b;
			System.out.println(c + " ");
			a = b;
			b = c;

		}

	}
//	PowerNum → Check power of 3
//	GooglyPno → Sum-of-digits prime check
//	StockPrice → Count price drops
//	
}
