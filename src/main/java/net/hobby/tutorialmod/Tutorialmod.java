package net.hobby.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.hobby.tutorialmod.block.ModBlocks;
import net.hobby.tutorialmod.item.ModItemGroups;
import net.hobby.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorialmod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}