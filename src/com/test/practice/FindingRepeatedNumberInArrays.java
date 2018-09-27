package com.test.practice;

public class FindingRepeatedNumberInArrays {
	
	public static void RepeatedNumber(int a[],int size){
		int i,j;
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]={1,2,2,3,4,5,5,6,7,7};
		//int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int size=arr.length;
        RepeatedNumber(arr, size);
	}

}
