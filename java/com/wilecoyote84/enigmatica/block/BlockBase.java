package com.wilecoyote84.enigmatica.block;

import com.wilecoyote84.enigmatica.Enigmatica;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block
{
	protected String name;
	private float lumi;
	
	public BlockBase(Material material, String name, float hard, float resist, String tool, int minelvl, float light)
	{
		super(material);
		setHardness(hard);
		setResistance(resist);
		setHarvestLevel(tool, minelvl);
		lumi = (light/15.0F);
		setLightLevel(lumi);
		setCreativeTab(Enigmatica.creativeTab);
		
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	public void registerItemModel(Item itemBlock)
	{
		Enigmatica.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock()
	{
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab)
	{
		super .setCreativeTab(tab);
		return this;
	}
}

