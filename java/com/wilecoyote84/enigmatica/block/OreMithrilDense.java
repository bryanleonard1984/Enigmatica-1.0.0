package com.wilecoyote84.enigmatica.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class OreMithrilDense extends BlockBase
{
	public OreMithrilDense()
	{
		super(Material.ROCK, "ore_mithril_dense", 15.0F, 20.0F, "pickaxe", 4, 0.0F);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(ModBlocks.oreMithril);
	}
	
	public int quantityDropped(Random rand)
	{
		int max = 3;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
