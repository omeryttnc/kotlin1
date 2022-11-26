package w3schools.kotlin_classes

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Car {
    var brand = ""
    var model = ""
    var year = 0




    constructor(brand: String, model: String, year: Int) {
        this.brand = brand
        this.model = model
        this.year = year
    }

    constructor()

    @BeforeEach
    internal fun setUp() {
        TODO("Not yet implemented")
    }

    @AfterEach
    internal fun tearDown() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Car(brand='$brand', model='$model', year=$year)"
    }

    @Test
    internal fun name() {
        var c1 = Car()

        print(c1)

    }
}

fun main() {
    var c1 = Car()

    c1.brand = "ford"
    c1.model = "mustang"
    c1.year = 1969

}