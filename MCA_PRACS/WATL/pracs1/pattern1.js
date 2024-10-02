const n = parseInt(process.argv[2])

for (var i = n; i > 0; i--){
    
    for (var a = 1; a <= i; a++){
        process.stdout.write(a + ' ');  //printing the numbers in the same line with the space 
    }
    console.log(" ");
}
