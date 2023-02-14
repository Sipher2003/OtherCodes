// import 'dart:html';

// import 'package:flutter/material.dart';
// import 'package:flutter/widgets.dart';

// void main() =>
//     runApp(MaterialApp(title: "animation", initialRoute: '/', routes: {
//       "/": (context) => AnimatedContainerPage(),
//       'gang': (content) => gang(),
//     }));

// class AnimatedContainerPage extends StatefulWidget {
//   // This widget is the root of your application.
//   @override
//   _AnimatedContainerPageState createState() => _AnimatedContainerPageState();
// }

// class _AnimatedContainerPageState extends State<AnimatedContainerPage> {
//   double _width = 200;
//   double _height = 200;
//   Color _color = Colors.blue;
//   Color _bcolor = Color(0xfffffafa);

//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       body: Column(
//         children: [
//           AnimatedContainer(
//             width: _width,
//             height: _height,
//             color: _color,
//             duration: Duration(milliseconds: 250),
//           ),
//           ElevatedButton(
//             onPressed: () {
//               Navigator.pushNamed(context, 'gang');
//             },
//             child: Icon(Icons.car_rental),
//             style: ElevatedButton.styleFrom(
//               primary: _bcolor,
//               padding: EdgeInsets.all(0),
//             ),
//           )
//         ],
//       ),
//       floatingActionButton: FloatingActionButton(
//         child: Icon(Icons.play_arrow),
//         onPressed: _update,
//         foregroundColor: Colors.white,
//         backgroundColor: Colors.purple,
//       ),
//     );
//   }

//   void _update() {
//     setState(() {
//       if (_color == Colors.blue) {
//         _width = 300;
//         _height = 300;
//         _color = Colors.green;
//         _bcolor = Colors.black;
//         curve:
//         Curves.easeInOutCubic;
//       } else {
//         _width = 200;
//         _height = 200;
//         _color = Colors.blue;
//         _bcolor = Colors.white;
//         curve:
//         Curves.easeOutCubic;
//       }
//     });
//   }
// }

// class gang extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//         appBar: AppBar(title: const Text("we gang gang")),
//         body: Center(
//           child: ElevatedButton(
//             onPressed: () {
//               Navigator.pushNamed(context, "/");
//             },
//             child: const Text("home"),
//             style: ElevatedButton.styleFrom(
//               primary: Colors.amber,
//             ),
//           ),
//         ));
//   }
// }