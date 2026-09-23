package com.dragn0007.daybreak_herbs.items.custom;

import com.dragn0007.daybreak_herbs.items.DBHItems;
import com.dragn0007.daybreak_herbs.items.custom.base.HerbalNameBlockItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SundropsItem extends HerbalNameBlockItem {

    public SundropsItem(Block block, Properties properties) {
        super(block, properties);
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.BOW;
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        ItemStack processedStack = new ItemStack(DBHItems.SUNDROPS_BUDS.get());
        if (entity instanceof Player player) {
            if (player.getOffhandItem().isEmpty() || player.getOffhandItem().getItem() == Items.AIR) {
                itemStack.shrink(1);
                player.setItemInHand(InteractionHand.OFF_HAND, processedStack);
            } else {
                player.displayClientMessage(Component.translatable("The off-paw must be free to process this plant!").withStyle(ChatFormatting.GOLD), true);
            }
        }
        return super.finishUsingItem(itemStack, level, entity);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.daybreak_herbs.petals.tooltip").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("tooltip.daybreak_herbs.sundrops_plants.tooltip").withStyle(ChatFormatting.YELLOW));
    }
}
