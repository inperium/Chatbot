package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatFrame;
import chat.view.ChatbotViewer;

public class ChatbotController
{
	private Chatbot stupidBot;
	private ChatbotViewer chatView;
	private ChatFrame chatFrame;
	
	public ChatbotController()
	{
		stupidBot = new Chatbot("Solid Poop");
		chatView = new ChatbotViewer();
		chatFrame = new ChatFrame(this);
	}
		
		public void start()
	{
			String response = chatView.collectResponse("What do you want to talk about?");
			
			while(stupidBot.lengthChecker(response))
			{
				chatView.displayMessage(useChatbotCheckers(response));
				response = chatView.collectResponse("Oh, you're interested in " + response +"?");
			}
		
	}
	
	private String useChatbotCheckers(String input)
	{
		String answer = "";
		
		if(stupidBot.contentChecker(input))
		{
			answer += "\nYou konw my special secret\n";
		}
		if(stupidBot.memeChecker(input))
		{
			answer += "\nI can has memes?\n";	
		}
		if(answer.length() == 0)
		{
			answer += "Sorry, I don't know about " + input +  ".";
		}
		
		return answer;
	}
	
}
