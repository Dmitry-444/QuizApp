package com.example.quizapp

object Constants {

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val CORRECT_ANSWERS = "correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Какой штат изображен на рисунке?",
             R.drawable.ic_map_alabama,
            "Арканзас", "Алабама",
            "Техас", "Нью-Йорк", 2
        )
        questionList.add(que1)

        // 2
        val que2 = Question(
            1, "Какой штат изображен на рисунке?",
            R.drawable.ic_map_alaska,
            "Аляска", "Нью_Гэпшир",
            "Гавайи", "Джорджия", 1
        )
        questionList.add(que2)
        // 3
        val que3 = Question(
            1, "Какой штат изображен на рисунке?",
            R.drawable.ic_map_colorado,
            "Флорида", "Алабама",
            "Колорадо", "Индиана", 3
        )
        questionList.add(que3)
        // 4
        val que4 = Question(
            1, "Какой штат изображен на рисунке?",
            R.drawable.ic_map_newyork,
            "Кентукки", "Айова",
            "Массачуссетс", "Нью-Йорк", 4
        )
        questionList.add(que4)
        // 5
        val que5 = Question(
            1, "Какой штат изображен на рисунке?",
            R.drawable.ic_map_florida,
            "Мичиган", "Флорида",
            "Техас", "Миннесота", 2
        )
        questionList.add(que5)
        // 6
        val que6 = Question(
            1, "Какой штат изображен на рисунке?",
            R.drawable.ic_map_newhampshire,
            "Нью-Гэмпшир", "Луизиана",
            "Мичиган", "Нью-Йорк", 1
        )
        questionList.add(que6)
        // 7
        val que7 = Question(
            1, "Какой штат изображен на рисунке?",
            R.drawable.ic_map_kansas,
            "Арканзас", "Невада",
            "Огайо", "Канзас", 4
        )
        questionList.add(que7)
        // 8
        val que8 = Question(
            1, "Какой штат изображен на рисунке?",
            R.drawable.ic_map_louiziana,
            "Дакота", "Луизиана",
            "Юта", "Пенсельвания", 2
        )
        questionList.add(que8)
        // 9
        val que9 = Question(
            1, "Какой штат изображен на рисунке?",
            R.drawable.ic_map_missouri,
            "Вирджиния", "Вашингтон",
            "Миссури", "Монтана", 3
        )
        questionList.add(que9)
        // 10
        val que10 = Question(
            1, "Какой штат изображен на рисунке?",
            R.drawable.ic_map_hawaii,
            "Гавайи", "Небраска",
            "Техас", "Мэрилэнд", 1
        )
        questionList.add(que10)

        return questionList
    }

}