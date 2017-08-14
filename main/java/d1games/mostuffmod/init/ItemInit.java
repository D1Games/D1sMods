package d1games.mostuffmod.init;

import d1games.mostuffmod.Reference;
import d1games.mostuffmod.init.items.CustomIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemInit 
{
	public static Item mithril_ingot;
	
	public static void init()
	{
		mithril_ingot = new CustomIngot("mithril_ingot");
	}
	
	public static void register()
	{
		registerItem(mithril_ingot);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
		new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
