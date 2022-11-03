package com.bubblegum.mod.init;

import com.bubblegum.mod.BubblegumMod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, BubblegumMod.MODID);
	
	// register items
	
	public static final RegistryObject<Item> BUBBLEGUMITEM = ITEMS.register("bubblegum_item",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
	
	 /*
	public static final RegistryObject<Item> BUBBLEGUMSWORD = ITEMS.register("bubblegum_sword",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
            */
	
	public static final RegistryObject<Item> BUBBLEGUMSWORD = ITEMS.register("bubblegum_sword",
            () -> new SwordItem(ModItemTier.BUBBLEGUMITEM, 3, -2.4F, new Item.Properties().tab(ModCreativeTab.instance)));
	
	// create the tab for holding our items
	
	public static class ModCreativeTab extends CreativeModeTab {
	    private ModCreativeTab(int index, String label) {
	        super(index, label);
	    }

	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(BUBBLEGUMITEM.get());
	    }
	    
	    // create instance of the tab and fill it with CreativeModeTab
	    
	    public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "bubblegumgroup");

	}

}
