package gay.ttf.toimmortality;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TotemOfImmortality.MOD_ID)
public class TotemOfImmortality {
    public static final String MOD_ID = "toimmortality";

    public TotemOfImmortality() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemsInit.ITEMS.register(modBus);

        modBus.addListener(CreativeTabEvents::addTotem);
        MinecraftForge.EVENT_BUS.register(new ImmortalityEvent());
    }
}
