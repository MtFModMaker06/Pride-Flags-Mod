package mod;

import net.minecraft.client.renderer.entity.PaintingRenderer;
import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.Random;

public class Flags{


    public static DeferredRegister<PaintingType> FLAGS = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, "pride_flags");

    public static RegistryObject<PaintingType> GAY = FLAGS.register("gay", () -> new PaintingType(64, 48));
    public static RegistryObject<PaintingType> LESBIAN = FLAGS.register("lesbian", () -> new PaintingType(64, 48));
    public static RegistryObject<PaintingType> TRANS = FLAGS.register("trans", () -> new PaintingType(64, 48));
    public static RegistryObject<PaintingType> progress = FLAGS.register("progress", () -> new PaintingType(64, 48));
    public static RegistryObject<PaintingType> BISEXAUL = FLAGS.register("bisexual", () -> new PaintingType(64, 48));
    public static RegistryObject<PaintingType> PANSEXAUL = FLAGS.register("pansexual", () -> new PaintingType(64, 48));
    public static RegistryObject<PaintingType> ASEXAUL = FLAGS.register("asexual", () -> new PaintingType(64, 48));
    public static RegistryObject<PaintingType> NONBINARY = FLAGS.register("nonbinary", () -> new PaintingType(64, 48));
    public static RegistryObject<PaintingType> AGENDER = FLAGS.register("agender", () -> new PaintingType(64, 48));
    public static RegistryObject<PaintingType> blm = FLAGS.register("blm", () -> new PaintingType(64, 64));





    public static void register() {


        FLAGS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }



}
