const myPromise = new Promise((resolve, reject) => {
    if (Math.random() * 100 <= 90) {
        resolve('hello,Promises')
    }
    reject(new Error('in 10% case ,fail'))
});

const onResolved = (resolvedValue) => console.log(resolvedValue)
const onRejected = (error) => console.log(error)
myPromise.then(onResolved, onRejected)