package skritek.fableforged.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import skritek.fableforged.FableForged;
import skritek.fableforged.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FableForged.MOD_ID);

    public static final RegistryObject<Item> BLACKHOLE = ITEMS.register("blackhole",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MOONLIGHT_SONATA_MUSIC_DISC = ITEMS.register("moonlight_sonata_music_disc",
            () -> new RecordItem(8, ModSounds.MOONLIGHT_SONATA,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE), 4720));

    public static final RegistryObject<Item> INTRO_SHADOW_MUSIC_DISC = ITEMS.register("intro_shadow_music_disc",
            () -> new RecordItem(9, ModSounds.INTRO_SHADOW,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE), 4880));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
