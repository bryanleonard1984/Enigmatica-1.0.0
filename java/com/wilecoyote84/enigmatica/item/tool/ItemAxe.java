package com.wilecoyote84.enigmatica.item.tool;

import com.wilecoyote84.enigmatica.Enigmatica;

import net.minecraft.item.Item;

public class ItemAxe extends net.minecraft.item.ItemAxe
{
	private String name;
	
	public ItemAxe(ToolMaterial material, String name)
	{
		super(material, 8.0f, -3.1F);
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
