package com.wilecoyote84.enigmatica.item.tool;

import com.wilecoyote84.enigmatica.Enigmatica;

import net.minecraft.item.Item;

public class ItemShovel extends net.minecraft.item.ItemSpade
{
	private String name;
	
	public ItemShovel(ToolMaterial material, String name)
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
