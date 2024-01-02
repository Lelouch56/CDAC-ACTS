//npm i express
const express=require('express');

const app=express();
//to make the html dynamic ejs is used
//template engine--> ejs
app.set("view engine", "ejs");
app.use(express.static("./public"));
// app.use(function(req,res,next){
//     console.log("middleware1");
//     next();//to go to next step
// })

// app.use(function(req,res,next){
//     console.log("middleware2");
//     next();
// })

// app.get('/',function(req,res){
//     res.send("Hello World");
// })

// app.get('/index/:value',function(req,res){
//     res.send(`welcome to ${req.params.value}`)
// })

app.get('/index',function(req,res){
    res.render("index")
})

app.get('/index2',function(req,res){
    res.render("index2",{info:"pratham"})//pass value
})

app.get("/error",function(req,res,next){
    throw Error("something went wrong...");
})

app.use(function errorHandler (err, req, res, next) {
    if (res.headersSent) {
      return next(err)
    }
    res.status(500)
    res.render('error', { error: err })
  })

app.listen(3000);
//to run use node or npx nodemon app.js