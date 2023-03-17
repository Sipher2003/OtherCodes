// import 'dart:async';

// // main() {
// //   print("Main Program started");
// //   printfilecontent();
// //   print("Main Program ended");
// // }

// // printfilecontent() async {
// //   String fileContent = await downloadFile();
// //   print("File Contents are ${fileContent}");
// // }

// // Future<String> downloadFile() {
// //   Future<String> result = Future.delayed(Duration(seconds: 4), () {
// //     return 'My file content';
// //   });
// //   return result;
// // }


// main(){
//   print("Linne start");
//   printfilecontent();
//   print("Linne ends");
// }

// printfilecontent() async {
// String fileContent= await downloadfile();
// print("File content is $fileContent");
// }

// Future<String> downloadfile(){
//    Future<String> result=Future.delayed(Duration(seconds: 5), (){
//     return "Helo World";
//    });
//    return result;
// }


// import 'package:flutter/material.dart';
// import 'package:http/http.dart';
// void main() => runApp(MyApp());
// class MyApp extends StatefulWidget {
// @override
// _MyState createState() => _MyState();
// }
// class _MyState extends State<MyApp> {
// Future data;
// void initState() {
// super.initState();
// data =
// Network("https://jsonplaceholder.typicode.com/posts").fetchData();
// }
// @override
// Widget build(BuildContext context) {
// return MaterialApp(
// title: 'Flutter Demo',
// theme: ThemeData(
// primarySwatch: Colors.blue,
// ),
// home: Scaffold(
// 34
// appBar: AppBar(title: Text("A Simple App Stateful Widget")),
// ));
// }
// }
// class Network {
// var url;
// Network(this.url);
// Future fetchData() async {
// print("$url");
// Response response = await get(Uri.parse(url));
// if (response.statusCode == 200) {
// //OK Status
// print(response.body);
// return response.body;
// } else {
// print(response.statusCode);
// }
// }
// }