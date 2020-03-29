package com.Yourchairness.sreemod.init;

import java.util.ArrayList;
import java.util.List;

import com.Yourchairness.sreemod.items.ItemBase;
import com.Yourchairness.sreemod.items.armor.ArmorBase;
import com.Yourchairness.sreemod.items.tools.ToolAxe;
import com.Yourchairness.sreemod.items.tools.ToolHoe;
import com.Yourchairness.sreemod.items.tools.ToolPickaxe;
import com.Yourchairness.sreemod.items.tools.ToolShovel;
import com.Yourchairness.sreemod.items.tools.ToolSword;
import com.Yourchairness.sreemod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ToolMaterial TOOL_NICKEL = EnumHelper.addToolMaterial("material_nickel", 2, 200, 5.0F, 2.0F, 10);
	public static final ArmorMaterial ARMOR_NICKEL = EnumHelper.addArmorMaterial("armor_nickel", Reference.MOD_ID + ":nickel", 12, 
			new int[] {1, 5, 6, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	
	public static final Item NICKEL_INGOT = new ItemBase("nickel_ingot");
	public static final Item NICKEL_NUGGET = new ItemBase("nickel_nugget");
	public static final Item NICKEL_DUST = new ItemBase("nickel_dust");
	
	
	public static final Item NICKEL_AXE = new ToolAxe("nickel_axe", TOOL_NICKEL);
	public static final Item NICKEL_HOE = new ToolHoe("nickel_hoe", TOOL_NICKEL);
	public static final Item NICKEL_PICKAXE = new ToolPickaxe("nickel_pickaxe", TOOL_NICKEL);
	public static final Item NICKEL_SHOVEL = new ToolShovel("nickel_shovel", TOOL_NICKEL);
	public static final Item NICKEL_SWORD = new ToolSword("nickel_sword", TOOL_NICKEL);
	
	public static final Item NICKEL_HELMET = new ArmorBase("nickel_helmet", ARMOR_NICKEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item NICKEL_CHESTPLATE = new ArmorBase("nickel_chestplate", ARMOR_NICKEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item NICKEL_LEGGINGS = new ArmorBase("nickel_leggings", ARMOR_NICKEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item NICKEL_BOOTS = new ArmorBase("nickel_boots", ARMOR_NICKEL, 1, EntityEquipmentSlot.FEET);

}
