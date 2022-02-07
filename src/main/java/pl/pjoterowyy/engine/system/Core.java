package pl.pjoterowyy.engine.system;

import pl.pjoterowyy.engine.audio.AudioDevice;

public class Core
{
    public static void initializeEngine()
    {
        AudioDevice.openDevice();
    }
}