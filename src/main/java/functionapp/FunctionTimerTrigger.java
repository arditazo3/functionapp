package functionapp;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.TimerTrigger;

/**
 * @author ardit
 */
public class FunctionTimerTrigger {

    @FunctionName("TimerTriggerExample")
    public void keepAlive(
            @TimerTrigger(name = "keepAliveTrigger", schedule = "0 */5 * * * *") String timerInfo,
            ExecutionContext context
    ) {
        // timeInfo is a JSON string, you can deserialize it to an object using your favorite JSON library
        context.getLogger().info("Timer is triggered: " + timerInfo);
    }

}
