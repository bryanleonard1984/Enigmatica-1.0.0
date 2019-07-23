package com.wilecoyote84.enigmatica.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockBase
{
	private String oreName;
	
	public BlockOre(String name, String oreName, float hard, float resist, String tool, int minelvl, float lumi)
	{
		super(Material.ROCK, name, hard, resist, tool, minelvl, lumi);
		
		this.oreName = oreName;
	}
	
	public void initOreDict()
	{
		OreDictionary.registerOre(oreName, this);
	}
	
	@Override
	public BlockOre setCreativeTab(CreativeTabs tab)
	{
		super.setCreativeTab(tab);
		return this;
	}
}
