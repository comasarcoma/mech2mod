package com.mech2mod.entity.client;

import com.mech2mod.entity.Mech2Entity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class Mech2Renderer extends GeoEntityRenderer<Mech2Entity> {

    public Mech2Renderer(EntityRendererProvider.Context context) {
        super(context, new Mech2Model());
    }
}
