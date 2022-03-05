package org.howard.edu.lsp.assignment4.implementation;

/**
 * @author surakshyaa
 */

import java.util.*;

public class IntegerSet  {
	private List<Integer> set;
    
    /**
	 * Default Constructor
	 */
	public IntegerSet() {
        this.set = new ArrayList<Integer>();
	}

    public void clear() {
      this.set.clear();
    }
    
    /**
      *Returns length of the Integer set 
      *@return length 
      */
    public int length() {
      return this.set.size();
    }

    /**
      *checks if two sets are equal or not
      *starts with checking the length of two sets and returns false if not equal
      * @param b is another set
      * @return true if two sets have the same elements in the same order
      */
    public boolean equals(IntegerSet b) {
      if (b.set.size() != this.set.size()){
        return false;
      }
      for (int element: this.set){
        if (!b.contains(element)){
          return false;
        }
      }
      return true;
    }

    /**
      *Returns true if the set contains the value, otherwise false
      * @param value of type IntegerSet 
      * @return true if the IntegerSet contains the Value, else false
      */
    public boolean contains(int value) {
        return this.set.contains(value);
    }
    
    /**
      *Returns the largest item in the set
      *Throws a IntegerSetException if the set is empty 
      * @return largest item in the set
      * @throws IntegerSetException 
    */
    public int largest() throws IntegerSetException {
      if (set.size() ==0) {
          throw new IntegerSetException("The set is empty");
      }
      else {
        int largest = set.get(0);
        for (int i = 1; i < this.set.size(); i++) {
            if (set.get(i)>largest) {
              largest=set.get(i);
            }
        }
              return largest;
        }
      }
/**
  * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
  * @return the smallest item in the set
  * @throws IntegerSetException
  */    
public int smallest() throws IntegerSetException {
      if (set.size() ==0) {
          throw new IntegerSetException("The set is empty");
      }
      else {
        int smallest=set.get(0);
        for (int i = 1; i < set.size(); i++) {
          if (set.get(i)<smallest) {
            smallest = set.get(i);
          }
        }
      
	return smallest;
      }
    }
/**Adds an item to the set or does nothing it already there
  * @param item is an integer to be added
  */ 

    
    public void add(int item) {
      if (!set.contains(item)) {
        set.add(item);
      }
    }
/**
  * Removes an item from the set or does nothing if not there and throws an IntegerSetException
  * @param item to be removed from set 
  * @throws IntegerSetException
  */
    
    public void remove(int item) throws IntegerSetException {
      if (set.size()==0) {
        throw new IntegerSetException("The set is empty");
      }
      if (set.contains(item)) {
        set.remove(set.indexOf(item));
      }
    }
/**
  * Set union 
  * @param intSetb is another set
  */
    
  public void union(IntegerSet intSetb) {
      for (int i=0; i< intSetb.set.size(); i++) {
        if (!set.contains(intSetb.set.get(i))) {
          set.add(intSetb.set.get(i));
        }
      }
    }
/**
  * Set intersection
  * @param intSetb is another set to find intersect
  */
public void intersect(IntegerSet intSetb) {
	int i=0;
  while (i < this.set.size()) {
    int temp = set.get(i);
    if (!intSetb.set.contains(temp)) {
      set.remove(temp);
    }
    else{
      i++;
    }
    
  }
}
    
/**
  * Set difference, i.e., s1 –s2
  * @param intSetb is another set to find difference
  */
public void diff(IntegerSet intSetb) {
  set.removeAll(intSetb.set);
} 
/**
  * Returns true if the set is empty, false otherwise
  * @return if the set is empty or false
  */

public boolean isEmpty() {
  return set.isEmpty();
}

/**
  * Return String representation of your set
  * @return string representation 
  */
public String toString() {
  String str= "";
  for (int i=0; i< set.size(); i++) {
    str+= Integer.toString(set.get(i));
  }
  return str;
}
  
    }

