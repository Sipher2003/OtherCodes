//basic hello world with bottomnavbar and floatingaction button
// import 'package:flutter/material.dart';

// void main() => runApp(MyApp());

// class MyApp extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       title: 'Hello there',
//       theme: ThemeData(primarySwatch: Colors.blue),
//       home: Myhomepage(),
//     );
//   }
// }

// class Myhomepage extends StatelessWidget {
//   Widget build(BuildContext context) {
//     return Scaffold(
//         backgroundColor: Colors.black,
//         appBar: AppBar(title: Text('First app')),
//         body: Center(
//             child: Text(
//           'Hello World',
//           style: TextStyle(color: Colors.deepPurpleAccent, fontSize: 40),
//         )),
//         floatingActionButton: FloatingActionButton(
//             elevation: 10.0,
//             backgroundColor: Colors.white,
//             foregroundColor: Colors.red,
//             child: Icon(Icons.add),
//             onPressed: () {
// // action on button press
//             }),
//         bottomNavigationBar: BottomNavigationBar(
//           currentIndex: 0,
//           fixedColor: Colors.orange,
//           items: [
//             BottomNavigationBarItem(label: ("Home"), icon: Icon(Icons.home)),
//             BottomNavigationBarItem(
//                 label: ("Search"), icon: Icon(Icons.search)),
//             BottomNavigationBarItem(
//                 label: ("Cart"), icon: Icon(Icons.shopping_cart))
//           ],
//         ));
//   }
// }




// Example of listtile
// import 'package:flutter/material.dart';

// void main() => runApp(MyApp());

// class MyApp extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       title: 'Hello there',
//       theme: ThemeData(primarySwatch: Colors.blue),
//       home: Myhomepage(),
//     );
//   }
// }

// class Myhomepage extends StatelessWidget {
//   Widget build(BuildContext context) {
//     return Scaffold(
//         // backgroundColor: Colors.black,
//         appBar: AppBar(title: Text('First app')),
//         body: ListView(
//           children: [
//             ListTile(
//               title: Text('This is main text'),
//               subtitle: Text('this is  subtext'),
//               leading: Icon(Icons.add),
//               trailing: Icon(Icons.arrow_forward),
//               contentPadding: EdgeInsets.all(10),
//             ),
//             ListTile(
//               title: Text('This is main text'),
//               subtitle: Text('this is  subtext'),
//               leading: Icon(Icons.add),
//               trailing: Icon(Icons.arrow_forward),
//               contentPadding: EdgeInsets.all(10),
//             )
//           ],
//         ),
//         floatingActionButton: FloatingActionButton(
//             elevation: 10.0,
//             backgroundColor: Colors.white,
//             foregroundColor: Colors.red,
//             child: Icon(Icons.add),
//             onPressed: () {
// // action on button press
//             }),
//         bottomNavigationBar: BottomNavigationBar(
//           currentIndex: 0,
//           fixedColor: Colors.orange,
//           items: [
//             BottomNavigationBarItem(label: ("Home"), icon: Icon(Icons.home)),
//             BottomNavigationBarItem(
//                 label: ("Search"), icon: Icon(Icons.search)),
//             BottomNavigationBarItem(
//                 label: ("Cart"), icon: Icon(Icons.shopping_cart))
//           ],
//         ));
//   }
// }


