public class Movie {

    private String title;
    private String filmDirector;
    private double buyPrice;
    private double rentPricePerDay;
    private boolean isUsed;

    public Movie(String title, String filmDirector, double buyPrice,
                 double rentPricePerDay, boolean isUsed) {
        this.title = title;
        this.filmDirector = filmDirector;
        this.buyPrice = buyPrice;
        this.rentPricePerDay = rentPricePerDay;
        this.isUsed = isUsed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilmDirector() {
        return filmDirector;
    }

    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getRentPricePerDay() {
        return rentPricePerDay;
    }

    public void setRentPricePerDay(double rentPricePerDay) {
        this.rentPricePerDay = rentPricePerDay;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    @Override
    public String toString() {
        return String.format("Title: %s\n Director: %s\n Price: %.1f", title, filmDirector, buyPrice);
    }

    public double calculateBuyPrice() {
        if (isUsed) {
            buyPrice = buyPrice * 0.8;
        }
        return buyPrice;
    }

    public double figureRentPrice(int rentDays) {
        if (rentDays >= 1 && rentDays < 8) {
            if (rentDays == 1) {
                return rentPricePerDay;
            } else if (rentDays >= 2 && rentDays <= 4) {
                return (rentPricePerDay * 0.9) * rentDays;
            } else if (rentDays > 4) {
                return (rentPricePerDay * 0.75) * rentDays;
            }
        } else {
            System.out.println("invalid number of days");
            return -1;
        }
        return rentPricePerDay;
    }
}


