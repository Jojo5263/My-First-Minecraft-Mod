package net.jojo.tutorialmod.item;

import net.jojo.tutorialmod.TutorialMod;
import net.jojo.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_MODE_TABS = CREATIVE_MODE_TABS.register("alexandrite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.tutorialmod.alexandrite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.ALEXANDRITE.get());
                    output.accept(ModItems.RAW_ALEXANDRITE.get());

                    output.accept(ModItems.CHISEL.get());

                        output.accept(ModBlocks.MAGIC_BLOCK.get());

                    }).build());

public static final RegistryObject<CreativeModeTab> ALEXANDRITE_BLOCKS_TABS = CREATIVE_MODE_TABS.register("alexandrite_blocks_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALEXANDRITE_BLOCK.get()))
                            .withTabsAfter(ALEXANDRITE_MODE_TABS.getId())
                            .title(Component.translatable("creativetab.tutorialmod.alexandrite_blocks"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                                output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
                                output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                                output.accept(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get());
                            }).build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
