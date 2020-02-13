public class mediaLib {
    public static void main(String[] args){

        double averageCost;
        double totalCost=0;
        double avaerageRating;
        int totalRating=0;



        System.out.println("welcome to your media library");
        Song song1 = new Song("Respect", 1.29,8);
        Song song2 = new Song("sex offender shuffle", 1.29,10);
        Song song3 = new Song("time to wake up the neighbors", 1.00,5);
        Song song4 = new Song("oofer gang", 1.29,9);
        Song song5 = new Song("the fitness gram pacer test", .99,8);
        Song song6 = new Song("pomf pomf", .99,6);
        Song song7 = new Song("trance-009 soundsystem  dreamscape", 1.29,7);
        Song song8 = new Song("kahoot soundtrack", .99,9);
        Song getNumSongs = new Song();


        Books book1 = new Books();
        Movie movie1 = new Movie();





        System.out.println(song1.getTitle()+" "+song1.getPrice()+" "+song1.getRating());
        totalCost = (totalCost +  song1.getPrice());
        totalRating = (totalRating + song1.getRating());

        System.out.println(song2.getTitle()+" "+song2.getPrice()+" "+song2.getRating());
        totalCost = (totalCost +  song2.getPrice());
        totalRating = (totalRating + song2.getRating());

        System.out.println(song3.getTitle()+" "+song3.getPrice()+" "+song3.getRating());
        totalCost = (totalCost +  song3.getPrice());
        totalRating = (totalRating + song3.getRating());

        System.out.println(song4.getTitle()+" "+song4.getPrice()+" "+song4.getRating());
        totalCost = (totalCost +  song4.getPrice());
        totalRating = (totalRating + song4.getRating());

        System.out.println(song5.getTitle()+" "+song5.getPrice()+" "+song5.getRating());
        totalCost = (totalCost +  song5.getPrice());
        totalRating = (totalRating + song5.getRating());

        System.out.println(song6.getTitle()+" "+song6.getPrice()+" "+song6.getRating());
        totalCost = (totalCost +  song6.getPrice());
        totalRating = (totalRating + song6.getRating());

        System.out.println(song7.getTitle()+" "+song7.getPrice()+" "+song7.getRating());
        totalCost = (totalCost +  song7.getPrice());
        totalRating = (totalRating + song7.getRating());

        System.out.println(song8.getTitle()+" "+song8.getPrice()+" "+song8.getRating());
        totalCost = (totalCost +  song8.getPrice());
        totalRating = (totalRating + song8.getRating());


        averageCost= (totalCost/ getNumSongs.getNumSongs());
        avaerageRating = (totalRating/getNumSongs.getNumSongs());
        System.out.println("total cost: "+totalCost+"\naverage cost: "+(averageCost)+"\naverage rating:"+(avaerageRating));




        movie1.setTitle("MOVIE ");
        System.out.println(movie1.getTitle());
        movie1.setRating(9);
        System.out.println(movie1.getRating());



        book1.setTitle("BOOK ");
        System.out.println(book1.getTitle());
        book1.setRating(7);
        System.out.println(book1.getRating());
        movie1.setDuration(97);
        movie1.displayDuration();
    }

}
