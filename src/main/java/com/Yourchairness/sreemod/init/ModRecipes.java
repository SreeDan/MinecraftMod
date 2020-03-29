package com.Yourchairness.sreemod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.NICKEL_ORE, new ItemStack(ModItems.NICKEL_INGOT, 1), 1.3f);
		
		GameRegistry.addSmelting(ModItems.NICKEL_SWORD, new ItemStack(ModItems.NICKEL_NUGGET, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.NICKEL_AXE, new ItemStack(ModItems.NICKEL_NUGGET, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.NICKEL_PICKAXE, new ItemStack(ModItems.NICKEL_NUGGET, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.NICKEL_HOE, new ItemStack(ModItems.NICKEL_NUGGET, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.NICKEL_SHOVEL, new ItemStack(ModItems.NICKEL_NUGGET, 1), 0.5f);
		
		GameRegistry.addSmelting(ModItems.NICKEL_HELMET, new ItemStack(ModItems.NICKEL_NUGGET, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.NICKEL_CHESTPLATE, new ItemStack(ModItems.NICKEL_NUGGET, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.NICKEL_LEGGINGS, new ItemStack(ModItems.NICKEL_NUGGET, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.NICKEL_BOOTS, new ItemStack(ModItems.NICKEL_NUGGET, 1), 0.5f);
	}
}
