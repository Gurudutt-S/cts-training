function add(x:string,y:string):string
function add(x:number,y:number):number
function add(x:string,y:number):string
function add(x:any,y:any):any{
    return x+y;
}




var sum=add(2,3);
console.log(sum);
var summ=add('a',3);
console.log(summ);




