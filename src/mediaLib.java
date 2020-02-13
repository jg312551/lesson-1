public class mediaLib {
    public static void main(String[] args){

        System.out.println("welcome to your media library");
        Song song1 = new Song("Respect", 1.29,8);
        Song song2 = new Song("sex offender shuffle", 0.00,10);
        Song song3 = new Song("time to wake up the neighbors", 1.00,5);
        Song song4 = new Song("oofer gang", 1.29,9);
        Song song5 = new Song("the fitness gram pacer test", .99,8);
        Song song6 = new Song("pomf pomf", .99,6);
        Song song7 = new Song("trance-009 soundsystem  dreamscape", 1.29,7);
        Song song8 = new Song("kahoot soundtrack", .99,9);
        Books book1 = new Books();
        Movie movie1 = new Movie();
        double numSongs=0;
        double totalCost=0;




        System.out.println(song1.getTitle()+" "+song1.getPrice()+" "+song1.getRating());
        ++numSongs;
        totalCost = song1.getPrice();

        System.out.println(song1.getTitle()+" "+song1.getPrice()+" "+song1.getRating());
        ++numSongs;
        totalCost = song1.getPrice();

        System.out.println(song1.getTitle()+" "+song1.getPrice()+" "+song1.getRating());
        ++numSongs;
        totalCost = song1.getPrice();

        System.out.println(song1.getTitle()+" "+song1.getPrice()+" "+song1.getRating());
        ++numSongs;
        totalCost = song1.getPrice();

        System.out.println(song1.getTitle()+" "+song1.getPrice()+" "+song1.getRating());
        ++numSongs;
        totalCost = song1.getPrice();

        System.out.println(song1.getTitle()+" "+song1.getPrice()+" "+song1.getRating());
        ++numSongs;
        totalCost = song1.getPrice();

        System.out.println(song1.getTitle()+" "+song1.getPrice()+" "+song1.getRating());
        ++numSongs;

        totalCost = song1.getPrice();System.out.println(song1.getTitle()+" "+song1.getPrice()+" "+song1.getRating());
        ++numSongs;
        totalCost = song1.getPrice();




        movie1.setTitle("MOVIE ");
        System.out.println(movie1.getTitle());
        movie1.setRating(9);
        System.out.println(movie1.getRating());



        book1.setTitle("BOOK ");
        System.out.println(book1.getTitle());
        book1.setRating(7);
        System.out.println(book1.getRating());
    }

}
