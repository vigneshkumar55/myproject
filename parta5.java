import java.util.*;
class distance
{
	int feet,inches;
	distance(int feet,int inches)
	{
		this.feet=feet;
		this.inches=inches;
	}
	void sum(distance d1,distance d2)
	{
		if(d1.inches<12 && d2.inches<12)
		{
			inches=d1.inches+d2.inches;
			feet=d1.feet+d2.feet+(inches/12);
			inches=inches%12;
			System.out.println("total distance is:\n feet:"+feet+"\t inches:"+inches);
		}
		else
		System.out.println("inches should be less than 12!!!");
	}
}
class parta5
{
	public static void main(String[] args)
	{
		int feet1,feet2,inches1,inches2;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a distance1");
		System.out.println("enter feet");
		feet1=Sc.nextInt();
		System.out.println("enter a inches");
		inches1=Sc.nextInt();
		System.out.println("enter distance2");
		System.out.println("enter feet");
		feet2=Sc.nextInt();
		System.out.println("enter inches");
		inches2=Sc.nextInt();
		distance d1=new distance(feet1,inches1);
		distance d2=new distance(feet2,inches2);
		d2.sum(d1,d2);
	}
}