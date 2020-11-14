package template_method_pattern.concrete;

import template_method_pattern.CsvReaderTemplateMethod;
import template_method_pattern.concrete.model.Product;

import java.util.List;

public class ProductReader extends CsvReaderTemplateMethod<Product> {
    @Override
    public void readHeader() {
        System.out.println("##########################");
        System.out.println("--Header of Product csv file--");
    }

    @Override
    public List<Product> readBody() {
        System.out.println("--Body of Product csv file--");
        return null;
    }
}
