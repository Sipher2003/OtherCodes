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







//textfield
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
//         body: Padding(
//             padding: const EdgeInsets.all(20),
//             child: Column(
//               children: [
//                 TextField(
//                     decoration: InputDecoration(
//                         border: InputBorder.none,
//                         labelText: 'Name',
//                         hintText: 'Enter your name',
//                         filled: true)),
//                 SizedBox(height: 20),
//                 TextField(
//                     decoration: InputDecoration(
//                         border: InputBorder.none,
//                         labelText: 'class',
//                         hintText: 'Enter your class',
//                         filled: true)),
//                 SizedBox(height: 20),
//                 ElevatedButton(
//                   onPressed: () {},
//                   child: const Text('Fetch'),
//                 )
//               ],
//             )),
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





//Routing

// import 'package:flutter/material.dart';

// void main() => runApp(MyApp());

// class MyApp extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       title: "MyApp",
//       theme: ThemeData(primarySwatch: Colors.orange),
//       home: Myhomepage(),
//       // initialRoute: "/",
//       routes: {
//         "/home": (context) => Myhomepage(),
//         "/search": (context) => Mysearchpage(),
//         "/cart": (context) => Mycartpage()
//       },
//     );
//   }
// }

// class Myhomepage extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(title: Text("Navigation")),
//       body: Center(
//         child: ElevatedButton(
//             onPressed: () {
//               Navigator.pushNamed(context, "/search");
//             },
//             child: Text("Next")),
//       ),
//       bottomNavigationBar: BottomNavigationBar(
//         currentIndex: 0,
//         items: [
//           BottomNavigationBarItem(label: ("home"), icon: Icon(Icons.home)),
//           BottomNavigationBarItem(label: ("search"), icon: Icon(Icons.search)),
//           BottomNavigationBarItem(
//               label: ("cart"), icon: Icon(Icons.shopping_cart)),
//         ],
//       ),
//     );
//   }
// }

// class Mysearchpage extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(title: Text("Navigation")),
//       body: Center(
//         child: Column(
//           mainAxisAlignment: MainAxisAlignment.center,
//           children: [
//             ElevatedButton(
//                 onPressed: () {
//                   Navigator.pushNamed(context, "/cart");
//                 },
//                 child: Text("Next")),
//             SizedBox(height: 10),
//             ElevatedButton(
//                 onPressed: () {
//                   Navigator.pushNamed(context, "/home");
//                 },
//                 child: Text("Prev")),
//           ],
//         ),
//       ),
//       bottomNavigationBar: BottomNavigationBar(
//         currentIndex: 1,
//         items: [
//           BottomNavigationBarItem(label: ("home"), icon: Icon(Icons.home)),
//           BottomNavigationBarItem(label: ("search"), icon: Icon(Icons.search)),
//           BottomNavigationBarItem(
//               label: ("cart"), icon: Icon(Icons.shopping_cart)),
//         ],
//       ),
//     );
//   }
// }

// class Mycartpage extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(title: Text("Navigation")),
//       body: Center(
//         child: Column(
//           mainAxisAlignment: MainAxisAlignment.center,
//           children: [
//             ElevatedButton(onPressed: () {}, child: Text("Next")),
//             SizedBox(height: 10),
//             ElevatedButton(
//                 onPressed: () {
//                   Navigator.pushNamed(context, "/search");
//                 },
//                 child: Text("Prev")),
//           ],
//         ),
//       ),
//       bottomNavigationBar: BottomNavigationBar(
//         currentIndex: 2,
//         items: [
//           BottomNavigationBarItem(label: ("home"), icon: Icon(Icons.home)),
//           BottomNavigationBarItem(label: ("search"), icon: Icon(Icons.search)),
//           BottomNavigationBarItem(
//               label: ("cart"), icon: Icon(Icons.shopping_cart)),
//         ],
//       ),
//     );
//   }
// }