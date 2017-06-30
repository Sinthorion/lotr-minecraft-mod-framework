package mota.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lotr.common.LOTRFaction;
import org.apache.logging.log4j.Logger;

@Mod(modid = MotaMod.MODID,
     version = MotaMod.VERSION,
     dependencies = "required-after:lotr")
public class MotaMod {
    static final String MODID = "mota";
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
