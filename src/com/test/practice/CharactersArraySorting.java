package com.test.practice;

public class CharactersArraySorting {
	
	

	public static void main(String[] args) {
		char[] chArray={'A','c','f','a','t','x','b'};
		int[] charNum=new int[chArray.length];
		for(int a=0;a<chArray.length;a++)
		{
			//charNum[i]=Character.getNumericValue(chArray[i]);
			charNum[a]=(int)chArray[a];
			//System.out.println(charNum[i]);
		}
		
		for(int b=0;b<charNum.length;b++){
			System.out.println(charNum[b]);
		}
		
		for(int i=0;i<charNum.length-1;i++)
		{
			for(int j=0;j<charNum.length-1;j++)
			{
				if(charNum[j]>charNum[j+1]){
					int temp=charNum[j+1];
					charNum[j+1]=charNum[j];
					charNum[j]=temp;
				}
			}
		}
		
		System.out.println("----------------------------------");
		for(int m=0;m<charNum.length;m++)
		{
			System.out.println(charNum[m]);
		}
		
		char[] sortChar=new char[charNum.length];
		for(int c=0;c<charNum.length;c++)
		{
			sortChar[c]=(char)charNum[c];
		}
		
		System.out.println("----------------------------------");
		for(int d=0;d<sortChar.length;d++)
		{
			System.out.println(sortChar[d]);
		}

	}

}
