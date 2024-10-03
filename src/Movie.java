public class Movie {
    private String id;
    private String title;
    private String year;
    private String director;
    private String gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Movie(String id, String title, String year, String director, String gender) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id+","+title+","+year+","+director+","+gender;
    }
}
