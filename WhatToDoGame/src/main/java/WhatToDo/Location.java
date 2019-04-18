package WhatToDo;

public class Location {
	
	boolean waterBlock = false;
	boolean captain = false;
	boolean awake = false;
	
	boolean deepWoods = true;
	boolean moonlitGrove = false;
	boolean shore = false;
	boolean outsideMansion = false;
	boolean eastCliffs = false;
	boolean southCliffs = false;
	boolean hut = false;
	boolean scorchedBeach = false;
	boolean grotto = false;
	boolean mansion = false;
	
	boolean useCandle = false;
	boolean useLadder = false;
	boolean useTarp = false;
	boolean useMatch = false;
	boolean useAshes = false;
	boolean useBranch = false;
	boolean useMonkey = false;
	
	boolean ladderRemains = true;
	boolean tarpRemains = true;
	boolean matchRemains = true;
	boolean ashesRemain = true;
	boolean branchRemains = true;
	boolean monkeyRemains = true;
	boolean keyRemains = true;
	
	boolean candle = true;
	boolean ladder = false;
	boolean tarp = false;
	boolean match = false;
	boolean ashes = false;
	boolean branch = false;
	boolean monkey = false;
	boolean key = false;
	
	public void observe() {
		if(deepWoods == true) {
			System.out.println("The forest is dense in every direction.");
			if(tarpRemains) {
			System.out.println("Some sort of tarp hangs from a branch a ways above you.");
			}
		}
		if(moonlitGrove == true) {
			System.out.println("A large, hollowed out tree stump stands alone where the moonlight is brightest.");
			if(monkeyRemains) {
			System.out.println("Upon closer inspection, a small creature not unlike a monkey has made its home in the trunk.");
			}
		}
		if(shore == true) {
			System.out.println("The coastline curves back South to both the East and West. The sea all around you is quiet and eerie.");
			if(useBranch && useTarp && captain) {
				System.out.println("Your pseudo captain and makeshift boat stand at the ready.");
			}
			else {
				System.out.println("There isn't much around but the old boat.");
			}
		}
		if(outsideMansion == true) {
			System.out.println("The house looks absolutely new, somehow unblemished by the sea or time.");
		}
		if(eastCliffs == true) {
			System.out.println("Cliffs loom over you to the East and the South.");
			System.out.println("The broken tree remnants are various shapes and sizes.");
		}
		if(southCliffs == true) {
			System.out.println("A stone gate in the middle of the stream is open, allowing water to flow freely.");
			System.out.println("There is something like a handle on one of the gate's posts.");
		}
		if(hut == true) {
			if(!captain && !awake) {
					System.out.println("Upon closer inspection, the man is (disappointingly) most definitely asleep.");
					System.out.println("Various assumed belongings are littered around him and in the yurt.");
			}
			else if(!captain && awake) {
				System.out.println("The old man's gaze is intimidating, but you need to speak with him nonetheless.");
				}
			else if(captain) {
				System.out.println("You look upon the recently abandoned home and wonder many things.");
			}
		}
		if(scorchedBeach == true) {
			System.out.println("Nothing of note can be seen among the piles of ash and what once were trees.");
			System.out.println("The smell of campfire mixes pleasantly with the salt of the sea.");
		}
		if(grotto == true) {
			if(!waterBlock) {
				System.out.println("You can vaguely make out the glint of an object deep below the surface.");
			}
			else if(waterBlock) {
				System.out.println("An ornate set of metal scales sit upon a podium on the far side of the cavern.");
				System.out.println("One side is weighed down by a pouch full of powder, and the other side bears a similar (though empty) pouch.");
			}
		}
		if(mansion == true) {
			System.out.println("The mansion is completely abandoned, but as clean as can be.");
			if(ladderRemains) {
				System.out.println("It is nearly devoid of any furniture aside from a glass lamp on a lonely table in the main room,\nas well as a ladder with the storage room all to itself.");

			}
			else if(!ladderRemains) {
				System.out.println("It is nearly devoid of any furniture aside from a glass lamp on a lonely table in the main room.");
			}
		}
	}
	public void action() {
		
		if(deepWoods == true) {
			if(tarpRemains == true) {
				if(useLadder == false) {
				System.out.println("You cannot reach the tarp in the trees and climbing seems unwise.");
				}
				else if(useLadder == true) {
				System.out.println("You pull the tarp down and sling it over your shoulder.");
				System.out.println("The frail ladder crumbles into pieces as you descend.");
					tarpRemains = false;
					tarp = true;
					itemCount++;
					tarpKey = itemCount;
					useLadder = false;
				}
			}
			else if(!tarpRemains) {
				System.out.println("Nothing else this deep in the woods could serve your cause.");
			}
			}
			if(moonlitGrove == true) {
				if(monkeyRemains) {
					if(ashes) {
				System.out.println("You reach out your hand over the solitary tree stump...");
				System.out.println("The small creature inside likes the smell of the ashes you carry and climbs onto your shoulder!");
				monkey = true;
				monkeyRemains = false;
				itemCount++;
				monkeyKey = itemCount;
				Inventory.addItem("Monkey");
					}
					else if(!ashes) {
				System.out.println("You reach out your hand over the solitary tree stump...");
				System.out.println("The small creature inside does not care for your stench and simply frowns.");
					}
				}
				else if(!monkeyRemains) {
				System.out.println("There is nothing left in the hollow tree trunk.");
				}
			}
			if(shore == true) {
				if(useBranch && useTarp && captain) {
					System.out.println("The two of you set sail with no supplies, food, or water,\nbut before you know it you are alone on the boat... and then alone in your own home.\nWhat a weird dream!");
					System.exit(0);
				}
				else if(useBranch && useTarp) {
					System.out.println("The boat has a makeshift mast and sail, but you still don't know what you're doing.");
				}
				else if(useBranch) {
					System.out.println("The boat has a makeshift mast, but isn't quite usuable.");
					System.out.println("...and you have no idea how to sail, besides.");
				}
				else {
					System.out.println("The boat does not appear usable without a mast or a sail.");
					System.out.println("...and you have no idea how to sail, besides.");
				}
			}
			if(outsideMansion == true) {
				if(!key) {
				System.out.println("You try to enter the mansion, but find that it is locked.");
				}
				else if (key) {
				System.out.println("The key you possess fits perfectly into the door's lock.\nYou step into the mansion, dimly lit by what moonlight bleeds through the building's few windows.");
				mansion = true;
				}
			}
			if(eastCliffs == true) {
				if (branchRemains) {
				System.out.println("You scavenge through the broken branches until you find one worthwhile,\ntaking the straight and solid limb with you.");
				branchRemains = false;
				branch = true;
				itemCount++;
				branchKey = itemCount;
				}
				else if (!branchRemains) {
				System.out.println("None of the other branches here look like they could be useful.");
				}
			}
			if(southCliffs == true) {
				if(!waterBlock) {
				System.out.println("You try to turn the handle and close the river's gate,\nbut without some variety of wrench it seems impossible.");
				}
				if(waterBlock) {
				System.out.println("The gate is already closed, and the flow of water staunched.");
				}
			}
			if(hut == true) {
				if(!captain) {
					if(!awake) {
						System.out.println("The elderly man refuses to wake up despite your persistent physical and verbal attempts.");
						if(matchRemains) {
						System.out.println("Among his smattering of things you find a matchbox with a single match.\nYou decide to 'borrow' it for the time being, at least.");
						matchRemains=false;
						match = true;
						itemCount++;
						matchKey = itemCount;
						}
					}
					else if(awake) {
						System.out.println("The old man's eyes are open at last, so you engage in conversation.");
						System.out.println("He tells you of his history as a sea captain, and offers to help you off this island if you can forge a vessel.");
						if(useBranch && useTarp) {
							System.out.println("You reply that you have a half-decent boat made on the North shore,\nand he immediately takes off to inspect said ship.");
							captain = true;
						}
					}
				}
				else { System.out.println("The abandoned hut boasts nothing of interest to you now."); }
			}
			if(scorchedBeach == true) {
				if(ashesRemain) {
				System.out.println("You scoop up a handful of smelly ash from one of the taller mounds.\nMaybe this will serve you in an unexpected way?");
				ashesRemain = false;
				ashes = true;
				itemCount++;
				ashesKey = itemCount;
				}
				else if (!ashesRemain) {
				System.out.println("You highly doubt that you'll need any more ash.");
				}
			}
			if(grotto == true) {
				if(!waterBlock) {
				System.out.println("With the cavern as flooded as it is, there isn't much you can do here.");
				}
				else if(waterBlock) {
				System.out.println("The set of scales cannot be manipulated manually.\nMaybe you need to balance them out with some sort of material.");
				}
			}
			if(mansion == true) {
				if(outsideMansion) {
					outsideMansion = false;
				}
				else if(ladderRemains) {
					System.out.println("You grab the ladder from the storage room and prop it up on your right shoulder.");
					System.out.println("It is heavy, but manageable.");
					ladderRemains = false;
					ladder = true;
					itemCount++;
					ladderKey=itemCount;
				}
				else if(!ladderRemains) {
				if(!useMatch) {
					if(!useCandle) {
						System.out.println("The glass lamp is empty and cannot produce light as it is.");
					}
					else if(useCandle) {
						System.out.println("The lamp bears the candle you provided, but still needs to be lit.");
					}
				}
				else if(useMatch) {
					System.out.println("There isn't anything else you can do with the makeshift lamp\nand the strange shadows it casts.");
				}
				}
			}
	}
	public void north() {
		if(deepWoods == true) {
			System.out.println("You walk North for a while until you arrive at a small clearing well lit by the moon.");
			deepWoods = false;
			moonlitGrove = true;
		}
		else if(moonlitGrove == true) {
				System.out.println("Heading North takes you out of the woods and onto a shore.");
			if(!useBranch) {
				System.out.println("A small boat (in severe disrepair) is beached in front of you.");
			}
			else if(useBranch) {
				System.out.println("A small boat with a makeshift mast is beached in front of you.");
			}
			else if(useTarp) {
				System.out.println("A small boat is beached in front of you.");
			}
			moonlitGrove = false;
			shore = true;
		}
		else if(shore == true) {
			System.out.println("There is nothing to the North but an endless sea.");
		}
		else if(outsideMansion == true) {
			System.out.println("You head North and follow the coastline West to a shore.");
			System.out.println("A small boat (in severe disrepair) is beached in front of you.");
			outsideMansion = false;
			shore = true;
		}
		else if(eastCliffs == true) {
			System.out.println("To the North you find an unbelievably untarnished mansion settled in the sand on a shore.");
			eastCliffs = false;
			outsideMansion = true;
		}
		else if(southCliffs == true) {
			System.out.println("You head North until you're deep in the woods, back where you awoke.");
			southCliffs = false;
			deepWoods = true;
		}
		else if(hut == true) {
			System.out.println("A mess of boulders blocks your way.");
		}
		else if(scorchedBeach == true) {
			System.out.println("You head North and follow the coastline East to a shore.");
			System.out.println("A small boat (in severe disrepair) is beached in front of you.");
			scorchedBeach = false;
			shore = true;
		}
		else if(grotto == true) {
			System.out.println("You cannot leave the grotto to the North; it surrounds you on all sides but East.");
		}
		else if(mansion == true) {
			System.out.println("You leave the abandoned mansion.");
			mansion = false;
			outsideMansion = true;
		}
	}
	
