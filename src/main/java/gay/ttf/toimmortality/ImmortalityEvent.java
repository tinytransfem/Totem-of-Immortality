package gay.ttf.toimmortality;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TotemOfImmortality.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ImmortalityEvent {
    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        if (event.getEntity() instanceof Player player && player.getInventory().contains(ItemsInit.TOTEM_OF_IMMORTALITY.get().getDefaultInstance())) {
            if (event.getAmount() >= player.getHealth())
                event.setAmount(player.getHealth()-1);
        }
    }
}
