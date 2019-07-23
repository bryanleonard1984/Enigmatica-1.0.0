package com.wilecoyote84.enigmatica.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks 
{
	//Ores
	public static BlockOre oreCopper = new BlockOre("ore_copper", "oreCopper", 3.0F, 5.0F, "pickaxe", 1, 0.0F);
	public static OreCopperDense oreCopperDense = new OreCopperDense();
	public static BlockOre oreBronze = new BlockOre("ore_bronze", "oreBronze", 3.5F, 6.0F, "pickaxe", 1, 0.0F);
	public static OreBronzeDense oreBronzeDense = new OreBronzeDense();
	public static BlockOre oreMithril = new BlockOre("ore_mithril", "oreMithril", 10.0F, 10.0F, "pickaxe", 4, 0.0F);
	public static OreMithrilDense oreMithrilDense = new OreMithrilDense();
	
	//Blocks
	public static BlockBase cobblestoneCompressed = new BlockBase(Material.ROCK, "cobblestone_compressed", 5.0F, 8.0F, "pickaxe", 1, 0.0F);
	public static BlockBase stoneCompressed = new BlockBase(Material.ROCK, "stone_compressed", 4.5F, 7.5F, "pickaxe", 1, 0.0F);
	public static BlockBase andesiteCompressed = new BlockBase(Material.ROCK, "andesite_compressed", 4.5F, 7.5F, "pickaxe", 1, 0.0F);
	public static BlockBase dioriteCompressed = new BlockBase(Material.ROCK, "diorite_compressed", 4.5F, 7.5F, "pickaxe", 1, 0.0F);
	public static BlockBase graniteCompressed = new BlockBase(Material.ROCK, "granite_compressed", 4.5F, 7.5F, "pickaxe", 1, 0.0F);
	public static BlockBase obsidianCompressed = new BlockBase(Material.ROCK, "obsidian_compressed", 100.0F, 4000.0F, "pickaxe", 3, 0.0F);
	public static BlockBase andesiteSmoothCompressed = new BlockBase(Material.ROCK, "andesite_smooth_compressed", 5.0F, 8.0F, "pickaxe", 1, 0.0F);
	public static BlockBase dioriteSmoothCompressed = new BlockBase(Material.ROCK, "diorite_smooth_compressed", 5.0F, 8.0F, "pickaxe", 1, 0.0F);
	public static BlockBase graniteSmoothCompressed = new BlockBase(Material.ROCK, "granite_smooth_compressed", 5.0F, 8.0F, "pickaxe", 1, 0.0F);
	public static BlockBase obsidianSmooth = new BlockBase(Material.ROCK, "obsidian_smooth", 125.0F, 4250.0F, "pickaxe", 3, 0.0F);
	public static BlockBase bedrockSmooth = new BlockBase(Material.ROCK, "bedrock_smooth", 200.0F, 7500.0F, "pickaxe", 5, 0.0F);
	public static BlockBase rockLuminescent = new BlockBase(Material.ROCK, "luminescent_rock", 25.0F, 50.0F, "pickaxe", 4, 6.0F);
	
	//Items and Multi-State Blocks
	public static BlockPedestal pedestal = new BlockPedestal();
	
	//Build array
	public static BlockBase[] list =
		{
				oreCopper,
				oreCopperDense,
				oreBronze,
				oreBronzeDense,
				oreMithril,
				oreMithrilDense,
				cobblestoneCompressed,
				stoneCompressed,
				andesiteCompressed,
				dioriteCompressed,
				graniteCompressed,
				obsidianCompressed,
				andesiteSmoothCompressed,
				dioriteSmoothCompressed,
				graniteSmoothCompressed,
				obsidianSmooth,
				bedrockSmooth,
				rockLuminescent,
				pedestal
		};
	
	
	public static void register(IForgeRegistry<Block> registry)
	{
		for(BlockBase item : list) 
		{
			registry.register(item);
		}
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry)
	{
		for(BlockBase item : list)
		{
			registry.register(item.createItemBlock());
		};
	}
	
	public static void registerModels()
	{
		for(BlockBase item : list)
		{
			item.registerItemModel(Item.getItemFromBlock(item));
		};
	}
}
