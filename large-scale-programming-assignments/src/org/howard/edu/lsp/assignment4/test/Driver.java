package org.howard.edu.lsp.assignment4.test;

/**
 * tests the functionality of our function
 * @author surakshyaa
 */

import java.util.*;
import org.howard.edu.lsp.assignment4.implementation.*;

public class Driver {
	public static void main(String[] args) {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		System.out.println(set1.toString());
		try {
			System.out.println(set1.smallest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(set1.largest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		System.out.println(set2.toString());
		try {
			System.out.println(set2.smallest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(set2.largest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		set1.intersect(set2);
		set1.diff(set2);
		
		System.out.println(set1.length());
		System.out.println(set2.length());
		System.out.println(set1.equals(set2));
		System.out.println(set2.isEmpty());
		
		//throws the IntegerSetException
		try {
			IntegerSet new_set = new IntegerSet();
			new_set.smallest();
		}catch (IntegerSetException exception){
			System.out.println(exception.getMessage());
		}
		
		try {
			IntegerSet set3 = new IntegerSet();
			set3.add(0);
			set3.remove(3);
		}catch (IntegerSetException exception){
			System.out.println(exception.getMessage());
		}
		set1.clear();
		try {
			set1.largest();
		}catch (IntegerSetException exception){
			System.out.println(exception.getMessage());
		}
		
		
		
		
		
		
		



	}
 
}