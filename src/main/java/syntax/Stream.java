package syntax;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

public class Stream {

    private String name;
    private int age;
    private String city;

    public Stream(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Getters and setters for name, age, and city
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", city='" + city + "'}";
    }

    public static void main(String[] args) {
        List<Stream> people = Arrays.asList(
                new Stream("Alice", 23, "London"),
                new Stream("Bob", 30, "New York"),
                new Stream("Charlie", 27, "Paris")
        );

        // Use a stream to filter out persons who are under 25 years old.
        List<Stream> youngPeople = people.stream()
                .filter(p -> p.getAge() < 25)
                .collect(Collectors.toList());
        System.out.println(youngPeople);
        // Collect the names into a list.
        List<String> names = people.stream()
                .map(Stream::getName)
                .collect(Collectors.toList());
        System.out.println(names);
        // Grouping by a Property.
        Map<String, List<Stream>> peopleByCity = people.stream()
                .collect(Collectors.groupingBy(Stream::getCity));
        System.out.println(peopleByCity);
        // Finding an Element.
        Optional<Stream> personInParis = people.stream()
                .filter(p -> "Paris".equals(p.getCity()))
                .findFirst();
        personInParis.ifPresent(System.out::println);
        // Sort people by age.
        List<Stream> sortedByAge = people.stream()
                .sorted(Comparator.comparingInt(Stream::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedByAge);
    }
}
