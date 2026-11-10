package com.dragn0007.daybreak_herbs.blocks.base;

import com.dragn0007.daybreak_herbs.blocks.DBHBlocks;
import com.dragn0007.daybreak_herbs.items.DBHItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BaseOldNestBlock extends Block {
    public BaseOldNestBlock(Properties properties) {super(properties);}
    protected static final VoxelShape AABB =  Block.box(0, 0, 0, 16, 3, 16);

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (state.is(DBHBlocks.OLD_FUR_NEST.get()) && itemstack.is(DBHItems.PINE_RESIN.get())) {
            BlockState setOld = DBHBlocks.FUR_NEST.get().defaultBlockState();
            level.setBlockAndUpdate(pos, setOld);
        }
        if (state.is(DBHBlocks.OLD_MOSS_NEST.get()) && itemstack.is(DBHItems.MOSS_CLUMP.get())) {
            BlockState setOld = DBHBlocks.MOSS_NEST.get().defaultBlockState();
            level.setBlockAndUpdate(pos, setOld);
        }
        if (state.is(DBHBlocks.OLD_REED_NEST.get()) && itemstack.is(DBHItems.BULRUSH_FLUFF.get())) {
            BlockState setOld = DBHBlocks.REED_NEST.get().defaultBlockState();
            level.setBlockAndUpdate(pos, setOld);
        }
        return super.use(state, level, pos, player, hand, result);
    }

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return AABB;
    }
}
