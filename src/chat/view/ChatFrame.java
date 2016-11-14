package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatbotController;

public class ChatFrame extends JFrame
{
	private ChatbotController baseController;
	private ChatPanel chatPanel;
	
	public ChatFrame(ChatbotController baseController)
	{
		super();
		this.baseController = baseController;
		this.chatPanel = chatPanel;
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(chatPanel);
		this.setVisible(true);
	}
}
