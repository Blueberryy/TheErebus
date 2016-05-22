package erebus.core.handler.configs;

import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import erebus.lib.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

import java.util.ArrayList;
import java.util.List;

public class ConfigGUI extends GuiConfig {

	public ConfigGUI(GuiScreen parent) {
		super(parent, getElements(), Reference.MOD_ID, Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigHandler.INSTANCE.config.toString()));
	}

	@SuppressWarnings({ "rawtypes" })
	private static List<IConfigElement> getElements() {
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		for (String category : ConfigHandler.INSTANCE.usedCategories)
			list.add(new ConfigElement(ConfigHandler.INSTANCE.config.getCategory(category.toLowerCase())));
		return list;
	}
}