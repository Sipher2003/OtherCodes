function isPrime(num) {
    if (num <= 1) return false; // 0 and 1 are not prime numbers
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false; // if divisible by any number other than 1 and itself, it's not prime
    }
    return true;
}

for (let i = 2; i <= 100; i++) {
    if (isPrime(i)) {
        console.log(i); // print the prime number
    }
}
