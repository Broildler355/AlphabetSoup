public class Soup {


    //Fouad Kadry
    //9/30/25
    //This program will give you a customizable "Alphabet Soup" to mess around with in multiple ways
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    //must be a string you add
    public void add(String word){
        letters+=word;
    }
//letters now has the string at the end

    //Use Math.random() to get a random character from the letters string and return it.
    //must be at least 1 character in the string
    public String randomLetter(){
        int x = (int) (Math.random()*letters.length());
        return letters.substring(x,x+1);
    }
    //one character from the original string is added on


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //set a company name
    public String companyCentered(){
        int x = ((int)(Math.random()*(letters.length()/2)));
        String y = letters.substring(0,x) + company + letters.substring(x);
        return y;
    }
    //the company name is now in the middle of the letters


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    //must have a vowel in the letters
    public void removeFirstVowel(){
        int x = letters.indexOf("AEIOUaeiou");
        letters = letters.substring(0,x)+letters.substring(x);
    }
    //it removes the first vowel

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    //input must be an interger less than the length of the string
    public void removeSome(int num){
        int x = (int)(Math.random()*letters.length());
        int z = (int)(Math.random()*(letters.length()-num));
        String y = letters.substring(z,z+x);
    }
// You are given the soup without the chunk of letters

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //must have an input that contains a word or series of characters within a phrase
    public void removeWord(String word){
        int x = letters.indexOf(word);
        letters = letters.substring(0,x)+letters.substring(x);
    }
}
//removes the first instance of the phrase and gives you the rest
