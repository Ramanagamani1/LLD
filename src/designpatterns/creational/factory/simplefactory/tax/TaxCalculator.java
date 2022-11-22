package designpatterns.creational.factory.simplefactory.tax;

import designpatterns.creational.factory.simplefactory.tax.algorithm.TaxCalculatorFactory;

public class TaxCalculator {
    public  static Double calculateTax(TaxRegime regime, SalaryDetails salaryDetails) {
        return TaxCalculatorFactory.getTaxAlgorithm(regime)
                .calculateTax(salaryDetails);
    }
}
