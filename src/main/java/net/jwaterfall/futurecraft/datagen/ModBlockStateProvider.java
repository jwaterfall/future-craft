package net.jwaterfall.futurecraft.datagen;

import net.jwaterfall.futurecraft.FutureCraft;
import net.jwaterfall.futurecraft.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, FutureCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        blockWithItem(ModBlocks.SCRAP_METAL_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> block)
    {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}
