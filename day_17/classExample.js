class Hello{
    constructor(fname,lname,age){
        this.fn=fname
        this.ln=lname
        this.a=age
    }
    display()
    {
        return this.fn+ ' ' +this.ln
    }
}

let hai=new Hello('abin','joshy',23)
console.log('full name: '+hai.display());
