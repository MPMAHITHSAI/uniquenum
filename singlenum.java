package Singlenum;

//import java.util.Scanner;

/*public class singlenum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int vals=Singlenumber(ar);
		System.out.println(vals);
	}


	        public static int Singlenumber(int ar[]){
	            int result=0;
	            for(int i=0;i<ar.length;i++){
	                result=result^ar[i];

	            }
	            return result;
	        }
	    
	}
*/

import java.util.Scanner;

public class singlenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
         array[i] = sc.nextInt();
        }
        System.out.println(checkUnique(array,size));
    }
    public static int checkUnique(int[] array,int size)
    {
        int result = 0;
        for(int i=0;i<size;i++)
        {
            result=result^array[i];
        }
        return result;
    }
}