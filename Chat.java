import java.util.Random;

class Chat{
	
	private final static String[] greetings = {"hi", "hello", "howdy", "greetings", "good morning", "good evening", "good day", "good afternoon"};
	private final static String[] farewells = {"bye", "goodbye", "see you later", "good talking", "laters"};
	
	
	public String respondOther(String query){
		for(String greeting : greetings){
			if(query.toLowerCase().contains(greeting)){
				return greetings[new Random().nextInt(greetings.length)];
			}
		}
		
		for(String farewell : farewells){
			if(query.toLowerCase().contains(farewell)){
				System.out.println(farewells[new Random().nextInt(farewells.length)]);
				System.exit(0);
			}
		}
		
		return String.format("%s?", query);
	}
	
	public String respond(String query){
		Type type = Parser.getType(query);
		
		if(type == Type.QUESTION){
			return Question.answer(query);
		}else if(type == Type.STATEMENT){
			return Statement.respond(query);
		}
		
		return respondOther(query);
	}
	
}
