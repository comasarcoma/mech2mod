package com.mech2mod.registry;

import com.mech2mod.Mech2Mod;
import com.mech2mod.entity.Mech2Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Mech2Mod.MOD_ID);

    public static final RegistryObject<EntityType<Mech2Entity>> MECH2 =
            ENTITY_TYPES.register("mech2",
                    () -> EntityType.Builder.<Mech2Entity>of(Mech2Entity::new, MobCategory.MISC)
                            .sized(1.5f, 2.5f)
                            .build(new ResourceLocation(Mech2Mod.MOD_ID, "mech2").toString()));
}
