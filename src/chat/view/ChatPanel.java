package chat.view;

import chat.controller.ChatbotController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatPanel extends JPanel
{
	private ChatbotController baseController;
	private SpringLayout baseLayout;
	private  JTextArea chatDisplay;
	private JTextField chatField;
	private JButton chatButton;
	
	public ChatPanel(ChatbotController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout= new SpringLayout();
		chatDisplay = new JTextArea(5,25);
		chatField = new JTextField(25);
		chatButton = new JButton("Chat");

		chatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		setupPanel();
		setupLayout();
		setupListners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.LIGHT_GRAY);
		this.add(chatDisplay);
		this.add(chatButton);
		this.add(chatField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, chatDisplay, 66, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatDisplay, 29, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatField, 232, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatField, 77, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatField, -165, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatDisplay, -18, SpringLayout.NORTH, chatButton);
		baseLayout.putConstraint(SpringLayout.WEST, chatButton, 6, SpringLayout.EAST, chatField);
		baseLayout.putConstraint(SpringLayout.NORTH, chatButton, 1, SpringLayout.NORTH, chatField);
	}
	
	private void setupListners()
	{
	}
}
