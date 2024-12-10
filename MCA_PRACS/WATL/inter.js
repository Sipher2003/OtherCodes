let count=0

const intervalid=setInterval(()=>{
    console.log("hello")
    count++

    if(count===10){
        clearInterval(intervalid)
    }

},500)