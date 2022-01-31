package service;

import model.GoogleCloudPricingCalculator;

public class CalculatorCreator {

    public static final String TESTDATA_CALCULATOR_NUMBER_OF_INSTANCES = "testdata.calculator.numberOfInstances";
    public static final String TESTDATA_CALCULATOR_OPERATING_SYSTEM = "testdata.calculator.operatingSystem";
    public static final String TESTDATA_CALCULATOR_MACHINE_CLASS = "testdata.calculator.machineClass";
    public static final String TESTDATA_CALCULATOR_SERIES = "testdata.calculator.series";
    public static final String TESTDATA_CALCULATOR_MACHINE_TYPE = "testdata.calculator.machineType";
    public static final String TESTDATA_CALCULATOR_GPY_TYPE = "testdata.calculator.gpuType";
    public static final String TESTDATA_CALCULATOR_NUMBER_OF_GPU = "testdata.calculator.numberOfGPU";
    public static final String TESTDATA_CALCULATOR_LOCAL_SSD = "testdata.calculator.localSSD";
    public static final String TESTDATA_CALCULATOR_DATACENTER_LOCATION = "testdata.calculator.datacenterLocation";
    public static final String TESTDATA_CALCULATOR_COMMITTED_USAGE = "testdata.calculator.committedUsage";

    public static GoogleCloudPricingCalculator calculatorFeatures() {
        return new GoogleCloudPricingCalculator(TestDataReader.getTestData(TESTDATA_CALCULATOR_NUMBER_OF_INSTANCES),
                TestDataReader.getTestData(TESTDATA_CALCULATOR_OPERATING_SYSTEM),
                TestDataReader.getTestData(TESTDATA_CALCULATOR_MACHINE_CLASS),
                TestDataReader.getTestData(TESTDATA_CALCULATOR_SERIES),
                TestDataReader.getTestData(TESTDATA_CALCULATOR_MACHINE_TYPE),
                TestDataReader.getTestData(TESTDATA_CALCULATOR_GPY_TYPE),
                TestDataReader.getTestData(TESTDATA_CALCULATOR_NUMBER_OF_GPU),
                TestDataReader.getTestData(TESTDATA_CALCULATOR_LOCAL_SSD),
                TestDataReader.getTestData(TESTDATA_CALCULATOR_DATACENTER_LOCATION),
                TestDataReader.getTestData(TESTDATA_CALCULATOR_COMMITTED_USAGE));
    }
}
