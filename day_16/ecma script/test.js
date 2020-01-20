test()

var name = 'hello'
var name = 'world'
console.log('name :  ' + name)

//same variable name can be declared more then one time.
//the scope of the var keyword is function scope.
//Javascript uses hoisting(variables and functions)

function test() {
    // for (var index = 0; index < 5; index++) {
    //     console.log('Index : ' + index)
    // }
    // console.log('value of index : ' + index)

    var name = 'hai'
    console.log('name : ' + name)

}