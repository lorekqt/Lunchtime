package Classes;

public class Restaurant {
	private String name;
	private Boolean favOfWeek;
	
	@Override
	public String toString(){
		return this.name;
	}
	
	public Restaurant(String name){
		this.name = name;
		this.favOfWeek = false;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Boolean getFavOfWeek(){
		return favOfWeek;
	}
	public void setFavOfWeek(Boolean fav){
		favOfWeek = fav;
	}
}
