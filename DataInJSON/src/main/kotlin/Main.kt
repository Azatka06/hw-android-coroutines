import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {

    val list = listOf(
            Post(0,
                    Types.STANDARD_TYPE,
                    24,
                    "20.04.2021",
                    "Azat Sagutdinov",
                    "Вы решили написать функцию, которая из количества секунд генерирует человекопонятное представление времени публикации.",
                    null,
                    null,
                    null,
                    false,
                    0,
                    true,
                    11,
                    false,
                    2),
            Post(1,
                    Types.EVENT_TYPE,
                    24,
                    "19.04.2021",
                    "Azat Sagutdinov",
                    "Путь в избушку на сбор по пейнтболу.",
                    null,
                    null,
                    "geo:55.754283,37.62002?z=15",
                    true,
                    123,
                    false,
                    0,
                    true,
                    44),
            Post(2,
                    Types.POST_WITH_VIDEO_TYPE,
                    24,
                    "18.04.2021",
                    "Azat Sagutdinov",
                    "Зацените легендарный клип!",
                    "https://youtu.be/HyHNuVaZJ-k",
                    null,
                    null,
                    true,
                    234,
                    true,
                    45,
                    true,
                    99),
            Post(3,
                    Types.PROMOTION_TYPE,
                    24,
                    "17.04.2021",
                    "Azat Sagutdinov",
                    "Вы решили пропиариться? Обращайтесь к нам!",
                    null,
                    "https://www.google.com/search?q=%D1%80%D0%B5%D0%BA%D0%BB%D0%B0%D0%BC%D0%B0&oq=Htrkfvf&aqs=chrome.1.69i57j0i1i10l2j0i10i433j0i10j0i10i433j0i10l2.3670j0j9&sourceid=chrome&ie=UTF-8",
                    null,
                    false,
                    0,
                    true,
                    11,
                    true,
                    2),
            Post(4,
                    Types.RE_POST_TYPE,
                    24,
                    "16.04.2021",
                    "Azat Sagutdinov",
                    null,
                    null,
                    null,
                    null,
                    false,
                    0,
                    true,
                    11,
                    true,
                    2,
                    1,
                    24,
                    "20.04.2021",
                    "Azat Sagutdinov",
                    "Зацените легендарный клип!",
                    "https://youtu.be/HyHNuVaZJ-k")

    )

    println(Gson().toJson(list))

    val gson = GsonBuilder().apply {
        setPrettyPrinting()
        serializeNulls()
    }.create()
    Files.write(Paths.get("./posts.json"), gson.toJson(list).toByteArray(), StandardOpenOption.CREATE)

}