	public void east() {
		if(deepWoods == true) {
			System.out.println("You head East until you stand at the bottom of a tall cliff face, just at the edge of the woods.");
			System.out.println("Broken branches and logs are strewn about, as if the forest and cliffs collided.");
			deepWoods = false;
			eastCliffs = true;
		}
		else if(moonlitGrove == true) {
			System.out.println("To the East you find an unbelievably untarnished mansion settled in the sand on a shore.");
			moonlitGrove = false;
			outsideMansion = true;
		}
		else if(shore == true) {
			System.out.println("You follow the shore as it turns SouthEast until you find\nan unbelievably untarnished mansion settled in the sand on a shore.");
			shore = false;
			outsideMansion = true;
		}
		else if(outsideMansion == true) {
			System.out.println("There is nothing East of the mansion but the endless sea.");
		}
		else if(eastCliffs == true) {
			System.out.println("The cliff face is too tall to scale and stops you from going further East.");
		}
		else if(southCliffs == true) {
			System.out.println("The cliff face is too tall to scale and stops you from going further East.");
		}
		else if(hut == true) {
			System.out.println("Heading back to the East brings you to the cliffs on the Southern shore.");
			if(!waterBlock) {
				System.out.println("Water is bizzarely flowing from the sea up a small river that heads NorthWest.");
			}
			else if(waterBlock) {
				System.out.println("The stone gate stops any ocean water from flowing up the river.");
			}
			hut = false;
			southCliffs = true;
		}
		else if(scorchedBeach == true) {
			System.out.println("You walk East back into the forest until you arrive at a small clearing well lit by the moon.");
			scorchedBeach = false;
			moonlitGrove = true;
		}
		else if(grotto == true) {
			System.out.println("You leave the grotto and head East until you're deep in the woods, back where you awoke.");
			grotto = false;
			deepWoods = true;
		}
		else if(mansion == true) {
			System.out.println("You leave the abandoned mansion.");
			mansion = false;
			outsideMansion = true;
		}
	}
	
