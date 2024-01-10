package skritek.fableforged.painting;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import skritek.fableforged.FableForged;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANT =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, FableForged.MOD_ID);

    public static final RegistryObject<PaintingVariant> DELTA = PAINTING_VARIANT.register("delta",
            () -> new PaintingVariant(16,16));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANT.register(eventBus);
    }
}
