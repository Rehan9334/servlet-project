<%@ page import="org.json.JSONObject" %>
<%
    String data = (String) request.getAttribute("weatherData");
    JSONObject json = new JSONObject(data);
    String cityName = json.getString("name");
    double temp = json.getJSONObject("main").getDouble("temp");
    String weather = json.getJSONArray("weather").getJSONObject(0).getString("description");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Weather Report</title>
    
</head>
<body>
    <h2>Weather in <%= cityName %></h2>
    <p>Temperature: <%= temp %>°C</p>
    <p>Condition: <%= weather %></p>
    <a href="index.html">Search Again</a>
</body>
</html>