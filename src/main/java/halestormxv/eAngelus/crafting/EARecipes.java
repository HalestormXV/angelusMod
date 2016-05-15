package halestormxv.eAngelus.crafting;

import halestormxv.eAngelus.main.init.eAngelusBlocks;
import halestormxv.eAngelus.main.init.eAngelusItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EARecipes 
{
	public static void initRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(eAngelusBlocks.angelic_block),
				new Object []
						{
								"###",
								"###",
								"###",
								'#', eAngelusItems.angelic_ingot				
						});
		
		GameRegistry.addShapelessRecipe(new ItemStack(eAngelusItems.angelic_ingot, 9), 
				new Object [] {
				eAngelusBlocks.angelic_block
				});
	}

}
