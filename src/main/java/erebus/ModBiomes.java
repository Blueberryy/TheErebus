package erebus;

import erebus.world.biomes.*;
import erebus.world.loot.WeightedList;

public class ModBiomes {
	public static WeightedList<BiomeBaseErebus> biomeList = new WeightedList<BiomeBaseErebus>();

	public static BiomeBaseErebus undergroundJungle;
	public static BiomeBaseErebus volcanicDesert;
	public static BiomeBaseErebus subterraneanSavannah;
	public static BiomeBaseErebus elysianFields;
	public static BiomeBaseErebus ulteriorOutback;
	public static BiomeBaseErebus fungalForest;
	public static BiomeBaseErebus submergedSwamp;

	public static int undergroundJungleID;
	public static int volcanicDesertID;
	public static int subterraneanSavannahID;
	public static int elysianFieldsID;
	public static int ulteriorOutbackID;
	public static int fungalForestID;
	public static int submergedSwampID;

	public static BiomeBaseErebus jungleSubLake;
	public static BiomeBaseErebus jungleSubAsperGrove;
	public static BiomeBaseErebus desertSubCharredForest;
	public static BiomeBaseErebus savannahSubRockyWasteland;
	public static BiomeBaseErebus savannahSubAsperGrove;
	public static BiomeBaseErebus savannahSubSteppe;
	public static BiomeBaseErebus fieldsSubForest;

	public static int jungleSubLakeID;
	public static int jungleSubAsperGroveID;
	public static int desertSubCharredForestID;
	public static int savannahSubRockyWastelandID;
	public static int savannahSubAsperGroveID;
	public static int savannahSubSteppeID;
	public static int fieldsSubForestID;

	public static void init() {
		for (int id : new int[] { undergroundJungleID, volcanicDesertID, subterraneanSavannahID, elysianFieldsID, ulteriorOutbackID, fungalForestID, submergedSwampID, jungleSubLakeID, jungleSubAsperGroveID, desertSubCharredForestID, savannahSubRockyWastelandID, savannahSubAsperGroveID, savannahSubSteppeID, fieldsSubForestID })
			if (id >= 128)
				throw new RuntimeException("Erebus biome IDs cannot be higher than 127!");

		// CREATE BIOMES

		undergroundJungle = new BiomeUndergroundJungle(undergroundJungleID);
		volcanicDesert = new BiomeVolcanicDesert(volcanicDesertID);
		subterraneanSavannah = new BiomeSubterraneanSavannah(subterraneanSavannahID);
		elysianFields = new BiomeElysianFields(elysianFieldsID);
		ulteriorOutback = new BiomeUlteriorOutback(ulteriorOutbackID);
		fungalForest = new BiomeFungalForest(fungalForestID);
		submergedSwamp = new BiomeSubmergedSwamp(submergedSwampID);
		fieldsSubForest = new BiomeElysianFields.BiomeElysianForest(fieldsSubForestID);

		// MUTATIONS

		undergroundJungle.isMutation();
		volcanicDesert.isMutation();
		subterraneanSavannah.isMutation();
		elysianFields.isMutation();
		ulteriorOutback.isMutation();
		fungalForest.isMutation();
		submergedSwamp.isMutation();

		fieldsSubForest.isMutation();
	}
}
