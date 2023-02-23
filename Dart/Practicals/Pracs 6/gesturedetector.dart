//  Gesture detector

//  import 'package:flutter/material.dart';

// void main() {
//   runApp(
//     MaterialApp(
//       title: 'Navigation with Gesture Detector',
//       initialRoute: '/',
//       routes: {
//         '/': (context) => HomeScreen(),
//         '/second': (context) => InfoScreen(),
//       },
//     ),
//   );
// }


// class HomeScreen extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(
//         title: Text("Fitnize"),
//       ),
//       body: Column(
//         children: <Widget>[
//           Padding(
//             padding: EdgeInsets.fromLTRB(50, 10, 50, 10),
//             child: Text(
//               'Workout',
//               style: TextStyle(color: Color(0xFF055052), fontWeight: FontWeight.w500, fontSize: 30),
//             ),
//           ),
//           Padding(
//             padding: EdgeInsets.all(10),
//             child: GestureDetector(
//               onLongPress: () {
//                 Navigator.pushNamed(context, '/second');
//               },
//               child: Image.network('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz6lPtniI2rRf_biCCqOnJbFoMttYiyIEldgblSrTq5GCARkVoL09Hs8ULKlpx_1UIFDg&usqp=CAU'),
//             ),
//           ),
//           Padding(
//             padding: EdgeInsets.all(15),
//             child: Text(
//               'Long Press the image to know more',
//               style: TextStyle(color: Color(0xFF055052), fontWeight: FontWeight.w500, fontSize: 20),
//             ),
//           ),
//         ],
//       ),
//     );
//   }
// }


// class InfoScreen extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(
//         title: Text("Information of the Image"),
//       ),
//       body: Padding(
//         padding: EdgeInsets.fromLTRB(15, 170, 15, 100),
//         child: Text('This particular workout is of an exercise that we should do daily.\n' + 'It is termed as standing side bends.\n' + 'Calories burnt by doing this exercise is 31 if we exercise for 10 mins.',
//             style: TextStyle(
//               fontSize: 23,
//               color: Color(0xFF5F1A2F),
//             )),
//       ),
//     );
//   }
// }
