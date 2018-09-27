package com.test.practice;

public class BubbleSortProgram {
	
	public static void BubbleSort(int a[]){
		
		int size=a.length;
		for(int i=0;i<size;i++)
		{
			for(int j=1;j<size-1;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		 int arr[] ={3,60,35,2,45,320,5};  
		 
		 System.out.println("Before Bubble Sort the Array is:");
		 
		 for(int k=0;k<arr.length-1;k++)
		 {
			 System.out.println(arr[k]);
		 }

		 BubbleSort(arr);
		 
System.out.println("Before Bubble Sort the Array is:");
		 
		 for(int l=0;l<arr.length-1;l++)
		 {
			 System.out.println(arr[l]);
		 }
	}

}
