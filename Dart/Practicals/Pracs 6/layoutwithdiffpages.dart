// import 'package:flutter/material.dart';

// void main() => runApp(MyApp());

// /// This Widget is the main application widget.
// class MyApp extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       home: MyNavigationBar(),
//     );
//   }
// }

// class MyNavigationBar extends StatefulWidget {
//   MyNavigationBar({Key? key}) : super(key: key);

//   @override
//   _MyNavigationBarState createState() => _MyNavigationBarState();
// }

// class _MyNavigationBarState extends State<MyNavigationBar> {
//   int _selectedIndex = 0;
//   static const List<Widget> _widgetOptions = <Widget>[
//     Text('Welcome ',
//         style: TextStyle(fontSize: 35, fontWeight: FontWeight.bold)),
//     Text('Cart ', style: TextStyle(fontSize: 35, fontWeight: FontWeight.bold)),
//     Text('Payment',
//         style: TextStyle(
//           fontSize: 30,
//           fontWeight: FontWeight.bold,
//         )),
//     Text('Profile Page\nMy name is Doflamingo :)',
//         style: TextStyle(fontSize: 35, fontWeight: FontWeight.bold)),
//     Text('Logout!',
//         style: TextStyle(fontSize: 35, fontWeight: FontWeight.bold)),
//   ];

//   void _onItemTapped(int index) {
//     setState(() {
//       _selectedIndex = index;
//     });
//   }

//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(
//           title: const Text('Shopping App'), backgroundColor: Colors.blue),
//       body: Center(
//         child: _widgetOptions.elementAt(_selectedIndex),
//       ),
//       bottomNavigationBar: BottomNavigationBar(
//           items: const <BottomNavigationBarItem>[
//             BottomNavigationBarItem(
//                 icon: Icon(Icons.home),
//                 label: "Home",
//                 backgroundColor: Colors.blue),
//             BottomNavigationBarItem(
//                 icon: Icon(Icons.shop),
//                 label: "Cart",
//                 backgroundColor: Colors.blue),
//             BottomNavigationBarItem(
//                 icon: Icon(Icons.currency_rupee_sharp),
//                 label: "Payment",
//                 backgroundColor: Colors.blue),
//             BottomNavigationBarItem(
//               icon: Icon(Icons.person),
//               label: "Profile",
//               backgroundColor: Colors.blue,
//             ),
//             BottomNavigationBarItem(
//               icon: Icon(Icons.logout),
//               label: "Logout",
//               backgroundColor: Color(0xfffd0000),
//             ),
//           ],
//           type: BottomNavigationBarType.shifting,
//           currentIndex: _selectedIndex,
//           selectedItemColor: Colors.black,
//           iconSize: 40,
//           onTap: _onItemTapped,
//           elevation: 5),
//     );
//   }
// }
