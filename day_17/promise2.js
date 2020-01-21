var asynchronousFunction=function(){
    return new Promise(function(resolve,reject){
        console.log('keep every promise')
        setTimeout(resolve,5000)
    })
}
asynchronousFunction()
    .then(asynchronousFunction)
    .then(asynchronousFunction)