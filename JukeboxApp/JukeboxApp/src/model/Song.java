package model;

/**
 * TODO Complete documentation - check Jukebox class
 * Class that models the Interpreter
 */
public class Song 
{
	
	//--------------------------------------------------------------------------
	// Attributes
	// -------------------------------------------------------------------------
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Attribute that models the name of the existing Song
	 */
	private String name;
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Attribute that models the duration of the existing Song
	 */
	private int duration;
	
	//--------------------------------------------------------------------------
	// Methods
	// -------------------------------------------------------------------------
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that creates and object (instance) of the Song class<br>
	 * <b>post: </b> An instance of type Song has been created<br>
	 */
	public Song(String pName, int pDuration)
	{
		name = pName;
		duration = pDuration;
	}

	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that returns the name of the Song
	 */
	public String getName() 
	{
		return name;
	}


	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that returns the duration of the Song
	 */
	public int getDuration() 
	{
		return duration;
	}
	
	
	
}
