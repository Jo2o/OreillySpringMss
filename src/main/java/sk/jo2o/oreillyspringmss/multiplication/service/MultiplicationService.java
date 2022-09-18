package sk.jo2o.oreillyspringmss.multiplication.service;

import sk.jo2o.oreillyspringmss.multiplication.domain.Multiplication;

public interface MultiplicationService {

    /**
     * Creates a Multiplication object w/ 2 randomly-generated factors between 11 and 99
     * @return a Multiplication object with random factors
     */
    Multiplication createRandomMultiplication();

}
