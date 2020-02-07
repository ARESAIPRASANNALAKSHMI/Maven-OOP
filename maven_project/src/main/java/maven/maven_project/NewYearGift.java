package maven.maven_project;
//import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class NewYearGift extends Sweet implements Chocolates
{
	public static void main(String args[])
	{
		
			NewYearGift n=new NewYearGift();
			n.gift();		
	}
	public void gift()
	{
		int total_weight=0;                         
		ArrayList<Integer> chocolates_object=new ArrayList<Integer>();
		ArrayList<Integer> candy_list=new ArrayList<Integer>();
		ArrayList<Integer> result_CandyList=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int number_gifts;
		System.out.println("No Of Gifts:");
		number_gifts=sc.nextInt();
		Sweet obj[]=new Sweet[number_gifts];
		for(int i=0;i<number_gifts;i++)
		{
			obj[i]=new Sweet();
			System.out.println("In Gift "+(i+1));
			System.out.println("Enter Sweet Name:");
			String Sweet_name=sc.next();
			System.out.println("Enter No Of Sweets And Cost Of Sweets ");
			int no_sweet=sc.nextInt();
			int cost=sc.nextInt();
			int sweet_weight=obj[i].Sweet_weight(no_sweet,cost);
			System.out.println("Number of Chocolates Present in gift "+(i+1));
			int number=sc.nextInt();
			int chocolate;
			String Chocolate_Name;
			for(int j=0;j<number;j++)
			{
				System.out.println("Enter Chocalate Name:");
				Chocolate_Name=sc.next();
				System.out.println("Enter No Of Chocolates And Weight ");
				int no_chocalate=sc.nextInt();
				int weight=sc.nextInt();
				chocolate=TotalChocalates(no_chocalate,weight);
				chocolates_object.add(chocolate);
			}
			chocolate=0;
			for(int j=0;j<chocolates_object.size();j++)
			{
				chocolate+=chocolates_object.get(i);
			}
			System.out.println("Enter Candy Name:");
			String Candy_Name=sc.next();
			System.out.println("Enter No Of Candies And Weight ");
			int no_candy=sc.nextInt();
			int candy_weight=sc.nextInt();
			int candies=Candy(no_candy,candy_weight);
			candy_list.add(candies);
			total_weight=(sweet_weight+chocolate+candies);
			System.out.println("Weight of Gift"+(i+1)+" is "+total_weight);
			System.out.println("Enter Minimum Cost for Candy: ");
			int candy_lowerlimit=sc.nextInt();
			System.out.println("Enter Maximum Cost for Candy: ");
			int candy_upperlimit=sc.nextInt();
			for(int j=0;j<candy_list.size();j++)
			{
				int a=candy_list.get(i);
				if(a>=candy_lowerlimit && a<=candy_upperlimit)
				{
					result_CandyList.add(a);
				}
			}
			System.out.println("Chocolates in gift according to weight are "+chocolates_object);
			System.out.println("Cost Of Candies That Satisfying Range are:"+result_CandyList);
		}
	}
	public  int TotalChocalates(int no_of_chocalates,int weight)
	{
		int total_weight=0;
		total_weight=no_of_chocalates*weight;
		return total_weight;
		
	}
}