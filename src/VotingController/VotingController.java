package VotingController;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import Classes.Restaurant;

public class VotingController {
	Map<String, Integer> voting = new HashMap<String, Integer>() ;
	ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
	Map<String, Integer> vot = new HashMap<String, Integer>();
	
	public VotingController(){
		
		restaurants.add(new Restaurant("Silva"));
		restaurants.add(new Restaurant("Pallatus"));
		restaurants.add(new Restaurant("50"));
		
		
		
		Random randomGenerator = new Random();
		
		for (Restaurant res: restaurants){
			voting.put(res.getName(), new Integer(randomGenerator.nextInt(5)));
			
		}
		vot.putAll(voting);
	}
	public ArrayList<Restaurant> getRestaurants(){
		return this.restaurants;
	}
	public Map<String, Integer> getVoting(){
		return this.voting;
	}
	
	public void incrementVotes(String res){
		try{
			voting.put(res, voting.get(res) + 1);
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public Entry<String, Integer> calculateMaxKey(){
		
		Map.Entry<String, Integer> maxEntry = null;
		
		for (Map.Entry<String, Integer> entry : vot.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		return maxEntry;
	}
	
	public String winner(){
		Map.Entry<String, Integer> maxEntry;
		
		maxEntry = calculateMaxKey();
		
		try{
			for (Restaurant res: restaurants){
				if (res.getName() == maxEntry.getKey()){
					if(!res.getFavOfWeek()){
						res.setFavOfWeek(true);
					}else{
						vot.remove(maxEntry.getKey());
						maxEntry = calculateMaxKey();
					}
				}
			}
		} catch (Exception e){
			return "Out of options";
		}
		
		
		try{
			return maxEntry.getKey();
		} catch(Exception e){
			return "Out of options";
		}
	}
}
