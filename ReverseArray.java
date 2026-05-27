package com;

public class ReverseArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	int end=arr.length-1;
	int start=0;
	for(int i=0;i<arr.length;i++) {
		if(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
	}
	for (int i : arr) {
		System.out.println(i);
	}
}
}
