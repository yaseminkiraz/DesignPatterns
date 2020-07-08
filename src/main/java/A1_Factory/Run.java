package A1_Factory;

public class Run {
    public static void main(String[] args){
            System.out.println(FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF)
                    .export("Test"));
    }
}
