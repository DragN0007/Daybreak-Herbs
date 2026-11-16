package com.dragn0007.daybreak_herbs.blocks.base;

import com.dragn0007.daybreak_herbs.blocks.entity.DBHBlockEntities;
import com.dragn0007.daybreak_herbs.common.gui.PreyPileMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class PreyPileBlockEntity extends BaseContainerBlockEntity {
   private NonNullList<ItemStack> items = NonNullList.withSize(18, ItemStack.EMPTY);

   protected final ContainerData dataAccess = new ContainerData() {
      @Override
      public int get(int p_39284_) {
         return 0;
      }

      @Override
      public void set(int p_39285_, int p_39286_) {

      }

      public int getCount() {
         return 18;
      }
   };

   public PreyPileBlockEntity(BlockPos pos, BlockState state) {
      super(DBHBlockEntities.PREY_PILE.get(), pos, state);
   }

   protected Component getDefaultName() {
      return Component.translatable("blockentities.daybreak_herbs.prey_pile");
   }

   public int getContainerSize() {
      return 18;
   }

   public boolean isEmpty() {
      for(ItemStack itemstack : this.items) {
         if (!itemstack.isEmpty()) {
            return false;
         }
      }
      return true;
   }

   @Nullable
   @Override
   public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
      return new PreyPileMenu(pContainerId, pPlayerInventory, this, dataAccess);
   }

   protected AbstractContainerMenu createMenu(int p_58990_, Inventory p_58991_) {
      return new PreyPileMenu(p_58990_, p_58991_, this, this.dataAccess);
   }

   protected void saveAdditional(CompoundTag p_187459_) {
      super.saveAdditional(p_187459_);
      ContainerHelper.saveAllItems(p_187459_, this.items);
   }

   public void load(CompoundTag p_155055_) {
      super.load(p_155055_);
      this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
      ContainerHelper.loadAllItems(p_155055_, this.items);
   }

   public ItemStack getItem(int p_59611_) {
      return this.items.get(p_59611_);
   }

   public ItemStack removeItem(int p_59613_, int p_59614_) {
      ItemStack itemstack = ContainerHelper.removeItem(this.items, p_59613_, p_59614_);
      if (!itemstack.isEmpty()) {this.setChanged();}
      return itemstack;
   }

   public ItemStack removeItemNoUpdate(int p_59630_) {
      return ContainerHelper.takeItem(this.items, p_59630_);
   }

   public void setItem(int p_59616_, ItemStack p_59617_) {
      this.items.set(p_59616_, p_59617_);
      if (p_59617_.getCount() > this.getMaxStackSize()) {
         p_59617_.setCount(this.getMaxStackSize());
      }
      this.setChanged();
   }

   public boolean stillValid(Player player) {
      return Container.stillValidBlockEntity(this, player);
   }

   public void clearContent() {
      this.items.clear();
   }
}