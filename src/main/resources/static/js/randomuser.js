// DOM Manipulation
// HTML -> DOM (Document Object Model)
function displayUser(user){
    // console.log(user);
    document.getElementById("userImage").src = user.image;
    document.getElementById("userName").textContent = user.name;
    document.getElementById("userGender").textContent = user.gender;
}

function getAndDisplayNextRandomUser(){
    fetch('/api/users')
    .then(function(res){
        return res.json();
    })
    .then(function(data){
        var userData = data.results[0];
        var myUserObject = {};
        myUserObject.name = userData.name.title + " " + userData.name.first + " " + userData.name.last;
        myUserObject.gender = userData.gender;
        myUserObject.image = userData.picture.large;
        displayUser(myUserObject);
    })
    .catch(function(err){
        console.log("ERROR " + err);
    })
}