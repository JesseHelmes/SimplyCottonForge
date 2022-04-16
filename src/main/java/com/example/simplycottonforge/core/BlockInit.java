package com.example.simplycottonforge.core;

import com.example.simplycottonforge.SimplyCottonForge;
import com.example.simplycottonforge.common.block.CottonCrop;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			SimplyCottonForge.MOD_ID);

	public static final RegistryObject<CottonCrop> COTTON_CROP = BLOCKS.register("cotton_crop",
			() -> new CottonCrop(BlockBehaviour.Properties.of(Material.PLANT)
					.noCollission().randomTicks().instabreak().sound(SoundType.CROP)));
}
