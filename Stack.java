/*
 * Stack.java
 * 
 * Copyright 2019 Mustaq <mustaq@mustaq-HP-Pavilion-Laptop-15-cc1xx>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Stack extends LinkedList {
	
	void push(int key){
		insertFirst(key);
	}
	boolean isEmpty(){
		if(head==null) return true;
		else return false;
	}
	int pop(){
		int x =head.data;
		deleteFirst();
		return x;
	}
	int peek(){
		if(head==null){
			System.out.println("Stack empty");
			return Integer.MAX_VALUE;
		}
		else{
			return head.data;
		}
	}
}
public class PrintGeneric {
 
    public static <T> void printAnyType(T x) {
      System.out.println("I am a variable of " + x.getClass());
      System.out.println("The parent of my " + x.getClass().getGenericSuperclass());
      System.out.println(x);
      System.out.println();
    }
  }


