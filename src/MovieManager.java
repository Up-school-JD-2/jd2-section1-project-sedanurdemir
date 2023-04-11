
public class MovieManager {

	public Movie[] allMovies;
	private int movieCount;
	
	private Movie movie=new Movie(1l, "Fight Club" , "David Fincher", new String [] {"Edward Norton", "Brad Pitt", "Helana Bonham Carter"}, "1999", "  ", "Dram/Gerilim");

	private Movie movie2=new Movie(2l, "Leon: The Professional" , "Luc Besson", new String [] {"Jean Reno", "Gary Oldman", "Natalie Portman","Danny Aiello"}, "1994", "  ", "Aksiyon/Dram");

	private Movie movie3=new Movie(3l, "Shutter Island" , "Martin Scorsese", new String [] {"Leonardo DiCaprio", "Mark Ruffalo", "Ben Kingsley"}, "2010", "  ", "Gizem/Gerilim");

	private Movie movie4=new Movie(4l, "Inception" , "Christopher Nolan", new String [] {"Leonardo DiCaprio", "Marion Cotillard", "Cillian Murphy"}, "2010", "  ", "Aksiyon/Bilim Kurgu");


	public MovieManager() {
		allMovies=new Movie[] {movie,movie2,movie3,movie4};
		movieCount=allMovies.length;
		
	}


	public Movie[] getAllMovies() {
		return allMovies;
	}


	public void setAllMovies(Movie[] allMovies) {
		this.allMovies = allMovies;
	}


	public int getMovieCount() {
		return movieCount;
	}


	public void setMovieCount(int movieCount) {
		this.movieCount = movieCount;
	}

	
	public void listMovies() {
		
	    for (Movie movie: allMovies) {
	      System.out.println(movie);
	    }
	  }
	
	public void removeFilm(String movieName) {
		System.out.println(movieCount);
		for(int i=0;i<movieCount;i++) {
			if(allMovies[i].getName().equalsIgnoreCase(movieName)) {
				Movie[] newMovieArray=new Movie[allMovies.length-1];
				System.arraycopy(allMovies, 0, newMovieArray, 0, i);
				System.arraycopy(allMovies, i+1, newMovieArray, i, allMovies.length-i-1);
				movieCount--;
				System.out.println("Film Silindi");
				allMovies=newMovieArray;
				return;
			}}
			{
				System.out.println("Film Bulunamadı");
				
			}
			
		}
		
		
	
	public Movie searchMovieById(Long movieId) {
	   Movie searchedMovie = null;
	    for (Movie movie :allMovies) {
	      if (movie.getId().equals(movieId)) {
	        searchedMovie=movie;
	        break;
	      }
	    }
	    return searchedMovie;
	  }
	

	
	public Movie searchMovieByName(String movieName) {
	   Movie searchedMovie = null;
	    for (Movie movie : allMovies) {
	      if (movie.getName().equalsIgnoreCase(movieName)) {
	       
	        if (movie instanceof Movie) {
	          searchedMovie = movie;
	          break;
	        }
	      }
	    }
	    return searchedMovie;
	  }
	
	public void addMovie(Movie newMovie) {
		
	    reInitializeArray();
       allMovies[movieCount]=newMovie;
       movieCount++;
       newMovie.setId((long) movieCount);
        
    }
	
	public void reInitializeArray() {
		Movie[] newMovieArray = new Movie[allMovies.length + 1];
        
        System.arraycopy(allMovies, 0, newMovieArray, 0, allMovies.length);
        
        allMovies = newMovieArray;
	}
	
}