	public void south() {
		
		if(deepWoods == true) {
			System.out.println("You walk South out of the forest and find yourself on a shore, at the base of a cliff face to the East.");
			if(!waterBlock) {
				System.out.println("Water is bizzarely flowing from the sea up a small river that heads NorthWest.");
			}
			else if(waterBlock) {
				System.out.println("The stone gate stops any ocean water from flowing up the river.");
			}
			deepWoods = false;
			southCliffs = true;
		}
		else if(moonlitGrove == true) {
			System.out.println("You head South until you're deep in the woods, back where you awoke.");
			moonlitGrove = false;
			deepWoods = true;
		}
		else if(shore == true) {
			System.out.println("You walk South back into the forest until you arrive at a small clearing well lit by the moon.");
			shore = false;
			moonlitGrove = true;
		}
		else if(outsideMansion == true) {
			System.out.println("You head South until you stand at the bottom of a tall cliff face, just at the edge of the woods.");
			System.out.println("Broken branches and logs are strewn about, as if the forest and cliffs collided.");
			outsideMansion = false;
			eastCliffs = true;
		}
		else if(eastCliffs == true) {
			System.out.println("The cliff face is too tall to scale and stops you from going further South.");
		}
		else if(southCliffs == true) {
			System.out.println("There is nothing to the South but an endless sea.");
		}
		else if(hut == true) {
			System.out.println("There is nothing to the South but an endless sea.");
		}
		else if(scorchedBeach == true) {
			System.out.println("A mess of boulders blocks your way.");
		}
		else if(grotto == true) {
			System.out.println("You cannot leave the grotto to the South; it surrounds you on all sides but East.");
		}
		else if(mansion == true) {
			System.out.println("You leave the abandoned mansion.");
			mansion = false;
			outsideMansion = true;
		}
	}
	
