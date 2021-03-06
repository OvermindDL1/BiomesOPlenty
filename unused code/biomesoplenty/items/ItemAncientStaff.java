package biomesoplenty.items;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import biomesoplenty.api.Blocks;

public class ItemAncientStaff extends Item
{
    public ItemAncientStaff(int par1)
    {
        super(par1);
        this.maxStackSize = 1;
    }
	
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
    
	public void registerIcons(IconRegister iconRegister)
	{
    	itemIcon = iconRegister.registerIcon("BiomesOPlenty:ancientstaff");
	}

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		if (par3EntityPlayer.dimension == 0)
		{

			if (par2World.getBlockId(0, 64 - 32, 0) != Blocks.promisedPortal.get().blockID)
			{

				if (!par3EntityPlayer.worldObj.isRemote)
				{
					par3EntityPlayer.addChatMessage("\u00a75A gateway to the \u00a76\u00a7l\u00a7nPromised Land\u00a75 has been buried at the origin of this world.");
				}

				int var99 = 32;

				par2World.setBlock(-1, 62 - var99, 1, Block.whiteStone.blockID);
				par2World.setBlock(0, 62 - var99, 1, Block.whiteStone.blockID);
				par2World.setBlock(1, 62 - var99, 1, Block.whiteStone.blockID);
				par2World.setBlock(1, 62 - var99, 0, Block.whiteStone.blockID);
				par2World.setBlock(1, 62 - var99, -1, Block.whiteStone.blockID);
				par2World.setBlock(0, 62 - var99, -1, Block.whiteStone.blockID);
				par2World.setBlock(-1, 62 - var99, -1, Block.whiteStone.blockID);
				par2World.setBlock(-1, 62 - var99, 0, Block.whiteStone.blockID);
				par2World.setBlock(0, 62 - var99, 0, Block.whiteStone.blockID);

				par2World.setBlock(-1, 63 - var99, 2, Block.whiteStone.blockID);
				par2World.setBlock(0, 63 - var99, 2, Block.whiteStone.blockID);
				par2World.setBlock(1, 63 - var99, 2, Block.whiteStone.blockID);
				par2World.setBlock(2, 63 - var99, 1, Block.whiteStone.blockID);
				par2World.setBlock(2, 63 - var99, 0, Block.whiteStone.blockID);
				par2World.setBlock(2, 63 - var99, -1, Block.whiteStone.blockID);
				par2World.setBlock(1, 63 - var99, -2, Block.whiteStone.blockID);
				par2World.setBlock(0, 63 - var99, -2, Block.whiteStone.blockID);
				par2World.setBlock(-1, 63 - var99, -2, Block.whiteStone.blockID);
				par2World.setBlock(-2, 63 - var99, -1, Block.whiteStone.blockID);
				par2World.setBlock(-2, 63 - var99, 0, Block.whiteStone.blockID);
				par2World.setBlock(-2, 63 - var99, 1, Block.whiteStone.blockID);

				par2World.setBlock(-1, 64 - var99, 2, Block.whiteStone.blockID);
				par2World.setBlock(0, 64 - var99, 2, Block.whiteStone.blockID);
				par2World.setBlock(1, 64 - var99, 2, Block.whiteStone.blockID);
				par2World.setBlock(2, 64 - var99, 1, Block.whiteStone.blockID);
				par2World.setBlock(2, 64 - var99, 0, Block.whiteStone.blockID);
				par2World.setBlock(2, 64 - var99, -1, Block.whiteStone.blockID);
				par2World.setBlock(1, 64 - var99, -2, Block.whiteStone.blockID);
				par2World.setBlock(0, 64 - var99, -2, Block.whiteStone.blockID);
				par2World.setBlock(-1, 64 - var99, -2, Block.whiteStone.blockID);
				par2World.setBlock(-2, 64 - var99, -1, Block.whiteStone.blockID);
				par2World.setBlock(-2, 64 - var99, 0, Block.whiteStone.blockID);
				par2World.setBlock(-2, 64 - var99, 1, Block.whiteStone.blockID);

				par2World.setBlock(-1, 65 - var99, 2, Block.whiteStone.blockID);
				par2World.setBlock(0, 65 - var99, 2, Block.whiteStone.blockID);
				par2World.setBlock(1, 65 - var99, 2, Block.whiteStone.blockID);
				par2World.setBlock(2, 65 - var99, 1, Block.whiteStone.blockID);
				par2World.setBlock(2, 65 - var99, 0, Block.whiteStone.blockID);
				par2World.setBlock(2, 65 - var99, -1, Block.whiteStone.blockID);
				par2World.setBlock(1, 65 - var99, -2, Block.whiteStone.blockID);
				par2World.setBlock(0, 65 - var99, -2, Block.whiteStone.blockID);
				par2World.setBlock(-1, 65 - var99, -2, Block.whiteStone.blockID);
				par2World.setBlock(-2, 65 - var99, -1, Block.whiteStone.blockID);
				par2World.setBlock(-2, 65 - var99, 0, Block.whiteStone.blockID);
				par2World.setBlock(-2, 65 - var99, 1, Block.whiteStone.blockID);

				par2World.setBlock(-1, 66 - var99, 1, Block.whiteStone.blockID);
				par2World.setBlock(0, 66 - var99, 1, Block.whiteStone.blockID);
				par2World.setBlock(1, 66 - var99, 1, Block.whiteStone.blockID);
				par2World.setBlock(1, 66 - var99, 0, Block.whiteStone.blockID);
				par2World.setBlock(1, 66 - var99, -1, Block.whiteStone.blockID);
				par2World.setBlock(0, 66 - var99, -1, Block.whiteStone.blockID);
				par2World.setBlock(-1, 66 - var99, -1, Block.whiteStone.blockID);
				par2World.setBlock(-1, 66 - var99, 0, Block.whiteStone.blockID);
				par2World.setBlock(0, 66 - var99, 0, Block.whiteStone.blockID);

				par2World.setBlock(-1, 63 - var99, 1, 0);
				par2World.setBlock(0, 63 - var99, 1, 0);
				par2World.setBlock(1, 63 - var99, 1, 0);
				par2World.setBlock(1, 63 - var99, 0, 0);
				par2World.setBlock(1, 63 - var99, -1, 0);
				par2World.setBlock(0, 63 - var99, -1, 0);
				par2World.setBlock(-1, 63 - var99, -1, 0);
				par2World.setBlock(-1, 63 - var99, 0, 0);
				par2World.setBlock(0, 63 - var99, 0, 0);

				par2World.setBlock(-1, 64 - var99, 1, 0);
				par2World.setBlock(0, 64 - var99, 1, 0);
				par2World.setBlock(1, 64 - var99, 1, 0);
				par2World.setBlock(1, 64 - var99, 0, 0);
				par2World.setBlock(1, 64 - var99, -1, 0);
				par2World.setBlock(0, 64 - var99, -1, 0);
				par2World.setBlock(-1, 64 - var99, -1, 0);
				par2World.setBlock(-1, 64 - var99, 0, 0);

				par2World.setBlock(-1, 65 - var99, 1, 0);
				par2World.setBlock(0, 65 - var99, 1, 0);
				par2World.setBlock(1, 65 - var99, 1, 0);
				par2World.setBlock(1, 65 - var99, 0, 0);
				par2World.setBlock(1, 65 - var99, -1, 0);
				par2World.setBlock(0, 65 - var99, -1, 0);
				par2World.setBlock(-1, 65 - var99, -1, 0);
				par2World.setBlock(-1, 65 - var99, 0, 0);
				par2World.setBlock(0, 65 - var99, 0, 0);

				par2World.setBlock(0, 64 - var99, 0, Blocks.promisedPortal.get().blockID);

				par2World.setBlock(-2, 64 - var99, 2, 0);
				par2World.setBlock(2, 64 - var99, 2, 0);
				par2World.setBlock(2, 64 - var99, -2, 0);
				par2World.setBlock(-2, 64 - var99, -2, 0);

				par2World.setBlock(-2, 65 - var99, 2, 0);
				par2World.setBlock(2, 65 - var99, 2, 0);
				par2World.setBlock(2, 65 - var99, -2, 0);
				par2World.setBlock(-2, 65 - var99, -2, 0);

				par2World.setBlock(-2, 66 - var99, 2, 0);
				par2World.setBlock(2, 66 - var99, 2, 0);
				par2World.setBlock(2, 66 - var99, -2, 0);
				par2World.setBlock(-2, 66 - var99, -2, 0);
			}
		}

		return par1ItemStack;
    }
}
