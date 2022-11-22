package designpatterns.creational.factory.simplefactory.tax.algorithm;

import designpatterns.creational.factory.simplefactory.tax.SalaryDetails;

// Step 1 : Create an interface
public interface TaxAlgorithm {
    Double calculateTax(SalaryDetails salaryDetails);
}
