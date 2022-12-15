void main()
{
   List list = ['Mumbai',24,'Pune',20,'Nashik',18,'Nagpur',15,'Nanded',25]; 
  
   var max=list[1];
   var min=list[1];
  var mincityindex=0;
  var maxcityindex=0;
  
  
  for(int i=1;i<=list.length;i=i+2){
    if (list[i] < min){
      min=list[i];
      mincityindex=i-1;
      }
     if (list[i] > max){
      max=list[i];
      maxcityindex=i-1;
      }
  }

  print("Minimum temp is ${min} and city is ${list[mincityindex]}");
  print("Max temp is ${max} and city is ${list[maxcityindex]}");
  
  
}