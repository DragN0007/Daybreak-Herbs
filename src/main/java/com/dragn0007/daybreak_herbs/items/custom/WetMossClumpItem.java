package com.dragn0007.daybreak_herbs.items.custom;

import com.dragn0007.daybreak_herbs.items.DBHItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WetMossClumpItem extends Item {
    public WetMossClumpItem() {
        super(new Properties().stacksTo(1));
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.DRINK;
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        return super.finishUsingItem(itemStack, level, entity);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.daybreak_herbs.wet_moss_clump.tooltip").withStyle(ChatFormatting.GRAY));
    }
}