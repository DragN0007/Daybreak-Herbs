package com.dragn0007.daybreak_herbs.blocks.crop;

import com.dragn0007.daybreak_herbs.blocks.DBHBlocks;
import com.dragn0007.daybreak_herbs.blocks.base.HerbCropBlock;
import com.dragn0007.daybreak_herbs.items.DBHItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PoisonIvyBlock extends FlowerBlock {

   public PoisonIvyBlock(MobEffect p_53512_, int p_53513_, Properties p_53514_) {
      super(p_53512_, p_53513_, p_53514_);
   }

   public void entityInside(BlockState p_57270_, Level p_57271_, BlockPos p_57272_, Entity p_57273_) {
      if (p_57273_ instanceof LivingEntity && p_57273_.getType() != EntityType.FOX && p_57273_.getType() != EntityType.BEE) {
         p_57273_.makeStuckInBlock(p_57270_, new Vec3(0.8F, 0.75D, 0.8F));
         if (!p_57271_.isClientSide && (p_57273_.xOld != p_57273_.getX() || p_57273_.zOld != p_57273_.getZ())) {
            double d0 = Math.abs(p_57273_.getX() - p_57273_.xOld);
            double d1 = Math.abs(p_57273_.getZ() - p_57273_.zOld);
            if (d0 >= (double)0.003F || d1 >= (double)0.003F) {
               p_57273_.hurt(p_57271_.damageSources().sweetBerryBush(), 1.0F);
            }
         }
      }
   }
}