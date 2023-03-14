import 'package:flutter/material.dart';

void main() => runApp(new MyApp());

class MyApp extends StatelessWidget {
// This widget is the root of your application.

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',

      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),

// home: new Dashboard(title: 'Flutter Demo Home Page'),

      home: Dashboard(),

      debugShowCheckedModeBanner: false,
    );
  }
}

class Dashboard extends StatefulWidget {
  @override
  _DashboardState createState() => _DashboardState();
}

class _DashboardState extends State<Dashboard> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("DASHBOARD 31011221008"),
        elevation: .1,
        backgroundColor: const Color(0xffb67cff),
      ),
      body: Container(
        padding: const EdgeInsets.symmetric(vertical: 20.0, horizontal: 2.0),
        color: Color(0xffffffff),
        child: GridView.count(
          crossAxisCount: 2,
          padding: const EdgeInsets.all(3.0),
          children: <Widget>[
            makeDashboardItem("Home", Icons.home),
            makeDashboardItem("Shoes", Icons.badge),
            makeDashboardItem("TRENDING", Icons.trending_up_rounded),
            makeDashboardItem("Cart", Icons.shopping_bag),
            makeDashboardItem("Offers", Icons.local_offer),
            makeDashboardItem("SETTINGS", Icons.settings_applications)
          ],
        ),
      ),
    );
  }

  Card makeDashboardItem(String title, IconData icon) {
    return Card(
        elevation: 1.0,
        margin: const EdgeInsets.all(8.0),
        child: Container(
          decoration: const BoxDecoration(color: Color(0xffa793ff)),
          child: InkWell(
            onTap: () {},
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              mainAxisSize: MainAxisSize.min,
              verticalDirection: VerticalDirection.down,
              children: <Widget>[
                const SizedBox(height: 50.0),
                Center(
                    child: Icon(
                  icon,
                  size: 40.0,
                  color: Colors.black,
                )),
                const SizedBox(height: 20.0),
                Center(
                  child: Text(title,
                      style:
                          const TextStyle(fontSize: 18.0, color: Colors.black)),
                )
              ],
            ),
          ),
        ));
  }
}
