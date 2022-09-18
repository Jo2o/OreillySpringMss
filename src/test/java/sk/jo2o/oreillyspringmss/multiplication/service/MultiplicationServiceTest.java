package sk.jo2o.oreillyspringmss.multiplication.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import sk.jo2o.oreillyspringmss.multiplication.domain.Multiplication;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class MultiplicationServiceTest {

    @MockBean
    private RandomGeneratorService randomGeneratorService;

    @Autowired
    private MultiplicationService multiplicationService;

    @Test
    void createRandomMultiplication() {
        // given
        given(randomGeneratorService.generateRandomNumber()).willReturn(50, 30);
        // when
        Multiplication multiplication = multiplicationService.createRandomMultiplication();
        // then
        assertThat(multiplication.getNum1()).isEqualTo(50);
        assertThat(multiplication.getNum2()).isEqualTo(30);
        assertThat(multiplication.getResult()).isEqualTo(1500);
    }
}