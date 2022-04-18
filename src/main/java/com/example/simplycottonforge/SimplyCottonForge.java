package com.example.simplycottonforge;

import com.example.simplycottonforge.core.BlockInit;
import com.example.simplycottonforge.core.ItemInit;
import com.example.simplycottonforge.core.LootInit;
import com.mojang.logging.LogUtils;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SimplyCottonForge.MOD_ID)
public class SimplyCottonForge {

	// Directly reference a slf4j logger
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LogUtils.getLogger();
	public static final String MOD_ID = "simplycottonforge";

	public SimplyCottonForge()
	{
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		BlockInit.BLOCKS.register(modEventBus);
		ItemInit.ITEMS.register(modEventBus);
		LootInit.LOOT_MODIFIERS.register(modEventBus);

		modEventBus.addListener(this::setupClient);

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setupClient(final FMLClientSetupEvent event) {
		ItemBlockRenderTypes.setRenderLayer(BlockInit.COTTON_CROP.get(), RenderType.cutout());
	}

	// Needed a way to get the seeds, I wanted to make them generate in plain farms
	// dropping the cotton seeds from grass would be cool too!
//	@SubscribeEvent
//	public void addNewTrade(VillagerTradesEvent event) {
//		if (event.getType() == VillagerProfession.FARMER) {
//			event.getTrades().get(1)
//				.add(new BasicItemListing(2, new ItemStack(ItemInit.COTTON_SEEDS.get()), 3, 2));
//		}
//
//		if (event.getType() == VillagerProfession.SHEPHERD) {
//			event.getTrades().get(1)
//				.add(new BasicItemListing(3, new ItemStack(ItemInit.COTTON_BALL.get()), 5, 2));
//			event.getTrades().get(1)
//				.add(new BasicItemListing(new ItemStack(ItemInit.COTTON_BALL.get()), new ItemStack(Items.EMERALD, 3), 2, 2, 1));
//			event.getTrades().get(1)
//			.add(new BasicItemListing(new ItemStack(ItemInit.COTTON_BALL.get()), new ItemStack(Items.EMERALD), 6, 2, 1));
//		}
//	}
}
