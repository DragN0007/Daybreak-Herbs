package com.dragn0007.daybreak_herbs.blocks.base;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BaseNestBlock extends Block {
    public BaseNestBlock(Properties properties) {super(properties);}
    protected static final VoxelShape AABB =  Block.box(0, 0, 0, 16, 3, 16);

    public static final IntegerProperty DEGRADE_TIME = IntegerProperty.create("degrade_time", 0, 33);
    public IntegerProperty getDegradeTimeProperty() {return DEGRADE_TIME;}
    public int getMaxDegradeTime() {return 32;}
    public int getDegradeTime(BlockState state) {return state.getValue(this.getDegradeTimeProperty());}
    public BlockState getStateForDegradeTime(int i) {return this.defaultBlockState().setValue(this.getDegradeTimeProperty(), Integer.valueOf(i));}
    public boolean isRandomlyTicking(BlockState state) {return true;}
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DEGRADE_TIME);
    }

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return AABB;
    }
}
