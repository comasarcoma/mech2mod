package com.mech2mod;

import com.mech2mod.registry.ModEntityTypes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Mech2Mod.MOD_ID)
public class Mech2Mod {

    public static final String MOD_ID = "mech2mod";

    public Mech2Mod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
    }
}
