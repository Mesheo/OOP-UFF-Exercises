import java.util.Scanner;
import java.util.List;

class Person {
    String name;
    String birthdayDate;
    String[] awards;
    String role;

    public Person(String name, String birthday, String[] awards, String role){
        this.name = name;
        this.birthdayDate = birthday;
        this.awards = awards;
        this.role = role;
    }   
}

class Media {
    String title;
    List<Person> cast;
    String releaseDate;
    Person director;

    public void addPerson(Person person) {
        this.people.add(person);
        if (person.role.equals("actor")) {
            this.cast.add(person);
        } else if (person.role.equals("director")) {
            this.director = person;
        }
    }

    public void editPerson(Person person, String name, String birthday, String[] awards, String role) {
        person.name = name;
        person.birthdayDate = birthday;
        person.awards = awards;
        person.role = role;
    }

    public void listPeople() {
        for(int i=0; i < this.people.size(); i++) {
            System.out.println("Name: " + person.name);
            System.out.println("Birthday: " + person.birthdayDate);
            System.out.println("Awards: " + Arrays.toString(person.awards));
            System.out.println("Role: " + person.role);
            System.out.println();
        }
    }
}   

class Movie extends Media {
    String MovieGenre;
}

class Serie extends Media {
    String serieGenre;
    List<Season> seasons;
    public Serie() {
        this.seasons = new ArrayList<>();
    }

    public void addSeason(Season temp) {
        this.seasons.add(temp);
    }

    public int getNumberOfSeasons() {
        return this.seasons.size();
    }
}

class Season {
    List<Episode> episodes;

    public void addEpisode(Episode ep){
        espisodes.add(ep);
    }

    public int getNumberOfEpisodes(){
        return this.episodes.size();
    }
}

class Episode {
    int timeLength;
    String releaseDate;
}

class Catalogue {
    List<Person> people;
    List<Movie> movies;
    List<Serie> series;

    public Catalogue() {
        this.people = new ArrayList<>();
        this.movies = new ArrayList<>();
        this.series = new ArrayList<>();
    }
    // Adicionar um filme
    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    // Editar um filme
    public void editMovie(Movie movie, String title, List<Person> cast, String releaseDate, Person director, String genre) {
        movie.title = title;
        movie.cast = cast;
        movie.releaseDate = releaseDate;
        movie.director = director;
        movie.MovieGenre = genre;
    }

    // Mostrar os filmes do catálogo
    public void listMovies() {
        for(int i = 0; this.movies.size(); i++) {
            System.out.println("\n****\nTitle: " + movie.title);
            System.out.println("Cast: " + movie.cast);
            System.out.println("Release Date: " + movie.releaseDate);
            System.out.println("Director: " + movie.director.name);
            System.out.println("Genre: " + movie.MovieGenre);
            System.out.println("****");
        }
    }

    // Adicionar uma série ao catálogo
    public void addSerie(Serie serie) {
        this.series.add(serie);
    }

    // Editar uma série
    public void editSerie(Serie serie, String title, List<Person> cast, String releaseDate, Person director, String genre, List<Season> seasons) {
        serie.title = title;
        serie.cast = cast;
        serie.releaseDate = releaseDate;
        serie.director = director;
        serie.serieGenre = genre;
        serie.seasons = seasons;
    }

    // Mostrar as séries
    public void listSeries() {
        for(Serie serie : series) {
            System.out.println("\n****\nTitle: " + serie.title);
            System.out.println("Cast: " + serie.cast);
            System.out.println("Release Date: " + serie.releaseDate);
            System.out.println("Director: " + serie.director.name);
            System.out.println("Genre: " + serie.serieGenre);
            System.out.println("Number of Seasons: " + serie.getNumberOfSeasons());
            System.out.println("****");
        }
    }
}
