package me.ez.jej.Datagen.LootTable;

import me.ez.jej.Init;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class BlockLootTable extends BlockLoot {



    @Override
    protected void addTables() {
        this.add(Init.ICE_BERRY_BUSH.get(), (block) ->
            applyExplosionDecay(block,
                    LootTable.lootTable()
                            .withPool(LootPool.lootPool()
                                    .when(LootItemBlockStatePropertyCondition
                                            .hasBlockStateProperties(Init.ICE_BERRY_BUSH.get())
                                            .setProperties(StatePropertiesPredicate.Builder.properties()
                                                    .hasProperty(BlockStateProperties.AGE_3, 3)))
                                    .add(LootItem.lootTableItem(Init.ICE_BERRY.get()))
                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                    .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE)))

                            .withPool(LootPool.lootPool()
                                    .when(LootItemBlockStatePropertyCondition
                                            .hasBlockStateProperties(Init.ICE_BERRY_BUSH.get())
                                            .setProperties(StatePropertiesPredicate.Builder.properties()
                                                    .hasProperty(BlockStateProperties.AGE_3, 2)))
                                    .add(LootItem.lootTableItem(Init.ICE_BERRY.get()))
                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                    .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE)))));

        this.add(Init.STRAW_BERRY_BUSH.get(), (block ->
            applyExplosionDecay(block,
                    LootTable.lootTable()
                            .withPool(LootPool.lootPool()
                                    .when(LootItemBlockStatePropertyCondition
                                            .hasBlockStateProperties(Init.STRAW_BERRY_BUSH.get())
                                            .setProperties(StatePropertiesPredicate.Builder.properties()
                                                    .hasProperty(BlockStateProperties.AGE_3, 3)))
                                    .add(LootItem.lootTableItem(Init.STRAW_BERRY.get()))
                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                    .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE)))

                            .withPool(LootPool.lootPool()
                                    .when(LootItemBlockStatePropertyCondition
                                            .hasBlockStateProperties(Init.STRAW_BERRY_BUSH.get())
                                            .setProperties(StatePropertiesPredicate.Builder.properties()
                                                    .hasProperty(BlockStateProperties.AGE_3, 3)))
                                    .add(LootItem.lootTableItem(Init.STRAW_BERRY.get()))
                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                    .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))))));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return Init.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
