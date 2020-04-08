# CISC-3130-Assignment-4
I downloaded the lists from MovieLens and used a while loop to get each round of information
I used a string tokenizer to separate genre from the movie title
Then I placed each set of genre and title into a HashMap
I made a separate arrayList for the movie titles
I made the title the key, so that I could get multiple answers for the chosen genre
If the genre is the key, it would only return one value
I created a method that would search for the arrayList for a movie title
Then it would check the hashmap for that title
If the genre matched the chosen genre, it would be placed into a smaller arrayList, which was then returned
I did a similar thing for the year and used subString to parse it out. If it matched the chosen year,
it went into a sub Array.
The length of time for my search was O(n) which is longer than a HashMap search usually is, but since I was searching for multiple instances of the genre, I needed to search every entry, so I couldnt use the genre as the key. 
