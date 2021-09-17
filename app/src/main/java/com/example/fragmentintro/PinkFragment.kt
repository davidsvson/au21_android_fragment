package com.example.fragmentintro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class PinkFragment : Fragment(){

    lateinit var nameText : TextView
   // lateinit var imageView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_pink, container, false)
        nameText = view.findViewById(R.id.pinkTextView)
      //  imageView = view.findViewById(R.id.animalImageView)

        return view
    }

    fun setText(text : String) {
        nameText.text = text
    }

   // fun setImage(image : Int) {
  //      imageView.setImageResource(image)
  //  }

//    fun createQuestions() {
//
//        val questionList = mutableListOf<Question>()
//
//        val q1 = Question(R.drawable.cat, "Hur stor?", listOf("4","jättestor", "ganska stor","3"),
//                3)
//        questionList.add(q1)
//
//      //  imageView.setImageReasource(q1.image)
//    }


}

//class Question(val image : Int, val q :String , val a : List<String>, val correctAnswer : Int  )