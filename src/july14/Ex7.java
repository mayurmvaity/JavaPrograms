/**Q7) Write a program to accept movie details like ( all 9 items) 
Analysis to be performed: Total number of movies released in 2015, total net income of all movies, total movie of rating more than 4
Count the number of movies whose language is English
Total movies whose director name is "John", and movies whose duration is >1.5 hours
**/

package july14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

class Movie
{
int id;
String actor;
String name;
int rating;
String language;
String dName;
int duration;
int year;
double netInc;

public Movie(int id, String name, String actor,int rating, String language, String dName, int duration, int year, double netInc)
{
	this.id = id;
	this.name = name;
	this.rating = rating;
	this.language = language;
	this.dName = dName;
	this.duration = duration;
	this.year = year;
	this.netInc = netInc;
	this.actor = actor;
}

}

public class Ex7
{

ArrayList<Movie> al5 = new ArrayList<Movie>();
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
/*public void getMovie(){
	
	Movie m1 = new Movie(1,"JL","flash",8,"EN","John",150,2017,15000000);
	Movie m2 = new Movie(2,"WW ","WW",7,"EN","Chris",120,2015,14500000);
	Movie m3 = new Movie(3,"Aquaman","aqman",7,"FR","Chris",65,2018,13500000);
	Movie m4 = new Movie(4,"TheFlash","flash",4,"FR","John",125,2015,11500000);
	Movie m5 = new Movie(5,"BvSTDoJ","superman",3,"EN","John",75,2016,12300000);
	
	al5.add(m1);
	al5.add(m2);
	al5.add(m3);
	al5.add(m4);
	al5.add(m5);
	
}*/

public void getMovieDetails() throws IOException
{
	
	for(int i=0;i<10;i++)
	{
		System.out.println("Enter movie details: ");
		System.out.print("Enter movie id: ");
		int id = Integer.parseInt(br.readLine());
		
		System.out.print("Enter movie name: ");
		String name = br.readLine();
		
		System.out.print("Enter actor name: ");
		String actor = br.readLine();
		
		System.out.print("Enter language: ");
		String language = br.readLine();
		
		System.out.print("Enter ratings: ");
		int rating = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Director name: ");
		String dname = br.readLine();
		
		System.out.print("Enter movie length: ");
		int duration = Integer.parseInt(br.readLine());
		
		System.out.print("Enter release year: ");
		int year = Integer.parseInt(br.readLine());
		
		System.out.print("Enter net income: ");
		double netInc = Double.parseDouble(br.readLine());
		
		Movie mx = new Movie(id,name,actor,rating,language,dname,duration,year,netInc);
		
		al5.add(mx);
		
	}
}


public void movieNetInc()
{
	double totalnetInc = 0;

	Iterator it1 = al5.iterator();
	while(it1.hasNext())
	{
		Movie mx = (Movie) it1.next();
		totalnetInc += mx.netInc;
	}
	
	System.out.println("Total net inc: Rs. "+totalnetInc);
}

public void movieByYear(int yr)
{
	
	int yearCount =0;
	
	Iterator it1 = al5.iterator();
	while(it1.hasNext())
	{
		Movie mx = (Movie) it1.next();
		
		if(mx.year == yr)
		{
			yearCount++;
		}
		
	}
	System.out.println("number of movies released in year "+yr+" are: "+yearCount);
	
}

public void moviesByLanguage(String language)
{
	int moviesCount = 0;
	Iterator it1 = al5.iterator();
	while(it1.hasNext()){
		Movie mx = (Movie) it1.next();
		if(mx.language.equals(language))
		{
			moviesCount++;
		}
	}
	System.out.println("Total movies with language "+language+" are: "+moviesCount);
}

public void moviesRating(int rating)
{
	int ratingCount =  0;
	Iterator it1 = al5.iterator();
	while(it1.hasNext()){
		Movie mx = (Movie) it1.next();
		if(mx.rating > rating)
		{
			ratingCount++;
		}
	}
	System.out.println("Total movies with ratings > 4 are: "+ratingCount);
}

public void moviesBy(String dname)
{
	int directorCount=0;
	Iterator it1 = al5.iterator();
	while(it1.hasNext()){
		Movie mx = (Movie) it1.next();
		if(mx.dName.equals(dname))
		{
			directorCount++;
		}
	}
	System.out.println("No of movies created by "+dname+" are: "+directorCount);
}

public void moviesDuration(int mins)
{
	int moviesCount=0;
	Iterator it1 = al5.iterator();
	while(it1.hasNext()){
		Movie mx = (Movie) it1.next();
		if(mx.duration > mins)
		{
			moviesCount++;
		}
	}
	System.out.println("movies with length greater than "+mins+" minutes are: "+moviesCount);
}

public static void main(String args[]) throws IOException
{
	Ex7 x = new Ex7();
	x.getMovieDetails();
	x.movieNetInc();
	x.movieByYear(2015);
	x.moviesByLanguage("EN");
	x.moviesBy("John");
	x.moviesDuration(90);
	x.moviesRating(4);
	
}

}