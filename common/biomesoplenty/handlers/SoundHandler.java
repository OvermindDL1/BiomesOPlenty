package biomesoplenty.handlers;

import java.util.logging.Level;

import net.minecraftforge.client.event.sound.PlayStreamingEvent;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SoundHandler 
{
	static String[] recordSoundFiles = { "biomesoplenty:bopdisc.ogg", "biomesoplenty:bopdiscmud.ogg" };
	static String[] soundFiles = { "biomesoplenty:mob/phantom/say.ogg", "biomesoplenty:mob/phantom/hurt.ogg", "biomesoplenty:mob/phantom/death.ogg" };
	
	@SideOnly(Side.CLIENT)
	@ForgeSubscribe
	public void onSoundLoad(SoundLoadEvent event) 
	{
		for (String soundFile : soundFiles) 
		{
			try 
			{
				event.manager.soundPoolSounds.addSound(soundFile);
			}

			catch (Exception e) 
			{
				FMLCommonHandler.instance().getFMLLogger().log(Level.WARNING, "[BiomesOPlenty] Failed loading sound file: " + soundFile);
			}
		}
		
		for (String recordSoundFile : recordSoundFiles) 
        {
            try 
            {
                event.manager.soundPoolStreaming.addSound(recordSoundFile);
            }

            catch (Exception e) 
            {
            	FMLCommonHandler.instance().getFMLLogger().log(Level.WARNING, "[BiomesOPlenty] Failed loading sound file: " + recordSoundFile);
            }
        }
	}
	
	@SideOnly(Side.CLIENT)
	@ForgeSubscribe
	public void onPlayStreaming(PlayStreamingEvent event) 
	{
		if (event.name == "bopdisc")
		{
			FMLClientHandler.instance().getClient().sndManager.playStreaming("biomesoplenty:bopdisc", (float) event.x + 0.5F, (float) event.y + 0.5F, (float) event.z + 0.5F);
		}
		else if (event.name == "bopdiscmud")
		{
			FMLClientHandler.instance().getClient().sndManager.playStreaming("biomesoplenty:bopdiscmud", (float) event.x + 0.5F, (float) event.y + 0.5F, (float) event.z + 0.5F);
		}
	}
}
