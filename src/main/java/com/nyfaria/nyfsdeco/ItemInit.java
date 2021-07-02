package com.nyfaria.nyfsdeco;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {
    public static void init(){
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "ct_slab"), new BlockItem(BlockInit.CT_TOPSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "bf_top"), new BlockItem(BlockInit.BF_TOPBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "bf_top_slab"), new BlockItem(BlockInit.BF_TOPSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "black_shulker_bottom"), new BlockItem(BlockInit.BLACK_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "black_shulker_slab"), new BlockItem(BlockInit.BLACK_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "blue_shulker_bottom"), new BlockItem(BlockInit.BLUE_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "blue_shulker_slab"), new BlockItem(BlockInit.BLUE_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "brown_shulker_bottom"), new BlockItem(BlockInit.BROWN_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "brown_shulker_slab"), new BlockItem(BlockInit.BROWN_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "ct_top"), new BlockItem(BlockInit.CT_TOPBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "cyan_shulker_bottom"), new BlockItem(BlockInit.CYAN_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "cyan_shulker_slab"), new BlockItem(BlockInit.CYAN_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "gray_shulker_bottom"), new BlockItem(BlockInit.GRAY_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "gray_shulker_slab"), new BlockItem(BlockInit.GRAY_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "green_shulker_bottom"), new BlockItem(BlockInit.GREEN_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "green_shulker_slab"), new BlockItem(BlockInit.GREEN_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "light_blue_shulker_bottom"), new BlockItem(BlockInit.LIGHT_BLUE_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "light_blue_shulker_slab"), new BlockItem(BlockInit.LIGHT_BLUE_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "light_gray_shulker_bottom"), new BlockItem(BlockInit.LIGHT_GRAY_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "light_gray_shulker_slab"), new BlockItem(BlockInit.LIGHT_GRAY_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "lime_shulker_bottom"), new BlockItem(BlockInit.LIME_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "lime_shulker_slab"), new BlockItem(BlockInit.LIME_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "ls_side"), new BlockItem(BlockInit.LS_SIDEBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "ls_side_slab"), new BlockItem(BlockInit.LS_SIDESLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "ls_top"), new BlockItem(BlockInit.LS_TOPBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "ls_top_slab"), new BlockItem(BlockInit.LS_TOPSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "magenta_shulker_bottom"), new BlockItem(BlockInit.MAGENTA_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "magenta_shulker_slab"), new BlockItem(BlockInit.MAGENTA_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "orange_shulker_bottom"), new BlockItem(BlockInit.ORANGE_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "orange_shulker_slab"), new BlockItem(BlockInit.ORANGE_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "pink_shulker_bottom"), new BlockItem(BlockInit.PINK_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "pink_shulker_slab"), new BlockItem(BlockInit.PINK_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "purple_shulker_bottom"), new BlockItem(BlockInit.PURPLE_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "purple_shulker_slab"), new BlockItem(BlockInit.PURPLE_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "ra_top"), new BlockItem(BlockInit.RA_TOPBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "ra_top_on"), new BlockItem(BlockInit.RA_TOPBLOCK_ON, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "ra_top_slab"), new BlockItem(BlockInit.RA_TOPSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "ra_top_slab_on"), new BlockItem(BlockInit.RA_TOPSLAB_ON, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "red_shulker_bottom"), new BlockItem(BlockInit.RED_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "red_shulker_slab"), new BlockItem(BlockInit.RED_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "s_bottom"), new BlockItem(BlockInit.S_BOTTOMBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "s_bottom_slab"), new BlockItem(BlockInit.S_BOTTOMSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "s_top"), new BlockItem(BlockInit.S_TOPBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "s_top_slab"), new BlockItem(BlockInit.S_TOPSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "shulker_bottom"), new BlockItem(BlockInit.SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "shulker_slab"), new BlockItem(BlockInit.SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "st_bottom"), new BlockItem(BlockInit.ST_BOTTOMBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "st_bottom_slab"), new BlockItem(BlockInit.ST_BOTTOMBSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "st_top"), new BlockItem(BlockInit.ST_TOPBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "st_top_slab"), new BlockItem(BlockInit.ST_TOPBLOCKSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "white_shulker_bottom"), new BlockItem(BlockInit.WHITE_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "white_shulker_slab"), new BlockItem(BlockInit.WHITE_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "yellow_shulker_bottom"), new BlockItem(BlockInit.YELLOW_SHULKERBLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("nyfsdeco", "yellow_shulker_slab"), new BlockItem(BlockInit.YELLOW_SHULKERSLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

    }
}
