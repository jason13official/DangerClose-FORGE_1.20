package net.ggwpgaming.dangerclose.entity;

import net.ggwpgaming.dangerclose.DangerClose;
import net.ggwpgaming.dangerclose.config.DCCommonConfigs;
import net.ggwpgaming.dangerclose.init.DCTags;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DangerClose.MOD_ID)
public class DCDetector {
    @SubscribeEvent
    public static void onLivingUpdate(LivingEvent.LivingTickEvent event) {

        LivingEntity entity = event.getEntity();
        Level level = entity.level();
        BlockPos pos = entity.blockPosition();

//        if (entity instanceof Player) {
//            entity.sendSystemMessage(Component.literal("Ticking on player!"));
//        }
        /* IF CONFIG IS TRUE AND ENTITY TOO CLOSE TO TORCH */
        if
        (
            DCCommonConfigs.ENABLE_TORCH_BURN_DAMAGE.get() &&
            (
                level.getBlockState(pos).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.TORCH_BURN_DANGER) ||
                level.getBlockState(pos.above()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.TORCH_BURN_DANGER) ||
                level.getBlockState(pos.below()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.TORCH_BURN_DANGER) ||
                level.getBlockState(pos.north()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.TORCH_BURN_DANGER) ||
                level.getBlockState(pos.east()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.TORCH_BURN_DANGER) ||
                level.getBlockState(pos.south()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.TORCH_BURN_DANGER) ||
                level.getBlockState(pos.west()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.TORCH_BURN_DANGER)
            )
        )
        {
            entity.setSecondsOnFire(2);
//            entity.sendSystemMessage(Component.literal("Too close!"));
        }

        /* IF CONFIG IS TRUE AND ENTITY TOO CLOSE TO CAMPFIRE */
        if
        (
            DCCommonConfigs.ENABLE_CAMPFIRE_BURN_DAMAGE.get() &&
            (
                level.getBlockState(pos).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER) ||
                level.getBlockState(pos.above()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER) ||
                level.getBlockState(pos.below()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER) ||
                level.getBlockState(pos.north()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER) ||
                level.getBlockState(pos.east()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER) ||
                level.getBlockState(pos.south()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER) ||
                level.getBlockState(pos.west()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER)
            )
        )
        {
            entity.setSecondsOnFire(2);
//            entity.sendSystemMessage(Component.literal("Too close!"));
        } else if
        (
            !DCCommonConfigs.ENABLE_CAMPFIRE_BURN_DAMAGE.get() &&
            (
                level.getBlockState(pos).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER) ||
                level.getBlockState(pos.above()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER) ||
                level.getBlockState(pos.below()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER) ||
                level.getBlockState(pos.north()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER) ||
                level.getBlockState(pos.east()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER) ||
                level.getBlockState(pos.south()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER) ||
                level.getBlockState(pos.west()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER)
            )
        )
        {
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10, 10, false, false, false));
//            entity.sendSystemMessage(Component.literal("Too close!"));
        }


//        else if (!DCCommonConfigs.ENABLE_CAMPFIRE_BURN_DAMAGE.get() && level.getBlockState(pos).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CAMPFIRE_BURN_DANGER))
//        {entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10, 10, false, false, false));}

        /* IF CONFIG IS TRUE AND ENTITY TOO CLOSE TO STONECUTTER */
        if
        (
            DCCommonConfigs.ENABLE_STONECUTTER_DAMAGE.get() &&
            (
                level.getBlockState(pos).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CUTTING_DANGER) ||
                level.getBlockState(pos.above()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CUTTING_DANGER) ||
                level.getBlockState(pos.below()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CUTTING_DANGER) ||
                level.getBlockState(pos.north()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CUTTING_DANGER) ||
                level.getBlockState(pos.east()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CUTTING_DANGER) ||
                level.getBlockState(pos.south()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CUTTING_DANGER) ||
                level.getBlockState(pos.west()).getTags().anyMatch(blockTagKey -> blockTagKey == DCTags.Blocks.CUTTING_DANGER)
            )
        )
        {
            entity.addEffect(new MobEffectInstance(MobEffects.HARM, 1, 0, false, false));
//            entity.sendSystemMessage(Component.literal("Too close!"));
        }
    }
}
