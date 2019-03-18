package com.central

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.packtpub.libgdx.collisiontest.MyCollisionTest

object DesktopLauncher {
    @JvmStatic
    fun main(args: Array<String>) {
        val config = LwjglApplicationConfiguration()
        LwjglApplication(MyCollisionTest(), config)
    }
}
