package model;

import java.util.ArrayList;

import ennumerators.Genre;

/**
 * TODO Complete documentation - check Jukebox class
 * Class that models an Album
 */
public class Album 
{
	//--------------------------------------------------------------------------
	// Constants
	// -------------------------------------------------------------------------
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Constant that models the maximum possible number of songs
	 */
	public static final int NUMBER_SONGS = 12;
	
	//--------------------------------------------------------------------------
	// Attributes
	// -------------------------------------------------------------------------
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Attribute that models the name of the Album class
	 */
	private String name;
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Attribute that models the price of the Album class
	 */
	private double price;
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Attribute that models the number of existing songs in the Album class
	 */
	private int numberOfExistingSongs;
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Models the Interpreter in the Album class
	 */
	private Interpreter interpreter;
	
	//--------------------------------------------------------------------------
	// Relations: Enumerators
	// -------------------------------------------------------------------------
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Models the Genre in the Album class
	 */
	private Genre genre;
	
	//--------------------------------------------------------------------------
	// Relations: Structures
	// -------------------------------------------------------------------------
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Vector that models the songs in the Album class
	 */
	private ArrayList<Song> songs;
	
	//--------------------------------------------------------------------------
	// Methods
	// -------------------------------------------------------------------------
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that creates and object (instance) of the Album class<br>
	 * <b>post: </b> An instance of type Album has been created<br>
	 */
	public Album(String pName, Genre pGenre, double pPrice, Interpreter pInterpreter)
	{
		name = pName;
		genre = pGenre;
		price = pPrice;
		interpreter = pInterpreter;
		numberOfExistingSongs = 0;
		
		songs = new ArrayList<Song>();
	}
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that adds a song to the Album<br>
	 * <b>pre: </b>The vector of songs has already been initialized.<br>
	 * <b>post: </b>A song has been added to the Album.<br>
	 * @param pName name of the new song<br>
	 * @param pDuration of the new song<br>
	 * @return true if the song is created. Otherwise it returns false
	 */
	public boolean addSong(String pName, int pDuration)
	{
		boolean response = false;
		
		Song existingSong = searchSong(pName);
		
		if(existingSong == null)
		{
			Song song = new Song(pName, pDuration);
			songs.add(song);
			numberOfExistingSongs++;
			response = true;
		}
		
		return response;
	}
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that searches for a song in the Album class<br>
	 * <b>pre: </b>The vector of songs has already been initialized.<br>
	 * @param pName name of the song it will look for. pName != null<br>
	 * @return the song if it exists. Otherwise null
	 */
	public Song searchSong(String pName)
	{
		Song response = null;
		
		for (int i = 0; i < songs.size() && response == null; i++) 
		{
			Song currentSong = songs.get(i);
			if(currentSong.getName().equals(pName))
			{
				response = currentSong;
			}
		}
		
		return response;
	}
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that returns the longest song in the array of songs
	 * <b>pre: </b> The array of songs has already been initialized.<br>
	 * @return the longest song of the array of songs. If there are no songs, returns null.
	 */
	public Song getLongestSong()
	{
		Song longest = null;
		
		for (int i = 0; i < songs.size(); i++) 
		{
			Song current = songs.get(i);
			if(longest == null)
			{
				longest = current;
			}
			else if(current.getDuration()>longest.getDuration())
			{
				longest = current;
			}
		}
		
		return longest;
	}
	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that removes a song from the array of songs in the album<br>
	 * <b>pre: </b>The array of songs has already been initialized<br>
	 * <b>post: </b>A song has been removed from the array of songs in the album.<br>
	 * @param pName name of the song to be removed. pName != null<br>
	 * @return true if the song was successfully removed from the array of songs. Otherwise false.
	 */
	public boolean removeSong(String pName)
	{
		boolean response = false;
		
		for (int i = 0; i < songs.size() && response == false; i++) 
		{
			Song current = songs.get(i);
			if(current.getName().equals(pName))
			{
				songs.remove(i);
				response = true;
				numberOfExistingSongs--;
			}
		}
		
		return response;
	}

	
	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that returns the name of the song in the array of songs<br>
	 * <b>pre: </b>The array of songs has already been initialized.<br>
	 * @return the name of the song of the array of songs.
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that returns the genre of the song in the array of songs<br>
	 * <b>pre: </b>The array of songs has already been initialized.<br>
	 * @return the genre of the song of the array of songs.
	 */
	public Genre getGenre() 
	{
		return genre;
	}

	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that returns the pricee of the song in the array of songs<br>
	 * <b>pre: </b>The array of songs has already been initialized.<br>
	 * @return the price of the song of the array of songs.
	 */
	public double getPrice() 
	{
		return price;
	}

	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that returns the number of existing songs in the array of songs<br>
	 * <b>pre: </b>The array of songs has already been initialized.<br>
	 * @return the number of existing songs of the array of songs
	 */
	public int getNumberOfExistingSongs() 
	{
		return numberOfExistingSongs;
	}

	/**
	 * TODO Complete documentation - check Jukebox class
	 * Method that returns the interpreter in the Album
	 * @return the interpreter.
	 */
	public Interpreter getInterpreter() 
	{
		return interpreter;
	}
	
	
}
