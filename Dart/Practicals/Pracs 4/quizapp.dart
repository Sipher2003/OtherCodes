// import 'dart:html';

// import 'package:flutter/material.dart';

// void main() => runApp(MyApp());

// class MyApp extends StatelessWidget {
//   // This widget is the root of your application.
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(title: 'Quiz', initialRoute: '/', routes: {
//       '/': (context) => QuizOne(),
//       '/quiz2': (context) => QuizTwo(),
//       '/quiz3': (context) => QuizThree(),
//       '/check': (context) => Answer(),
//     });
//   }
// }

// int score = 0;
// String quiz1 = "w";
// String quiz2 = "w";
// String quiz3 = "w";

// class QuizOne extends StatefulWidget {
//   @override
//   MyState createState() => MyState();
// }

// class MyState extends State<QuizOne> {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(
//           title: const Text("Quiz One"),
//           backgroundColor: Colors.deepOrangeAccent),
//       body: Container(
//         padding: const EdgeInsets.all(20),
//         child: Column(
//           children: [
//             const Text('What is the capital of Japan ?',
//                 style: TextStyle(fontSize: 18)),
//             const Divider(),
//             RadioListTile(
//                 title: const Text("Osaka"),
//                 value: "Osaka",
//                 groupValue: quiz1,
//                 onChanged: (value) {
//                   setState(() {
//                     quiz1 = value.toString();
//                   });
//                 }),
//             RadioListTile(
//                 title: const Text("Tokyo"),
//                 value: "Tokyo",
//                 groupValue: quiz1,
//                 onChanged: (value) {
//                   setState(() {
//                     quiz1 = value.toString();
//                   });
//                 }),
//             TextButton(
//               style: ButtonStyle(
//                 foregroundColor: MaterialStateProperty.all<Color>(Colors.blue),
//               ),
//               onPressed: () {
//                 if (quiz1 == "Tokyo") {
//                   score = score + 1;
//                 }
//                 Navigator.pushNamed(context, '/quiz2');
//               },
//               child: const Text('Quiz 2'),
//             ),
//             Text("You selected : $quiz1"),
//           ],
//         ),
//       ),
//     );
//   }
// }

// class QuizTwo extends StatefulWidget {
//   @override
//   MyState2 createState() => MyState2();
// }

// class MyState2 extends State<QuizTwo> {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(
//           title: const Text("Quiz Two"),
//           backgroundColor: Colors.deepOrangeAccent),
//       body: Container(
//         padding: const EdgeInsets.all(20),
//         child: Column(
//           children: [
//             const Text('Java is an _', style: TextStyle(fontSize: 18)),
//             const Divider(),
//             RadioListTile(
//                 title: const Text("Object oriented language"),
//                 value: "Object oriented language",
//                 groupValue: quiz2,
//                 onChanged: (value) {
//                   setState(() {
//                     quiz2 = value.toString();
//                   });
//                 }),
//             RadioListTile(
//                 title: const Text("Bike"),
//                 value: "bike",
//                 groupValue: quiz2,
//                 onChanged: (value) {
//                   setState(() {
//                     quiz2 = value.toString();
//                   });
//                 }),
//             TextButton(
//               style: ButtonStyle(
//                 foregroundColor: MaterialStateProperty.all<Color>(Colors.blue),
//               ),
//               onPressed: () {
//                 if (quiz2 == "Object oriented language") {
//                   score = score + 1;
//                 }
//                 Navigator.pushNamed(context, '/quiz3');
//               },
//               child: const Text('Quiz 3'),
//             ),
//             Text("You selected : $quiz2"),
//           ],
//         ),
//       ),
//     );
//   }
// }

// class QuizThree extends StatefulWidget {
//   @override
//   MyState3 createState() => MyState3();
// }

// class MyState3 extends State<QuizThree> {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(
//           title: const Text("Quiz 3"),
//           backgroundColor: Colors.deepOrangeAccent),
//       body: Container(
//         padding: const EdgeInsets.all(20),
//         child: Column(
//           children: [
//             const Text('Visual studio code is an _',
//                 style: TextStyle(fontSize: 18)),
//             const Divider(),
//             RadioListTile(
//                 title: const Text("IDE | Code Editor"),
//                 value: "IDE",
//                 groupValue: quiz3,
//                 onChanged: (value) {
//                   setState(() {
//                     quiz3 = value.toString();
//                   });
//                 }),
//             RadioListTile(
//                 title: const Text("Game"),
//                 value: "game",
//                 groupValue: quiz3,
//                 onChanged: (value) {
//                   setState(() {
//                     quiz3 = value.toString();
//                   });
//                 }),
//             TextButton(
//               style: ButtonStyle(
//                 foregroundColor: MaterialStateProperty.all<Color>(Colors.blue),
//               ),
//               onPressed: () {
//                 if (quiz3 == "IDE") {
//                   score = score + 1;
//                 }
//                 Navigator.pushNamed(context, '/check');
//               },
//               child: const Text('Check'),
//             ),
//             Text("You selected : $quiz3"),
//           ],
//         ),
//       ),
//     );
//   }
// }

// class Answer extends StatefulWidget {
//   @override
//   MyState4 createState() => MyState4();
// }

// class MyState4 extends State<Answer> {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(
//           title: const Text("Cheking Answers"),
//           backgroundColor: Colors.deepOrangeAccent),
//       body: Container(
//         padding: const EdgeInsets.all(20),
//         child: Column(
//           children: [
//             Text('Total score is $score', style: TextStyle(fontSize: 18)),
//             const Divider(),
//             TextButton(
//               style: ButtonStyle(
//                 foregroundColor: MaterialStateProperty.all<Color>(Colors.blue),
//               ),
//               onPressed: () {
//                 score = 0;
//                 Navigator.pushNamed(context, '/');
//               },
//               child: const Text('Redo Quiz'),
//             ),
//           ],
//         ),
//       ),
//     );
//   }
// }