package com.wilecoyote84.enigmatica.client;

import com.wilecoyote84.enigmatica.Enigmatica;
import com.wilecoyote84.enigmatica.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EnigmaTab extends CreativeTabs
{
	public EnigmaTab()
	{
		super(Enigmatica.modid);
		setBackgroundImageName("item_search.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.gemEmerald);
	}
	
	@Override
	public boolean hasSearchBar()
	{
		return true;
	}
}
