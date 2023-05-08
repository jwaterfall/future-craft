package net.jwaterfall.futurecraft.item;

import net.jwaterfall.futurecraft.FutureCraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "future_craft", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab FUTURE_CRAFT_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        FUTURE_CRAFT_TAB = event.registerCreativeModeTab(new ResourceLocation(FutureCraft.MOD_ID, "future_craft_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.SCRAP_METAL.get()))
                        .title(Component.translatable("creativemodetab.future_craft_tab")));
    }
}
