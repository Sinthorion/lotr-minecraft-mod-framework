package lotrframework.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lotr.common.LOTRFaction;
import org.apache.logging.log4j.Logger;

@Mod(modid = LOTRFrameworkMod.MODID, version = LOTRFrameworkMod.VERSION, dependencies = "required-after:lotr")
public class
LOTRFrameworkMod {
    static final String MODID = "lotrframework";
    static final String VERSION = "0.1";

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info(LOTRFaction.DWARF.factionName());
    }
}
