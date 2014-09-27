package emasher.gas.item;

import emasher.core.EmasherCore;
import emasher.gas.CommonProxy;
import emasher.gas.EmasherGas;
import net.minecraft.world.biome.*;
import net.minecraft.world.*;
import net.minecraft.world.chunk.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.tileentity.*;
import net.minecraft.block.material.*;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.potion.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fluids.*;

public class ItemGasVial extends Item
{
	public ItemGasVial(int id) 
	{
		super();
		
		setCreativeTab(EmasherGas.tabGasCraft);
		setMaxStackSize(16);
		setUnlocalizedName("gasVial");
	}
	
	public void registerIcons(IIconRegister registry)
	{
		this.itemIcon = registry.registerIcon("gascraft:vial");
	}
	
	
	
	
}
