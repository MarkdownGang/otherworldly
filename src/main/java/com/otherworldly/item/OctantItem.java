package com.otherworldly.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class OctantItem extends Item{

    public OctantItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient && world.getTimeOfDay() > 13000 && world.getTimeOfDay() < 23000 && world.getLightLevel(LightType.SKY, user.getBlockPos()) >= 12){

            int x = user.getChunkPos().x;
            int z = user.getChunkPos().z;

            user.sendMessage(Text.literal(x + ", " + z), true);
            
            //user.sendMessage(Text.literal("" + (world.getLightLevel(LightType.SKY, user.getBlockPos()))));
            user.getItemCooldownManager().set(this, 200);
        }

        return super.use(world, user, hand);
    }
}


