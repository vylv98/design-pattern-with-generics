package template_method_pattern;

import java.util.List;

public abstract class CsvReaderTemplateMethod<T> {
    public void readHeader() {
        System.out.println("##########################");
        System.out.println("--*-HEADER-*--");
    }

    public abstract List<T> readBody();

    public void readFooter() {
        System.out.println("--*-FOOTER-*--");
    }

    public final void readCsvFile() {
        this.readHeader();
        this.readBody();
        this.readFooter();
    }
}
