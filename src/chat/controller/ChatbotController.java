package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatbotViewer;

public class ChatbotController
{
	private Chatbot stupidBot;
	private ChatbotViewer chatView;
	
	public ChatbotController()
	{
		stupidBot = new Chatbot("Solid Poop");
		chatView = new ChatbotViewer();
	}
		
		public void start()
	{
			String response = "talking to you";
			
			while(stupidBot.lengthChecker(response))
			{
				response = chatView.collectResponse("WYD???!?");
			}
			
	}
	
}
