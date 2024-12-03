package FIConsumerPredicateFunctionSupplier.Supplier;

import FIConsumerPredicateFunctionSupplier.Predicate.PredicateClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierExercise {

    public static void main(String[] args) {

        List<SupplierClass> item = new ArrayList<>();
        item.add(new SupplierClass("chicken", 180));
        item.add(new SupplierClass("pizza", 150));
        item.add(new SupplierClass("burger", 70));
        item.add(new SupplierClass("chips", 50));

        Supplier<SupplierClass> sFI = () -> new SupplierClass("dummy", 0);
        System.out.println(item.stream()
                .filter(i -> i.getPrice()>1000).findAny().orElseGet(sFI));
    }
}
