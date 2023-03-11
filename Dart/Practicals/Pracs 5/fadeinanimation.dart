import 'package:flutter/material.dart';

// Image URL --> use network
const img_url =
    'https://www.pngkey.com/png/detail/61-612294_anime-manga-animeboy-one-piece-luffy-manga-anime.png';

// Creating class FadeInDemo, extends from Stateful
class FadeInDemo extends StatefulWidget {
  _FadeInDemoState createState() => _FadeInDemoState();
}

// State and Stateful widget need to be asociated
class _FadeInDemoState extends State<FadeInDemo> {
  double opacityLevel = 0.0;
  @override
  Widget build(BuildContext context) {
    return Column(children: <Widget>[
      Image.network(img_url),
      Container(
        padding: EdgeInsets.only(top: 10.0, bottom: 5.0),
        alignment: Alignment.center,
        child: ElevatedButton(
          child: Text(
            'Know More',
            style: TextStyle(
              color: Color(0xffffffff),
              fontSize: 15.0,
            ),
          ),
          onPressed: () => setState(() {
            opacityLevel = 1.0;
          }),
        ),
      ),
      Container(
        padding: EdgeInsets.only(left: 10.0, right: 10.0, bottom: 10.0),
        child: AnimatedOpacity(
          duration: Duration(seconds: 3),
          opacity: opacityLevel,
          child: Column(
            children: <Widget>[
              Text(
                'Monkey D. Luffy, also known as "Straw Hat Luffy" and commonly as "Straw Hat',
                style: TextStyle(
                  fontSize: 20.0,
                ),
              ),
            ],
          ),
        ),
      ),
      Container(
        decoration: BoxDecoration(
          color: Color(0xfff80000),
        ),
        width: 500,
        height: 25,
      ),
    ]);
  }
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: const Text("Mid Piece"),
        ),
        body: Container(
          // Call to the FadeInDemo class
          child: FadeInDemo(),
        ),
      ),
    );
  }
}

// void main --> MyApp --> FadeInDemo
void main() {
  runApp(
    MyApp(),
  );
}
