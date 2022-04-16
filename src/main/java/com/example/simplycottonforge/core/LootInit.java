package com.example.simplycottonforge.core;

import com.example.simplycottonforge.SimplyCottonForge;
import com.example.simplycottonforge.common.loot.GrassSeedModifier;

import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LootInit {
	public static final DeferredRegister<GlobalLootModifierSerializer<?>> LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS,
			SimplyCottonForge.MOD_ID);

	public static final RegistryObject<GrassSeedModifier.Serializer> GRASS_SEED_MODIFIER = LOOT_MODIFIERS.register("cotton_seed_drops", GrassSeedModifier.Serializer::new);
}
