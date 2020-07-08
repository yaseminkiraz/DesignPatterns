package A1_Factory;

class ExcelExporter implements FileExporter {
    public String export(String content) {
        return "EXCEL -> " + content;
    }
}
