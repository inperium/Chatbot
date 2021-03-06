package chat.controller;

import java.util.concurrent.ThreadLocalRandom;

import chat.model.Chatbot;
import chat.view.ChatFrame;
import chat.view.ChatbotViewer;

public class ChatController
{
	private Chatbot stupidBot;
	private ChatbotViewer chatView;
	private ChatFrame chatFrame;
	public String questionList[] = {"What is the meaning of life?", "What do you like to do?", "Where do you live?"};
	
	/**
	 * Constructs Chatbot, chatView, and chatFrame. 
	 * @param The current user's input.
	 * @return Whether or not the response contains twitter related characters.
	 */
	
	public ChatController()
	{
		stupidBot = new Chatbot("Steve");
		chatView = new ChatbotViewer();
		chatFrame = new ChatFrame(this);
	}
	
	/**
	 * Presents the user with a welcome message.
	 */
		
	public void start()
	{
		this.chatFrame.getChatPanel().showMessage("Welcome to Chatbot!");
	}
	
	
	/**
	 * Gets the Main Chatbot.
	 * @return Main ChatBot
	 */
	public Chatbot getChatbot(){
		return stupidBot;
	}
	
	/**
	 * Runs the Chatbot checkers to see what it contains and formulate a response. 
	 * @param The current user's input.
	 * @return Whether or not the response contains something the Chatbot knows.
	 */
	
	public String useChatbotCheckers(String input)
	{
		String answer = "";
		
		if(!stupidBot.quitChecker(input))
		{
		if(stupidBot.contentChecker(input))
		{
			answer += "\nYou konw my special secret\n";
		}
		if(stupidBot.keyboardMashChecker(input))
		{
			
			answer += questionList[ThreadLocalRandom.current().nextInt(0, 3)];
		
		}else{
		if(stupidBot.harambeChecker(input))
		{
				answer += "Harambe was innocent.\n";	
		}else{
		if(stupidBot.memeChecker(input))
		{
			answer += "I can has memes?\n";	
		}else{
		if(stupidBot.lengthChecker(input))
		{
			answer += "Sorry, I don't know about " + input +  ".";
		}else{
			answer += "Sometimes silence is the answer.";
		}
		}
		}
		}
		}else{
			System.exit(0);
		}
		chatView.displayMessage("Thank you for chatting!");
		return answer;
	}

	/**
	 * Gets the chatFrame.
	 * @return The chatFrame.
	 */
	
	public ChatFrame getBaseFrame()
	{
		return this.chatFrame;
	}
}
