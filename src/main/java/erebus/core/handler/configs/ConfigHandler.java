package erebus.core.handler.configs;

import erebus.lib.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigHandler {

	public static final ConfigHandler INSTANCE = new ConfigHandler();

	public Configuration config;
	public int erebusDimensionID;
	public int portalCooldown;
	public byte beetleLarvaEating = 0;
	public boolean spawnPortalMobs, bombardierBlockDestroy, randomNames, playCustomSongs, lead, silver, copper, tin, aluminium, alternativePlanks, graveMarker, bioluminescence, glowshrooms, generateVents, allowRespawning;

	public boolean disableThaumcraft = false, disableFMP = false;

	public final String[] usedCategories = { Configuration.CATEGORY_GENERAL, "Biomes", "Ores", "Integration" };

	public void loadConfig(FMLPreInitializationEvent event) {
		config = new Configuration(event.getSuggestedConfigurationFile());

		config.load();
		syncConfigs();
	}

	private void syncConfigs() {

		erebusDimensionID = config.get(Configuration.CATEGORY_GENERAL, "Dimension ID of The Erebus", 66, "There doesn't appear to be a limit on dimension IDs, but try to keep it low").getInt(66);
		portalCooldown = config.get(Configuration.CATEGORY_GENERAL, "Number of seconds before the portal is usable again.", 5).getInt(5);
		allowRespawning = config.get(Configuration.CATEGORY_GENERAL, "Should player re-spawn in dimension", false).getBoolean(false);
		spawnPortalMobs = config.get(Configuration.CATEGORY_GENERAL, "Should spawn beetles and larvae in the portal", true).getBoolean(true);
		beetleLarvaEating = (byte) config.get(Configuration.CATEGORY_GENERAL, "Beetle larva eating settings", 0, "0 = only wooden blocks except tile entities & logs, 1 = only wooden blocks except logs, 2 = anything", 0, 2).getInt(0);
		bombardierBlockDestroy = config.get(Configuration.CATEGORY_GENERAL, "Bombardier Beetle Block destruction", true, "This will not stop block destruction for player attacks only collided with blocks!").getBoolean(true);
		randomNames = config.get(Configuration.CATEGORY_GENERAL, "Random mob names", true).getBoolean(true);
		playCustomSongs = config.get(Configuration.CATEGORY_GENERAL, "Play erebus songs", true).getBoolean(true);
		alternativePlanks = config.get(Configuration.CATEGORY_GENERAL, "Alternative Planks Textures", false).getBoolean(false);
		graveMarker = config.get(Configuration.CATEGORY_GENERAL, "Block O' Bones Inventory Save", true).getBoolean(true);
		bioluminescence = config.get(Configuration.CATEGORY_GENERAL, "Glowing bugs emit light", true).getBoolean(true);
		glowshrooms = config.get(Configuration.CATEGORY_GENERAL, "Add Glowshrooms to World generation", true).getBoolean(true);
		generateVents = config.get(Configuration.CATEGORY_GENERAL, "Generate natural swap vents", true).getBoolean(true);

		lead = config.get("Ores", "Generate lead", false).getBoolean(false);
		silver = config.get("Ores", "Generate silver", false).getBoolean(false);
		copper = config.get("Ores", "Generate copper", false).getBoolean(false);
		tin = config.get("Ores", "Generate tin", false).getBoolean(false);
		aluminium = config.get("Ores", "Generate aluminium", false).getBoolean(false);

		disableThaumcraft = config.get("Integration", "Disable Thaumcraft integration", false).getBoolean(false);
		disableFMP = config.get("Integration", "Disable Forge Multipart integration", false).getBoolean(false);

		if (config.hasChanged())
			config.save();
	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (Reference.MOD_ID.equals(event.getModID()))
			syncConfigs();
	}
}
