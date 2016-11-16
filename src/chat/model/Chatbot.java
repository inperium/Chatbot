package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2016 Chatbot class. Only stub methods are provided.
 * Students will complete methods as part * of the project. * @author Isaac
 * Bowen * @version 1.0 10/14/16
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;;
	private String userName;
	private String content;

	/**
	 * Creates an instance of the Chatbot with the supplied username. 
	 * @param userName The username for the chatbot. 
	 */
	public Chatbot(String userName)
	{
		this.politicalTopicList = new ArrayList<String>();
		this.content = new String ("content");
		this.memesList = new ArrayList<String>();
		this.userName = new String (userName);
		this.content = new String("Not Bad Stuff");
		this.buildMemesList();
		this.buildPoliticalTopicsList();
	}

	private void buildMemesList()
	{
		memesList.add("Harambe");
		memesList.add("John Cena");
		memesList.add("Arthur");
		memesList.add("cat");
		memesList.add("john");
		memesList.add("cute animals");
		memesList.add("babies");
		memesList.add("mr steal yo girl");
		memesList.add("steal your girl");
		memesList.add("doge");
		memesList.add("dat boy");
		memesList.add("clowns");
		memesList.add("fracking");
		memesList.add("Pokemon Go");
		memesList.add("Willy Wonka");
		
	}

	private void buildPoliticalTopicsList()
	{
		politicalTopicList.add("Trump");
		politicalTopicList.add("Hillary");
		politicalTopicList.add("Jill Stein");
		politicalTopicList.add("Putin");
		politicalTopicList.add("Russian Hackers");
		politicalTopicList.add("Mexico");
		politicalTopicList.add("the wall");
		politicalTopicList.add("deleted emails");
		politicalTopicList.add("voting fraud");
		politicalTopicList.add("Libertarian");
		politicalTopicList.add("tea party");
		politicalTopicList.add("racism");
		politicalTopicList.add("taxes");
		politicalTopicList.add("Obama Care");
		politicalTopicList.add("Radical Islam");
		politicalTopicList.add("money");
		politicalTopicList.add("Gary Johnson");
		politicalTopicList.add("Bernie Sanders");
		politicalTopicList.add("DNC");
		politicalTopicList.add("RNC");
		politicalTopicList.add("Mexicans");
		politicalTopicList.add("communism");
		politicalTopicList.add("news");
		politicalTopicList.add("CNN");
		politicalTopicList.add("Fox");
		politicalTopicList.add("judge");
		politicalTopicList.add("Democratic");
		politicalTopicList.add("Republican");
		politicalTopicList.add("Democrat");
		politicalTopicList.add("supreme court");
		politicalTopicList.add("campain");
		politicalTopicList.add("Hillary for prison");
		politicalTopicList.add("illegal immigrants");
		politicalTopicList.add("election");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("liberal");
		politicalTopicList.add("conservative");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Pence");
		politicalTopicList.add("11/8/2016");
		politicalTopicList.add("Stein");
		politicalTopicList.add("Johnson");
	}

	/**
	 * Checks the length of the supplied string. Returns false if the supplied
	 * String is empty or null, otherwise returns true. * @param currentInput * @return
	 * A true or false based on the length of the supplied String.
	 */

	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		if (currentInput != null && currentInput.length() > 0)
		{
			hasLength = true;
		}

		return hasLength;
	}

	/**
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * @param currentInput The supplied String to be checked. * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		Boolean hasContent = false;

		if(currentInput.toLowerCase().contains(content.toLowerCase()))
		{
			hasContent = true;
		}

		return hasContent;
		}

	/**
	 * Checks if supplied String matches ANY of the topics in the
	 * politicalTopicsList. Returns true if it does find a match and false if it
	 * does not match. 
	 * @param currentInput The supplied String to be checked. * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean politicalChecker = false;
		for(int politicalNames = 0; politicalNames < politicalTopicList.size(); politicalNames++)
		{
			if(currentInput != null && currentInput.equals(politicalTopicList.get(politicalNames)))
			{
				politicalChecker = true;
			}
		}

		return politicalChecker;
	}

	/**
	 *Checks to see that the supplied String value is in the current
	 * memesList variable.
	 * @param currentInput The supplied String to be checked. * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean memeChecker = false;
		for(int memeNames = 0; memeNames < memesList.size(); memeNames++)
		{
			if(currentInput != null && currentInput.equalsIgnoreCase(memesList.get(memeNames)))
			{
				memeChecker = true;
			}
		}

		return memeChecker;

	}

	/*
	 * * Returns the username of this Chatbot instance. * @return The username
	 * of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * * Returns the content area for this Chatbot instance. * @return The
	 * content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return content;
	}

	/**
	 *Getter method for the memesList object. * @return The reference to the
	 *meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}

	/**
	 * * Getter method for the politicalTopicList object. * @return The
	 * reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}

	/**
	 * * Updates the content area for this Chatbot instance. * @param content
	 * The updated value for the content area.
	 */
	public void setContent(String content)
	{
	}

	public boolean keyboardMashChecker(String currentInput)
	{
		boolean mash = false;
		
		if(currentInput.contains("sdf")){
			mash = true;
		}else if(currentInput.contains("dfg")){
			mash = true;
		}else if(currentInput.contains("cvb")){
			mash = true;
		}else if(currentInput.contains(",./")){
			mash = true;
		}
		return mash;
	}

	public boolean inputHTMLChecker(String input)
	{
		boolean html = false;
		if(input.contains("<") && input.substring(0,0).contains(">"))
		{
			html = true;
		}
		return html;
	}

}