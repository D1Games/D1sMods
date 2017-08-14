package d1games.mostuffmod.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomIngot extends Item 
{
	public CustomIngot(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
	}
}
