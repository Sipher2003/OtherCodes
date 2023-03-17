// import 'package:flutter/material.dart';
// import 'package:cloud_firestore/cloud_firestore.dart';
// import 'package:firebase_core/firebase_core.dart';
// import 'firebase_options.dart';

// Future<void> main() async {
//   WidgetsFlutterBinding.ensureInitialized();
//   await Firebase.initializeApp(
//     options: DefaultFirebaseOptions.currentPlatform,
//   );
//   runApp(MyApp());
// }

// class MyApp extends StatelessWidget {
// // This widget is the root
// // of your application.
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       title: 'Firebase',
//       home: AddData(),
//     );
//   }
// }

// class AddData extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(backgroundColor: Colors.green, title: Text("Add Data")),
//       body: Center(
//         child: FloatingActionButton(
//           backgroundColor: Colors.green,
//           child: Icon(Icons.add),
//           onPressed: () {
//             FirebaseFirestore.instance
//                 .collection('Class')
//                 .add({'Name': 'From Program'});
//           },
//         ),
//       ),
//     );
//   }
// }
