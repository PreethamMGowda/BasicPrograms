package FIConsumerPredicateFunctionSupplier.Predicate;

import FIConsumerPredicateFunctionSupplier.ConsumerClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExercise {

    public static void main(String[] args) {

        List<PredicateClass> item = new ArrayList<>();
        item.add(new PredicateClass("chicken", 180));
        item.add(new PredicateClass("pizza", 150));
        item.add(new PredicateClass("burger", 70));
        item.add(new PredicateClass("chips", 50));

        Predicate<PredicateClass> pFI = (p) -> p.getPrice() > 100;
        item.stream().filter(pFI).forEach(System.out::println);
    }
}
