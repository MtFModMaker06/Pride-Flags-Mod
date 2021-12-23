package mod;

import net.minecraft.client.renderer.entity.PaintingRenderer;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Flags{


    public static DeferredRegister<Motive> FLAGS = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, "pride_flags");

    public static RegistryObject<Motive> GAY = FLAGS.register("gay", () -> new Motive(64, 48));
    public static RegistryObject<Motive> LESBIAN = FLAGS.register("lesbian", () -> new Motive(64, 48));
    public static RegistryObject<Motive> TRANS = FLAGS.register("trans", () -> new Motive(64, 48));
    public static RegistryObject<Motive> progress = FLAGS.register("progress", () -> new Motive(64, 48));
    public static RegistryObject<Motive> BISEXAUL = FLAGS.register("bisexual", () -> new Motive(64, 48));
    public static RegistryObject<Motive> PANSEXAUL = FLAGS.register("pansexual", () -> new Motive(64, 48));
    public static RegistryObject<Motive> ASEXAUL = FLAGS.register("asexual", () -> new Motive(64, 48));
    public static RegistryObject<Motive> NONBINARY = FLAGS.register("nonbinary", () -> new Motive(64, 48));
    public static RegistryObject<Motive> AGENDER = FLAGS.register("agender", () -> new Motive(64, 48));
    public static RegistryObject<Motive> blm = FLAGS.register("blm", () -> new Motive(64, 64));


    public static void register() {


        FLAGS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
