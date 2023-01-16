package justForPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyPhone {
	public static void main (String[] args) {
//	for (int i = 0; i < 1000; i++) {
//		isEvenOrOdd(i);
//		
//	}
//	}
//	
//	public static void isEvenOrOdd(int num) {
//		if(num%2==0) {
//			System.out.println( num +" is an even number");
//			
//		}else {System.out.println(num +" is odd num");
//		String a = "sdhafkdshfkjsdfh2345923405729129@@hasdhfk";
//		String replace =a.replaceAll("[a-zA-Z]", "");
//		int alphaBetic = a.length()-replace.length();
//		System.out.println(alphaBetic);
//		System.out.println(chartwithCount ("Tek School of America"));
//	}
//ArrayList <Integer> name = new ArrayList<Integer>();
//name.add(1);
//name.add(2);
//name.add(3);
//System.out.println(name);
//name.set(2, 34);
//System.out.println(name);
//String given="wefeqf878979797fewfewrf879797efds&^&^*^*^";
//String replaced=given.replaceAll("[a-zA-Z]", "");
//int alphaChar=given.length()-replaced.length();
//System.out.println(alphaChar);
//String khalid = "hello wattan";
//System.out.println(khalid.concat("evergreen"));
//StringBuffer emad = new StringBuffer(khalid);
//System.out.println(emad.reverse());
//int [] a= {12,24,2,4,1};
//Arrays.sort(a);
//System.out.println(Arrays.toString(a));
//String x = "hello";
//String y = "hello";
//if(x.equals(y)) {System.out.println(x + " equal to : " + y);
//		
//	}else {System.out.println(x + " not equal to :" + y);
//String a = "345";
//String b = "98";
//String c = a+b;
//System.out.println(c);
//int a = 13;
//int b = 6;
//		double a = 23.12;
//		int b = 55;
//System.out.println();
//		int a = 5;int b = 6;int c = ++a -b++ + a++;System.out.println(c);
//		int a = 9;
//		int b = 19;
//
//		System.out.println((double)(b/a));
//		String a = "khalid";
//		String b = "emad";
//		char [] name = a.toCharArray();
////		String [] name = a.split(b);
//		System.out.println(name);
//		int a = 10;
//		double b = 3.33;
//		System.out.println((int)(a/b));
//		int grade = 95;
//		if(grade<35) {System.out.println("C");
//		{ if(grade>55) {System.out.println("b");
//		
//
//}else {System.out.println("fail");
//		public static Map<Character , Integer> chartwithCount(String str){
//			Map<Character , Integer> chars = new HashMap<Character , Integer>();
//			for(int i = 0; i <str.length(); i ++) {
//				if ( chars.containsKey(str.charAt(i))) {
//					chars.put(str.charAt(i), chars.get(str.charAt(i)) + 1);
//				} else {chars.put(str.charAt(i), 1);
//			
//				}}
//			  
//			
//			return chars;
//		String str = "wefeqf878979797fewfewrf879797efds&^&^^^";
//int all = str.length();
//int allwihtoutA = str.replace("e", "").length();
//int countA = all - allwihtoutA;
//System.out.println(countA);
//		for(int i = 0; i <=5; i ++)
//		int a = 91;
//		if (a>=90 && a<=100) { if (a>95) {System.out.println("A+");
//	}else {System.out.println("A");
//	}
//	}
//	else if(a>=80 && a <=90) {if (a >=85) {System.out.println("B+");
//	}else {System.out.println("B");
//	}
//	}
//	else if(a>70 && a<=80) {if (a>= 75) {System.out.println("C+");
//	}else {System.out.println("C");
//	}
//	}else {System.out.println("failed");
//		int a = 90;
//		System.out.println((a>92)? "he is still in here" : "he is not in here");
//		int day = 4;
//		switch (day) {
//		case 1 : System.out.println("monday");
//		break;
//		case 2 : System.out.println("tuesday");
//		break;
//		case 3 : System.out.println("Wednesday");
//		break;
//		case 4 : System.out.println("tursday");
//		break;
//		case 5 : System.out.println("friday");
//		break;
//		case 6 : System.out.println("saturday");
//		break;
//		default : System.out.println("not days of week");
//		int month = 123;
//		switch (month) {
//		case 1 : System.out.println("january");
//		break;
//		case 2 : System.out.println("febreuary");
//		break;
//		case 3 :System.out.println("march");
//		break;
//		case 4 : System.out.println("April");
//		break;
//		case 5 : System.out.println("may");
//		break;
//		case 6 : System.out.println("june");
//		default : System.out.println("not month of year");
//		}
//		int a = 0;
//		while (a<13) {System.out.println(a);
//		a+=2;
//		while(a<23) {System.out.println(a);
//		a+=2;
//		int a =3;
//		while (a<33) {System.out.print(a + " , ");
//		a +=2;
//		for (int i = 19; i >0; i--) {System.out.println(i);
//		String [] khalid = {"emad" , "aqil" , "eqbal" , "ghulam"};
//		for(String a : khalid) {System.out.println(a);
//		int [] str = {123 , 124,24,45,656};
//		for (int i = 0; i <str.length; i ++) {
//			System.out.println(str[i]);
//		int [] name = new int [4];
//		name[0] = 4;
//		name[1] = 3;
//		name[2] = 5;
//		name [3] = 8;
//		for(int i = 0; i <name.length; i ++) {
//		System.out.println(name[i]);
//		String [] name = {"emad" , "khalid" , "aqil"};
//		for(String a : name) {System.out.println(a);
//		ArrayList<Integer> name = new ArrayList<Integer>();
//		name.add(23);
//		name.add(1, 234);
//		name.add(123);
//		name.add(908);
//		name.add(123);
//		name.set(2, 5765);
//		name.remove(2);
//
//		System.out.println(name);
//		for (int i = 0; i <11; i ++) { if (i == 3) {continue;}
//			System.out.println(i);
//		for(int i = 0; i <13; i ++) {if (i ==5) {break;}
//		System.out.println(i);
//		for(int i = 0; i <20; i ++) {if (i ==15) {continue;}
//		System.out.println(i);
//		int [][] name = new int [5][3];
//		for(int[] i : name) {System.out.println(i);
//		String str = "khalid";
//		String rev = "";
//		for(int i =0; i <str.length(); i ++) {
//			rev = str.charAt(i)+rev;}
//		if(str.equals(rev)) {System.out.println("palindrome");
////		}else {System.out.println("not palindrome");
//		StringBuffer emad = new StringBuffer("khalid");
//		System.out.println(emad.reverse());
//		String str = "wefeqf878979797fewfewrf879797efds&^&^^^";
//		String replace = str.replaceAll("[a-z A-Z]", "");
//		int character = str.length()-replace.length();
//		System.out.println(character);
//		String a = "I am very talented person in this country";
//		System.out.println(a.substring(24));
//		String [] name = a.split(" ");
//		System.out.println(name);
//		StringBuffer p = new StringBuffer(a);
//		System.out.println(p.reverse());
//		int a = 123456;
//		String num = String.valueOf(a);
//		StringBuffer p = new StringBuffer(num);
//		System.out.println(p.reverse());
//		String b = String.valueOf(a);
//		StringBuffer sb = new StringBuffer(b);
//		System.out.println(sb.reverse());
//		int [] a = {12 , 43 , 987, 23,67};
////		Arrays.sort(a);
////		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		String a = "khalid";
//		String b = "khalid";
//		if(a.equals(b)) {System.out.println(a + "  is equal to :  " + b);
//		
//		}else {System.out.println(a + "  is not equal to :  " + b);
//		String a = "qwerertrw23454325][][1234fdsg";
//		String replace = a.replaceAll("[A-z a-z]", "");
//		int alpha = a.length()-replace.length();
//		String a = "this is an apple";
//		System.out.println(a.substring(8));
//		String[] word = a.split(" ");
//		System.out.println(a.split(" ,"));
//		StringBuffer sb = new StringBuffer(a);
//		System.out.println(sb.reverse());
//		int a = 12345;
//		String num = String.valueOf(a);
//		StringBuffer khalid = new StringBuffer(num);
//		System.out.println(khalid.reverse());
//		int [] a = {12 , 234, 345, 546,2,4};
//		
//		System.out.println(Arrays.toString(a));
//		String a = "emad";
//		String b = "emad";
//		if(a.equals(b)) {System.out.println(a + "  equal to : " + b);
//		}else {System.out.println(a + " is not equal to : " + b);
//		ArrayList<Integer> emad = new ArrayList<Integer>();
//		emad.add(12);
//		emad.add(34);
//		emad.add(56);
//		emad.remove(1);
//		emad.clear();
//		System.out.println(emad.isEmpty());
//		emad.add(23);
//		emad.add(45);
//		emad.add(45);
//		System.out.println(emad.isEmpty());
			
//	
//Set<Integer> aqil = new HashSet<Integer>();
//aqil.add(12);
//aqil.add(34);
//aqil.add(34);
//aqil.add(12);
//for(int emad : aqil ) {System.out.println(aqil.add(34));
//		Map<Integer , String> khalid = new HashMap<Integer , String>();
//		khalid.put(1, "emad");
//		khalid.put(2, "aqil");
//		khalid.put(3, "samanta");
//		System.out.println(khalid);
//		System.out.println(khalid.get(2));
//		System.out.println(khalid.keySet());
//		System.out.println(khalid.values());
//		System.out.println(khalid.containsKey(2));
//		System.out.println(khalid.containsValue("delbar"));
//String [] a = {"shjd" , "asdfh" , "shdfa"};
//		System.out.println(a.split(" , "));
//		String a = "manipulation";
//		System.out.println(a.charAt(a.length()-1));
		

}
		}
