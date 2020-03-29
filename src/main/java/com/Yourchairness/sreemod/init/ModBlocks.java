package com.Yourchairness.sreemod.init;

import java.util.ArrayList;


import java.util.List;

import com.Yourchairness.sreemod.blocks.NickelBlock;
import com.Yourchairness.sreemod.blocks.NickelOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block NICKEL_BLOCK = new NickelBlock("nickel_block", Material.IRON);
	public static final Block NICKEL_ORE = new NickelOre("nickel_ore", Material.ROCK);
	
}
