import java.io.File
import java.util.*

object ClipPlayerConfig {
    private val properties = Properties().apply {
        load(File("data/clipPlayer.properties").inputStream())
    }

    val clipLocation = properties.getProperty("clip_location")
    val allowedVideoFiles: List<String> = properties.getProperty("allowed_video_files").split(",")
}