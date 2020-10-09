
class Chat{
	
	private final static String[] greetings = {"hi", "hello", "howdy", "greetings", "good morning", "good evening", "good day", "good afternoon"};
	
	public String respondOther(String query){
		for(String greeting : greetings){
			if(query.toLowerCase().contains(greeting)){
				return "Hello there";
			}
		}
		
		return "OK";
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
