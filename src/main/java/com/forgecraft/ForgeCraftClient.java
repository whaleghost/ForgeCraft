package com.forgecraft;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = ForgeCraft.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = ForgeCraft.MOD_ID, value = Dist.CLIENT)
public final class ForgeCraftClient {
    public ForgeCraftClient() {
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        ForgeCraft.LOGGER.debug("Client initialized");
    }
}
