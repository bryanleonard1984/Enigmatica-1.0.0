package com.wilecoyote84.enigmatica.item;

import com.wilecoyote84.enigmatica.Enigmatica;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemBase extends Item
{
	protected String name;
	
	public ItemBase(String name)
	{
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Enigmatica.creativeTab);
	}
	
	public void registerItemModel()
	{
		Enigmatica.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab)
	{
		super .setCreativeTab(tab);
		return this;
	}
}
