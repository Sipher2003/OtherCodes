function fabonacci(num){
    let n1=0, n2=1, nextterm;
    for(let i= 0; i < num; i++){
        console.log(n1);
        nextterm = n1 + n2;
        n1 = n2;
        n2 = nextterm;

    }
}

const number = parseInt(process.argv[2]);
fabonacci(number);
