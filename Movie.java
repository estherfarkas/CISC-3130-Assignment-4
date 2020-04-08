import java.util.*;
import java.io.*;


public class Movie {

	public static void main(String[] args) throws IOException {
		
		File infile= new File("/Users/estherfarkas/Desktop/movies.csv");
		Scanner input= new Scanner(infile);
		
		HashMap <String, String> movieList= new HashMap<>();
		ArrayList <String> movies= new ArrayList<>();
		
		while (input.hasNext()) {
			
			String line= input.nextLine();
			String [] tokens=line.split(",");
			
			String title= tokens[1];
			String genre= tokens[2];
			
			movies.add(title);
			movieList.put(title, genre);}
		
		
		System.out.println("Please enter the movie genre you are searching for");
		Scanner in= new Scanner(System.in);
		String genre= in.next();
		System.out.println("Please enter the year");
		String year=in.next();
		findMovies(genre, year, movieList, movies);
		dataCheck(year,movieList, movies);
		
		
	}
		

	
	public static ArrayList findMovies (String genre, String year, HashMap allMovies, ArrayList movies) {
		
		ArrayList <String> list= new ArrayList<>();
		ArrayList <String> subList= new ArrayList<>();
		for (int i=0; i<allMovies.size(); i++) {
			if (allMovies.get(movies.get(i)).equals(genre)){
				String movie= (String) movies.get(i);
				list.add(movie);
			}}
		for (int i=0; i<list.size(); i++) {
			String movieYear=list.get(i);
			int index= movieYear.length()-5;
			
			movieYear= movieYear.substring(index, movieYear.length()-1);
			String movie=list.get(i);
			movie= movie.substring(0, index);
			if (movieYear.equals(year)){
				subList.add(movie);
				
			}
		}
		
		
		System.out.println("There are " + list.size() + " movies in " + genre);
		System.out.println("There are " + subList.size()+ " movies in " + genre + " in "+ year);
		return subList;
		
		
		
	}
	
	public static void dataCheck (String year, HashMap allMovies, ArrayList movies) {
		
		ArrayList <String> comedy= findMovies("Comedy",year,  allMovies, movies);
		ArrayList <String> drama= findMovies("Drama", year,  allMovies, movies);
		ArrayList <String> romance= findMovies("Romance", year, allMovies, movies);
		ArrayList <String> adventure= findMovies("Adventure",year, allMovies, movies);
		ArrayList <String> action= findMovies("Action",year, allMovies, movies);
		
		double average= (comedy.size()+ drama.size()+romance.size()+action.size()+adventure.size())/5;
		System.out.println("The average amount of movies per genre is " + average);
		
		
		
		
	}
	
	
	}
		
		
		
	

	

