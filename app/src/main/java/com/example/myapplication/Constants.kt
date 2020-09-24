package com.example.myapplication

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(1,"What country does this flag belong to",
            R.drawable.ic_flag_of_argentina,
        "Argentina",
            "Australia", "Armenia",
            "Austria",
        1)

        questionList.add(que1)

        val que2 = Question(2,"What country does this flag belong to",
            R.drawable.ic_flag_of_india,
            "India",
            "Australia", "Armenia",
            "Austria",
            1)

        questionList.add(que2)

        return questionList
    }
}