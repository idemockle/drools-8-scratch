import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertExcel {

    @Test
    public void convertDrl() throws IOException {
        String drl = new SpreadsheetCompiler().compile(Files.newInputStream(Paths.get("src/main/resources/defaultkiesession/Hal1.drl.xls")), InputType.XLS);

        BufferedWriter writer = new BufferedWriter(new FileWriter("Hal1.drl"));
        writer.write(drl);
        writer.close();
    }
}
