package com.forgecraft;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(ForgeCraft.MOD_ID)
public final class ForgeCraft {
    public static final String MOD_ID = "forgecraft";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ForgeCraft(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Loading {}", MOD_ID);
    }
}
