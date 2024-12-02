package Programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Course{
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String toString(){
        return name + ":" + category + ":" + reviewScore;
    }
}
public class FP05FunctionalCustomClass {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("String", "framework", 95, 20000),
                new Course("String Boot", "framework", 94, 18000),
                new Course("API", "Microservices", 98, 22000),
                new Course("Microservices", "Microservices", 99, 25000),
                new Course("Fullstack", "Fullstack", 91, 14000),
                new Course("AWS", "cloud", 92, 21000),
                new Course("Azure", "cloud", 95, 21000),
                new Course("Docker", "cloud", 95, 20000),
                new Course("Kubernetes", "cloud", 92, 20000)
        );

        // allMatch, noneMatch and anyMatch
        Predicate<Course> allMatchVar = course -> course.getReviewScore() > 90;
        System.out.println(courses.stream().allMatch(allMatchVar));
        Predicate<Course> noneMatchVar = course -> course.getReviewScore() > 90;
        System.out.println(courses.stream().noneMatch(noneMatchVar));
        Predicate<Course> anyMatchVar = course -> course.getReviewScore() >= 90;
        System.out.println(courses.stream().anyMatch(anyMatchVar));

        // sorted
        // Using comparingInt because we are dealing with primitive type and increases the performance
        Comparator<Course> courseComparatorIncreasing = Comparator.comparingInt(Course::getNoOfStudents);
        System.out.println(courses.stream().sorted(courseComparatorIncreasing).collect(Collectors.toList()));

        Comparator<Course> courseComparatorDecresing = Comparator.comparingInt(Course::getNoOfStudents).reversed();
        System.out.println(courses.stream().sorted(courseComparatorDecresing).collect(Collectors.toList()));

        Comparator<Course> courseComparatorOfNoOfStudentsAndThanReviewScore = Comparator.comparingInt(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore).reversed();
        System.out.println(courses.stream().sorted(courseComparatorOfNoOfStudentsAndThanReviewScore).collect(Collectors.toList()));

        //limit, skip, takeWhile and dropWhile
        System.out.println(courses.stream()
                .sorted(courseComparatorOfNoOfStudentsAndThanReviewScore)
                .limit(5)
                .collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(courseComparatorOfNoOfStudentsAndThanReviewScore)
                .skip(5)
                .collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(courseComparatorOfNoOfStudentsAndThanReviewScore)
                .limit(6)
                .skip(3)
                .collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(courseComparatorOfNoOfStudentsAndThanReviewScore)
                .takeWhile(course -> course.getReviewScore() >= 95)
                .collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(courseComparatorOfNoOfStudentsAndThanReviewScore)
                .dropWhile(course -> course.getReviewScore() >= 95)
                .collect(Collectors.toList()));

        //max, min, findFirst and findAny
        System.out.println(courses.stream()
                .max(courseComparatorOfNoOfStudentsAndThanReviewScore));

        System.out.println(courses.stream()
                .min(courseComparatorOfNoOfStudentsAndThanReviewScore)
                .orElse(new Course("String", "framework", 95, 20000)));

        System.out.println(courses.stream()
                .filter(course -> course.getReviewScore() < 90)
                .max(courseComparatorOfNoOfStudentsAndThanReviewScore)
                .orElse(new Course("String", "framework", 95, 20000))
        );

        System.out.println(courses.stream()
                .filter(course -> course.getReviewScore() > 90)
                .findFirst());

        System.out.println(courses.stream()
                .filter(course -> course.getReviewScore() > 90)
                .findAny());

        //Sum, average and count
        System.out.println(courses.stream()
                .sorted(courseComparatorOfNoOfStudentsAndThanReviewScore)
                .mapToInt(Course::getNoOfStudents)
                .sum()
        );

        System.out.println(courses.stream()
                .sorted(courseComparatorOfNoOfStudentsAndThanReviewScore)
                .mapToInt(Course::getNoOfStudents)
                .average()
        );

        System.out.println(courses.stream()
                .sorted(courseComparatorOfNoOfStudentsAndThanReviewScore)
                .mapToInt(Course::getNoOfStudents)
                .count()
        );

        System.out.println(courses.stream()
                .sorted(courseComparatorOfNoOfStudentsAndThanReviewScore)
                .mapToInt(Course::getNoOfStudents)
                .max()
        );

        //Grouping and counting
        System.out.println(courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory)));

        System.out.println(courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));

        System.out.println(courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));

        System.out.println(courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getName, Collectors.toList()))));

        //HigherOrder Function
        Predicate<Course> higherorder = getHigherorder(90);
        Predicate<Course> higherorde2 = getHigherorder(95);

    }

    // a method which returns logic
    private static Predicate<Course> getHigherorder(int cutOffReviewscore) {
        return course -> course.getReviewScore() > cutOffReviewscore;
    }
}
