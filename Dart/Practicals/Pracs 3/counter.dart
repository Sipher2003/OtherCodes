// import 'package:flutter/material.dart';

// void main() => runApp(MyApp());

// class MyApp extends StatelessWidget {
//   // This widget is the root of your application.
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       // Application name
//       title: 'Flutter Stateful Clicker Counter',
//       theme: ThemeData(
//         // Application theme data, you can set the colors for the application as
//         // you want
//         primarySwatch: Colors.orange,
//       ),
//       home: MyHomePage(title: 'Upload Photos'),
//     );
//   }
// }

// class MyHomePage extends StatefulWidget {
//   final String title;
//   const MyHomePage({Key? key, required this.title}) : super(key: key);

//   @override
//   _MyHomePageState createState() => _MyHomePageState();
// }

// class _MyHomePageState extends State<MyHomePage> {
//   int _counter = 0;

//   void _incrementCounter() {
//     setState(() {
//       _counter++;
//     });
//   }

//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       backgroundColor: Color(0xffe8bd3a),
//       appBar: AppBar(
//         title: Text(widget.title),
//       ),
//       body: Center(
//         // Center is a layout widget. It takes a single child and positions it
//         // in the middle of the parent.
//         child: Column(
//           mainAxisAlignment: MainAxisAlignment.center,
//           children: <Widget>[
//             Text('Uploaded files:', style: TextStyle(fontSize: 45)),
//             Text(
//               '$_counter',
//               style: TextStyle(fontSize: 40),
//             ),
//           ],
//         ),
//       ),
//       floatingActionButton: FloatingActionButton(
//         onPressed: _incrementCounter,
//         tooltip: 'Upload',
//         child: Icon(Icons.upload_file),
//       ),
//       bottomNavigationBar: BottomNavigationBar(
//           currentIndex: 0,
//           fixedColor: Colors.deepOrange,
//           items: [
//             BottomNavigationBarItem(
//               label: ("Home"),
//               icon: Icon(Icons.home),
//             ),
//             BottomNavigationBarItem(
//               label: ("Search"),
//               icon: Icon(Icons.search),
//             ),
//             BottomNavigationBarItem(
//               label: ("Profile"),
//               icon: Icon(Icons.account_circle),
//             ),
//           ],
//           onTap: (int indexOfItem) {}),
//     );
//   }
// }