	public void west() {
		
		if(deepWoods == true) {
			System.out.println("A ways to the West you enter a grotto at the edge of the woods.");
			if(!waterBlock) {
				System.out.println("A meager creek flows through the opening and floods the lower area of the cavern.");
			}
			if(waterBlock) {
				System.out.println("Water that once filled the lowest level has been apparently drained through a gaping hole in the floor.");
			}
			deepWoods = false;
			grotto = true;
		}
		else if(moonlitGrove == true) {
			System.out.println("To the West you find dozens of scorched, blackened trees,\nas the forest opens up onto an ocean shore.");
			moonlitGrove = false;
			scorchedBeach = true;
		}
		else if(shore == true) {
			System.out.println("You follow the shore as it turns SouthWest until you find\n dozens of scorched, blackened trees at the edge of the woods.");
			shore = false;
			scorchedBeach = true;
		}
		else if(outsideMansion == true) {
			System.out.println("You walk West back into the forest until you arrive at a small clearing well lit by the moon.");
			outsideMansion = false;
			moonlitGrove = true;
		}
		else if(eastCliffs == true) {
			System.out.println("You head West until you're deep in the woods, back where you awoke.");
			eastCliffs = false;
			deepWoods = true;
		}
		else if(southCliffs == true) {
			System.out.println("Following the coast West leads to a yurt at the edge of the sea.");
			if(!awake) {
			System.out.println("An elderly man sits cross-legged at its base, apparently deep in sleep.");
			}
			else if(awake && !captain) {
			System.out.println("A tired looking man stares at you with a disturbing lack of surprise.");
			}
			if(awake && captain) {
			System.out.println("No one is home.");
			}
			southCliffs = false;
			hut = true;
		}
		else if(hut == true) {
			System.out.println("There is nothing to the West but an endless sea.");
		}
		else if(scorchedBeach == true) {
			System.out.println("There is nothing to the West but an endless sea.");
		}
		else if(grotto == true) {
			System.out.println("You cannot leave the grotto to the West; it surrounds you on all sides but East.");
		}
		else if(mansion == true) {
			System.out.println("You leave the abandoned mansion.");
			mansion = false;
			outsideMansion = true;
		}	
	}

}
