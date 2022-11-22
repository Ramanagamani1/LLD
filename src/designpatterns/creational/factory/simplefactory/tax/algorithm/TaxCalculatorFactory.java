package designpatterns.creational.factory.simplefactory.tax.algorithm;

import designpatterns.creational.factory.simplefactory.tax.TaxRegime;

//Step3 - create a calculator factory

public class TaxCalculatorFactory {
    public  static TaxAlgorithm getTaxAlgorithm(TaxRegime regime) {
           switch (regime) {

               case OLD : return new OldTaxAlgorithm();
               case NEW: return new NewTaxAlgorithm();
           }
           throw  new RuntimeException("Invalid regime"+ regime);
    }
}
