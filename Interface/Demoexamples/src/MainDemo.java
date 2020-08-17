import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MainDemo {
	
	public static void main (String[] args) {
		
		
		ArrayList<Movie> list = new ArrayList<Movie>();
	    list.add(new Movie("Movie A",1987,3.5));
	    list.add(new Movie("Jovie b",1957,1.5));
	    list.add(new Movie("Yovie C",1987,2.5));
	    
	    
	    System.out.println("Pring with iterator");
	    
	     

	    Collections.sort(list);


	    for (Movie movie : list){
	      System.out.println(movie.getMname() + movie.getMyear() + movie.getRating());
	    }
		
	    System.out.println("Comparing Rating");
	    RatingCompare rt = new RatingCompare();
	    Collections.sort(list,rt);
	    for (Movie movie : list) {
	    	System.out.println(movie.getMname() + movie.getMyear() + movie.getRating());
	    }
	    
	    System.out.println("Comparing Name");
	    NameCompare nc = new NameCompare();
	    Collections.sort(list,nc);
	    for (Movie movie : list) {
	    	System.out.println(movie.getMname() + movie.getMyear() + movie.getRating());
	    }
	   
	}
}



class Movie implements Comparable<Movie>{

	  private String mname;
	  private int myear;
	  private double rating ;

	  Movie(String mname , int myear , double rating){
	    this.mname = mname;
	    this.myear = myear;
	    this.rating = rating;

	  }

	  public int compareTo(Movie m){
	        return this.myear - m.myear;
	  }

	    public double getRating(){return rating;}
	    public String getMname(){return mname;}
	    public int getMyear(){return myear;}

	}

class RatingCompare   implements Comparator<Movie>{
	
	public int compare(Movie m1 , Movie m2) {
		if( m1.getRating() > m2.getRating()){
			return -1;
		}
		if( m1.getRating() < m2.getRating()){
			return 1;
		}
		else 
			return 0;		
		
	} 
	 
	
}



class NameCompare   implements Comparator<Movie>{
	
	public int compare(Movie m1 , Movie m2) {
		
		return m1.getMname().compareTo(m2.getMname());
	}
	 
	
}