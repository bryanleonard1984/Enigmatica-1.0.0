package com.wilecoyote84.enigmatica;

import com.wilecoyote84.enigmatica.block.ModBlocks;
import com.wilecoyote84.enigmatica.client.EnigmaTab;
import com.wilecoyote84.enigmatica.item.ModItems;
import com.wilecoyote84.enigmatica.proxy.CommonProxy;
import com.wilecoyote84.enigmatica.recipe.ModRecipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Enigmatica.modid, name = Enigmatica.name, version = Enigmatica.version)
public class Enigmatica 
{
	public static final String modid = "enigmatica";
	public static final String name = "Enigmatica";
	public static final String version = "1.0.0";
	public static final EnigmaTab creativeTab = new EnigmaTab();
	
	//Tool materials
	
	public static final ToolMaterial copperToolMaterial = EnumHelper .addToolMaterial("COPPER", 1, 145, 5.0F, 1.2F, 10);
	public static final ToolMaterial bronzeToolMaterial = EnumHelper .addToolMaterial("BRONZE", 2, 200, 5.0F, 1.8F, 12);
	public static final ToolMaterial steelToolMaterial = EnumHelper .addToolMaterial("STEEL", 2, 500, 7.0F, 2.5F, 16);
	public static final ToolMaterial bedrockToolMaterial = EnumHelper .addToolMaterial("BEDROCK", 3, 2000, 10.0F, 4.0F, 10);
	public static final ToolMaterial goldenrockToolMaterial = EnumHelper .addToolMaterial("GOLDERNROCK", 4, 2250, 11.0F, 4.5F, 22);
	public static final ToolMaterial emeraldrockToolMaterial = EnumHelper .addToolMaterial("EMERALDROCK", 4, 3000, 12.0F, 5.5F, 30);
	public static final ToolMaterial mithrilToolMaterial = EnumHelper .addToolMaterial("MITHRIL", 5, 3000, 14.0F, 6.5F, 35);
	public static final ToolMaterial infusedMithrilToolMaterial = EnumHelper .addToolMaterial("INFUSED_MITHRIL", 5, 4500, 18.0F, 8.0F, 40);
	
	@Mod.Instance(modid)
	public static Enigmatica instance;
	
	@SidedProxy(serverSide = "com.wilecoyote84.enigmatica.proxy.CommonProxy", clientSide = "com.wilecoyote84.enigmatica.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println(name + " is loading!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler
	{
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event)
		{
			ModBlocks.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event)
		{
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event)
		{
			ModItems.registerModels();
			ModBlocks.registerModels();
		}
	}
}
