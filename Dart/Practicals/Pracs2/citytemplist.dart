void main()
{
var city=['mumbai',31,'Nagpur',21,'Solapur',14,'Kolhapur',19,'Ratnagiri',32,'Pune',22,'Nashik',18,'Akola',44,'Amravati',41,'Raigad',33];
  
  var max=city[0];
  var min=city[0];
  
  // for(var i=1;i<city.length;i+2){
	// 	print(city[i]);


	// }
  //code to find max and min temp
  // for(var i=1;i<city.length;i+=2){
  //   // min=city[i];
  //   if(city[i]>max){
  //     max=city[i];
  //   }
  //   if(city[i]<min){
  //     min=city[i];
  //   }
  // }




  print("Max temp is ${max} and city is ${city[city.indexOf(max)-1]}");
  print("Min temp is ${min} and city is ${city[city.indexOf(min)-1]}");
}