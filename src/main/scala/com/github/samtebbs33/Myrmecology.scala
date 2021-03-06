package com.github.samtebbs33

import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import net.minecraftforge.fml.common.{Mod, SidedProxy}

/**
	* Created by samtebbs on 30/07/2016.
	*/
@Mod(modid = Myrmecology.MOD_ID, modLanguage = "scala", version = Myrmecology.MOD_VERSION, name = Myrmecology.MOD_NAME)
object Myrmecology {

	final val MOD_ID = "myrmecology"
	final val MOD_VERSION = "0.0.0.0"
	final val MOD_NAME = "Myrmecology"

	@SidedProxy(clientSide = "com.github.samtebbs33.client.ClientProxy", serverSide = "com.github.samtebbs33.server.ServerProxy", modId = MOD_ID)
	var proxy: Proxy = null

	@EventHandler
	def preInit(e: FMLPreInitializationEvent) {
		proxy.preInit(e)
	}

	@EventHandler
	def init(e: FMLInitializationEvent): Unit = {
		proxy.init(e)
	}

	@EventHandler
	def postInit(e: FMLPostInitializationEvent) {
		proxy.postInit(e)
	}

}
