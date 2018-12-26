package hronlinr;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TestCollection11{
 public static void main(String args[]){
 
  NavigableSet<String> al=new TreeSet<String>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ravi");
  al.add("Ajay");
  System.out.println(al.ceiling("A"));
  Iterator<String> itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}

