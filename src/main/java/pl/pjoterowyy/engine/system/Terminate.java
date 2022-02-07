package pl.pjoterowyy.engine.system;

import pl.pjoterowyy.engine.audio.AudioDevice;
import pl.pjoterowyy.engine.audio.AudioLoader;
import pl.pjoterowyy.engine.audio.SoundLoader;
import pl.pjoterowyy.engine.frame.FrameLoader;
import pl.pjoterowyy.engine.image.ImageLoader;
import pl.pjoterowyy.engine.scene.mesh.ModelLoader;
import pl.pjoterowyy.engine.scene.mesh.anim.AnimatedModelLoader;
import pl.pjoterowyy.engine.scene.mesh.texture.TextureLoader;
import pl.pjoterowyy.engine.shader.ShaderLoader;
import pl.pjoterowyy.engine.shader.ShaderProgramLoader;
import pl.pjoterowyy.engine.window.Window;

public class Terminate
{
    public static void stop()
    {
        SoundLoader.deleteSources();
        AudioLoader.deleteAudioBuffers();
        AudioDevice.closeDevice();
        Window.terminate();
        TextureLoader.deleteTextures();
        ImageLoader.deleteImages();
        FrameLoader.deleteFrames();
        ModelLoader.deleteModels();
        AnimatedModelLoader.deleteModels();
        ShaderProgramLoader.deletePrograms();
        ShaderLoader.deleteShaders();
        System.exit(0);
    }

    public static void stopWithMessage(String message)
    {
        System.out.println(message);
        stop();
    }
}
