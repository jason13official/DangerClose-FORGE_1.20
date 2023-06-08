package net.ggwpgaming.dangerclose.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class DCTags {
    public static class Blocks {
        public static final TagKey<Block> TORCH_BURN_DANGER = tag("torch_burn_danger");
        public static final TagKey<Block> CAMPFIRE_BURN_DANGER = tag("campfire_burn_danger");
        public static final TagKey<Block> CUTTING_DANGER = tag("cutting_danger");
    }

    private static TagKey<Block> tag(String name)
    {
        return BlockTags.create(new ResourceLocation("dangerclose", name));
    }
}
