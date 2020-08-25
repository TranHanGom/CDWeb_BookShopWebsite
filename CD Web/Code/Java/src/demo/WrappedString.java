package demo;

import java.util.HashSet;

public class WrappedString {
		   private String s;
		   public WrappedString(String s) { this.s = s; }

		   public static void main(String[] args) {
		      HashSet<Object> hs = new HashSet<Object>();
		      WrappedString ws1 = new WrappedString("Java Exam");
		      WrappedString ws2 = new WrappedString("Java Exam");
		      String s1 = new String("Java Exam");
		      String s2 = new String("Java Exam");
		      hs.add(ws1); hs.add(ws2); hs.add(s1); hs.add(s2);    
		      System.out.println(hs.size());
		   }
		


}
