package net.jwaterfall.futurecraft.datagen;

import net.jwaterfall.futurecraft.block.ModBlocks;
import net.jwaterfall.futurecraft.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider
{
    public ModBlockLootTables()
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate()
    {
        add(ModBlocks.SCRAP_METAL_BLOCK.get(), (block) -> createOreDrop(ModBlocks.SCRAP_METAL_BLOCK.get(), ModItems.SCRAP_METAL.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
