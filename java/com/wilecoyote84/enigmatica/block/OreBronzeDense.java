package com.wilecoyote84.enigmatica.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class OreBronzeDense extends BlockBase
{
	public OreBronzeDense()
	{
		super(Material.ROCK, "ore_bronze_dense", 5.0F, 8.0F, "pickaxe", 1, 0.0F);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(ModBlocks.oreBronze);
	}
	
	public int quantityDropped(Random rand)
	{
		int max = 3;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}


