package designpatterns.creational.factory.simplefactory.tax.algorithm;


import designpatterns.creational.factory.simplefactory.tax.SalaryDetails;


// Step 2 - create concrete classes
public class NewTaxAlgorithm implements TaxAlgorithm {

    @Override
    public Double calculateTax(SalaryDetails salaryDetails) {
        //return 0.4* salaryDetails.getBasePay() + 0.3 * salaryDetails.getHra() + 0.2 * salaryDetails.getLta();
      return 0.4;
    }
}
