import java.util.Scanner;

/*
* Author : ashwin
*Date : 21-Jan-2021
*/
public class FiveCities {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int []dist= new int[4];
		//for loup to input the values of the distances between cities
		for (int i = 0; i < 4; i++) { dist[i]=sc.nextInt();}
	
		int []villes=new int[5];
		
		villes[0]=0;
		
		for (int i = 1; i < 5; i++) {villes[i]=villes[i-1] + dist[i-1];}
		
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				int distVille=Math.abs(villes[i]-villes[j]);
				System.out.print(distVille);
				System.out.print(" ");
			}
			System.out.println();
		}


	}

}

