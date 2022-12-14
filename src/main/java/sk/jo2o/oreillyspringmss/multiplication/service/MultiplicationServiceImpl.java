package sk.jo2o.oreillyspringmss.multiplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.jo2o.oreillyspringmss.multiplication.domain.Multiplication;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {

    private RandomGeneratorService randomGeneratorService;

    @Autowired
    public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
        this.randomGeneratorService = randomGeneratorService;
    }

    @Override
    public Multiplication createRandomMultiplication() {
        return new Multiplication(
            randomGeneratorService.generateRandomNumber(),
            randomGeneratorService.generateRandomNumber());
    }

}
