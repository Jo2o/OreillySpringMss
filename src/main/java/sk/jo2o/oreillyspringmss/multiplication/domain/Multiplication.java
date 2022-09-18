package sk.jo2o.oreillyspringmss.multiplication.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Multiplication {

    private int num1;
    private int num2;
    private int result;

    public Multiplication (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        result = num1 * num2;
    }

}
