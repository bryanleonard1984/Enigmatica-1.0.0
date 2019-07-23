package com.wilecoyote84.enigmatica.proxy;

import com.wilecoyote84.enigmatica.Enigmatica;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerItemRenderer(Item item, int meta, String id)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Enigmatica.modid + ":" + id, "inventory"));
	}
}
