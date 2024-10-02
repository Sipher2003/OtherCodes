const n = parseInt(process.argv[2]);

for (var i = 0; i < n; i++){
    
    for (var a = 0; a <= i; a++){
        process.stdout.write("*" + ' ');  // 
    }
    console.log(" ");
}
