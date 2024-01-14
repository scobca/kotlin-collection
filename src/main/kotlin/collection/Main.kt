package collection

const val helloMessage = "Hello world!"

fun calculator() {
    val number1 = 124
    val number2 = 84

    println(number1 + number2)
}

fun main(args: Array<String>) {
    println(helloMessage)

    //var = let; val = const

    var age: Number = 10
    val name: String = "Alex"
    val isAdmin: Boolean = false

    age = 20
    println("Ваш возраст: $age, ваше имя: $name, isAdmin: $isAdmin")


    // if you want to set null to variable - you need to set ? after variable type

    val nullExample: Number? = null
    println(nullExample)

    // if you want to call external function just write it like this
    calculator()
}