package chat.view;

import javax.swing.JOptionPane;

public class ChatbotViewer
{

	public String collectResponse(String message)
	{
		String response = "";
		response = JOptionPane.showInputDialog(null, message);
		return response;
	}

	public int collectOption(String question)
	{
		int response = 0;
		response = JOptionPane.showConfirmDialog(null, question);
		return response;
	}

	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}

}
