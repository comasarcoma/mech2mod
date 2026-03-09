package com.mech2mod.entity.client;

import com.mech2mod.Mech2Mod;
import com.mech2mod.entity.Mech2Entity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class Mech2Model extends GeoModel<Mech2Entity> {

    @Override
    public ResourceLocation getModelResource(Mech2Entity object) {
        return new ResourceLocation(Mech2Mod.MOD_ID, "geo/mech2.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Mech2Entity object) {
        return new ResourceLocation(Mech2Mod.MOD_ID, "textures/entity/mech2.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Mech2Entity object) {
        return new ResourceLocation(Mech2Mod.MOD_ID, "animations/mech2.animation.json");
    }
}
