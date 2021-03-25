import java.util.ArrayList;

public class MovieShop {

    private String address;
    private String shopNumber;
    private ArrayList<Movie> movieStock = new ArrayList<>();

    public MovieShop(String address, String shopNumber) {
        this.address = address;
        this.shopNumber = shopNumber;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber;
    }

    public ArrayList<Movie> getMovieStock() {
        return movieStock;
    }

    public void setMovieStock(ArrayList<Movie> movieStock) {
        this.movieStock = movieStock;
    }

    public void addMovie (Movie myMovie) {
      movieStock.add(myMovie);
    }

    public boolean isMovieInStock (String title){
        for(int i = 0;i<movieStock.size();i++){
            if(movieStock.get(i).getTitle().equals(title)){
                System.out.println(movieStock.get(i));
                return true;
            }
        }
        return false;
    }

    public void searchMoviesByDirector (String filmDirector) {
        for (int i = 0; i < movieStock.size(); i++) {
            if (movieStock.get(i).getFilmDirector().equals(filmDirector)) {
                System.out.println(movieStock.get(i));
            }
        }
    }

}
