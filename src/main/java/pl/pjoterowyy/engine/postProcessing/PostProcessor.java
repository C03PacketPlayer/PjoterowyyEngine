package pl.pjoterowyy.engine.postProcessing;

import pl.pjoterowyy.engine.frame.Frame;
import pl.pjoterowyy.engine.render.Renderer;
import pl.pjoterowyy.engine.scene.mesh.Model;
import pl.pjoterowyy.engine.scene.mesh.ModelLoader;
import pl.pjoterowyy.engine.shader.ShaderProgram;

public class PostProcessor
{
    private static float[] positions = {1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f};
    private static float[] colors = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    private static float[] texCoords = {1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
    private static float[] normals = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    private static Model quad = ModelLoader.getModel(positions, colors, texCoords, normals, null);

    public static Frame invertColor(Frame frame)
    {
        return null;
    }

    public static void customEffect(Frame input, ShaderProgram program, Frame output)
    {
        if(output != null)
        {
            output.start();
            Renderer.renderScreen(quad, program, input.getColorTextureID(), input.getDepthTextureID());
            output.stop();
        }
        else Renderer.renderScreen(quad, program, input.getColorTextureID(), input.getDepthTextureID());
    }
}