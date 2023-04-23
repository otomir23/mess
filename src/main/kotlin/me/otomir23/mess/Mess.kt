package me.otomir23.mess

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object Mess : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("Mess")

    override fun onInitialize(mod: ModContainer) {
        LOGGER.info("{} was successfully initialized!", mod.metadata()?.name())
    }
}
