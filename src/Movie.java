import java.util.Arrays;

public class Movie {
	
	private  Long id;
	private  String name;
	private  String director;
	private String [] actors;
	private String releaseDate;
	private  String explanation;
	private  String type;
	
	
	public Movie(Long id, String name, String director, String[] actors, String releaseDate, String explanation,
			String type) {
		super();
		this.id = id;
		this.name = name;
		this.director = director;
		this.actors = actors;
		this.releaseDate = releaseDate;
		this.explanation = explanation;
		this.type = type;
		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDirector() {
		return director;
	}

	public String[] getActors() {
		return actors;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getExplanation() {
		return explanation;
	}

	public String getType() {
		return type;
	}

	

	
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	@Override
	  public String toString() {
	    return "# " + this.getClass().getName() + " " +
	           "Product{" +
	           "id=" + id +
	           ", name='" + name + '\'' +
	           ", directorName='" + director + '\'' +
	           ", releaseDate='" + releaseDate + '\'' +
	           ", actors= " + Arrays.toString(actors)+
	           ", explanation=" + explanation +
	           ", type=" + type +
	           
	           '}';
	  }
	

}
