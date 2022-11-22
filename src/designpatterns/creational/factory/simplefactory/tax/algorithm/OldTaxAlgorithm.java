package designpatterns.creational.factory.simplefactory.tax.algorithm;

import designpatterns.creational.factory.simplefactory.tax.SalaryDetails;

// Step2 : create concrete classes
public class OldTaxAlgorithm implements TaxAlgorithm{

    @Override
    public Double calculateTax(SalaryDetails salaryDetails) {
        //return 0.4 * salaryDetails.getBasePay() + 0.3 * salaryDetails.getHra();
      return 0.4;
    }
}
