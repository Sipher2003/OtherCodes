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


// simple switch eg to change bgcolor
// import 'package:flutter/material.dart';
// import 'package:flutter/widgets.dart';

// void main() => runApp(MyApp());

// class MyApp extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       title: "My app",
//       theme: ThemeData(primarySwatch: Colors.blue),
//       home: MyhomePage(),
//     );
//   }
// }

// class MyhomePage extends StatefulWidget {
//   @override
//   _MyhomePagestate createState() => _MyhomePagestate();
// }

// bool switched = false;

// class _MyhomePagestate extends State<MyhomePage> {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       backgroundColor: switched ? Colors.black : Colors.white,
//       appBar: AppBar(title: Text("Myapp")),
//       body: Container(
//         child: Switch(
//           value: switched,
//           onChanged: (newval) {
//             setState(() {
//               switched = newval;
//             });
//           },
//         ),
        
//       ),
      
//       floatingActionButton: FloatingActionButton(
//         elevation: 10,
//         child: Icon(Icons.add),
//         onPressed: () {},
//       ),
//     );
//   }
// }




// Flutter slider
// import 'package:flutter/material.dart';
// import 'package:flutter/widgets.dart';

// void main() => runApp(MyApp());

// class MyApp extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       title: "My app",
//       theme: ThemeData(primarySwatch: Colors.blue),
//       home: MyhomePage(),
//     );
//   }
// }

// class MyhomePage extends StatefulWidget {
//   @override
//   _MyhomePagestate createState() => _MyhomePagestate();
// }

// double _currentval = 1;

// class _MyhomePagestate extends State<MyhomePage> {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       // backgroundColor: switched ? Colors.black : Colors.white,
//       appBar: AppBar(title: Text("Myapp")),
//       body: Container(
//         child:
//             Column(mainAxisAlignment: MainAxisAlignment.spaceEvenly, children: [
//           Slider(
//               min: 1,
//               max: 100,
//               divisions: 10,
//               value: _currentval,
//               onChanged: (value) {
//                 setState(() {
//                   _currentval = value;
//                 });
//               }),
//           Text(
//             _currentval.toString(),
//             style: TextStyle(fontSize: 30),
//           )
//         ]),
//       ),
//       floatingActionButton: FloatingActionButton(
//         elevation: 10,
//         child: Icon(Icons.add),
//         onPressed: () {},
//       ),
//     );
//   }
// }





// Navigating using bottom nav bar
// import 'package:flutter/material.dart';

// void main() => runApp(MyApp());

// class Bag extends StatelessWidget {
//   Widget build(BuildContext context) {
//     return Scaffold(
//       body: Center(child: Text("Bag")),
//     );
//   }
// }

// class Cart extends StatelessWidget {
//   Widget build(BuildContext context) {
//     return Scaffold(
//       body: Center(child: Text("cart")),
//     );
//   }
// }

// class Homee extends StatelessWidget {
//   Widget build(BuildContext context) {
//     return Scaffold(
//       body: Center(child: Text("Home")),
//     );
//   }
// }

// class MyApp extends StatelessWidget {
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       title: "My app",
//       theme: ThemeData(primarySwatch: Colors.green),
//       home: MyHome(),
//     );
//   }
// }

// class MyHome extends StatefulWidget {
//   @override
//   MyHomestate createState() => MyHomestate();
// }

// class MyHomestate extends State<MyHome> {
//   int _currentIndex = 0;
//   final List _children = [Homee(), Bag(), Cart()];

//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(title: Text("Hello")),
//       body: _children[_currentIndex],
//       bottomNavigationBar: BottomNavigationBar(
//         currentIndex: _currentIndex,
//         onTap: (index) => setState(() {
//           _currentIndex = index;
//         }),
//         selectedItemColor: Colors.red,
//         items: [
//           BottomNavigationBarItem(
//             icon: Icon(Icons.home),
//             label: "Home",
//           ),
//           BottomNavigationBarItem(icon: Icon(Icons.shopping_bag), label: "Bag"),
//           BottomNavigationBarItem(
//               icon: Icon(Icons.shopping_cart), label: "Cart"),
//         ],
//       ),
//     );
//   }
// }


//dashboard
// import 'package:flutter/material.dart';

// void main() => runApp(Myapp());

// class Myapp extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       title: "MyApp",
//       theme: ThemeData(brightness: Brightness.dark),
//       home: Dashboard(),
//     );
//   }
// }

// class Dashboard extends StatefulWidget {
//   @override
//   _DashboardState createState() => _DashboardState();
// }

// class _DashboardState extends State<Dashboard> {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(title: Text("Dashboard")),
//       body: Container(
//         padding: const EdgeInsets.symmetric(vertical: 20.0, horizontal: 2.0),
//         color: Colors.grey,
//         child: GridView.count(
//           crossAxisCount: 2,
//           padding: const EdgeInsets.all(15),
//           children: <Widget>[
//             makeDashboardItem("Home", Icons.home),
//             makeDashboardItem("Shoes", Icons.badge),
//             makeDashboardItem("TRENDING", Icons.trending_up_rounded),
//             makeDashboardItem("Cart", Icons.shopping_bag),
//             makeDashboardItem("Offer", Icons.local_offer),
//             makeDashboardItem("SETTINGS", Icons.settings_applications)
//           ],
//         ),
//       ),
//     );
//   }

//   Card makeDashboardItem(String title, IconData icon) {
//     return Card(
//       child: Container(
//         decoration: BoxDecoration(color: Colors.yellow),
//         child: InkWell(
//           onTap: () {},
//           child: Column(children: [
//             const SizedBox(
//               height: 50,
//             ),
//             Center(
//                 child: Icon(
//               icon,
//               size: 40.0,
//               color: Colors.black,
//             )),
//             Center(
//               child: Text(
//                 title,
//                 style: TextStyle(fontSize: 18, color: Colors.black),
//               ),
//             )
//           ]),
//         ),
//       ),
//     );
//   }
// }





