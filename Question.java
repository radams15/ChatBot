import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Question{
	public final static String[] questionSymbols = {"who", "which", "what", "why", "when", "where", "how", "?"};
	
	private final static Pattern whoPattern = Pattern.compile("who\\s+(is|are|am) (.*)", Pattern.MULTILINE);
	
	private static String who(String question){
		Matcher matcher = whoPattern.matcher(question);
		
		if(matcher.find()){
			String subject = matcher.group(2);
			
			return subject;
		}
		
		return "you";
	}
	
	private static String which(String question){
		return "the first one";
	}
	
	private static String what(String question){
		return "whatever you want it to be";
	}
	
	private static String why(String question){
		return "because it is";
	}
	
	private static String when(String question){
		return "at some point";
	}
	
	private static String where(String question){
		return "probably where you least expect it";
	}
	
	private static String how(String question){
		return "i don't even know myself";
	}
		
	
	public static String answer(String question){
		String firstWord = question.split(" ")[0];
		
		switch(firstWord.toLowerCase()){
			case "who":
				return who(question);
			case "which":
				return which(question);
			case "what":
				return what(question);
			case "why":
				return why(question);
			case "when":
				return when(question);
			case "where":
				return where(question);
			case "how":
				return how(question);
		}
		
		return "Yessss";
	}
}
