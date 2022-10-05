package fr.lernejo;

import jdk.dynalink.Operation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {


    @Test
    void factoriel_of_negative_should_produce_an_exception() {
        var Sample = new Sample();
        int number = -1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> Sample.fact(number));
    }

    @Test
    void factoriel_of_5_should_produce_120() {
        var Sample = new Sample();
        int number = 5; // (1)
        int result = Sample.fact(number); // (2)
        Assertions.assertThat(result).as("factoriel of 5")
            .isEqualTo(120); // (3)

    }

    @Test
    void adding_10_to_4_should_produce_14() {
        var Sample = new Sample();
        int number1 = 10; // (1)
        int number2 = 4;
        int result = Sample.op(fr.lernejo.Sample.Operation.ADD,number1,number2); // (2)
        Assertions.assertThat(result).as("addition of 10 to 4")
            .isEqualTo(14); // (3)
    }

    @Test
    void multiplication_10_with_4_should_produce_40() {
        var Sample = new Sample();
        int number1 = 10; // (1)
        int number2 = 4;
        int result = Sample.op(fr.lernejo.Sample.Operation.MULT,number1,number2); // (2)
        Assertions.assertThat(result).as("multiplication of 10 with 4")
            .isEqualTo(40); // (3)
    }
}
