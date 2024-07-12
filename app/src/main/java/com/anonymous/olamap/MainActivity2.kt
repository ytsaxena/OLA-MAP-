package com.anonymous.olamap

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ola.maps.mapslibrary.models.OlaMapsConfig
import com.ola.maps.mapslibrary.utils.MapTileStyle
import com.ola.maps.navigation.ui.v5.MapStatusCallback
import com.ola.maps.navigation.v5.navigation.OlaMapView

class MainActivity2 : AppCompatActivity(), MapStatusCallback {

    var isMapReady = false
    var olaMapView: OlaMapView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        olaMapView = findViewById(R.id.olaMapView)

        // Replace "your_token_here" with your actual token string
        val tokenInterceptor = ATI("eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJMRndtX0U2akoyWG5yYkpkS1d1VXl2UllUN25lZ0FibDhWLXVSTno3UzZVIn0.eyJleHAiOjE3MjA4MDgyMzEsImlhdCI6MTcyMDgwNDYzMSwianRpIjoiZjVlNWZiZDYtY2FjMi00NTRkLWJhMDEtYzcwYzQyMGU1MDlkIiwiaXNzIjoiaHR0cHM6Ly9hY2NvdW50Lm9sYW1hcHMuaW8vcmVhbG1zL29sYW1hcHMiLCJzdWIiOiJmZmI5NzkxNi05YWI0LTRmOWEtOWFkNS1hOWNkYTVhNzdjZjEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJlZmFjNGIxNi0zNmU2LTQwMTMtYTIxNy1jN2VkYTY0OTUzOTQiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIk9SRy1NS3BUbGpvTlJSIiwiZGVmYXVsdC1yb2xlcy1vbGFtYXBzIiwiU0JOLWFmYTU4ZmUxLTY3NWYtNGI0Mi05MWQ1LTVmNzI5YTllNDNmZiJdfSwic2NvcGUiOiJvcGVuaWQgcHJvZmlsZSBlbWFpbCIsImNsaWVudEhvc3QiOiIxMC4zNy4xNC44NiIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwib3JnIjoiT1JHLU1LcFRsam9OUlIiLCJvcmcxIjp7fSwicmVhbG0iOiJvbGFtYXBzIiwicHJlZmVycmVkX3VzZXJuYW1lIjoic2VydmljZS1hY2NvdW50LWVmYWM0YjE2LTM2ZTYtNDAxMy1hMjE3LWM3ZWRhNjQ5NTM5NCIsImNsaWVudEFkZHJlc3MiOiIxMC4zNy4xNC44NiIsInNibiI6IlNCTi1hZmE1OGZlMS02NzVmLTRiNDItOTFkNS01ZjcyOWE5ZTQzZmYiLCJjbGllbnRfaWQiOiJlZmFjNGIxNi0zNmU2LTQwMTMtYTIxNy1jN2VkYTY0OTUzOTQifQ.jNEMu1xE-wlW_hdUDZqVYufkea6__sbHCxCUljOgCAS8WEA020QugAWm7Wo9y9PeL2ZgJYB2F5LYGgxpfxKHLsfRX0LGnpq5INaKEVbRBSK4yHgz38SOO8W1zNpakllYTO_tXC7y_vEMt2jpR8prThZWe-7YJXCnW3Fw1EicKX61B-eJun4F86BvLv8snfleHdh04CHQpKlj9DmKyvdjyHOxHzX7TAGQzREUTgCj8R7vgcDVyjnwieeepy1CsGzMy7WPMbtlmqxN1uk5wigfZcSDb9V2KzS6MxREK5UWM4yMUcvDOuuUX8-qcJv3vsVy0lM2qp9oZc2lrAnJwPxkgA")

        olaMapView?.onCreate(savedInstanceState)
        olaMapView?.initialize(
            mapStatusCallback = this,
            olaMapsConfig = OlaMapsConfig.Builder()
                .setApplicationContext(applicationContext)
                .setClientId("efac4b16-36e6-4013-a217-c7eda6495394")
                .setMapBaseUrl("https://api.olamaps.io/")
                .setInterceptor(tokenInterceptor) // Use your AccessTokenInterceptor here
                 //pass the MapTileStyle here, it is Optional.
                .setMinZoomLevel(3.0)
                .setMaxZoomLevel(21.0)
                .setZoomLevel(14.0)
                .build()
        )


    }

    override fun onMapReady() {
        isMapReady = true

        Log.d("main", "start")

    }

    override fun onMapLoadFailed(p0: String?) {
        Log.d("main", "onMapLoadFailed: $p0")
    }
}