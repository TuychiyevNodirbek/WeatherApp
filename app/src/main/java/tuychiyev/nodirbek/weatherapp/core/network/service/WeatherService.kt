package tuychiyev.nodirbek.weatherapp.core.network.service

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    //https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}
    @GET("/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}")
    fun getWeatherData(
        @Query("lat") lt: Double,
        @Query("lon") ln: Double,
        @Query("appid") apiKEY: String,
    )
}