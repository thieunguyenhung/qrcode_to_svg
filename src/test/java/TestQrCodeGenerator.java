import com.google.zxing.WriterException;
import org.junit.Test;
import qrcode.QrCodeGenerator;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class TestQrCodeGenerator {
  @Test
  public void should_return_non_null_file() throws IOException, WriterException {
    QrCodeGenerator qrCodeGenerator = new QrCodeGenerator();
    File qrFile = qrCodeGenerator.generate();
    assertNotNull(qrFile);
    System.out.println(qrFile.getAbsolutePath());
  }
}
