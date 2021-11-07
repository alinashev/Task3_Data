import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Reader {

    private File file;
    private StringBuffer stringBuffer = new StringBuffer();
    private Scanner scanner;

    public String reading(){
        try{
            file = new File("src/main/resources/osmi.json");
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                stringBuffer.append(scanner.nextLine());
            }
            System.out.println("Read!");
        }catch (FileNotFoundException ex){
            System.out.println(ex);
        }
        return stringBuffer.toString();
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public StringBuffer getStringBuffer() {
        return stringBuffer;
    }

    public void setStringBuffer(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return Objects.equals(file, reader.file) && Objects.equals(stringBuffer, reader.stringBuffer) && Objects.equals(scanner, reader.scanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, stringBuffer, scanner);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "file=" + file +
                ", stringBuffer=" + stringBuffer +
                ", scanner=" + scanner +
                '}';
    }
}
