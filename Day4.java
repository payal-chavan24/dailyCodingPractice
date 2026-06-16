package com.tka.ArrayBasicQuestion;

public class Day4 {
//	LargeNum → Find maximum element in array
	public void findMax(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}

		}
	System.out.println("Max value ="+max);

	}
//	EvOddPrint → Print Even/Odd elements
	public void printEvenOdd(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0&&arr[i]%2==0) {
				System.out.println("Evev number ="+arr[i]);
				
			}else if(arr[i]>0&&arr[i]%2!=0){
				System.out.println("Odd number ="+arr[i]);
			}
			
		}
		
	}
//	RevArr → Reverse array
	public void reverseArray(int arr[]) {
		int start=0;
		int end=arr.length-1;
		System.out.println("Before reversing array ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
			
		}
		System.out.println();
		System.out.println("After reversing array");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
//	ArrDropCount → Count drops in array
	public void countArrayDrop(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				count++;
			}
			
		}
		System.out.println("Array drop count is ="+count);
		
	}
	
//	StockPrice → Count stock price decreases
	public void countStockPriceDrop(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				count++;
			}
			
		}
		System.out.println("Array drop count is ="+count);
		
	}
//	StringPresent → Search string in array
	public void searchString(String arr[],String search) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println(search + " is found at ="+i+" index");
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		Day4 d=new Day4();
		int arr[]= {1,45,23,90};
		d.findMax(arr);
		d.printEvenOdd(arr);
		d.reverseArray(arr);
		d.countArrayDrop(arr);
		String arr1[]= {"payal","nish","meena","raju"};
		d.searchString(arr1, "payal");
		
	}

}
