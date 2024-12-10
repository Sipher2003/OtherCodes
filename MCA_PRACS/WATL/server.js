const express=require("express")
const path=require("path")
const app=express()
const port=3000

app.get("/",(req,res)=>{
    res.sendFile(path.join(__dirname,"public","home.html"))

})

app.get("/about",(req,res)=>{
    res.sendFile(path.join(__dirname,"public","about.html"))

})

app.get("/contact",(req,res)=>{
    res.sendFile(path.join(__dirname,"public","contact.html"))

})

app.listen(port,()=>{
    console.log(`server is running on port ${port}`)
})