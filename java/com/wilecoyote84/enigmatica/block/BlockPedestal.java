package com.wilecoyote84.enigmatica.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockPedestal extends BlockBase 
{
	public BlockPedestal()
	{
		super(Material.ROCK, "pedestal", 6.0F, 8.0F, "pickaxe", 1, 0.0F);
	}
	
	@Override
	@Deprecated
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	@Deprecated
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
}
