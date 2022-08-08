package org.example;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorPageTests extends BaseTest{
    @Test
    public void checkInformationInVmClassString() throws InterruptedException {
        calculatorPage.openCloudPage();
        calculatorPage.goToGoogleCloudPlatformPricingCalculatorPage(
                "Google Cloud Platform Pricing Calculator");

        calculatorPage.sendKeyInToNumberOfInstancesField("4");
        calculatorPage.selectOS();
        calculatorPage.selectProvisionModel();
        calculatorPage.selectSeriesOfMachine();
        calculatorPage.selectMachineType();
        calculatorPage.clickAddGpusCheckBox();
        calculatorPage.selectGpuType();
        calculatorPage.selectNumberOfGpus();
        calculatorPage.selectLocalSsd();
        calculatorPage.selectDataCenterLocation();
        calculatorPage.selectCommittedUsage();
        calculatorPage.pushAddToEstimate();
        calculatorPage.checkInformationInVmClassIsRegular();
        calculatorPage.checkInformationInInstanceTypeIncludeN1Standard8();
        calculatorPage.checkRegionIsFrankfurt();
        calculatorPage.checkLocalSsdSpace2x375Gib();
        calculatorPage.checkCommitmentTermOneYear();
        Assert.assertEquals(calculatorPage.checkRegionIsFrankfurt(),"Region: Frankfurt");
        Assert.assertEquals(calculatorPage.checkInformationInInstanceTypeIncludeN1Standard8(),"Instance type: n1-standard-8\nCommitted Use Discount applied");
        Assert.assertEquals(calculatorPage.checkInformationInVmClassIsRegular(),"Provisioning model: Regular");
        Assert.assertEquals(calculatorPage.checkLocalSsdSpace2x375Gib(),"Local SSD: 2x375 GiB\nCommitted Use Discount applied");
        Assert.assertEquals(calculatorPage.checkCommitmentTermOneYear(),"Commitment term: 1 Year");
        Assert.assertEquals(calculatorPage.checkMonthlyAmount(),"2,920 total hours per month");
    }
}