package StackandQueue;

import java.util.LinkedList;



public class Stacka {
	 static LinkedList<String> ll = new LinkedList<>();

	    public static void push(String data){
	        ll.add(data);
	    }

	    public static void pop(){
	        ll.removeLast();
	    }
	    public static void print(){
	        if(ll.size() != 0) {
	            for (String element : ll) {
	                System.out.println("| " + element + "|");
	                System.out.println(" --- ");
	            }
	            System.out.println();
	        } else
	            System.out.println("Stack is Null.............");
	    }

	    public static void main(String[] args) {
	        System.out.println("Welcome to Stack and Queue Problems.");
	        push("56");
	        push("30");
	        push("70");
	        push("70");
	        push("70");
	        push("70");
	        System.out.println("Stack ::::::::::::::");
	        print();
	        int size = ll.size();
	        System.out.println("size " +ll.size());
	        for (int i = 0; i < size; i++){
	            pop();
	        }
	        System.out.println("Stack :::::::::::::::::::");
	        print();
	    }
}
