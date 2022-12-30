package StackandQueue;

import java.util.LinkedList;



public class Stacka {
	  static LinkedList<String> ll = new LinkedList<>();

	    public static void push(String data){
	        ll.add(data);
	    }

	    public static void print(){
	        for(String element : ll){
	            System.out.println("| " + element + "|");
	            System.out.println(" --- ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        System.out.println("Welcome to Stack and Queue Problems...");
	        push("56");
	        push("30");
	        push("70");
	        print();
	    }

}
