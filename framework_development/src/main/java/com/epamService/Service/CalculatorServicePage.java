package com.epamService.Service;

import com.epam.Model.Calculator;


import java.io.IOException;

import static com.epam.constants.ProjectConstants.NO_OF_INSTANCES;


public class CalculatorServicePage {

    static Calculator calculator;

    public static Calculator getCalculatorData() {

//        System.out.println(TestReader.getTestData(NO_OF_INSTANCES));
        calculator = new Calculator(TestReader.getTestData(NO_OF_INSTANCES));
        // calculator.setInstancesField( PropertyReader.readProperty(INSTANCE_FIELD));
        return calculator;

    }
}
