package model;

import ennumerators.Region;


/**
 * TODO Complete documentation - check Jukebox class
 * Class that models the Interpreter
 */
public class Interpreter
{
	
	//--------------------------------------------------------------------------
	// Attributes
	// -------------------------------------------------------------------------
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Attribute that models the name of the existing Interpreter
	 */
	private String name;
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Attribute that models the surname of the existing Interpreter
	 */
	private String surname;
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Attribute that models the age of the existing Interpreter
	 */
	private int age;
	
	//--------------------------------------------------------------------------
	// Relations: Enumerators
	// -------------------------------------------------------------------------
//	private Region NORTH_AMERICA;
//	private Region SOUTH_AMERICA;
//	private Region EUROPE;
//	private Region AFRICA;
//	private Region ASIA;
//	private Region AUSTRALIA;
		
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Attribute that models the different regions in the Region enumerator 
	 */
	private Region region;
	

	//--------------------------------------------------------------------------
	// Methods
	// -------------------------------------------------------------------------
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that creates an object (instance) of the Interpreter class<br>
	 * <b>post: </b> An instance of type Interpreter has been created<br>
	 */
	public Interpreter(String pName, String pSurname, int pAge, Region pRegion)
	{
		name = pName;
		surname = pSurname;
		age = pAge;
		region = pRegion;
	}

	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that returns the name of the Interpreter
	 */
	public String getName() {
		return name;
	}

	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that returns the surname of the Interpreter
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that returns the age of the Interpreter
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that returns the region from the region enumerator in the Interpreter
	 */
	public Region getRegion() {
		return region;
	}
	
	
}



