package template_method_pattern.concrete;

import template_method_pattern.CsvReaderTemplateMethod;
import template_method_pattern.concrete.model.Staff;

import java.util.List;

public class StaffReader extends CsvReaderTemplateMethod<Staff> {
    @Override
    public List<Staff> readBody() {
        System.out.println("--Body of Staff csv file--");
        return null;
    }
}
