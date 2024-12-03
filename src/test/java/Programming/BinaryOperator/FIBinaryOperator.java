package Programming.BinaryOperator;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class FIBinaryOperator {

    public static void main(String[] args) {

        ConfigBinaryOperator conf1 = new ConfigBinaryOperator("jorden", BigDecimal.valueOf(9999));
        ConfigBinaryOperator conf2 = new ConfigBinaryOperator("jack", BigDecimal.valueOf(8888));
        ConfigBinaryOperator conf3 = new ConfigBinaryOperator("jaden", BigDecimal.valueOf(10000));
        ConfigBinaryOperator conf4 = new ConfigBinaryOperator("ali", BigDecimal.valueOf(2000));
        ConfigBinaryOperator conf5 = new ConfigBinaryOperator("mkyong", BigDecimal.valueOf(1));

        List<ConfigBinaryOperator> list = Arrays.asList(conf1, conf2, conf3, conf4, conf5);

        Comparator<ConfigBinaryOperator> comparing = Comparator.comparing(ConfigBinaryOperator::getSalary);

        BinaryOperator<ConfigBinaryOperator> bi = BinaryOperator.maxBy(comparing);

        ConfigBinaryOperator result = find(list, bi);

        System.out.println(result);

        // find ConfigBinaryOperator with highest pay
        ConfigBinaryOperator ConfigBinaryOperator = find(list, BinaryOperator.maxBy(comparing));
        System.out.println(ConfigBinaryOperator);  // ConfigBinaryOperator{name='jaden', salary=10000}

        // find ConfigBinaryOperator with lowest pay
        ConfigBinaryOperator ConfigBinaryOperator2 = find(list, BinaryOperator.minBy(comparing));
        System.out.println(ConfigBinaryOperator2); // ConfigBinaryOperator{name='mkyong', salary=1}

        
    }
    public static ConfigBinaryOperator find(List<ConfigBinaryOperator> list, BinaryOperator<ConfigBinaryOperator> accumulator) {
        ConfigBinaryOperator result = null;
        for (ConfigBinaryOperator t : list) {
            if (result == null) {
                result = t;
            } else {
                result = accumulator.apply(result, t);
            }
        }
        return result;
    }
}
