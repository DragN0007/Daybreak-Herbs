package com.dragn0007.daybreak_herbs.blocks.base;

import com.dragn0007.daybreak_herbs.blocks.DBHBlocks;
import com.dragn0007.daybreak_herbs.items.DBHItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;

import java.util.List;

public class ReedNestBlock extends BaseNestBlock {
    public ReedNestBlock(Properties properties) {super(properties);}

    public static final IntegerProperty DEGRADE_TIME = IntegerProperty.create("degrade_time", 0, 33);
    public IntegerProperty getDegradeTimeProperty() {return DEGRADE_TIME;}
    public boolean isRandomlyTicking(BlockState state) {return true;}
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DEGRADE_TIME);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (itemstack.is(DBHItems.BULRUSH_FLUFF.get())) {
            BlockState newState = this.getStateForDegradeTime(1);
            level.setBlockAndUpdate(pos, newState);
        }
        return super.use(state, level, pos, player, hand, result);
    }

    int sitInNestTick;
    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {
        if (!level.isAreaLoaded(pos, 1)) return;
        int i = this.getDegradeTime(state);

        if (i <= this.getMaxDegradeTime()) {
            BlockState newState = this.getStateForDegradeTime(i + 1);
            level.setBlockAndUpdate(pos, newState);
        }

        if (i >= this.getMaxDegradeTime()) {
            BlockState setOld = DBHBlocks.OLD_MOSS_NEST.get().defaultBlockState();
            level.setBlockAndUpdate(pos, setOld);
        }

        double range = 1.0;
        AABB searchBox = new AABB(pos).inflate(range);
        List<Player> list = level.getEntitiesOfClass(Player.class, searchBox);
        for (Player player : list) {
            sitInNestTick++;

            if (sitInNestTick >= (2 * level.getGameRules().getRule(GameRules.RULE_RANDOMTICKING).get())) {
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 18000, 0, false, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 18000, 0, false, false));
                sitInNestTick = 0;
            }
        }
    }
}
