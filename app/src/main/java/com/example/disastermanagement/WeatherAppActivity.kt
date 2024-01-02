package com.example.disastermanagement

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SearchView
import com.example.disastermanagement.databinding.ActivityWeatherAppBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class WeatherAppActivity : AppCompatActivity() {
    private val binding:ActivityWeatherAppBinding by lazy{
        ActivityWeatherAppBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        fetchWeatherData("pune")
        SearchCity()
    }

    private fun SearchCity() {
        val searchView=binding.searchView
        searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    fetchWeatherData(query)
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }

        })
    }

    private fun fetchWeatherData(cityName: String) {
        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.openweathermap.org/data/2.5/")
                .build().create(ApiInterface::class.java)

        val response = retrofit.getWeatherData(cityName, "91d45e5d267f6305064d0fe8d2fbc06b", "metric")

        response.enqueue(object : Callback<WeatherApp>{

            override fun onResponse(call: Call<WeatherApp>, response: Response<WeatherApp>) {
                val responseBody=response.body()
                if(response.isSuccessful && responseBody != null){
                    val temperature=responseBody.main.temp.toString()
                    val humidty=responseBody.main.humidity
                    val windspeed=responseBody.wind.speed
                    val sunrise=responseBody.sys.sunrise.toLong()
                    val sunset=responseBody.sys.sunset.toLong()
                    val sealevel=responseBody.main.pressure
                    val condition=responseBody.weather.firstOrNull()?.main?:"unknown"
                    val maxTemp=responseBody.main.temp_max
                    val minTemp=responseBody.main.temp_min

                    binding.temp.text="$temperature °C"
                    binding.conditions.text=condition
                    binding.maxTemp.text="Max Temp: $maxTemp °C"
                    binding.minTemp.text="Max Temp: $minTemp °C"
                    binding.humidity.text="$humidty %"
                    binding.windspeed.text="$windspeed m/s"
                    binding.sunrise.text="${time(sunrise)}"
                    binding.sunset.text="${time(sunset)}"
                    binding.sea.text="$sealevel hPa"
                    binding.conditions.text=condition
                    binding.day.text= dayName(System.currentTimeMillis())
                            binding.date.text=date()
                            binding.city.text="$cityName"

                  //  Log.d("TAG", "onResponse: $temperature")
                    ChangeBackgroundAccordingtoImages(condition)
                }
            }

            override fun onFailure(call: Call<WeatherApp>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })


    }

    private fun ChangeBackgroundAccordingtoImages(condition:String) {
        when(condition){
            "Haze" ->{
                binding.root.setBackgroundResource(R.drawable.haze_bg)
            }
            "Clear Sky","Sunny","Clear" ->{
                binding.root.setBackgroundResource(R.drawable.sunny_bg4)
            }
            "Partly Clouds","Clouds","Overcast" ->{
                binding.root.setBackgroundResource(R.drawable.partlyclody)
            }
            "Mist","Foggy","Smoke" ->{
                binding.root.setBackgroundResource(R.drawable.foggy_bg)
            }
            "Light Rain","Drizzle","Moderate Rain", ->{
                binding.root.setBackgroundResource(R.drawable.drizzle_bg)
            }
            "Showers","Heavy Rain"->{
                binding.root.setBackgroundResource(R.drawable.heavyrain_bg2)
            }
            "Light Snow","Moderate Snow","Heavy Snow","Blizzard"->{
                binding.root.setBackgroundResource(R.drawable.snow_bg)
            }
            else ->{
                binding.root.setBackgroundResource(R.drawable.else_bg)
            }
        }
    }

    private fun date(): String {
        val sdf=SimpleDateFormat("dd MMMM yyyy", Locale.getDefault())
        return sdf.format((Date()))
    }
    private fun time(timestamp: Long): String {
        val sdf=SimpleDateFormat("HH:mm", Locale.getDefault())
        return sdf.format((Date(timestamp*1000)))
    }

    fun dayName(timestamp: Long):String{
        val sdf=SimpleDateFormat("EEEE", Locale.getDefault())
        return sdf.format((Date()))
    }
}