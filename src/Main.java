import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> movieList = new ArrayList<>();
        movieList.add("Casablanca");
        movieList.add("Gone with the Wind");
        movieList.add("The Godfather");
        movieList.add("Forrest Gump");
        movieList.add("The Godfather");

        List<Integer> movieTickets = new ArrayList<>();
        movieTickets.add(42);
        movieTickets.add(5);
        movieTickets.add(13);
        movieTickets.add(0);

        Map<String, Integer> movieMap = new HashMap<>();
        movieMap.put("Casablanca", 42);
        movieMap.put("Gone with the Wind", 5);
        movieMap.put("The Godfather", 13);
        movieMap.put("The Godfather", 7);
        movieMap.put("Lord of the Rings", 42);
        movieMap.put("Forrest Gump", 0);
        System.out.println(movieMap);
        int godfatherTickets = movieMap.get("The Godfather");
        System.out.println(
            "The Godfather has " +
            godfatherTickets +
            " tickets"
        );
        for (String key : movieMap.keySet()) {
            System.out.println(
                key + " " +
                movieMap.get(key)+ " tickets"
            );
        }

        System.out.println(movieMap.get("Hot Fuzz"));
        if (movieMap.containsKey("Hot Fuzz")) {
            System.out.println(movieMap.get("Hot Fuzz"));
        } else {
            System.out.println(0);
        }
        System.out.println(movieMap.getOrDefault("Hot Fuzz", 0));
        System.out.println(movieMap.getOrDefault("Casablanca", 0));


        Set<String> movieSet = new HashSet<>();
        movieSet.add("Casablanca");
        movieSet.add("The Godfather");
        movieSet.add("Forrest Gump");
        movieSet.add("The Godfather");
        movieSet.add("Gone with the Wind");

        System.out.println(movieList);
        System.out.println(movieSet);

        movieList.contains("Casablanca"); // O(N)
        movieSet.contains("Casablanca"); // O(1)

        Set<String> movieTreeSet = new TreeSet<>();
        movieTreeSet.add("Casablanca");
        movieTreeSet.add("The Godfather");
        movieTreeSet.add("Forrest Gump");
        movieTreeSet.add("The Godfather 2");
        movieTreeSet.add("Gone with the Wind");
        System.out.println(movieTreeSet);

        boolean doesExist = movieTreeSet.contains("Casablanca"); // O(log N)
        System.out.println(doesExist);

        Set<String> movieLinkedSet = new LinkedHashSet<>();
        movieLinkedSet.add("Casablanca");
        movieLinkedSet.add("The Godfather");
        movieLinkedSet.add("Forrest Gump");
        movieLinkedSet.add("The Godfather 2");
        movieLinkedSet.add("Gone with the Wind");
        System.out.println(movieLinkedSet);


        movieLinkedSet.contains("Casablanca");

    }
}
