package com.example.simplycottonforge.core;

import com.example.simplycottonforge.SimplyCottonForge;
import com.example.simplycottonforge.common.item.CottonCrop;
import com.example.simplycottonforge.common.item.CottonSeeds;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			SimplyCottonForge.MOD_ID);

	public static final RegistryObject<CottonSeeds> COTTON_SEEDS = ITEMS.register("cotton_seeds",
			() -> new CottonSeeds(BlockInit.COTTON_CROP.get(),
					(new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<CottonCrop> COTTON_BALL = ITEMS.register("cotton_ball",
			() -> new CottonCrop((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));

}
