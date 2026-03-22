function validateForm(){

let name=document.getElementById("name").value.trim();
let email=document.getElementById("email").value.trim();
let mobile=document.getElementById("mobile").value.trim();
let password=document.getElementById("password").value;
let confirm=document.getElementById("confirm").value;
let course=document.getElementById("course").value;
let department=document.getElementById("department").value;
let feedback=document.getElementById("feedback").value.trim();
let gender=document.getElementsByName("gender");

if(name==""){
alert("Name required");
return false;
}

let emailPattern=/^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
if(!email.match(emailPattern)){
alert("Enter valid email");
return false;
}

let mobilePattern=/^[0-9]{10}$/;
if(!mobile.match(mobilePattern)){
alert("Enter valid 10 digit mobile number");
return false;
}

let genderSelected=false;
for(let i=0;i<gender.length;i++){
if(gender[i].checked){
genderSelected=true;
break;
}
}
if(!genderSelected){
alert("Please select gender");
return false;
}

if(department==""){
alert("Please select department");
return false;
}

if(password.length<6){
alert("Password must be at least 6 characters");
return false;
}

if(password!=confirm){
alert("Passwords do not match");
return false;
}

if(course==""){
alert("Please select course");
return false;
}

let wordCount=feedback.split(/\s+/).filter(word=>word.length>0).length;
if(wordCount<10){
alert("Feedback must be at least 10 words");
return false;
}

alert("Registration Successful");

return true;


}