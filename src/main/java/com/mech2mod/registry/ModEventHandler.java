package com.mech2mod.registry;

import com.mech2mod.Mech2Mod;
import com.mech2mod.entity.Mech2Entity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mech2Mod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventHandler {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.MECH2.get(), Mech2Entity.createAttributes().build());
    }
}
