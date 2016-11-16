package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatFrame;
import chat.view.ChatbotViewer;

public class ChatbotController
{
	private Chatbot stupidBot;
	//private ChatbotViewer chatView;
	private ChatFrame chatFrame;
	
	public ChatbotController()
	{
		stupidBot = new Chatbot("Steve");
		//chatView = new ChatbotViewer();
		chatFrame = new ChatFrame(this);
	}
		
	public void start()
	{
		/*
		 * String response = chatView.collectResponse("What do you want to talk about?");
			
			while(stupidBot.lengthChecker(response))
			{
				chatView.displayMessage(useChatbotCheckers(response));
				response = chatView.collectResponse("Oh, you're interested in " + response +"?");
			}
		 */
		
	}
	/*
	 * 	public Chatbot getChatbot(){
			return stupidBot;
		}
		
		public String useChatbotCheckers(String input)
		{
			String answer = "";
			
			if(stupidBot.contentChecker(input))
			{
				answer += "\nYou konw my special secret\n";
			}
			if(stupidBot.memeChecker(input))
			{
				answer += "I can has memes?\n";	
			}
			if(stupidBot.lengthChecker(input))
			{
				answer += "Sorry, I don't know about " + input +  ".";
			}else{
				answer += "Sometimes silence is the answer.";
			}

			
			return answer;
		*/
	
	public Chatbot getChatbot(){
		return stupidBot;
	}
	
	public String useChatbotCheckers(String input)
	{
		String answer = "";
		
		if(stupidBot.contentChecker(input))
		{
			answer += "\nYou konw my special secret\n";
		}
		if(stupidBot.keyboardMashChecker(input))
		{
			
		
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

		
		return answer;
	}
}
