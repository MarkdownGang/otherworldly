package com.otherworldly.item;

import com.otherworldly.Otherworldly;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class OtherworldlyItems {
    public static final Item TEST_ITEM = Registry.register(Registries.ITEM, new Identifier(Otherworldly.MOD_ID, "test_item"), new Item(new FabricItemSettings()));
    public static final Item OCTANT = Registry.register(Registries.ITEM, new Identifier(Otherworldly.MOD_ID, "octant"), new OctantItem(new FabricItemSettings()));
    public static final Item LEVITATION_FRUIT = Registry.register(Registries.ITEM, new Identifier(Otherworldly.MOD_ID, "levitation_fruit"), new Item(new FabricItemSettings().food( new FoodComponent.Builder().hunger(10).saturationModifier(0.0f).statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 400, 1), 1).build())));
    
    public static void registerItems(){
        Otherworldly.LOGGER.debug("Registering items for Otherworldly");
    }

}

