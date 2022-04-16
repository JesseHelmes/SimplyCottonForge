package com.example.simplycottonforge.common.block;

import com.example.simplycottonforge.core.ItemInit;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

// this should be shearable..
public class CottonCrop extends CropBlock {

	public CottonCrop(Properties builder) {
		super(builder);
	}

	protected ItemLike getBaseSeedId() {
		return ItemInit.COTTON_SEEDS.get();
	}

}
