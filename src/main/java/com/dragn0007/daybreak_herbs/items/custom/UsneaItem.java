package com.dragn0007.daybreak_herbs.items.custom;

import com.dragn0007.daybreak_herbs.blocks.DBHBlocks;
import com.dragn0007.daybreak_herbs.blocks.base.AttachedBlock;
import com.dragn0007.daybreak_herbs.items.custom.base.HerbalNameBlockItem;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UsneaItem extends HerbalNameBlockItem {

    public UsneaItem(Block block, Properties properties) {
        super(block, properties);
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.EAT;
    }

    public InteractionResult place(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        Level level = context.getLevel();
        if (context.getClickedFace() != Direction.DOWN && context.getClickedFace() != Direction.UP) {
            level.setBlock(blockpos, DBHBlocks.HANGING_USNEA.get().defaultBlockState().setValue(AttachedBlock.FACING, context.getHorizontalDirection().getOpposite()), 2);
        }
        return super.place(context);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.daybreak_herbs.usnea.tooltip").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("tooltip.daybreak_herbs.usnea_plants.tooltip").withStyle(ChatFormatting.YELLOW));
        appendEffectText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
