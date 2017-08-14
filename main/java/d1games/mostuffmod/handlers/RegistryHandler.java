package d1games.mostuffmod.handlers;

import d1games.mostuffmod.init.ItemInit;

public class RegistryHandler 
{
	public static void Client()
	{
		ItemInit.register();
	}
	
	public static void Common() 
	{
		ItemInit.init();
	}
}
