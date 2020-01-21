var arr = new Array(10)
for (var i = 0; i < arr.length; i++) {
    arr[i] = Math.floor(Math.random() * 100)
}

var filt = arr.filter((x) => x % 2 == 0 && x % 5 == 0)

var ma = arr.map((x) =>Math.floor( x * 1.1))

console.log(filt)
console.log(ma)  