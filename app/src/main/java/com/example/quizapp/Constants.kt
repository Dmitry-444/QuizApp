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
        // 11
        val que11 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_idaho,
                "Айдахо", "Вермонт",
                "Мичиган", "Мэн", 1
        )
        questionList.add(que11)
        // 12
        val que12 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_montana,
                "Юта", "Пенсильвания",
                "Огайо", "Монтана", 4
        )
        questionList.add(que12)
        // 13
        val que13 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_oregon,
                "Пенсильвания", "Орегон",
                "Мэрилэнд", "Нью-Джерси", 2
        )
        questionList.add(que13)
        // 14
        val que14 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_newmexico,
                "Нью-Мексико", "Огайо",
                "Теннеси", "Вермонт", 1
        )
        questionList.add(que14)
        // 15
        val que15 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_kentucky,
                "Техас", "Северная Дакота",
                "Кентукки", "Коннектикут", 3
        )
        questionList.add(que15)
        // 16
        val que16 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_rhodeisland,
                "Род-Айленд", "Нью-Мексико",
                "Орегон", "Небраска", 1
        )
        questionList.add(que16)
        // 17
        val que17 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_pennsylvania,
                "Индиана", "Джорджия",
                "Пенсильвания", "Нью-Гэмпшир", 3
        )
        questionList.add(que17)
        // 18
        val que18 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_northcarolina,
                "Делэвэр", "Висконсин",
                "Северная Каролина", "Миннесота", 3
        )
        questionList.add(que18)
        // 19
        val que19 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_southdakota,
                "Южная Дакота", "Иллинойс",
                "Айдахо", "Северная Дакота", 1
        )
        questionList.add(que19)
        // 20
        val que20 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_texas,
                "Айова", "Канзас",
                "Луизиана", "Техас", 4
        )
        questionList.add(que20)
        // 21
        val que21 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_utah,
                "Флорида", "Оклахома",
                "Мэн", "Юта", 4
        )
        questionList.add(que21)
        // 22
        val que22 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_michigan,
                "Монтана", "Мичиган",
                "Орегон", "Вайоминг", 2
        )
        questionList.add(que22)
        // 23
        val que23 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_nebraska,
                "Небраска", "Канзас",
                "Колорадро", "Южная дакота", 1
        )
        questionList.add(que23)
        // 24
        val que24 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_massachusetts,
                "Коннектикут", "Мэн",
                "Массачусетс", "Род-Айлэнд", 3
        )
        questionList.add(que24)
        // 25
        val que25 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_tennessee,
                "Алабама", "Вайоминг",
                "Миссисипи", "Теннеси", 4
        )
        questionList.add(que25)
        // 26
        val que26 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_newjersey,
                "Делевэр", "Нью-Джерси",
                "Мэрилэнд", "Огайо", 2
        )
        questionList.add(que26)
        // 27
        val que27 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_oklahoma,
                "Луизиана", "Оклахома",
                "Техас", "Иллинойс", 2
        )
        questionList.add(que27)
        // 28
        val que28 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_northdakota,
                "Южная Дакота", "Монтана",
                "Северная Дакота", "Миннесота", 3
        )
        questionList.add(que28)
        // 29
        val que29 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_maine,
                "Вермонт","Нью-Гэмпшир",
                "Пенсильвания", "Мэн", 4
        )
        questionList.add(que29)
        // 30
        val que30 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_nevada,
                "Аризона", "Орегон",
                "Невада", "Калифорния", 3
        )
        questionList.add(que30)
        // 31
        val que31 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_maryland,
                "Мэрилэнд", "Вашингтон",
                "Западная вирджиния", "Нью-Йорк", 1
        )
        questionList.add(que31)
        // 32
        val que32 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_ohio,
                "Кентуки", "Огайо",
                "Теннесси", "Пенсильвания", 2
        )
        questionList.add(que32)
        // 33
        val que33 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_connecticut,
                "Массачусетс", "Коннектикут",
                "Вирджиния", "Северная Каролина", 2
        )
        questionList.add(que33)
        // 34
        val que34 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_washington,
                "Айдахо", "Вашингтон",
                "Юта", "Орегон", 2
        )
        questionList.add(que34)
        // 35
        val que35 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_wyoming,
                "Колорадо", "Аризона",
                "Вайоминг", "Висконсин", 3
        )
        questionList.add(que35)
        // 36
        val que36 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_delaware,
                "Вайоминг", "Нью-Джерси",
                "Коннектикут", "Делэвэр", 4
        )
        questionList.add(que36)
        // 37
        val que37 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_illinois,
                "Иллинойс", "Индиана",
                "Миссури", "Кентуки", 1
        )
        questionList.add(que37)
        // 38
        val que38 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_indiana,
                "Индиана", "Мичиган",
                "Оклахома", "Арканзас", 1
        )
        questionList.add(que38)
        // 39
        val que39 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_california,
                "Юта", "Калифорния",
                "Невада", "Вашингтон", 2
        )
        questionList.add(que39)
        // 40
        val que40 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_minnesota,
                "Вирждиния", "Небраска",
                "Миннесота", "Айова", 3
        )
        questionList.add(que40)
        // 41
        val que41 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_arkanzas,
                "Луизиана", "Миссисипи",
                "Арканзас", "Миссури", 3
        )
        questionList.add(que41)
        // 42
        val que42 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_georgia,
                "Алабама", "Джорджия",
                "Флорида", "Южная Каролина", 2
        )
        questionList.add(que42)
        // 43
        val que43 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_iowa,
                "Айова", "Мичиган",
                "Миссури", "Индиана", 1
        )
        questionList.add(que43)
        // 44
        val que44 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_westvirginia,
                "Западная Вирджиния", "Вирджиния",
                "Теннеси", "Алабама", 1
        )
        questionList.add(que44)
        // 45
        val que45 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_wisconsin,
                "Миннесота", "Мичиган",
                "Миссури", "Висконсин", 4
        )
        questionList.add(que45)
        // 46
        val que46 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_virginia,
                "Вирджиния", "Огайо",
                "Джорджия", "Флорида", 1
        )
        questionList.add(que46)
        // 47
        val que47 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_southcarolina,
                "Айдахо", "Вирджиния",
                "Невада", "Южная Каролина", 4
        )
        questionList.add(que47)
        // 48
        val que48 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_arizona,
                "Нью-Мексико", "Нью-Гэмпшир",
                "Аризона", "Техас", 3
        )
        questionList.add(que48)
        // 49
        val que49 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_vermont,
                "Мэн", "Вермонт",
                "Пенсильвания", "Вайоминг", 2
        )
        questionList.add(que49)
        // 50
        val que50 = Question(
                1, "Какой штат изображен на рисунке?",
                R.drawable.ic_map_missisipi,
                "Миссисипи", "Алабама",
                "Луизиана", "Оклахома", 1
        )
        questionList.add(que50)

        return questionList
    }

}