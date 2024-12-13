import java.util.*

class Conversions {
    val scanner = Scanner(System.`in`) // Initializing a scanner property

    fun celsiusToFahrenheit(celsiusTemperature: Double): Double {
        return celsiusTemperature * (9 / 5.0) + 32
    }

    fun fahrenheitToCelsius(fahrenheitTemperature: Double): Double {
        return (fahrenheitTemperature - 32) * (5.0 / 9)
    }

    fun celsiusToKelvin(celsiusTemperature: Double): Double {
        return celsiusTemperature + 273.15
    }

    fun kelvinToCelsius(kelvinTemperature: Double): Double {
        return kelvinTemperature - 273.15
    }

    fun fahrenheitToKelvin(fahrenheitTemperature: Double): Double {
        return (fahrenheitTemperature - 32) * (5.0 / 9) + 273.15
    }

    fun kelvinToFahrenheit(kelvinTemperature: Double): Double {
        return (kelvinTemperature - 273.15) * (9 / 5.0) + 32
    }

    // Returns a number for the selected conversion
    fun chooseConversion(): Int {
        availableConversion()

        print("Choose conversion: ")
        val option = scanner.nextInt()
        // Returns, option iff it's inside a range otherwise 0
        return if (option in 1..6) option else 0
    }

    // Displaying the conversions available
    private fun availableConversion() {
        println("\n1. Celsius to Fahrenheit")
        println("2. Fahrenheit to Celsius")
        println("3. Celsius to Kelvin")
        println("4. Kelvin to Celsius")
        println("5. Fahrenheit to Kelvin")
        println("6. Kelvin to Fahrenheit\n")
    }

    // Temperature conversion units
    val conversionUnits = mapOf(
        1 to listOf("°C", "°F"),
        2 to listOf("°F", "°C"),
        3 to listOf("°C", "K"),
        4 to listOf("K", "°C"),
        5 to listOf("°F", "K"),
        6 to listOf("K", "°F"),
    )
}
// Note: We put .0 on 5s so that it returns a double instead of an int