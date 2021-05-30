package StructuralDesignPattern.ProxyPattern.YouTube;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
	
	HashMap<String, Video> popularVideos();
	
	Video getVideo(String videoIds);

}
