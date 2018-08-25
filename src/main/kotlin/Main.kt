package myfutzgame

import com.camerontauxe.futz.*

/**
 * Main function. Calls FUTZ.init
 */
fun main(args : Array<String>) {
    FUTZ.init(startCallback = ::start)
    // This does not return until the game is closed
}

/**
 * This will be called once the splash screen has finished and the game starts.
 */
fun start() {
    /**
     * Initialize and spawn entities here
     */
}
