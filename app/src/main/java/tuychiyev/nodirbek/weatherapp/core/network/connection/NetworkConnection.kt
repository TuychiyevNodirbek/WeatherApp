package tuychiyev.nodirbek.weatherapp.core.network.connection

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkConnection {
    companion object {
        private var retrofit: Retrofit? = null
        fun getRetrofit(): Retrofit {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl("https://developer.accuweather.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }
    }
}