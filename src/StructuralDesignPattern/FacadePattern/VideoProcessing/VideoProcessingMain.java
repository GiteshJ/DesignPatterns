package StructuralDesignPattern.FacadePattern.VideoProcessing;

import java.io.File;

public class VideoProcessingMain {

	public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        @SuppressWarnings("unused")
		File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        
    }
}
