public class mediaLib {
    public static void main(String[] args){

        System.out.println("welcome to your media library");

        Song song1 = new Song();
        Books book1 = new Books();
        Movie movie1 = new Movie();

        System.out.println(song1);

        song1.setTitle("SONG");
        System.out.println(song1.getTitle());
        song1.setRating(1337);
        System.out.println(song1.getRating());

        movie1.setTitle("MOVIE");
        System.out.println(movie1.getTitle());
        movie1.setRating(69);
        System.out.println(movie1.getRating());

        book1.setTitle("BOOK");
        System.out.println(book1.getTitle());
        book1.setRating(420);
        System.out.println(book1.getRating());
    }

}
