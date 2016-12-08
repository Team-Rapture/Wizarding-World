package rapture.wizard;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rapture.wizard.energy.IMagicHandler;

@Mod(modid = Wizard.MODID , version = Wizard.VERSION , name = Wizard.MODNAME)
public class Wizard {

    public static final String MODID = "wizard";
    public static final String MODNAME = "Wizarding World";
    public static final String VERSION = "1.10.2-1.0";

    @CapabilityInject(IMagicHandler.class)
    public static final Capability<IMagicHandler> CAPABILITY_MAGIC = null;

    @Mod.Instance
    public static Wizard instance = new Wizard();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){


    }

   @Mod.EventHandler
    public void Init(FMLInitializationEvent e){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){

    }

}
