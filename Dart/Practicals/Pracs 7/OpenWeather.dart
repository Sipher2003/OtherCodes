import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Weather Application',
      theme: ThemeData(
        primarySwatch: Colors.teal,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: CurrentWeatherPage(),
    );
  }
}

class Weather {
  final double? temp;
  final double? feelsLike;
  final double? low;
  final double? high;
  final String? description;
  Weather({this.temp, this.feelsLike, this.low, this.high, this.description});
  factory Weather.fromJson(Map<String, dynamic> json) {
    return Weather(
      temp: json['main']['temp'].toDouble(),
      feelsLike: json['main']['feels_like'].toDouble(),
      low: json['main']['temp_min'].toDouble(),
      high: json['main']['temp_max'].toDouble(),
      description: json['weather'][0]['description'],
    );
  }
}

class CurrentWeatherPage extends StatefulWidget {
  @override
  _CurrentWeatherPageState createState() => _CurrentWeatherPageState();
}

class _CurrentWeatherPageState extends State<CurrentWeatherPage> {
  late Weather _weather;
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text('Weather Data'),
        ),
        body: Center(
          child: FutureBuilder(
            builder: (context, snapshot) {
              if (snapshot != null) {
                this._weather = snapshot.data as Weather;
                if (this._weather == null) {
                  return Text("Error getting weather");
                } else {
                  return weatherBox(_weather);
                }
              } else {
                return CircularProgressIndicator();
              }
            },
            future: getCurrentWeather(),
          ),
        ));
  }
}

Widget weatherBox(Weather _weather) {
  return Column(mainAxisSize: MainAxisSize.min, children: <Widget>[
    Container(
        margin: const EdgeInsets.all(10.0),
        child: Text(
          "${_weather.temp}°C",
          textAlign: TextAlign.center,
          style: TextStyle(
            fontWeight: FontWeight.bold,
            fontSize: 60,
            color: Colors.teal[800],
          ),
        )),
    Container(
        margin: const EdgeInsets.all(5.0),
        child: Text(
          "${_weather.description}",
          style: TextStyle(
            fontWeight: FontWeight.bold,
            fontSize: 20,
            color: Colors.teal[700],
          ),
        )),
    Container(
        margin: const EdgeInsets.all(5.0),
        child: Text(
          "Feels:${_weather.feelsLike}°C",
          style: TextStyle(
            fontWeight: FontWeight.bold,
            fontSize: 20,
            color: Colors.teal[700],
          ),
        )),
    Container(
        margin: const EdgeInsets.all(5.0),
        child: Text(
          "H:${_weather.high}°C L:${_weather.low}°C",
          style: TextStyle(
            fontWeight: FontWeight.bold,
            fontSize: 20,
            color: Colors.teal[700],
          ),
        )),
  ]);
}

Future getCurrentWeather() async {
  Weather weather;
  String city = "calgary";
  String apiKey = "3c97151c47f203334e308a7860ea8826";
  var url =
      "https://api.openweathermap.org/data/2.5/weather?q=$city&appid=$apiKey&units=metric";
  final response = await http.get(Uri.parse(url));
  if (response.statusCode == 200) {
    weather = Weather.fromJson(jsonDecode(response.body));
    return weather;
  }
}
