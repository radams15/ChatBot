import java.util.Scanner;

/*
 * Create a program that convinces the user that it is a human
*/


class Main{
	public Main(){
		Scanner scanner = new Scanner(System.in);
		Chat chat = new Chat();
		
		while(true){
			System.out.print("\t: ");
			String input = scanner.nextLine();
			
			if(!input.equals("")){
				String response = chat.respond(input);
				System.out.printf("(%s)\n", response);
			}
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}
