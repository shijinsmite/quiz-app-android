package com.example.myapplication

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_argentina,
        "Argentina",
            "Australia", "Armenia",
            "Austria",
        1)

        questionList.add(que1)

        val que2 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_india,
            "India",
            "Australia", "Armenia",
            "Austria",
            1)

        questionList.add(que2)

        return questionList
    }
}