package template_method_pattern.concrete;

import template_method_pattern.CsvReaderTemplateMethod;
import template_method_pattern.concrete.model.Customer;

import java.util.List;

public class CustomerReader extends CsvReaderTemplateMethod<Customer> {
    @Override
    public List<Customer> readBody() {
        System.out.println("--Body of Customer csv file--");
        return null;
    }
}
