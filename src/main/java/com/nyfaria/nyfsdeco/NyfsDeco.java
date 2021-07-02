package com.nyfaria.nyfsdeco;

import net.fabricmc.api.ModInitializer;
import net.minecraft.data.server.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.EntityTypeTags;
import net.minecraft.tag.Tag;

public class NyfsDeco implements ModInitializer {

	@Override
	public void onInitialize() {
		BlockInit.init();
		ItemInit.init();
	}
}
