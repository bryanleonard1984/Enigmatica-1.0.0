package com.wilecoyote84.enigmatica.item.tool;

import com.wilecoyote84.enigmatica.Enigmatica;
import com.wilecoyote84.enigmatica.item.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSword extends net.minecraft.item.ItemSword 
{
	private String name;
	
	public ItemSword(ToolMaterial material, String name)
	{
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(Enigmatica.creativeTab);
		this.name = name;
	}
	
	public void registerItemModel(Item item)
	{
		Enigmatica.proxy.registerItemRenderer(this, 0, name);
	}
}
