package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    public static List<QuestionsList> bookQuestions () {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Что тайком выбросила Лиса, когда ночевала у мужика в сказке «За лапоток — курочку, за курочку — гусочку»?",
                "куриное яйцо", "лапоть", "горшочек",
                "лапоть", "");
        final QuestionsList question2 = new QuestionsList("Какое испытание Лиса предложила волку чтобы доказать, что это он съел пирожок, в сказке «Лисичка — сестричка и волк»?",
                "первым добежать до леса", "вспороть волку брюхо и посмотреть, что у него внутри", "лечь на солнце и ждать,пока на теле выступит воск",
                "лечь на солнце и ждать,пока на теле выступит воск", "");
        final QuestionsList question3 = new QuestionsList("Чем подавился петушок в сказке «Смерть петушка»?",
                "горошиной", "кедровым орешком", "бобовым зернышком",
                "бобовым зернышком", "");
        final QuestionsList question4 = new QuestionsList("В какой сказке волк крал из погреба масло и ставил на высокую полку, чтобы Лиса его не съела?",
                "мужик, медведь и лиса", "лиса -повитуха", "лиса - исповедница",
                "лиса -повитуха", "");
        final QuestionsList question5 = new QuestionsList("Как петух помог зайцу вернуться в свою избушку в сказке «Лиса, заяц и петух»?",
                "спустил с нее шкуру", "рубанул лису касой", "заклевал",
                "рубанул лису касой", "");
        final QuestionsList question6 = new QuestionsList("Что подавал журавль лисе в кувшине с узким горлышком в сказке «Лиса и журавль»?",
                "окрошку", "щи", "манную кашу",
                "окрошку", "");
        final QuestionsList question7 = new QuestionsList("Сколько дочерей была у лисы в сказке «Кот, баран, петух и лиса»?",
                "5", "7", "3",
                "7", "");
        final QuestionsList question8 = new QuestionsList("Чей торчащий из норы хвост заметил кот в сказке «Напуганный медведь и волки»?",
                "бобра", "сурка", "зайца",
                "зайца", "");
        final QuestionsList question9 = new QuestionsList("В какой сказке волка обманули и пёс, и козёл, и свинья?",
                "волк и семеро козлят", "звери в яме", "волк - дурень",
                "волк - дурень", "");
        final QuestionsList question10 = new QuestionsList("У кого была тёплая изба в сказке «Зимовьё зверей»?",
                "у быка", "у свиньи", "у барана",
                "у быка", "");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return questionsList;
    }

    public static List<QuestionsList> astronomiyaQuestions () {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Что находится в центре галактики Млечный Путь?",
                "Черная дыра", "Нейтронная звезда", "Мегазвезда",
                "Черная дыра", "");
        final QuestionsList question2 = new QuestionsList("Первыми животными в космосе были?",
                "собаки", "дрозофилы", "мыши",
                "дрозофилы", "");
        final QuestionsList question3 = new QuestionsList("Первыми астронафтами высадившимися стали?",
                "Базз Олдрин и Нил Арамстронг", "Белка и Стрелка", "Юрий Гагарин и Алексей Леонов",
                "Базз Олдрин и Нил Арамстронг", "");
        final QuestionsList question4 = new QuestionsList("Как зовут первого человека побывавшего в космосе?",
                "Юрий Гагарин", "Алексей Леонов", "Базз Олдрин",
                "Юрий Гагарин", "");
        final QuestionsList question5 = new QuestionsList("Что такое МКС?",
                "Максимальное космическое созвездие", "Междунарадная космичекская станция", "Международный корабль связи",
                "Междунарадная космичекская станция", "");
        final QuestionsList question6 = new QuestionsList("Что предотвращает запотевание стекол скафандра космонавта?",
                "Отверстия в шлеме скафандра", "Космическая невесомость", "Циркуляция кислорода",
                "Циркуляция кислорода", "");
        final QuestionsList question7 = new QuestionsList("Как имя астрономо, который первым утверждал, что земля вращается воктруг Солнце в течение года?",
                "Николай Коперник", "Галилео Галлей", "Джованни Кассини",
                "Николай Коперник", "");
        final QuestionsList question8 = new QuestionsList("Как называется путь космического тела в пространстве?",
                "Млечный путь", "Полет", "Орбита",
                "Орбита", "");
        final QuestionsList question9 = new QuestionsList("В каком году был запущен первый искуственный спутник?",
                "1960", "1998", "1957",
                "1957", "");
        final QuestionsList question10 = new QuestionsList("Что такое Млечный путь?",
                "Галактика", "Планетарная система", "Созвездие",
                "Галактика", "");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return questionsList;
    }

    public static List<QuestionsList> animalQuestions () {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList(" Запасы чего содержат горбы у верблюдов?",
                " воды", "молока", "жира",
                "жира", "");
        final QuestionsList question2 = new QuestionsList("Какой рисунок заметен на голове гадюки?",
                "звездочки", "в виде буквы «х»", " в форме черепа",
                "в виде буквы «х»", "");
        final QuestionsList question3 = new QuestionsList("В качестве чего действуют задние ласты тюленя?",
                "руля", "тормоза", "весел",
                "руля", "");
        final QuestionsList question4 = new QuestionsList("Какого окраса песцы не встречаются?",
                "белые", "черные", "голубые",
                "черные", "");
        final QuestionsList question5 = new QuestionsList("Что является родной стихией для белых медведей?",
                "снежные просторы", "горы", "море",
                "море", "");
        final QuestionsList question6 = new QuestionsList("Самый быстрый бегун среди животных?",
                "леопард", "кенгуру", "гепард",
                "гепард", "");
        final QuestionsList question7 = new QuestionsList("Самая маленькая птичка на Земле?",
                "воробей", "канарейка", "колибри",
                "колибри", "");
        final QuestionsList question8 = new QuestionsList("Самая большая ящерица на планете?",
                "крокодил", "хамелеон", "варан",
                "варан", "");
        final QuestionsList question9 = new QuestionsList("У какой птицы самый большой размах крыльев?",
                "странствующий альбатрос", "андский кондор", "бурый гриф",
                "странствующий альбатрос", "");
        final QuestionsList question10 = new QuestionsList("Как называлась телевизионная программа с ведущим Николаем Дроздовым?",
                "Животный мир", "Мир животных", "В мире животных",
                "В мире животных", "");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return questionsList;
    }

    public static List<QuestionsList> flowerQuestions () {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Цветок солнца, имеющий вкусные и полезные семечки?",
                "ромашка", "подсолнечник", "астра",
                "подсолнечник", "");
        final QuestionsList question2 = new QuestionsList("Растение, растущее вдоль дорог, незаменимое средство при царапинах и ссадинах?",
                "крапива", "мать-и-мачеха", "подорожник",
                "подорожник", "");
        final QuestionsList question3 = new QuestionsList("От какого дерева ранней весной дает полезный сок?",
                "тополь", "кедр", "береза",
                "береза", "");
        final QuestionsList question4 = new QuestionsList(" Растение-колючка, считается сорняком, обладает многими полезными свойствами?",
                "репейник", "череда", "осока",
                "репейник", "");
        final QuestionsList question5 = new QuestionsList("Листьями этого растения можно обрезаться, как бритвой?",
                "осока", "ромашка", "лопуху",
                "осока", "");
        final QuestionsList question6 = new QuestionsList("Какой цветок называют водяной лилией?",
                "папоротник", "подсолнух", "кувшинка",
                "кувшинка", "");
        final QuestionsList question7 = new QuestionsList("Растение, которым питается северный олень?",
                "ягель", "колючка", "клевер",
                "ягель", "");
        final QuestionsList question8 = new QuestionsList("Какое растение любит верблюд?",
                "мох", "колючку", "крапиву",
                "колючку", "");
        final QuestionsList question9 = new QuestionsList("Первые весенние цветы, которые захотела получить к новому году капризная принцесса из сказки «12 месяцев»?",
                "ландыши", "ромашки", "подснежники",
                "подснежники", "");
        final QuestionsList question10 = new QuestionsList("Очень редкий цветок, произрастающий в воде, занесенный в «Красную книгу». С ним связано много мифов и легенд.",
                "кувшинка", "лотос", "роза",
                "лотос", "");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return questionsList;
    }
    public static List<QuestionsList> cartoonsQuestions() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Как зовут главных четвероногих героев мультфильма «101 далматинец»?",
                "Понго и Пэдди", "Роджер и Анита", "Джаспер и Люси",
                "Понго и Пэдди", "");
        final QuestionsList question2 = new QuestionsList("Как на самом деле Спящую красавицу?",
                "Спящая красавица", "Мэривеза", "Аврора",
                "Аврора", "");
        final QuestionsList question3 = new QuestionsList("Какой лев появился в мультфильме «Геркулес»?",
                "Немейский лев", "Симба", "Шрам",
                "Шрам", "");
        final QuestionsList question4 = new QuestionsList("К каким животным относится Тимон?",
                "Сурикат", "Тушканчик", "Мангуст",
                "Сурикат", "");
        final QuestionsList question5 = new QuestionsList("Какому умению не был обучен Змей Горыныч из мультфильмов про Богатырей?",
                "Плавать", "Летать", "Плеваться огонем",
                "Летать", "");
        final QuestionsList question6 = new QuestionsList("В какое животное мог обращаться купец Кривжа из мультфильма «Князь Владимир»?",
                "В вльва", "В медведя", "В волка",
                "В волка", "");
        final QuestionsList question7 = new QuestionsList("В каком мультфилеме говорящий «попугай» своим умом и сообразительностью?",
                "Приключение попугая", "Тайна третьей планеты", "Возвращение блудного попугая",
                "Тайна третьей планеты", "");
        final QuestionsList question8 = new QuestionsList("Кого увидел в пруду крошка Енот из одноименного мультфильма?",
                "Злую обезьяну", "Себя", "Лесного зверя",
                "Себя", "");
        final QuestionsList question9 = new QuestionsList("Как зовут самого маленького мультяшного гнома?",
                "Вялый", "Вася", "Нафаня",
                "Вася", "");
        final QuestionsList question10 = new QuestionsList("Как зовут подружек Водяного из мультфильма «Летучий корабль»?",
                "Бабки-ёршки", "Пиявке и лягушки", "Мыши и лягушки",
                "Пиявке и лягушки", "");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return questionsList;
    }

    public static List<QuestionsList> natureQuestions() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Земля вращается по орбите вокруг?",
                "солнца", "луны", "костра",
                "солнца", "");
        final QuestionsList question2 = new QuestionsList("Самым мелким морем на нашей планете является?",
                "Мертвое", "Байкал", "Азовское",
                "Аврора", "");
        final QuestionsList question3 = new QuestionsList("Кто привез картофель в Россию?",
                "Петр I", "Екатерина II", "Иван Грозный",
                "Петр I", "");
        final QuestionsList question4 = new QuestionsList("Он зеленый и прыгучий, совершенно не колючий, скачет быстро по траве?",
                "кузнечик", "мячик", "лягушка",
                "кузнечик", "");
        final QuestionsList question5 = new QuestionsList("Как называется линия, которая проходит через центр земли?",
                "параллель", "меридиан", "экватор",
                "экватор", "");
        final QuestionsList question6 = new QuestionsList("Что за природное явление может удалить в дерево и сломать его?",
                "гром", "град", "молния",
                "молния", "");
        final QuestionsList question7 = new QuestionsList("Самая толстая кожа у этого животного?",
                " носорога", "слона", "бегемота",
                "бегемота", "");
        final QuestionsList question8 = new QuestionsList("Кто является самым быстрым зверем на планете?",
                "леопард", "рысь", "гепард",
                "гепард", "");
        final QuestionsList question9 = new QuestionsList("Это дерево считается самым мудрым и могучим?",
                "ель", "баобаб", "дуб",
                "дуб", "");
        final QuestionsList question10 = new QuestionsList("Какой катаклизм угрожает нашей планете?",
                "нападение инопланетян", "парниковый эффект", "восстание машин",
                "парниковый эффект", "");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return questionsList;
    }
    public static List<QuestionsList> sportQuestions() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Чем в Древней Греции награждали победителей Олимпийских игр?",
                "терновым венком", "венком из лавровых листьев", "деньгами",
                "венком из лавровых листьев", "");
        final QuestionsList question2 = new QuestionsList("Какое из этих выражений является девизом Олимпийских игр?",
                "главное не победа, а участие", "никогда не сдавайся!", "быстрее, выше, сильнее!",
                "Аврора", "");
        final QuestionsList question3 = new QuestionsList("Что означает переплетение вышеупомянутых колец?",
                "количество игр и их тесную взаимосвязь друг с другом", "число месяцев, в течение которых продолжается олимпийский сезон", "дружбу пяти континентов",
                "дружбу пяти континентов", "");
        final QuestionsList question4 = new QuestionsList("Сколько человек состоит в волейбольной команде?",
                "11", "5", "6",
                "6", "");
        final QuestionsList question5 = new QuestionsList("Чем в Древнем Риме покрывали гладиаторскую арену?",
                "листьями", "камнями", "песком",
                "песком", "");
        final QuestionsList question6 = new QuestionsList("Какое из этих боевых искусств придумали в Корее?",
                "тхэквондо", "дзюдо", "сумо",
                "тхэквондо", "");
        final QuestionsList question7 = new QuestionsList("Гимнастическая фигура, названная в честь птицы?",
                "утка", "цапля", "ласточка",
                "ласточка", "");
        final QuestionsList question8 = new QuestionsList("В этом спортивном единоборстве используют рапиры, сабли, шпаги?",
                "фехтование", "тхэквондо", "самбо",
                "фехтование", "");
        final QuestionsList question9 = new QuestionsList("Разновидность конькобежного спорта?",
                "санный спорт", "лыжное двоеборье", "шорт-трек",
                "шорт-трек", "");
        final QuestionsList question10 = new QuestionsList("Эта дисциплина включает в себя гонку на велосипеде, бег и плавание?",
                "шоссейный велоспорт", "современное пятиборье", "триатлон",
                "триатлон", "");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return questionsList;
    }
    public static List<QuestionsList> craftsQuestions() {
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Как называется белый, расписанный синим, фарфор, который производится в одном из российских городов?",
                "Хохлома", "Палех", "Гжель",
                "Гжель", "");
        final QuestionsList question2 = new QuestionsList("Продукцию какого народного промысла часто называют золотой?",
                "Гжель", "Палех", "Хохлома",
                "Хохлома", "");
        final QuestionsList question3 = new QuestionsList("В какой области России находится Палех, центр русского народного искусства – лаковой миниатюры?",
                "Московская", "Ивановская", "Кировская",
                "Ивановская", "");
        final QuestionsList question4 = new QuestionsList("Какие игрушки изготовлялись для праздника Свистопляска (Свистунья) в городе Вятка?",
                "Кукла-петрушка", "Дымковская игрушка", "Филимоновская игрушка",
                "Дымковская игрушка", "");
        final QuestionsList question5 = new QuestionsList("Какой уральский город славится своими художественными изделиями из чугуна?",
                "Миасс", "Нижний Тагил", "Касли",
                "Касли", "");
        final QuestionsList question6 = new QuestionsList("Изделия какого народного промысла изготавливают из кровельной стали?",
                "Жостовские подносы", "Каслинское литье", "Ростовская финифть",
                "Жостовские подносы", "");
        final QuestionsList question7 = new QuestionsList("Борецкая и мезенская росписи – русские народные художественные промыслы. По какому природному материалу ведется роспись?",
                "По бересте", "По металлу", "По дереву",
                "По дереву", "");
        final QuestionsList question8 = new QuestionsList("Каким основным материалом покрывают изделия знаменитой ростовской финифти?",
                "Лаком", "Акварелью", "Эмалью",
                "Эмалью", "");
        final QuestionsList question9 = new QuestionsList("Для вязания оренбургских пуховых платков нужен особый пух. Пух какого животного самый тонкий в мире?",
                "Ангорской козы", "Гималайского горного козла", "Оренбургской козы",
                "Оренбургской козы", "");
        final QuestionsList question10 = new QuestionsList("Символом чего считается матрёшка?",
                "Достатка", "Материнства", "Здоровья",
                "Материнства", "");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return questionsList;
    }
    public static List<QuestionsList> getQuestions (String SelectedTopicName) {
        switch (SelectedTopicName) {
            case "Книги": return bookQuestions();
            case "Астрономия": return astronomiyaQuestions();
            case "Животный мир": return animalQuestions();
            case "Растительный мир": return flowerQuestions();
            case "Мультфильмы": return cartoonsQuestions();
            case "Природа": return natureQuestions();
            case "Спорт": return sportQuestions();
            default: return craftsQuestions();
        }
    }
}
