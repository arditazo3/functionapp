package functionapp;

import com.microsoft.azure.functions.annotation.BlobOutput;
import com.microsoft.azure.functions.annotation.BlobTrigger;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.StorageAccount;

/**
 * @author ardit
 */
public class FunctionOutputBinding {

    @FunctionName("copyBlob")
    @StorageAccount("54db81e92d72499d8991")
    @BlobOutput(name = "$return", path = "samples-output-java/{name}")
    public static String copyBlob(@BlobTrigger(name = "blob", path = "samples-input-java/{name}") String content) {
        return content;
    }
}
