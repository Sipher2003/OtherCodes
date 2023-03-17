import 'dart:async';

// main() {
//   print("Main Program started");
//   printfilecontent();
//   print("Main Program ended");
// }

// printfilecontent() async {
//   String fileContent = await downloadFile();
//   print("File Contents are ${fileContent}");
// }

// Future<String> downloadFile() {
//   Future<String> result = Future.delayed(Duration(seconds: 4), () {
//     return 'My file content';
//   });
//   return result;
// }


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


void main() async {
await hello();
print('all done');
}

hello() async {
print('something exciting is going to happen here...');
}
