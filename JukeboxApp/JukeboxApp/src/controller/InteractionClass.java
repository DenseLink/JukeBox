package controller;

import java.util.Scanner;

import ennumerators.Genre;
import ennumerators.Region;
import model.Album;
import model.Interpreter;
import model.Jukebox;
import model.Song;

/**
 * Class that models the interaction window with the user.
 * @author Pedro Guillermo Feijóo-García
 */
public class InteractionClass 
{
	/**
	 * Main method of the application. It controls the excecution of the program.
	 * @param args arguments input by the Java Virtual Machine and the environment.
	 */
	public static void main(String[] args) 
	{
		Jukebox model = new Jukebox();
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to JukeboxApp!");


		boolean continueExcecution = true;
		while(continueExcecution == true)
		{
			System.out.println("Please select one of the following actions:");
			System.out.println("Add a new album [1]");
			System.out.println("Add a new song to an existing album [2]");
			System.out.println("Add a new hit [3]");
			System.out.println("Search for an existing album [4]");
			System.out.println("Search for a song in an album [5]");
			System.out.println("Search for a hit [6]");
			System.out.println("Delete an album [7]");
			System.out.println("Delete a song from an existing album [8]");
			System.out.println("Delete a hit [9]");
			System.out.println("Retrieve the most expensive album [10]");
			System.out.println("Retrieve the least expensive album [11]");
			System.out.println("Retrieve the longest song in an existing album [12]");
			System.out.println("Retrieve longest hit [13]");
			System.out.println("Retrieve shortest hit [14]");
			System.out.println("Retrieve the number of existing albums [15]");
			System.out.println("Retrieve the number of existing hits [16]");
			System.out.println("Exit Program [17]");


			String txtResponse = input.nextLine();
			int response = Integer.parseInt(txtResponse);

			//TODO Complete this method for each functional requirement

			if(response == 1)
			{
				//Add a new album
				System.out.println("Let's create the Interpreter first.");
				System.out.println("What is the name of the interpreter?");
				String nameInterpreter = input.nextLine();
				System.out.println("What is the surname of the interpreter?");
				String surnameInterpreter = input.nextLine();
				System.out.println("What is the age of the interpreter?");
				String txtAge = input.nextLine();
				int ageInterpreter = Integer.parseInt(txtAge);
				System.out.println("What is the region of the interpreter?:");
				System.out.println("NORTH_AMERICA [1]");
				System.out.println("SOUTH_AMERICA [2]");
				System.out.println("EUROPE [3]");
				System.out.println("AFRICA [4]");
				System.out.println("ASIA [5]");
				System.out.println("AUSTRALIA [6]");
				String inputAnswer = input.nextLine();
				int pInputAnswer = Integer.parseInt(inputAnswer);
				Region answerResponse = null;
				if(pInputAnswer == 1)
				{
					answerResponse = Region.NORTH_AMERICA;
				}
				else if(pInputAnswer == 2)
				{
					answerResponse = Region.SOUTH_AMERICA;
				}
				else if(pInputAnswer == 3)
				{
					answerResponse = Region.EUROPE;
				}
				else if(pInputAnswer == 4)
				{
					answerResponse = Region.AFRICA;
				}
				else if(pInputAnswer == 5)
				{
					answerResponse = Region.ASIA;
				}
				else if(pInputAnswer == 2)
				{
					answerResponse = Region.AUSTRALIA;
				}
							
				Interpreter interpreter = new Interpreter(nameInterpreter, surnameInterpreter, ageInterpreter, answerResponse);


				System.out.println("Perfect! Now, let's create the Album.");
				System.out.println("What is the name of the album?");
				String nameAlbum = input.nextLine();
				System.out.println("What is the genre of the album? GOSPEL [1], SALSA[2], HIPHOP[3], RNB[4], CLASSICAL[5]");
				String InputAnswer1 = input.nextLine();
				int pInputResponser = Integer.parseInt(InputAnswer1);
				Genre answerResponse1 = null;
				if(pInputResponser == 1)
				{
					answerResponse1 = Genre.GOSPEL;
				}
				else if(pInputResponser == 2)
				{
					answerResponse1 = Genre.SALSA;
				}
				else if(pInputResponser == 3)
				{
					answerResponse1 = Genre.HIPHOP;
				}
				else if(pInputResponser == 4)
				{
					answerResponse1 = Genre.RNB;
				}
				else if(pInputResponser == 5)
				{
					answerResponse1 = Genre.CLASSICAL;
					
				}
				
				//String genreAlbum = input.nextLine()/*.toUpperCase()*/;
				System.out.println("What is the price of the album?");
				String txtPrice = input.nextLine();
				double priceAlbum = Double.parseDouble(txtPrice);
				
				boolean methodAnswer = model.addAlbum(nameAlbum, answerResponse1 /*genreAlbum*/, priceAlbum, interpreter);

				if(methodAnswer == true)
				{
					System.out.println("Amazing! Your album was succesfully added to the Jukebox :)");
				}
				else
				{
					System.out.println("I am sorry :( The album was not added to the Jukebox.");
				}

			}
			else if (response == 2)
			{
				//Add a new song to an existing album
				System.out.println("Please input the name of the album:");
				String nameAlbum = input.nextLine();

				System.out.println("Please input the name of the song:");
				String nameSong = input.nextLine();

				System.out.println("Please input the duration of the album:");
				String txtDuration = input.nextLine();
				int durationSong = Integer.parseInt(txtDuration);

				boolean methodResponse = model.addSong(nameAlbum, durationSong, nameSong);

				if(methodResponse == true)
				{
					System.out.println("Amazing! your song was succesfully added to the album!");
				}

				else
				{
					System.out.println("I am sorry :( The song was not added to the Jukebox.");
				}

			}
			else if (response == 3)
			{
				//Add a new hit to an existing album
				System.out.println("Please input the name of the album:");
				String nameAlbum = input.nextLine();

				System.out.println("Please input the name of the hit:");
				String nameSong = input.nextLine();

				boolean methodResponse = model.addhit(nameSong, nameAlbum);

				if(methodResponse == true)
				{
					System.out.println("Amazing! your hit was succesfully added to the album!");
				}

				else
				{
					System.out.println("I am sorry :( The hit was not added to the Jukebox.");
				}

			}
			else if(response == 4)
			{
				//Search for existing album
				System.out.println("Please input the name of the album:");
				String nameAlbum = input.nextLine();

				Album searchedAlbum = model.searchAlbum(nameAlbum);

				if(searchedAlbum == null)
				{
					System.out.println("We are sorry, but there is not an album with the name: " + nameAlbum);
				}

				else
				{
					System.out.println("The album named " + nameAlbum + " has the following details:");
					System.out.println("\t a. Genre: " + searchedAlbum.getGenre());
					System.out.println("\t b. Price: " + searchedAlbum.getPrice());
					System.out.println("\t c. Number of Songs: " + searchedAlbum.getNumberOfExistingSongs());
					System.out.println("\t d.Interpreter: " + searchedAlbum.getInterpreter().getName());
				}
			}
			else if(response == 5)
			{
				//Search for an existing Song
				System.out.println("Please input the name of the song:");
				String nameSong = input.nextLine();
				System.out.println("Please input the name of the album");
				String nameAlbum = input.nextLine();

				Song searchedSong = model.searchSong(nameSong, nameAlbum);

				if(searchedSong == null)
				{
					System.out.println("We are sorry but there is not a song with the name: " + nameSong);
				}
				else
				{
					System.out.println("The song " + nameSong + " exists");
				}
			}
			else if(response == 6)
			{
				System.out.println("Please input the name of the hit");
				String nameHit = input.nextLine();

				Song searchedHit = model.searchHit(nameHit);

				if(searchedHit == null)
				{
					System.out.println("We are sorry but there is not a Hit with the name: " + nameHit);
				}
				else
				{
					System.out.println("The Hit " + nameHit + " exists.");
				}
			}
			else if(response == 7)
			{
				//delete an existing album
				System.out.println("Please input the name of the album:");
				String nameAlbum = input.nextLine();

				boolean deleteAlbum = model.removeAlbum(nameAlbum);


				if(deleteAlbum == false)
				{

					System.out.println("We are sorry, but there is not an album with the name: " + nameAlbum);
				}

				else
				{
					System.out.println("The album " + nameAlbum + " has been deleted");

				}
			}
			else if(response == 8)
			{
				//Delete a song from within an existing album.

				System.out.println("Please input the name of the album you would like to delete the song from");
				String pNameAlbum = input.nextLine();

				System.out.println("Please input the name of the song you would like to delete");
				String pNameSong = input.nextLine();

				boolean removeSongFromAlbum = model.removeSongFromAlbum(pNameAlbum, pNameSong);



				if(removeSongFromAlbum == false)
				{
					System.out.println("We are sorry, but there not an album named " + pNameAlbum + " associated the song name: " + pNameSong);
				}
				else
				{
					System.out.println("Your song has been deleted");
				}

			}
			else if(response == 9)
			{
				//remove a hit by searching by its name
				System.out.println("Please input the name of the hit you would like to delete");
				String pNameHit = input.nextLine();
				boolean removeHit = model.removeHit(pNameHit);
				if(removeHit == false)
				{
					System.out.println("We are sorry but " + pNameHit + " could not be deleted for some reason");
				}
				else
				{
					System.out.println("Your hit has been deleted");
				}
			}
			else if(response == 10)
			{
				//Retrieve the most expensive album
				Album mostExpensive = model.getMostExpensiveAlbum();
				if(mostExpensive == null)
				{
					System.out.println("There are no albums in the jukebox yet :(");
				}
				else
				{
					System.out.println("The most expensive album is named " + mostExpensive.getName() + " and has the following details:");
					System.out.println("\t a. Genre: " + mostExpensive.getGenre());
					System.out.println("\t b. Price: " + mostExpensive.getPrice());
					System.out.println("\t c. Number of Songs: " + mostExpensive.getNumberOfExistingSongs());
					System.out.println("\t d.Interpreter: " + mostExpensive.getInterpreter().getName());
				}
			}
			else if(response == 11)
			{
				//Retrieve the least expensive album
				Album leastExpensive = model.getLeastExpensiveAlbum();
				if(leastExpensive == null)
				{
					System.out.println("There are no albums in the Jukebox yet :(");
				}
				else
				{
					System.out.println("The most expensive album is named " + leastExpensive.getName() + " and has the following details:");
					System.out.println("\t a. Genre: " + leastExpensive.getGenre());
					System.out.println("\t b. Price: " + leastExpensive.getPrice());
					System.out.println("\t c. Number of Songs: " + leastExpensive.getNumberOfExistingSongs());
					System.out.println("\t d.Interpreter: " + leastExpensive.getInterpreter().getName());
				}
			}
			else if(response == 12)
			{
				//Get the longest song of the album, searching by the name of the album
				System.out.println("Please input the name of the Album you would like to search through");
				String pName = input.nextLine();
				Song searchedSongs = model.getLongestSongInAlbum(pName); 
				System.out.println(searchedSongs.getName());
			}
			else if(response == 13)
			{
				//Get the Longest hit

				Song longestHit = model.getLongestHit();
				System.out.println(longestHit.getName());
			}
			else if(response == 14)
			{
				//Gest shortest hit
				Song shortestHit = model.getShortestHit();
				System.out.println(shortestHit.getName());
			}
			else if(response == 15)
			{
				//Retrieve the number of existing albums
				int numberOfAlbums = model.getNumberOfExistingAlbums();
				System.out.println("The number of existing albums is: " + numberOfAlbums);
			}
			else if(response == 16)
			{
				//Get the number of existing hits in the Jukebox
				int existingHits = model.getNumberOfExistingHits();
				System.out.println(existingHits);
			}
			else if(response == 17)
			{
				continueExcecution = false;
			}

//			input.close();

		}
		input.close();
	}
}
