class Question{
	public final static String[] questionSymbols = {"who", "which", "what", "why", "when", "where", "how", "?"};
	
	private String who(String question){
		return "YES";
	}
	
	private String which(String question){
		return "YES";
	}
	
	private String what(String question){
		return "YES";
	}
	
	private String why(String question){
		return "YES";
	}
	
	private String when(String question){
		return "YES";
	}
	
	private String where(String question){
		return "YES";
	}
	
	private String how(String question){
		return "YES";
	}
		
	
	public static String answer(String question){
		String firstWord = question.split(" ")[0];
		
		System.out.println(":"+firstWord);
		
		return "YES";
	}
}
