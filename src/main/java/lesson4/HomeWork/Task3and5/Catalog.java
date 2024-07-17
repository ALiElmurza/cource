package lesson4.HomeWork.Task3and5;

public class Catalog {
    public static void main(String[] args) {

        Movie[] film = new Movie[3];
        film[0] = new Movie(2019,"Джентельмены", 9, "Боевик/Комедия", "США, Великобритания", false);
        film[1] = new Movie(1997, "Карты, деньги, два ствола", 8.6, "Криминал/Комедия", "США", true);
        film[2] = new Movie(1999, "Бешенные псы", 8.1, "Криминал/триллер", "США", true);


        for (int i = 0; i < film.length; i++) { //простой цикл for
            System.out.println(film[i].year + ", " +  film[i].name + ", " + film[i].rating + ", " + film[i].genre);
        }

        System.out.println();

        for (Movie movie : film) { //цикл for each
            System.out.println(movie.year + ", " + movie.name + ", " + movie.rating + ", " + movie.genre);

        }
    }
}