package com.Yourchairness.sreemod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class NickelOre extends BlockBase
{
	public NickelOre(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 1);
		
	}
}
