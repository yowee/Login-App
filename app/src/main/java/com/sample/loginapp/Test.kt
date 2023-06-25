package com.sample.loginapp

enum class multippleChoice{
    A, B , C , D , E
}

class Test(val name: String, var questions: List<Choice>){

}

class Question(var number: Int, question: String){

}

class Choice(question :Question, possibleAnswers : List<Answer>) {

}

class Answer(multippleChoice: multippleChoice, value :String)
