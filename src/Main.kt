fun main() {
    val conversions = Conversions()
    val scanner = conversions.scanner
    val conversion = conversions.chooseConversion()
    val temperatureUnits = conversions.conversionUnits

    // Prompt user which temperature should be entered by displaying its unit
    print("Temperature in ${temperatureUnits.getValue(conversion).first()}: ")
    val temperature = scanner.nextDouble()

    // Deciding which conversion should according to user choice
    val result = when (conversion) {
        1 -> conversions.celsiusToFahrenheit(temperature)
        2 -> conversions.fahrenheitToCelsius(temperature)
        3 -> conversions.celsiusToKelvin(temperature)
        4 -> conversions.kelvinToCelsius(temperature)
        5 -> conversions.fahrenheitToKelvin(temperature)
        6 -> conversions.kelvinToFahrenheit(temperature)
        else -> "Invalid choice number"
    }

    // Display a final result of temperature with their units
    println(
        "Temperature: $temperature${temperatureUnits.getValue(conversion).first()} " +
                "= $result${temperatureUnits.getValue(conversion).last()}"
    )
}