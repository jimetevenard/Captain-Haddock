package com.jimetevenard.captainHaddock;


public class CaptainHaddock {
		
	private static final String[] englishInsults = {
			"bashi-bazouk",
			"visigoths",
			"kleptomaniac",
			"sea gherkin",
			"anacoluthon",
			"pockmark",
			"nincompoop",
			"abominable snowman",
			"nitwits",
			"scoundrels",
			"steam rollers",
			"parasites",
			"vegetarians",
			"floundering oath",
			"carpet seller",
			"blundering Bazookas",
			"Popinjay",
			"bragger",
			"pinheads",
			"miserable slugs",
			"ectomorph",
			"maniacs",
			"pickled herring",
			"freshwater swabs",
			"miserable molecule of mildew",
			"Logarithm",
			"bandits",
			"orang-outangs",
			"cercopithecuses",
			"Polynesians",
			"iconoclasts",
			"ruffians",
			"fancy-dress freebooter",
			"ignoramus",
			"sycophant",
			"dizzard",
			"black-beetle",
			"pyrographer",
			"slave-trader",
			"Fuzzy Wuzzy"
		};
	
	
	/**
	 * 
	 * 
	 * @return a random insult from Captain Haddock
	 */
	public static String randomInsult() {
		int i = (int) Math.floor(Math.random() * englishInsults.length);
		return englishInsults[i];		
	}
	
	
	/**
	 * Returns your error message formulated Captain Haddock's way
	 * i.e. preceded by a colorful insult
	 * 
	 * @param message Your error message
	 * @return Your message said Captain's way
	 */
	public static String errorMessage(String message) {
		return "You " + randomInsult() + ", " + message + " !";
	}

}
