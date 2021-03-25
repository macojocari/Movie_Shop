public class Driver {
    public static void main(String[] args) {
        Movie movie1 = new Movie("THE GENTLEMEN","Guy Ritchie",100,
                30,false);
        Movie movie2 = new Movie("GREENLAND","Ric Roman Waugh",95,
                25,true);
        Movie movie3 = new Movie("BAD BOYS FOR LIFE"," Adil El Arbi",80,
                20,true);
        Movie movie4 = new Movie("THE OLD GUARD","Keola Racela",80,
                20,false);
        Movie movie5 = new Movie("TENET","Christopher Nolan",95,
                30,true);
        Movie movie6 = new Movie("SOUL","Pete Docter",90,
                30,true);
        Movie movie7 = new Movie("AVENGERS: Endgame","Anthony Russo",110,
                35,true);

        MovieShop movieShop = new MovieShop("Street1","MS-01");
        movieShop.addMovie(movie1);
        movieShop.addMovie(movie2);
        movieShop.addMovie(movie3);
        movieShop.addMovie(movie4);
        movieShop.addMovie(movie5);
        movieShop.addMovie(movie6);
        movieShop.addMovie(movie7);

        System.out.println(movie1.figureRentPrice(2));
        System.out.println(movie2.calculateBuyPrice());
        System.out.println(movie3.getRentPricePerDay());
        System.out.println(movie4.toString());
        System.out.println(movie5.getFilmDirector());
        System.out.println(movieShop.isMovieInStock("AVENGERS: Endgame"));
        System.out.println(movieShop.isMovieInStock("Ghost"));
        movieShop.searchMoviesByDirector("Guy Ritchie");


    }


}
