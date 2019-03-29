package Aladdin;
import java.util.Scanner;

public class Story {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		boolean proceed = true;
		boolean chapterOne = false;
		boolean chapterTwo = false;
		boolean chapterThree = false;
		boolean chapterFour = false;
		boolean wealthy = false;
		boolean lamp = true;
		int skepticism = 0;
		int skepOne = 0;
		int skepTwo = 0;
		int skepThree = 0;
		int mysticism = 0;
		int mystOne = 0;
		int mystTwo = 0;
		int mystThree = 0;
		int responsibility = 0;
		int respOne = 0;
		int respTwo = 0;
		int respThree = 0;
		String input = "";

		while (proceed && !chapterOne) {
		System.out.println("Your name is Aladdin, and you live in Medievil China."
				+ "\nYour parents are concerned you are too lazy; but are you?"
				+"\n(y)es or (n)o?");
				input = keys.nextLine();
		if(input.equals("y")) {
			System.out.println("...but, like, how lazy?\n(v)ery.");
			input = keys.nextLine();
			if(input.equals("v")) {
				System.out.println("Your father dies of emotional exhaustion and frustration.\n"
						+ "You head into town.\n(l)ook for a job to help your mother or (f)ind your friends?");
						input = keys.nextLine();
						
						if(input.equals("l")) {
							System.out.println("A famous magician from Africa has arrived in town and a large crowd blocks your way.\n"
									+"Try to meet him?\n(s)ure or (g)o find your friends?");
							responsibility ++;
							input = keys.nextLine();
									if(input.equals("s")) {
										System.out.println("The magician recognizes you and puts his hand on your shoulder.\n"
												+ "He tells you he is the brother of your late father and would like to visit your home. Take him there?\n"
												+ "(y)es or (n)o?");
										mysticism ++;
										String input2 = keys.nextLine();
										if(input2.equals("y")) {
											chapterOne = true;
											skepOne = skepticism;
											mystOne = mysticism;
											respOne = responsibility;
										}
										if(input2.equals("n")) {
											System.out.println("The magician sighs, but returns home,\nand nothing else extraordinary occurs.");
											proceed = false;
										}
									}
									if(input.equals("g")) {
										System.out.println("While telling your friends about your father's passing, the magician comes and finds you.\n"
												+ "He tells you he is the brother of your late father and would like to visit your home. Take him there?\n"
												+ "(y)es or (n)o?");
										skepticism ++;
										String input2 = keys.nextLine();
										if(input2.equals("y")) {
											chapterOne = true;
											skepOne = skepticism;
											mystOne = mysticism;
											respOne = responsibility;
										}
										if(input2.equals("n")) {
											System.out.println("The magician sighs, but returns home,\nand nothing else extraordinary occurs.");
											proceed = false;
										}
									}
 						}
						if(input.equals("f")) {
							System.out.println("While telling your friends about your father's passing, a visiting magician from Africa finds you.\n"
									+ "He tells you he is the brother of your late father and would like to visit your home. Take him there?\n"
									+ "(y)es or (n)o?");
										String input2 = keys.nextLine();
							if(input2.equals("y")) {
								chapterOne = true;
								skepOne = skepticism;
								mystOne = mysticism;
								respOne = responsibility;
							}
							if(input2.equals("n")) {
								System.out.println("The magician pressures, and you relent.");
								responsibility ++;
								chapterOne = true;
								skepOne = skepticism;
								mystOne = mysticism;
								respOne = responsibility;
							}
						}
			}
		}
		if(input.equals("n")) {
			System.out.println("Your family barely manages to scrape by,"
						+ "\nand nothing extraordinary occurs.");
					proceed = false;
		}
		
		if(!proceed && !chapterOne) {
			System.out.println("Your tale is over. Try again?\n(y)es or (n)o?");
			input = keys.nextLine();
			if(input.equals("y")) {
				proceed = true;
			}
			else { 
				System.out.println("Farewell.");
				break; 
				}
		}
		
		while(chapterOne && !chapterTwo) {
			input = "";
			System.out.println("Back at your home, you introduce your mother to the magician.\nShe has heard of him, but they have never met."
					+ "\nAre you suspicious?\n(a)bsolutely. (s)omewhat. (n)ah.");
			String suspicion = keys.nextLine();
			if (suspicion.equals("a")) {
				System.out.println("While difficult to believe, the magician does offer to take you on as an apprentice merchant."
						+ "\nMerchants are like celebrities in this time; do you decide to leave your lazy ways behind and accept?"
						+ "\n(s)ign me up! or (t)oo much work.");
				skepticism += 2;
				input = keys.nextLine();
				if(input.equals("s")) {
					responsibility ++;
					System.out.println("After a few days of learning the basics, the magician offers to introduce you to an important client outside of town.\n"
							+ "(l)et's go now! (m)aybe tomorrow? (n)o thanks.");
					input = keys.nextLine();
					if(input.equals("l")) {
						responsibility ++;
						System.out.println("You walk for many hours and the sun has long set.\n"
								+"Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
								+"(u)h oh, magic. (o)oo, magic.");
						input = keys.nextLine();
						if(input.equals("u")) {
							skepticism ++;
							System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
									+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
						if(input.equals("o")) {
							mysticism += 2;
							System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
									+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
					}
					if(input.equals("m")) {
						responsibility ++;
						skepticism ++;
						System.out.println("The magician agrees, and the next morning you walk for many hours.\n"
								+"Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
								+"(u)h oh, magic. (o)oo, magic.");
						input = keys.nextLine();
						if(input.equals("u")) {
							skepticism ++;
							System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
									+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
						if(input.equals("o")) {
							mysticism += 2;
							System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
									+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
					}
					if(input.equals("n")) {
						skepticism ++;
						if (skepticism >= 3) {
							System.out.println("The magician is fed up with you and returns home.\nNothing else extraordinary occurs.");
							proceed = false;
						}
						if (skepticism < 3) {
							if(mysticism >= 1) {
								System.out.println("You are assured it will be worth your while and decide to go after all.\n"
										+ "You walk for many hours and the sun has long set.\n"
										+ "Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
										+ "(u)h oh, magic. (o)oo, magic.\");\n"); 
										input = keys.nextLine();
										if(input.equals("u")) {
											skepticism ++;
											System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
													+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
											chapterTwo = true;
											skepTwo = skepticism;
											mystTwo = mysticism;
											respTwo = responsibility;
										}
										if(input.equals("o")) {
											mysticism += 2;
											System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
													+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
											chapterTwo = true;
											skepTwo = skepticism;
											mystTwo = mysticism;
											respTwo = responsibility;
										}
							}
							System.out.println("The magician is fed up with you and returns home.\nNothing else extraordinary occurs.");
							proceed = false;
						}
					}
				}
				if(input.equals("t")) {
					System.out.println("Your mother agrees it is unwise and the magician sighs, but leaves."
							+" Nothing else extraordinary occurs.");
					proceed = false;
				}
			}
			if (suspicion.equals("s")) {
				System.out.println("While a little difficult to believe, the magician does offer to take you on as an apprentice merchant."
						+ "\nMerchants are like celebrities in this time; do you decide to leave your lazy ways behind and accept?"
						+ "\n(s)ign me up! or (t)oo much work.");
				skepticism ++;
				input = keys.nextLine();
				if(input.equals("s")) {
					responsibility ++;
					System.out.println("After a few days of learning the basics, the magician offers to introduce you to an important client outside of town.\n"
							+ "(l)et's go now! (m)aybe tomorrow? (n)o thanks.");
					input = keys.nextLine();
					if(input.equals("l")) {
						responsibility ++;
						System.out.println("You walk for many hours and the sun has long set.\n"
								+"Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
								+"(u)h oh, magic. (o)oo, magic.");
						input = keys.nextLine();
						if(input.equals("u")) {
							skepticism ++;
							System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
									+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
						if(input.equals("o")) {
							mysticism += 2;
							System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
									+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
					}
					if(input.equals("m")) {
						responsibility ++;
						skepticism ++;
						System.out.println("The magician agrees, and the next morning you walk for many hours.\n"
								+"Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
								+"(u)h oh, magic. (o)oo, magic.");
						input = keys.nextLine();
						if(input.equals("u")) {
							skepticism ++;
							System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
									+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
						if(input.equals("o")) {
							mysticism += 2;
							System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
									+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
					}
					if(input.equals("n")) {
						skepticism ++;
						if (skepticism >= 3) {
							System.out.println("The magician is fed up with you and returns home.\nNothing else extraordinary occurs.");
							proceed = false;
						}
						if (skepticism < 3) {
							if(mysticism >= 1) {
								System.out.println("You are assured it will be worth your while and decide to go after all.\n"
										+ "You walk for many hours and the sun has long set.\n"
										+ "Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
										+ "(u)h oh, magic. (o)oo, magic."); 
										input = keys.nextLine();
										if(input.equals("u")) {
											skepticism ++;
											System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
													+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
											chapterTwo = true;
											skepTwo = skepticism;
											mystTwo = mysticism;
											respTwo = responsibility;
										}
										if(input.equals("o")) {
											mysticism += 2;
											System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
													+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
											chapterTwo = true;
											skepTwo = skepticism;
											mystTwo = mysticism;
											respTwo = responsibility;
										}
							}
							System.out.println("The magician is fed up with you and returns home.\nNothing else extraordinary occurs.");
							proceed = false;
						}
					}
				}
				if(input.equals("t")) {
					if(skepticism>=2) {
						System.out.println("Your mother agrees it is unwise and the magician sighs, but leaves."
								+" Nothing else extraordinary occurs.");
						proceed = false;
					}
					else {
						System.out.println("Your mother pleads with you to reconsider... and you agree.");
						System.out.println("After a few days of learning the basics, the magician offers to introduce you to an important client outside of town.\n"
								+ "(l)et's go now! (m)aybe tomorrow? (n)o thanks.");
						input = keys.nextLine();
						if(input.equals("l")) {
							responsibility ++;
							System.out.println("You walk for many hours and the sun has long set.\n"
									+"Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
									+"(u)h oh, magic. (o)oo, magic.");
							input = keys.nextLine();
							if(input.equals("u")) {
								skepticism ++;
								System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
										+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
								chapterTwo = true;
								skepTwo = skepticism;
								mystTwo = mysticism;
								respTwo = responsibility;
							}
							if(input.equals("o")) {
								mysticism += 2;
								System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
										+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
								chapterTwo = true;
								skepTwo = skepticism;
								mystTwo = mysticism;
								respTwo = responsibility;
							}
						}
						if(input.equals("m")) {
							responsibility ++;
							skepticism ++;
							System.out.println("The magician agrees, and the next morning you walk for many hours.\n"
									+"Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
									+"(u)h oh, magic. (o)oo, magic.");
							input = keys.nextLine();
							if(input.equals("u")) {
								skepticism ++;
								System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
										+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
								chapterTwo = true;
								skepTwo = skepticism;
								mystTwo = mysticism;
								respTwo = responsibility;
							}
							if(input.equals("o")) {
								mysticism += 2;
								System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
										+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
								chapterTwo = true;
								skepTwo = skepticism;
								mystTwo = mysticism;
								respTwo = responsibility;
							}
						}
						if(input.equals("n")) {
							skepticism ++;
							if (skepticism >= 3) {
								System.out.println("The magician is fed up with you and returns home.\nNothing else extraordinary occurs.");
								proceed = false;
							}
							if (skepticism < 3) {
								if(mysticism >= 1) {
									System.out.println("You are assured it will be worth your while and decide to go after all.\n"
											+ "You walk for many hours and the sun has long set.\n"
											+ "Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
											+ "(u)h oh, magic. (o)oo, magic."); 
											input = keys.nextLine();
											if(input.equals("u")) {
												skepticism ++;
												System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
														+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
												chapterTwo = true;
												skepTwo = skepticism;
												mystTwo = mysticism;
												respTwo = responsibility;
											}
											if(input.equals("o")) {
												mysticism += 2;
												System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
														+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
												chapterTwo = true;
												skepTwo = skepticism;
												mystTwo = mysticism;
												respTwo = responsibility;
											}
								}
								System.out.println("The magician is fed up with you and returns home.\nNothing else extraordinary occurs.");
								proceed = false;
							}
						}
					}
				}
			}
			if (suspicion.equals("n")) {
				System.out.println("The magician offers to take you on as an apprentice merchant."
						+ "\nMerchants are like celebrities in this time; do you decide to leave your lazy ways behind and accept?"
						+ "\n(s)ign me up! or (t)oo much work.");
				input = keys.nextLine();
				if(input.equals("s")) {
					responsibility ++;
					System.out.println("After a few days of learning the basics, the magician offers to introduce you to an important client outside of town.\n"
							+ "(l)et's go now! (m)aybe tomorrow? (n)o thanks.");
					input = keys.nextLine();
					if(input.equals("l")) {
						responsibility ++;
						System.out.println("You walk for many hours and the sun has long set.\n"
								+"Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
								+"(u)h oh, magic. (o)oo, magic.");
						input = keys.nextLine();
						if(input.equals("u")) {
							skepticism ++;
							System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
									+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
						if(input.equals("o")) {
							mysticism += 2;
							System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
									+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
					}
					if(input.equals("m")) {
						responsibility ++;
						skepticism ++;
						System.out.println("The magician agrees, and the next morning you walk for many hours.\n"
								+"Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
								+"(u)h oh, magic. (o)oo, magic.");
						input = keys.nextLine();
						if(input.equals("u")) {
							skepticism ++;
							System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
									+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
						if(input.equals("o")) {
							mysticism += 2;
							System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
									+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
					}
					if(input.equals("n")) {
						skepticism ++;
						if (skepticism >= 3) {
							System.out.println("The magician is fed up with you and returns home.\nNothing else extraordinary occurs.");
							proceed = false;
						}
						if (skepticism < 3) {
							if(mysticism >= 1) {
								System.out.println("You are assured it will be worth your while and decide to go after all.\n"
										+ "You walk for many hours and the sun has long set.\n"
										+ "Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
										+ "(u)h oh, magic. (o)oo, magic."); 
										input = keys.nextLine();
										if(input.equals("u")) {
											skepticism ++;
											System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
													+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
											chapterTwo = true;
											skepTwo = skepticism;
											mystTwo = mysticism;
											respTwo = responsibility;
										}
										if(input.equals("o")) {
											mysticism += 2;
											System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
													+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
											chapterTwo = true;
											skepTwo = skepticism;
											mystTwo = mysticism;
											respTwo = responsibility;
										}
							}
							System.out.println("The magician is fed up with you and returns home.\nNothing else extraordinary occurs.");
							proceed = false;
						}
					}
				}
				if(input.equals("t")) {
					System.out.println("Your mother pleads with you to reconsider... and you agree.");
					System.out.println("After a few days of learning the basics, the magician offers to introduce you to an important client outside of town.\n"
							+ "(l)et's go now! (m)aybe tomorrow? (n)o thanks.");
					input = keys.nextLine();
					if(input.equals("l")) {
						responsibility ++;
						System.out.println("You walk for many hours and the sun has long set.\n"
								+"Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
								+"(u)h oh, magic. (o)oo, magic.");
						input = keys.nextLine();
						if(input.equals("u")) {
							skepticism ++;
							System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
									+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
						if(input.equals("o")) {
							mysticism += 2;
							System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
									+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
					}
					if(input.equals("m")) {
						responsibility ++;
						skepticism ++;
						System.out.println("The magician agrees, and the next morning you walk for many hours.\n"
								+"Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
								+"(u)h oh, magic. (o)oo, magic.");
						input = keys.nextLine();
						if(input.equals("u")) {
							skepticism ++;
							System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
									+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
						if(input.equals("o")) {
							mysticism += 2;
							System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
									+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
							chapterTwo = true;
							skepTwo = skepticism;
							mystTwo = mysticism;
							respTwo = responsibility;
						}
					}
					if(input.equals("n")) {
						skepticism ++;
						if (skepticism >= 3) {
							System.out.println("The magician is fed up with you and returns home.\nNothing else extraordinary occurs.");
							proceed = false;
						}
						if (skepticism < 3) {
							if(mysticism >= 1) {
								System.out.println("You are assured it will be worth your while and decide to go after all.\n"
										+ "You walk for many hours and the sun has long set.\n"
										+ "Finally, you arrive at a large stone slab in the ground and the magician begins to murmur over it.\n"
										+ "(u)h oh, magic. (o)oo, magic.\");\n"); 
										input = keys.nextLine();
										if(input.equals("u")) {
											skepticism ++;
											System.out.println("You try to slowly back away, but the magician rushes over and grabs you by the wrist.\n"
													+ "He forces your hand onto the stone and it somehow moves away, revealing a dark passage beneath.");
											chapterTwo = true;
											skepTwo = skepticism;
											mystTwo = mysticism;
											respTwo = responsibility;
										}
										if(input.equals("o")) {
											mysticism += 2;
											System.out.println("You observe the spell with keen interest and touch the now enchanted stone.\n"
													+ "The magician smiles as the slab somehow slides away, revealing a dark passage beneath.");
											chapterTwo = true;
											skepTwo = skepticism;
											mystTwo = mysticism;
											respTwo = responsibility;
										}
							}
							System.out.println("The magician is fed up with you and returns home.\nNothing else extraordinary occurs.");
							proceed = false;
						}
					}
				}
			}
			
		if(!proceed && chapterOne && !chapterTwo) {
			System.out.println("Your tale is over. Try again?\n(y)es or (n)o?");
			String inputContinue = keys.nextLine();
			if(inputContinue.equals("y")) {
				System.out.println("Continue from a recent point?\n(p)lease! or (r)estart from the beginning?");
				inputContinue = keys.nextLine();
				if(inputContinue.equals("p")) {
					proceed = true;
					chapterOne = true;
					skepticism = skepOne;
					mysticism = mystOne;
					responsibility = respOne;
				}
				else if (inputContinue.equals("r")) {
					proceed = true;
					chapterOne = false;
					skepticism = 0;
					skepOne = 0;
					mysticism = 0;
					mystOne = 0;
					responsibility = 0;
					respOne = 0;
				}
			}
			else { 
			System.out.println("Farewell.");
			break; 
				}
			}
		}
	
	while(chapterTwo && !chapterThree) {
		input = "";
		String input2 = "";
		System.out.println("You stand over the cave entrance.\n(j)ump into the darkness or (a)sk the magician what is going on?");
		input = keys.nextLine();
		if (input.equals("j")) {
			if(responsibility >= 2) {
				System.out.println("You jump down, but the magician shouts at you to wait!\n'I want you to bring me back a very old lamp,' he says."
						+" 'Do not touch anything else or you will not return.'\n"
						+"He throws you down a magic ring that might come in handy and you slide it on your finger."
						+ "\n(i)nquire about the ring or (g)et going?");
				input = keys.nextLine();
				if(input.equals("i")) {
					skepticism ++;
					System.out.println("You ask about the ring, but the magician has disappeared from view."
							+ "\nAs you travel through each room of the cave, you notice\ncountless, flawless gemstones shaped like fruit piled high."
							+"\n(t)ake as many as you can carry or (h)eed the magician's warning and leave them alone?");
					input2 = keys.nextLine();
					if(input2.equals("t")) {
						skepticism++;
						wealthy = true;
						System.out.println("You stuff your pockets and your bag as full as possible and seem to be unharmed.\n"
								+ "The lamp is there as well; you grab it and return to the entrance.\n"
								+ "The magician looks down at you and asks for the lamp.\n"
								+ "(g)ive him the lamp! (a)sk him to help you up first! (o)ffer him the gems instead.");
						input2 = keys.nextLine();
						if(input2.equals("g")) {
							mysticism++;
							System.out.println("The magician takes the lamp and blasts the stone back over the cave entrance.");
							if(mysticism>=5) {
								lamp = false;
								chapterThree = true;
								skepThree = skepticism;
								mystThree = mysticism;
								respThree = responsibility;
							}
							if(mysticism<5) {
								proceed = false;
							}
						}
						if(input2.equals("a")) {
							skepticism++;
							System.out.println("The magician and you argue back and forth for a while.\n"
									+"Eventually his frustration takes over and he blasts the stone back over the cave entrance.\n"
									+"Realising what he's done, he sighs and begins his long journey home.");
							chapterThree = true;
							skepThree = skepticism;
							mystThree = mysticism;
							respThree = responsibility;
						}
						if(input2.equals("o")) {
							responsibility++;
							System.out.println("The magician only wants the lamp, and the two of you argue back and forth for a while.\n"
									+"Eventually his frustration takes over and he blasts the stone back over the cave entrance.\n"
									+"Realising what he's done, he sighs and begins his long journey home.");
							chapterThree = true;
							skepThree = skepticism;
							mystThree = mysticism;
							respThree = responsibility;
						}
					}
					if (input2.equals("h")) {
						responsibility++;
						mysticism++;
						System.out.println("You ignore the gemstones, but eventually find the lamp!\n"
								+ "It looks to be worth nothing, but you pocket it and return to the entrance.\n"
								+ "The magician looks down at you and asks for the lamp.\n"
								+ "(g)ive him the lamp! (a)sk him to help you up first!");
						input2 = keys.nextLine();
						if(input2.equals("g")) {
							mysticism++;
							System.out.println("The magician takes the lamp and blasts the stone back over the cave entrance.");
							if(mysticism>=5) {
								lamp = false;
								chapterThree = true;
								skepThree = skepticism;
								mystThree = mysticism;
								respThree = responsibility;
							}
							if(mysticism<5) {
								proceed = false;
							}
						}
						if(input2.equals("a")) {
							skepticism++;
							System.out.println("The magician and you argue back and forth for a while.\n"
									+"Eventually his frustration takes over and he blasts the stone back over the cave entrance.\n"
									+"Realising what he's done, he sighs and begins his long journey home.");
							chapterThree = true;
							skepThree = skepticism;
							mystThree = mysticism;
							respThree = responsibility;
						}
					}
				}
				if(input.equals("g")) {
					mysticism ++;
					System.out.println("As you travel through each room of the cave, you notice\ncountless, flawless gemstones shaped like fruit piled high."
							+"\n(t)ake as many as you can carry or (h)eed the magician's warning and leave them alone?");
					input2 = keys.nextLine();
					if(input2.equals("t")) {
						skepticism++;
						wealthy = true;
						System.out.println("You stuff your pockets and your bag as full as possible and seem to be unharmed.\n"
								+ "The lamp is there as well; you grab it and return to the entrance.\n"
								+ "The magician looks down at you and asks for the lamp.\n"
								+ "(g)ive him the lamp! (a)sk him to help you up first! (o)ffer him the gems instead.");
						input2 = keys.nextLine();
						if(input2.equals("g")) {
							mysticism++;
							System.out.println("The magician takes the lamp, blasts the stone back over the cave entrance, and vanishes");
							if(mysticism>=5) {
								lamp = false;
								chapterThree = true;
								skepThree = skepticism;
								mystThree = mysticism;
								respThree = responsibility;
							}
							if(mysticism<5) {
								proceed = false;
							}
						}
						if(input2.equals("a")) {
							skepticism++;
							System.out.println("The magician and you argue back and forth for a while.\n"
									+"Eventually his frustration takes over and he blasts the stone back over the cave entrance.\n"
									+"Realising what he's done, he sighs and begins his long journey home.");
							chapterThree = true;
							skepThree = skepticism;
							mystThree = mysticism;
							respThree = responsibility;
						}
						if(input2.equals("o")) {
							responsibility++;
							System.out.println("The magician only wants the lamp, and the two of you argue back and forth for a while.\n"
									+"Eventually his frustration takes over and he blasts the stone back over the cave entrance.\n"
									+"Realising what he's done, he sighs and begins his long journey home.");
							chapterThree = true;
							skepThree = skepticism;
							mystThree = mysticism;
							respThree = responsibility;
						}
					}
					if (input2.equals("h")) {
						responsibility++;
						mysticism++;
						System.out.println("You ignore the gemstones, but eventually find the lamp!\n"
								+ "It looks to be worth nothing, but you pocket it and return to the entrance.\n"
								+ "The magician looks down at you and asks for the lamp.\n"
								+ "(g)ive him the lamp! (a)sk him to help you up first!");
						input2 = keys.nextLine();
						if(input2.equals("g")) {
							mysticism++;
							System.out.println("The magician takes the lamp and blasts the stone back over the cave entrance.");
							if(mysticism>=5) {
								lamp = false;
								chapterThree = true;
								skepThree = skepticism;
								mystThree = mysticism;
								respThree = responsibility;
							}
							if(mysticism<5) {
								proceed = false;
							}
						}
						if(input2.equals("a")) {
							skepticism++;
							System.out.println("The magician and you argue back and forth for a while.\n"
									+"Eventually his frustration takes over and he blasts the stone back over the cave entrance.\n"
									+"Realising what he's done, he sighs and begins his long journey home.");
							chapterThree = true;
							skepThree = skepticism;
							mystThree = mysticism;
							respThree = responsibility;
						}
					}
				}
			}
			if (responsibility < 2) {
				System.out.println("You get lost in the cave and perish among its treasures.");
				proceed = false;
			}
		}
		if (input.equals("a")) {
			responsibility ++;
			System.out.println("'I want you to bring me back a very old lamp,' he says."
					+" 'Do not touch anything else or you will not return.'\n"
					+"He throws you down a magic ring that might come in handy and you slide it on your finger."
					+ "\n(i)nquire about the ring or (g)et going?");
			input = keys.nextLine();
			if(input.equals("i")) {
				skepticism ++;
				System.out.println("You ask about the ring, but the magician has disappeared from view."
						+ "\nAs you travel through each room of the cave, you notice\ncountless, flawless gemstones shaped like fruit piled high."
						+"\n(t)ake as many as you can carry or (h)eed the magician's warning and leave them alone?");
				input2 = keys.nextLine();
				if(input2.equals("t")) {
					skepticism++;
					wealthy = true;
					System.out.println("You stuff your pockets and your bag as full as possible and seem to be unharmed.\n"
							+ "The lamp is there as well; you grab it and return to the entrance.\n"
							+ "The magician looks down at you and asks for the lamp.\n"
							+ "(g)ive him the lamp! (a)sk him to help you up first! (o)ffer him the gems instead.");
					input2 = keys.nextLine();
					if(input2.equals("g")) {
						mysticism++;
						System.out.println("The magician takes the lamp, blasts the stone back over the cave entrance, and vanishes");
						if(mysticism>=5) {
							lamp = false;
							chapterThree = true;
							skepThree = skepticism;
							mystThree = mysticism;
							respThree = responsibility;
						}
						if(mysticism<5) {
							proceed = false;
						}
					}
					if(input2.equals("a")) {
						skepticism++;
						System.out.println("The magician and you argue back and forth for a while.\n"
								+"Eventually his frustration takes over and he blasts the stone back over the cave entrance.\n"
								+"Realising what he's done, he sighs and begins his long journey home.");
						chapterThree = true;
						skepThree = skepticism;
						mystThree = mysticism;
						respThree = responsibility;
					}
					if(input2.equals("o")) {
						responsibility++;
						System.out.println("The magician only wants the lamp, and the two of you argue back and forth for a while.\n"
								+"Eventually his frustration takes over and he blasts the stone back over the cave entrance.\n"
								+"Realising what he's done, he sighs and begins his long journey home.");
						chapterThree = true;
						skepThree = skepticism;
						mystThree = mysticism;
						respThree = responsibility;
					}
				}
				if (input2.equals("h")) {
					responsibility++;
					mysticism++;
					System.out.println("You ignore the gemstones, but eventually find the lamp!\n"
							+ "It looks to be worth nothing, but you pocket it and return to the entrance.\n"
							+ "The magician looks down at you and asks for the lamp.\n"
							+ "(g)ive him the lamp! (a)sk him to help you up first!");
					input2 = keys.nextLine();
					if(input2.equals("g")) {
						mysticism++;
						System.out.println("The magician takes the lamp and blasts the stone back over the cave entrance.");
						if(mysticism>=5) {
							lamp = false;
							chapterThree = true;
							skepThree = skepticism;
							mystThree = mysticism;
							respThree = responsibility;
						}
						if(mysticism<5) {
							proceed = false;
						}
					}
					if(input2.equals("a")) {
						skepticism++;
						System.out.println("The magician and you argue back and forth for a while.\n"
								+"Eventually his frustration takes over and he blasts the stone back over the cave entrance.\n"
								+"Realising what he's done, he sighs and begins his long journey home.");
						chapterThree = true;
						skepThree = skepticism;
						mystThree = mysticism;
						respThree = responsibility;
					}
				}
			}
			if(input.equals("g")) {
				mysticism ++;
				System.out.println("As you travel through each room of the cave, you notice\ncountless, flawless gemstones shaped like fruit piled high."
						+"\n(t)ake as many as you can carry or (h)eed the magician's warning and leave them alone?");
				input2 = keys.nextLine();
				if(input2.equals("t")) {
					skepticism++;
					wealthy = true;
					System.out.println("You stuff your pockets and your bag as full as possible and seem to be unharmed.\n"
							+ "The lamp is there as well; you grab it and return to the entrance.\n"
							+ "The magician looks down at you and asks for the lamp.\n"
							+ "(g)ive him the lamp! (a)sk him to help you up first! (o)ffer him the gems instead.");
					input2 = keys.nextLine();
					if(input2.equals("g")) {
						mysticism++;
						System.out.println("The magician takes the lamp, blasts the stone back over the cave entrance, and vanishes");
						if(mysticism>=5) {
							lamp = false;
							chapterThree = true;
							skepThree = skepticism;
							mystThree = mysticism;
							respThree = responsibility;
						}
						if(mysticism<5) {
							proceed = false;
						}
					}
					if(input2.equals("a")) {
						skepticism++;
						System.out.println("The magician and you argue back and forth for a while.\n"
								+"Eventually his frustration takes over and he blasts the stone back over the cave entrance.\n"
								+"Realising what he's done, he sighs and begins his long journey home.");
						chapterThree = true;
						skepThree = skepticism;
						mystThree = mysticism;
						respThree = responsibility;
					}
					if(input2.equals("o")) {
						responsibility++;
						System.out.println("The magician only wants the lamp, and the two of you argue back and forth for a while.\n"
								+"Eventually his frustration takes over and he blasts the stone back over the cave entrance.\n"
								+"Realising what he's done, he sighs and begins his long journey home.");
						chapterThree = true;
						skepThree = skepticism;
						mystThree = mysticism;
						respThree = responsibility;
					}
				}
				if (input2.equals("h")) {
					responsibility++;
					mysticism++;
					System.out.println("You ignore the gemstones, but eventually find the lamp!\n"
							+ "It looks to be worth nothing, but you pocket it and return to the entrance.\n"
							+ "The magician looks down at you and asks for the lamp.\n"
							+ "(g)ive him the lamp! (a)sk him to help you up first!");
					input2 = keys.nextLine();
					if(input2.equals("g")) {
						mysticism++;
						System.out.println("The magician takes the lamp and blasts the stone back over the cave entrance.");
						if(mysticism>=5) {
							lamp = false;
							chapterThree = true;
							skepThree = skepticism;
							mystThree = mysticism;
							respThree = responsibility;
						}
						if(mysticism<5) {
							proceed = false;
						}
					}
					if(input2.equals("a")) {
						skepticism++;
						System.out.println("The magician and you argue back and forth for a while.\n"
								+"Eventually his frustration takes over and he blasts the stone back over the cave entrance.\n"
								+"Realising what he's done, he sighs and begins his long journey home.");
						chapterThree = true;
						skepThree = skepticism;
						mystThree = mysticism;
						respThree = responsibility;
					}
				}
			}
		}
		
		if(!proceed) {
			System.out.println("Your tale is over. Try again?\n(y)es or (n)o?");
			String inputContinue = keys.nextLine();
			if(inputContinue.equals("y")) {
				System.out.println("Continue from a recent point?\n(p)lease! or (r)estart from the beginning?");
				inputContinue = keys.nextLine();
				if(inputContinue.equals("p")) {
					proceed = true;
					chapterOne = true;
					chapterTwo = true;
					skepticism = skepTwo;
					mysticism = mystTwo;
					responsibility = respTwo;
				}
				else if (inputContinue.equals("r")) {
					proceed = true;
					chapterOne = false;
					chapterTwo = false;
					skepticism = 0;
					mysticism = 0;
					responsibility = 0;
				}
			}
			else { 
			System.out.println("Farewell.");
			break; 
				}
			}
	}
	
	
	while(chapterThree && !chapterFour) {
		
		input = "";
		System.out.println("You appear trapped in the cave.\n(c)ry for help or (e)xamine your belongings?");
		input = keys.nextLine();
		if(input.equals("c")) {
			responsibility++;
			System.out.println("You cry out for help... but no one can hear you.\nEventually, you give up and take stock of your things.");
			input = "e";
		}
		if(input.equals("e")) {
			if (lamp == true) {
				System.out.println("You have the rusty old lamp, the ring the magician gave you, and the clothes on your back.");
			}
			else if (lamp == false) {
				System.out.println("You have the ring the magician gave you and the clothes on your back.");
			}
			if(wealthy == true) {
				System.out.println("...plus a lot of gemstones.");
				}
			else if(wealthy == false) {
				System.out.println("...that is all.");
			}
			if (lamp == true) {
			System.out.println("use the (l)amp? use the (r)ing?");
			}
			else if (lamp == false ) {
				System.out.println("use the (r)ing?");
			}
			String item = keys.nextLine();
			if(item.equals("l")) {
				if(mysticism>=6) {
					System.out.println("You study the lamp for a while and eventually it starts to glow."
							+"\nA djinni emerges, made of fire and smoke, and accepts you as its master.");
				}
				else {
					System.out.println("The lamp appears as useless as ever, so you take a look at the ring.");
					item = "r";
				}
			}
			if(item.equals("r")) {
				if(mysticism>=3) {
					System.out.println("You study the ring for a while and eventually it starts to glow."
							+"\nA djinni emerges, made of fire and smoke, and accepts you as its master.");
				}
				else {
					System.out.println("The ring does not react, even after hours, and you wonder if\nyou should have been more receptive towards the mystic arts.");
					System.out.println("Days pass... and the cave becomes your tomb.");
					proceed = false;
				}
			}
		}
		
		if(!proceed) {
			System.out.println("Your tale is over. Try again?\n(y)es or (n)o?");
			String inputContinue3 = keys.nextLine();
			if(inputContinue3.equals("y")) {
				System.out.println("Continue from a recent point?\n(p)lease! or (r)estart from the beginning?");
				inputContinue3 = keys.nextLine();
				if(inputContinue3.equals("p")) {
					proceed = true;
					chapterOne = true;
					chapterTwo = true;
					chapterThree = true;
					skepticism = skepThree;
					mysticism = mystThree;
					responsibility = respThree;
				}
				else if (inputContinue3.equals("r")) {
					proceed = true;
					chapterOne = false;
					chapterTwo = false;
					chapterThree = false;
					skepticism = 0;
					mysticism = 0;
					responsibility = 0;
				}
			}
			else { 
			System.out.println("Farewell.");
			break; 
				}
			}
	}
	//while(chapterFour && !chapterFive) {
		
//}
}
}
}
