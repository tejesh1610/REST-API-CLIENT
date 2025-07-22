import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class WeatherApp {

	private static final String API_KEY = "91118f999d1d5dfd029009cd2befe41b";
	private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/forecast?lat=44.34&lon=10.99";

	public static void main(String[] args) {
		String urlString = BASE_URL + "&appid=" + API_KEY;

		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");

			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuilder responseContent = new StringBuilder();
			String line;

			while ((line = reader.readLine()) != null) {
				responseContent.append(line);
			}
			reader.close();

			JSONObject json = new JSONObject(responseContent.toString());

			String cityName = json.getString("name");
			double temp = json.getJSONObject("main").getDouble("temp");
			String weatherDescription = json.getJSONArray("weather").getJSONObject(0).getString("description");
			int humidity = json.getJSONObject("main").getInt("humidity");
			double windSpeed = json.getJSONObject("wind").getDouble("speed");

			System.out.println("City: " + cityName);
			System.out.println("Temperature: " + temp + "°C");
			System.out.println("Weather: " + capitalize(weatherDescription));
			System.out.println("Humidity: " + humidity + "%");
			System.out.println("Wind Speed: " + windSpeed + " m/s");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String capitalize(String input) {
		return Character.toUpperCase(input.charAt(0)) + input.substring(1);
	}
}
