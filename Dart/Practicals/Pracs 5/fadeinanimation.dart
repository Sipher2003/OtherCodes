// import &#39;package:flutter/material.dart&#39;;
// // Image URL --&gt; use network
// const img_url =
//     &#39;https://img.freepik.com/free-vector/marathon-abstract-concept-
// vector-illustration-running-competition-active-lifestyle-long-
// distance-race-athletic-workout-sports-training-street-fitness-
// sprint-winner-abstract-metaphor_335657-4262.jpg&#39;;
// // Creating class FadeInDemo, extends from Stateful
// class FadeInDemo extends StatefulWidget {
//   _FadeInDemoState createState() =&gt; _FadeInDemoState();
// }
// // State and Stateful widget need to be asociated
// class _FadeInDemoState extends State&lt;FadeInDemo&gt; {
//   double opacityLevel = 0.0;
//   @override
//   Widget build(BuildContext context) {
//     return Column(children: &lt;Widget&gt;[
//       Image.network(img_url),
//       Container(
//         padding: EdgeInsets.only(top: 10.0, bottom: 5.0),
//         alignment: Alignment.center,
//         child: ElevatedButton(
//           child: Text(
//             &#39;Know More&#39;,
//             style: TextStyle(
//               color: Colors.blueAccent,
//               fontSize: 25.0,
//             ),
//           ),
//           onPressed: () =&gt; setState(() {
//             opacityLevel = 1.0;
//           }),
//         ),
//       ),
//       Container(
//         padding: EdgeInsets.only(left: 10.0, right: 10.0, bottom:
// 10.0),

//         child: AnimatedOpacity(
//           duration: Duration(seconds: 3),
//           opacity: opacityLevel,
//           child: Column(
//             children: &lt;Widget&gt;[
//               Text(
//                 &#39;Fitnize is an app to incorporate fitness in a
// realistic way. &#39; +
//                     &#39;Using our app will lead you to a healthy
// lifestyle. &#39; +
//                     &#39;Multiple features have been provided like
// sleep, step tracking, reminders.&#39;,
//                 style: TextStyle(
//                   fontSize: 15.0,
//                 ),
//               ),
//             ],
//           ),
//         ),
//       ),
//       Container(
//         decoration: BoxDecoration(
//           color: Colors.blue,
//         ),
//         width: 500,
//         height: 25,
//       ),
//     ]);
//   }
// }
// class MyApp extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       debugShowCheckedModeBanner: false,
//       home: Scaffold(
//         appBar: AppBar(
//           title: const Text(&quot;Fitnize&quot;),
//         ),
//         body: Container(
//           // Call to the FadeInDemo class

//           child: FadeInDemo(),
//         ),
//       ),
//     );
//   }
// }
// // void main --&gt; MyApp --&gt; FadeInDemo
// void main() {
//   runApp(
//     MyApp(),
//   );
// }