package com.wilecoyote84.enigmatica.item;

import com.wilecoyote84.enigmatica.item.tool.ItemAxe;
import com.wilecoyote84.enigmatica.item.tool.ItemHoe;
import com.wilecoyote84.enigmatica.item.tool.ItemPickaxe;
import com.wilecoyote84.enigmatica.item.tool.ItemShovel;
import com.wilecoyote84.enigmatica.item.tool.ItemSword;
import com.wilecoyote84.enigmatica.Enigmatica;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems 
{
	//Swords
	public static ItemSword copperSword = new ItemSword(Enigmatica.copperToolMaterial, "copper_sword");
	public static ItemSword bronzeSword = new ItemSword(Enigmatica.bronzeToolMaterial, "bronze_sword");
	public static ItemSword steelSword = new ItemSword(Enigmatica.steelToolMaterial, "steel_sword");
	public static ItemSword bedrockSword = new ItemSword(Enigmatica.bedrockToolMaterial, "bedrock_sword");
	public static ItemSword goldenrockSword = new ItemSword(Enigmatica.goldenrockToolMaterial, "goldenrock_sword");
	public static ItemSword emeraldrockSword = new ItemSword(Enigmatica.emeraldrockToolMaterial, "emeraldrock_sword");
	public static ItemSword mithrilSword = new ItemSword(Enigmatica.mithrilToolMaterial, "mithril_sword");
	public static ItemSword infusedMithrilSword = new ItemSword(Enigmatica.infusedMithrilToolMaterial, "infused_mithril_sword");
	
	//Pickaxes
	public static ItemPickaxe copperPickaxe = new ItemPickaxe(Enigmatica.copperToolMaterial, "copper_pickaxe");
	public static ItemPickaxe bronzePickaxe = new ItemPickaxe(Enigmatica.bronzeToolMaterial, "bronze_pickaxe");
	public static ItemPickaxe steelPickaxe = new ItemPickaxe(Enigmatica.steelToolMaterial, "steel_pickaxe");
	public static ItemPickaxe bedrockPickaxe = new ItemPickaxe(Enigmatica.bedrockToolMaterial, "bedrock_pickaxe");
	public static ItemPickaxe goldenrockPickaxe = new ItemPickaxe(Enigmatica.goldenrockToolMaterial, "goldenrock_pickaxe");
	public static ItemPickaxe emeraldrockPickaxe = new ItemPickaxe(Enigmatica.emeraldrockToolMaterial, "emeraldrock_pickaxe");
	public static ItemPickaxe mithrilPickaxe = new ItemPickaxe(Enigmatica.mithrilToolMaterial, "mithril_pickaxe");
	public static ItemPickaxe infusedMithrilPickaxe = new ItemPickaxe(Enigmatica.infusedMithrilToolMaterial, "infused_mithril_pickaxe");
	
	//Axes
	public static ItemAxe copperAxe = new ItemAxe(Enigmatica.copperToolMaterial, "copper_axe");
	public static ItemAxe bronzeAxe = new ItemAxe(Enigmatica.bronzeToolMaterial, "bronze_axe");
	public static ItemAxe steelAxe = new ItemAxe(Enigmatica.steelToolMaterial, "steel_axe");
	public static ItemAxe bedrockAxe = new ItemAxe(Enigmatica.bedrockToolMaterial, "bedrock_axe");
	public static ItemAxe goldenrockAxe = new ItemAxe(Enigmatica.goldenrockToolMaterial, "goldenrock_axe");
	public static ItemAxe emeraldrockAxe = new ItemAxe(Enigmatica.emeraldrockToolMaterial, "emeraldrock_axe");
	public static ItemAxe mithrilAxe = new ItemAxe(Enigmatica.mithrilToolMaterial, "mithril_axe");
	public static ItemAxe infusedMithrilAxe = new ItemAxe(Enigmatica.infusedMithrilToolMaterial, "infused_mithril_axe");
	
	//Shovels
	public static ItemShovel copperShovel = new ItemShovel(Enigmatica.copperToolMaterial, "copper_shovel");
	public static ItemShovel bronzeShovel = new ItemShovel(Enigmatica.bronzeToolMaterial, "bronze_shovel");
	public static ItemShovel steelShovel = new ItemShovel(Enigmatica.steelToolMaterial, "steel_shovel");
	public static ItemShovel bedrockShovel = new ItemShovel(Enigmatica.bedrockToolMaterial, "bedrock_shovel");
	public static ItemShovel goldenrockShovel = new ItemShovel(Enigmatica.goldenrockToolMaterial, "goldenrock_shovel");
	public static ItemShovel emeraldrockShovel = new ItemShovel(Enigmatica.emeraldrockToolMaterial, "emeraldrock_shovel");
	public static ItemShovel mithrilShovel = new ItemShovel(Enigmatica.mithrilToolMaterial, "mithril_shovel");
	public static ItemShovel infusedMithrilShovel = new ItemShovel(Enigmatica.infusedMithrilToolMaterial, "infused_mithril_shovel");
	
	//Hoes
	public static ItemHoe copperHoe = new ItemHoe(Enigmatica.copperToolMaterial, "copper_hoe");
	public static ItemHoe bronzeHoe = new ItemHoe(Enigmatica.bronzeToolMaterial, "bronze_hoe");
	public static ItemHoe steelHoe = new ItemHoe(Enigmatica.steelToolMaterial, "steel_hoe");
	public static ItemHoe bedrockHoe = new ItemHoe(Enigmatica.bedrockToolMaterial, "bedrock_hoe");
	public static ItemHoe goldenrockHoe = new ItemHoe(Enigmatica.goldenrockToolMaterial, "goldenrock_hoe");
	public static ItemHoe emeraldrockHoe = new ItemHoe(Enigmatica.emeraldrockToolMaterial, "emeraldrock_hoe");
	public static ItemHoe mithrilHoe = new ItemHoe(Enigmatica.mithrilToolMaterial, "mithril_hoe");
	public static ItemHoe infusedMithrilHoe = new ItemHoe(Enigmatica.infusedMithrilToolMaterial, "infused_mithril_hoe");
	
	//Items
	public static ItemBase gemEmerald = new ItemBase("emerald_gem");
	public static ItemBase gemEnchantment = new ItemBase("gem_of_enchantment");
	public static ItemOre ingotBronze = new ItemOre("bronze_ingot", "ingotBronze");
	public static ItemOre ingotCopper = new ItemOre("copper_ingot", "ingotCopper");
	public static ItemBase ingotGlowing = new ItemBase("glowing_ingot");
	public static ItemBase ingotMithrilInfused = new ItemBase("infused_mithril_ingot");
	public static ItemOre ingotMithril = new ItemOre("mithril_ingot", "ingotMithril");
	public static ItemOre ingotSteel = new ItemOre("steel_ingot", "ingotSteel");
	public static ItemOre ingotStone = new ItemOre("stone_ingot", "ingotStone");
	public static ItemBase mixtureStone = new ItemBase("stone_mixture");
	public static ItemBase powderAndesite = new ItemBase("andesite_powder");
	public static ItemBase powderDiorite = new ItemBase("diorite_powder");
	public static ItemBase powderGranite = new ItemBase("granite_powder");
	public static ItemBase powderStone = new ItemBase("stone_powder");
	
	//Build array
	public static ItemBase[] list =
		{
				gemEmerald,
				gemEnchantment,
				ingotBronze,
				ingotCopper,
				ingotGlowing,
				ingotMithrilInfused,
				ingotMithril,
				ingotSteel,
				ingotStone,
				mixtureStone,
				powderAndesite,
				powderDiorite,
				powderGranite,
				powderStone
		};
	public static ItemSword[] sword =
		{
			copperSword,
			bronzeSword,
			steelSword,
			bedrockSword,
			goldenrockSword,
			emeraldrockSword,
			mithrilSword,
			infusedMithrilSword
		};
	public static ItemPickaxe[] pick =
		{
			copperPickaxe,
			bronzePickaxe,
			steelPickaxe,
			bedrockPickaxe,
			goldenrockPickaxe,
			emeraldrockPickaxe,
			mithrilPickaxe,
			infusedMithrilPickaxe
		};
	public static ItemAxe[] axe =
		{
			copperAxe,
			bronzeAxe,
			steelAxe,
			bedrockAxe,
			goldenrockAxe,
			emeraldrockAxe,
			mithrilAxe,
			infusedMithrilAxe
		};
	public static ItemShovel[] shovel =
		{
			copperShovel,
			bronzeShovel,
			steelShovel,
			bedrockShovel,
			goldenrockShovel,
			emeraldrockShovel,
			mithrilShovel,
			infusedMithrilShovel
		};
	public static ItemHoe[] hoe =
		{
			copperHoe,
			bronzeHoe,
			steelHoe,
			bedrockHoe,
			goldenrockHoe,
			emeraldrockHoe,
			mithrilHoe,
			infusedMithrilHoe
		};
	
	public static void register(IForgeRegistry<Item> registry)
	{
		for(ItemBase item : list)
		{
			registry.register(item);
		}
		for(ItemSword item : sword)
		{
			registry.register(item);
		}
		for(ItemPickaxe item : pick)
		{
			registry.register(item);
		}
		for(ItemAxe item : axe)
		{
			registry.register(item);
		}
		for(ItemShovel item : shovel)
		{
			registry.register(item);
		}
		for(ItemHoe item : hoe)
		{
			registry.register(item);
		}
	}
	
	public static void registerModels()
	{
		for(ItemBase item : list)
		{
			item.registerItemModel();
		}
		for(ItemSword item : sword)
		{
			item.registerItemModel(item);
		}
		for(ItemPickaxe item : pick)
		{
			item.registerItemModel(item);
		}
		for(ItemAxe item : axe)
		{
			item.registerItemModel(item);
		}
		for(ItemShovel item : shovel)
		{
			item.registerItemModel(item);
		}
		for(ItemHoe item : hoe)
		{
			item.registerItemModel(item);
		}
	}
}
