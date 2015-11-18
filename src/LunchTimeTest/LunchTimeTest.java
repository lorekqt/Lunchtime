package LunchTimeTest;
//import LunchTimeApp.*;
import VotingController.VotingController;

//import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;

import org.junit.Test;

import Classes.Restaurant;

public class LunchTimeTest {
	VotingController vc = new VotingController();
	ArrayList<Restaurant> rt = new ArrayList<Restaurant>();
	
	@Before public void initialize(){
		rt.add(new Restaurant("Silva"));
		rt.add(new Restaurant("Pallatus"));
		rt.add(new Restaurant("50"));
	}
	@Test
	public void test() {
//		assertArrayEquals((rt.toArray()), vc.getRestaurants().toArray());
	}

}
