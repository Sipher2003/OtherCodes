// import 'package:flutter/material.dart';

// void main() {
//   runApp(MyApp());
// }

// class MyApp extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       theme: ThemeData(
//         primaryColor: Colors.pinkAccent,
//       ),
//       home: Demo(),
//     );
//   }
// }

// class Demo extends StatefulWidget {
//   @override
//   _DemoState createState() => _DemoState();
// }

// class _DemoState extends State<Demo> {
//   final TextEditingController _heightController = TextEditingController();
//   final TextEditingController _weightController = TextEditingController();

//   double? _result;

//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(
//         title: Text('BMI Calculator 31011221008'),
//         centerTitle: true,
//         backgroundColor: Colors.pinkAccent,
//       ),
//       body: Container(
//         padding: EdgeInsets.symmetric(horizontal: 10.0),
//         child: Column(
//           mainAxisAlignment: MainAxisAlignment.center,
//           children: <Widget>[
//             TextField(
//               controller: _heightController,
//               keyboardType: TextInputType.number,
//               decoration: InputDecoration(
//                 labelText: 'height in cm',
//                 icon: Icon(Icons.trending_up),
//               ),
//             ),
//             SizedBox(height: 20),
//             TextField(
//               controller: _weightController,
//               keyboardType: TextInputType.number,
//               decoration: InputDecoration(
//                 labelText: 'weight in kg',
//                 icon: Icon(Icons.line_weight),
//               ),
//             ),
//             SizedBox(height: 15),
//             ElevatedButton(
//               child: Text(
//                 "Calculate",
//                 style: TextStyle(color: Colors.white),
//               ),
//               onPressed: calculateBMI,
//             ),
//             SizedBox(height: 15),
//             Text(
//               _result == null
//                   ? "Enter Value"
//                   : "${_result!.toStringAsFixed(2)}",
//               style: TextStyle(
//                 color: Colors.redAccent,
//                 fontSize: 19.4,
//                 fontWeight: FontWeight.w500,
//               ),
//             ),
//           ],
//         ),
//       ),
//     );
//   }

//   void calculateBMI() {
//     double height = double.parse(_heightController.text) / 100;
//     double weight = double.parse(_weightController.text);

//     double heightSquare = height * height;
//     double result = weight / heightSquare;
//     _result = result;
//     setState(() {});
//   }
// }
