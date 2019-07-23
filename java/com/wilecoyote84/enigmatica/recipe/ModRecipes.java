package com.wilecoyote84.enigmatica.recipe;

import com.wilecoyote84.enigmatica.block.ModBlocks;
import com.wilecoyote84.enigmatica.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		//Ore Dict
		ModBlocks.oreCopper.initOreDict();
		ModBlocks.oreBronze.initOreDict();
		ModBlocks.oreMithril.initOreDict();
		ModItems.ingotCopper.initOreDict();
		ModItems.ingotBronze.initOreDict();
		ModItems.ingotMithril.initOreDict();
		ModItems.ingotSteel.initOreDict();
		ModItems.ingotStone.initOreDict();
		
		//Smelting recipes
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper, 1), 0.2F);
		GameRegistry.addSmelting(ModBlocks.oreCopperDense, new ItemStack(ModItems.ingotCopper, 3), 0.6F);
		GameRegistry.addSmelting(ModBlocks.cobblestoneCompressed, new ItemStack(ModBlocks.stoneCompressed, 1), 0.2F);
		GameRegistry.addSmelting(ModBlocks.andesiteCompressed, new ItemStack(ModBlocks.andesiteSmoothCompressed, 1), 0.2F);
		GameRegistry.addSmelting(new ItemStack(Blocks.STONE, 1, 5), new ItemStack(Blocks.STONE, 1, 6), 0.2F);
		GameRegistry.addSmelting(ModBlocks.dioriteCompressed, new ItemStack(ModBlocks.dioriteSmoothCompressed, 1), 0.2F);
		GameRegistry.addSmelting(new ItemStack(Blocks.STONE, 1, 3), new ItemStack(Blocks.STONE, 1, 4), 0.2F);
		GameRegistry.addSmelting(ModBlocks.graniteCompressed, new ItemStack(ModBlocks.graniteSmoothCompressed, 1), 0.2F);
		GameRegistry.addSmelting(new ItemStack(Blocks.STONE, 1, 1), new ItemStack(Blocks.STONE, 1, 2), 0.2F);
		GameRegistry.addSmelting(ModBlocks.obsidianCompressed, new ItemStack(ModBlocks.obsidianSmooth), 0.5F);
		GameRegistry.addSmelting(Blocks.BEDROCK, new ItemStack(ModBlocks.bedrockSmooth, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.stoneCompressed, new ItemStack(ModItems.powderStone, 4), 0.2F);
		GameRegistry.addSmelting(ModItems.mixtureStone, new ItemStack(ModItems.ingotStone, 1), 0.4F);
		GameRegistry.addSmelting(ModItems.ingotStone, new ItemStack(ModItems.ingotGlowing, 1), 0.8F);
	}
}
