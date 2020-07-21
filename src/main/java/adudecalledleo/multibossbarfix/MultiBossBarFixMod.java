package adudecalledleo.multibossbarfix;

import net.fabricmc.api.ClientModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MultiBossBarFixMod implements ClientModInitializer {
    public static final String MOD_ID = "multibossbarfix";
    public static final String MOD_NAME = "Multi Boss Bar Fix";

    public static Logger LOGGER = LogManager.getLogger(MOD_NAME);

    @Override
    public void onInitializeClient() {
        log(Level.INFO, "mcMMO plz");
    }

    public static void log(Level level, String message){
        LOGGER.log(level, message);
    }
}
