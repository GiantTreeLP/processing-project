import org.gtlp.ui.PWindow
import processing.core.PApplet

/**
 * Sample class to use Processing in IntelliJ IDEA with my processing-ui library.
 */
class KotlinSample : PWindow() {
    override fun settings() {
        size(600, 400)
    }

    override fun onDraw() {
        // TODO your code here!
    }
}

fun main(args: Array<String>) {
    PApplet.main(KotlinSample().javaClass)
}
