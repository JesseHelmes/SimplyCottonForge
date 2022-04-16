package com.example.simplycottonforge.common.loot;

import com.example.simplycottonforge.core.ItemInit;
import com.google.gson.JsonObject;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class GrassSeedModifier extends LootModifier {

	protected GrassSeedModifier(LootItemCondition[] conditionsIn) {
		super(conditionsIn);
	}

	@NotNull
	@Override
	protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
		generatedLoot.add(new ItemStack(ItemInit.COTTON_SEEDS.get()));
		return generatedLoot;
	}

	public static class Serializer extends GlobalLootModifierSerializer<GrassSeedModifier> {

		@Override
		public GrassSeedModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] ailootcondition) {
			return new GrassSeedModifier(ailootcondition);
		}

		@Override
		public JsonObject write(GrassSeedModifier instance) {
			JsonObject jsonObject = makeConditions(instance.conditions);
			jsonObject.addProperty("item", ItemInit.COTTON_SEEDS.get().getRegistryName().toString());
			return jsonObject;
		}
	}
}