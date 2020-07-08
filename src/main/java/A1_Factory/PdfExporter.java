package A1_Factory;

class PdfExporter implements FileExporter {
    public String export(String content) {
        return "PDF -> " + content;
    }
}
