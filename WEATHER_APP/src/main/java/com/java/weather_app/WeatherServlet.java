package com.java.weather_app;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/WeatherServlet")

public class WeatherServlet extends HttpServlet {
    @SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String city = request.getParameter("city");
        String apiKey = "86c57db4e49d094d6c9e01c3f57b53fb";
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
        
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        
        Scanner sc = new Scanner(url.openStream());
        StringBuilder result = new StringBuilder();
        while (sc.hasNext()) {
            result.append(sc.nextLine());
        }
        sc.close();
        
        request.setAttribute("weatherData", result.toString());
        request.getRequestDispatcher("weather.jsp").forward(request, response);
    }
}

