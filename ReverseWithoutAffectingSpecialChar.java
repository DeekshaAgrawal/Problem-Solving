package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWithoutAffectingSpecialChar {
	
	public static void main(String[] args){
		BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
		//String a = "a!!!b.c.d,e'f,ghi"; : Sample String
		String a;
		try {
			a = read.readLine();
			char[] srr= a.toCharArray();
			int j=a.length()-1;
			int i=0;
			while(i<j){
				if(!Character.isLetterOrDigit(srr[i]))
				{
					i++;
				}
				else if(!Character.isLetterOrDigit(srr[j]))
				{
					j--;
				}
				else
				{
					swap(srr,i,j);					
					i++;
					j--;
				}
						
			}
			System.out.println(new String(srr));
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	
	}

	private static void swap(char[] srr, int i, int j) {
		char temp=srr[i];
		srr[i]=srr[j];
		srr[j]=temp;
		
	}
	


}
