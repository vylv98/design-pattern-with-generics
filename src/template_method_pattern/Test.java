package template_method_pattern;

import template_method_pattern.concrete.CustomerReader;
import template_method_pattern.concrete.ProductReader;
import template_method_pattern.concrete.StaffReader;

public class Test {
    public static void main(String[] args) {
        CustomerReader customerReader = new CustomerReader();
        ProductReader productReader = new ProductReader();
        StaffReader staffReader = new StaffReader();

        customerReader.readCsvFile();
        productReader.readCsvFile();
        staffReader.readCsvFile();
    }
}
