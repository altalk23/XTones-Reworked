package net.tobsend.xtonesreworked.block;

import java.util.function.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.block.custom.XBlock;
import net.tobsend.xtonesreworked.item.ModItems;

public class ZtylBlocks {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    XtonesReworkedMod.MODID
  );

  public static final RegistryObject<Block> ZTYL_BLOCK_0 = registerBlock(
    "ztyl_block_0",
    XBlock::new
  );

  public static final RegistryObject<Block> ZTYL_BLOCK_1 = registerBlock(
    "ztyl_block_1",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_2 = registerBlock(
    "ztyl_block_2",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_3 = registerBlock(
    "ztyl_block_3",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_4 = registerBlock(
    "ztyl_block_4",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_5 = registerBlock(
    "ztyl_block_5",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_6 = registerBlock(
    "ztyl_block_6",
    XBlock::new
  );

  public static final RegistryObject<Block> ZTYL_BLOCK_7 = registerBlock(
    "ztyl_block_7",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_8 = registerBlock(
    "ztyl_block_8",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_9 = registerBlock(
    "ztyl_block_9",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_10 = registerBlock(
    "ztyl_block_10",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_11 = registerBlock(
    "ztyl_block_11",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_12 = registerBlock(
    "ztyl_block_12",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_13 = registerBlock(
    "ztyl_block_13",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_14 = registerBlock(
    "ztyl_block_14",
    XBlock::new
  );
  public static final RegistryObject<Block> ZTYL_BLOCK_15 = registerBlock(
    "ztyl_block_15",
    XBlock::new
  );

  private static <T extends Block> RegistryObject<T> registerBlock(
    String name,
    Supplier<T> block
  ) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;
  }

  private static <T extends Block> RegistryObject<Item> registerBlockItem(
    String name,
    RegistryObject<T> block
  ) {
    return ModItems.ITEMS.register(
      name,
      () -> new BlockItem(block.get(), new Item.Properties())
    );
  }

  public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
  }
}
