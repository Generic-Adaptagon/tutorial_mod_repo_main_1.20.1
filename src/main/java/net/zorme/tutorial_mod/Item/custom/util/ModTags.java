package net.zorme.tutorial_mod.Item.custom.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.zorme.tutorial_mod.tutorial_mod;

public class ModTags {
    public static  class  Blocks {

        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        public static final TagKey<Block> NEED_SAPPHIRE_TOOL = tag("needs_sapphire_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(tutorial_mod.MOD_ID, name));

        }
    }
    private static TagKey<Item> tag(String name) {
        return ItemTags.create(new ResourceLocation(tutorial_mod.MOD_ID, name));

    }




}
