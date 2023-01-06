package com.obsqura.selenium.TestNGSample;

public class InterviewQn {

	public static void findOccurence(){
		String input="JAVA";
		String a[]= {"J","V","A","A"};
		int count=input.length();
		int number=0,number1=0,number2=0;
		for(int i=0;i<=count;i++){
			if(a[i]=="J"){
				number=number+1;
				System.out.println("Count of J ="+number);
			}
			if(a[i]=="A"){
				number1=number1+1;
				System.out.println("Count of A ="+number1);
			}
			if(a[i]=="V"){
				number2=number2+1;
				System.out.println("Count of V ="+number2);
			}}
	}
	public static void main(String args[]){
		InterviewQn.findOccurence();
	}

}
