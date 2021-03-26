package me.florian.artillerygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.florian.artillerygamelib.GameWorld
import me.florian.artillerygamelib.performPlayerMove


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val g = GameWorld()
        do {
            performPlayerMove(g)
            println(g)
        }while (g.gameContinues())
        println(g.determineWinner())


    }
}