package FIConsumerPredicateFunctionSupplier;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExercise {

    public static void main(String[] args) {

        List<ConsumerClass> item = new ArrayList<>();
        item.add(new ConsumerClass("chicken", 180));
        item.add(new ConsumerClass("pizza", 150));
        item.add(new ConsumerClass("burger", 70));
        item.add(new ConsumerClass("chips", 50));

        Consumer<ConsumerClass> consumer = (c) ->
                System.out.println(c.getItemName().toUpperCase());

        item.forEach(consumer);

        item.forEach(items -> {
            System.out.println(items.getItemName().toUpperCase());
        });
    }
}
