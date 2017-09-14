package reversestring5;
import java.io.*;
import java.util.*;

public class reverseString {
	 public static void main(String[] args) {
		  String input = "Be in present";
		  byte [] strAsByteArray = input.getBytes();
		  byte [] result = new byte [strAsByteArray.length];
		   
		  for(int i = 0; i<strAsByteArray.length; i++){
		  result[i] = strAsByteArray[strAsByteArray.length-i-1];
		  }
		  System.out.println( new String(result));
		   }}


