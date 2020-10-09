
class Parser{	
	public static Type getType(String query){
		for(String questionSymbol : Question.questionSymbols){
			if(query.toLowerCase().contains(questionSymbol)){
				return Type.QUESTION;
			}
		}
		
		for(String statementSymbol : Statement.statementSymbols){
			if(query.toLowerCase().contains(statementSymbol)){
				return Type.STATEMENT;
			}
		}
		
		return Type.OTHER;
	}
}
