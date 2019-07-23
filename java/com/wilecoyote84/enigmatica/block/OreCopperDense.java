package com.wilecoyote84.enigmatica.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class OreCopperDense extends BlockBase
{
	public OreCopperDense()
	{
		super(Material.ROCK, "ore_copper_dense", 5.0F, 8.0F, "pickaxe", 1, 0.0F);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(ModBlocks.oreCopper);
	}
	
	public int quantityDropped(Random rand)
	{
		int max = 3;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
