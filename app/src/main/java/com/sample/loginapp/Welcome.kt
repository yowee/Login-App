package com.sample.loginapp

import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.ui.AppBarConfiguration
import com.sample.loginapp.databinding.ActivityWelcomeBinding
class Welcome : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


//        populateTest( createTest() )

    }

/*    private fun createTest() : Test{
        var question1 = Question(1, "Which keyword is used to declare a constant variable in Kotlin?");
        var question2 = Question(2, "Which of the following is true about Kotlin's null safety?");

        val answer1 : Answer = Answer(multippleChoice.A, "val")
        val answer2 : Answer = Answer(multippleChoice.B, "var")
        val answer3 : Answer = Answer(multippleChoice.C, "const")
        val answer4 : Answer = Answer(multippleChoice.D, "final")


        val answer21 : Answer = Answer(multippleChoice.A, "All variables in Kotlin are non-nullable by default.")
        val answer22 : Answer = Answer(multippleChoice.B, "Kotlin does not support null values.")
        val answer23 : Answer = Answer(multippleChoice.C, "Kotlin uses the \"?\" operator to make variables nullable.")
        val answer24 : Answer = Answer(multippleChoice.D, "Kotlin does not have any mechanism for handling null values.")

        val choice1 = Choice(question1, listOf(answer1, answer2, answer3, answer4))
        val choice2  = Choice(question2, listOf(answer21, answer22, answer23, answer24))

        var myQuestionList = listOf<Question>(question1, question2)
        val test1 = Test("test1", listOf(choice1, choice2))

        return test1
    }


    fun populateTest(test:Test){

        var tvQuestionNumber : TextView = findViewById(R.id.tvqn1)
        var question : TextView = findViewById(R.id.question)
    }*/

}