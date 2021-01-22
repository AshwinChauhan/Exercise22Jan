import java.util.Scanner;

/*
* Author : ashwin
*Date : 18-Jan-2021
*/
public class MagicSquare {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// creer les tableau pour chaque array de nombre
		int []MyTab1= new int[4];
		int []MyTab2= new int[4];
		int []MyTab3= new int[4];
		int []MyTab4= new int[4];
		// determiner les valeur dans chaque table
		for (int i = 0; i < MyTab1.length; i++) 
		{ MyTab1[i]=sc.nextInt();}
		for (int i = 0; i < MyTab1.length; i++) 
		{ MyTab2[i]=sc.nextInt();}
		for (int i = 0; i < MyTab1.length; i++) 
		{ MyTab3[i]=sc.nextInt();}
		for (int i = 0; i < MyTab1.length; i++) 
		{ MyTab4[i]=sc.nextInt();}
		// creer les variable pour le somme de chaque tableau verticallement
		int sum1H=0;
		int sum2H=0;
		int sum3H=0;
		int sum4H=0;
		// faire les addition de chaque array
		for (int i : MyTab1) { sum1H=sum1H + i;}
		for (int i : MyTab2) { sum2H=sum2H + i;}
		for (int i : MyTab3) { sum3H=sum3H + i;}
		for (int i : MyTab4) { sum4H=sum4H + i;}
		// faire le varable pour chaque somme verticale
		int sum1V=0;
		int sum2V=0;
		int sum3V=0;
		int sum4V=0;
		// faire le calcule pour chaque somme verticale
		sum1V= MyTab1[0] + MyTab2[0]+ MyTab3[0] + MyTab4[0];
		sum2V= MyTab1[1] + MyTab2[1]+ MyTab3[1] + MyTab4[1];
		sum3V= MyTab1[2] + MyTab2[2]+ MyTab3[2] + MyTab4[2];
		sum4V= MyTab1[3] + MyTab2[3]+ MyTab3[3] + MyTab4[3];
		
		//creer un variable pour la somme des calcule horizontale
		int SommeH = 0;
		//faire le calcule du somme horizontale
		SommeH= sum1H + sum2H + sum3H + sum4H;
		//creer un varaible pour la somme des calcule verticale
		int SommeV=0;
		//faire le calcule du somme verticale
		SommeV= sum1V + sum2V + sum3V + sum4V;
		//conclusion
		if(SommeV==SommeH) { System.out.println("Magic"); }
		else {System.out.println("Not Magic");}
		
		
	}

}
