package TestLabNo_01;

import java.util.*;
public class DateOfBirth {
	Scanner sc = new Scanner(System.in);
	private int d,m,y;
	private int maxd;
	public DateOfBirth()
	{
		this.sety(1900);
		this.setm(1);
		this.setd(1);
	}
	public void setd(int d){
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
			maxd=31;
		else 
			if(m==4||m==6||m==9||m==11)
				maxd=30;
			else
				if(y%400==0||y%4==0 && y%100!=0)
					maxd=29;
				else 
					maxd=28;
		if (d<1 || d>maxd)
			this.d=1;
		else
			this.d=d;
	}
	public void setm(int m){
		if(m<1||m>12)
			this.m=1;
		else
			this.m=m;
	}
	public void sety(int y){
		if(y<1900||y>3000)
			this.y=1900;
		else
			this.y=y;
	}
	public DateOfBirth(int d,int m, int y){
		this.sety(y);
		this.setm(m);
		this.setd(d);
	}
	public int getd()
	{
		return this.d;
	}
	public int getm()
	{
		return this.m;
	}
	public int gety()
	{
		return this.y;
	}
	public void input()
	{
		do{
			System.out.print("Pls enter year: ");
			y=sc.nextInt();
		}while(y<1900 || y>3000);

		do{
			System.out.print("Pls enter month: ");
			m=sc.nextInt();
		}while(m<1 || m>12);
		
		do {
			System.out.print("Pls enter day: ");
			d=sc.nextInt();
		}while(d<1||d>maxd);
	}
	public void output()
	{
		System.out.println(d+"/"+m+"/"+y);
	}
	public static void main(String[] args) {
		DateOfBirth dob = new DateOfBirth();
		dob.input();
		dob.output();
	}
}

