package Programming.BinaryOperator;

import java.math.BigDecimal;

public class ConfigBinaryOperator {

    String name;
    BigDecimal salary;

    ConfigBinaryOperator(String name, BigDecimal salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public BigDecimal getSalary(){
        return salary;
    }

    private void setName(String name){
        this.name = name;
    }

    private void setSalary(BigDecimal salary){
        this.salary = salary;
    }

    public String toString(){
        return "[name=" + name + ", salary=" + salary + "]";
    }
}
