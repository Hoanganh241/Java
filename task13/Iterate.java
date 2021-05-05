package task13;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterate {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Ai la trieu phu");
        tvShows.add("Hay chon gia dung");
        tvShows.add("Duong len dinh olympia");
        tvShows.add("Chung toi la chien si");

        System.out.println("== Iterate using Java 8 forEach and lamba ===");
        tvShows.forEach(tvShow -> {
            System.out.println(tvShow);
        });
        System.out.println("\n === Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using a listIterator() to traver in both deractions ==");

        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using simple for-each loop ===");
        for (String tvShow: tvShows){
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using for loop with index ==");
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
    }

}