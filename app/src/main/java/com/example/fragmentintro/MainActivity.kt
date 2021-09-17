package com.example.fragmentintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun addPinkFragment(view: View) {
        val pinkFragment = PinkFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container, pinkFragment, "pinkFragment")
        transaction.commit()
    }

    fun removePinkFragment(view : View) {
        val pinkFragment = supportFragmentManager.findFragmentByTag("pinkFragment")

        if ( pinkFragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.remove(pinkFragment)
            transaction.commit()
        } else {
           Toast.makeText(this, "Pinkfragment not found", Toast.LENGTH_SHORT).show()
        }
    }

    fun addYellowFragment(view: View) {
        val fragment = YellowFragment.newInstance("hej", "hej")
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container, fragment, "yellowFragment")
        transaction.commit()
    }

    fun removeYellowFragment(view: View) {
        val fragment = supportFragmentManager.findFragmentByTag("yellowFragment")

        if ( fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.remove(fragment)
            transaction.commit()
        } else {
            Toast.makeText(this, "Yellowfragment not found", Toast.LENGTH_SHORT).show()
        }
    }

    fun replaceWithPinkFragment(view : View) {
        val fragment = PinkFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment, "pinkFragment")
        transaction.commit()
    }

    fun changeText(view: View) {
       // val pinkView = findViewById<TextView>(R.id.pinkTextView)
        // pinkView.text = "David"

        val fragment = supportFragmentManager.findFragmentByTag("pinkFragment") as PinkFragment?

        fragment?.setText("David")

       // fragment?.setImage(R.drawable.cat)
    }


}