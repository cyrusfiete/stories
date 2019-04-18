package WhatToDo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
	
	public static final String CANDLE = "Candle";
	public static final String LADDER = "Ladder";
	public static final String TARP = "Tarp";
	public static final String MATCH = "Match";
	public static final String ASHES = "Ashes";
	public static final String BRANCH = "Branch";
	public static final String MONKEY = "Monkey";
	
	private List<String> inventory = new ArrayList<>();
	
	public Inventory() {
		
		inventory.add(CANDLE);
		
	}

	public void addItem(String newItem) {
		inventory.add(newItem);
	}
	
	public void usedItem(String loseItem) {
		inventory.add(loseItem);
	}
	
	public Boolean hasItem(String hasItem) {
		return inventory.contains(hasItem);
	}
	
	public void displayItems() {
		for(String item : items) {
			if(candleKey == i) {
				System.out.println("(" + candleKey + ") an old, half-used candle.");
			}
			if(ladderKey == i) {
				System.out.println("(" + ladderKey + ") a worn, but functional ladder.");
			}
			if(tarpKey == i) {
				System.out.println("(" + tarpKey + ") a dirty tarp with no tears or holes.");
			}
			if(matchKey == i) {
				System.out.println("(" + matchKey + ") a single, unused match.");
			}
			if(ashesKey == i) {
				System.out.println("(" + ashesKey + ") a pile of odorous ash.");
			}
			if(branchKey == i) {
				System.out.println("(" + branchKey + ") a long, sturdy tree branch.");
			}
			if(monkeyKey == i) {
				System.out.println("(" + monkeyKey + ") a tiny, carcinogen-loving monkey on your left shoulder.");
			}
			}
			if(key) { System.out.println("...a strange key."); }
			if (!candle && !ladder && !tarp && !match && !ashes && !branch && !monkey && !key){ 
				System.out.print("nothing!");
			}
		}
	}

}
