function onSubmit() {
    console.log("on submit function called");
let email = document.getElementById("emailInput");

    let emailValue = email.value;
    if (emailValue == '') {
        console.log("Email is required");

        //below applies the is-invalid class to the input so it is red 
        email.classList.add("is-invalid");
        //these lines change the sub-sentence text and style
        document.getElementById("emailHelp").textContent = "Email is required";
        document.getElementById("emailHelp").classList.add("invalid-feedback");
    } else if (!emailValue.match(/(?:[a-z0-9#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9#$%&'*+/=?^_`{|}~-]+)*|"(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])/)) {
        console.log("Email must include '@' ")

        //below applies the is-invalid class to the input so it is red 
        email.classList.add("is-invalid");
        //these lines change the sub-sentence text and style
        document.getElementById("emailHelp").textContent = "Email must include '@'";
        document.getElementById("emailHelp").classList.add("invalid-feedback");
    } else {
        email.classList.add("is-valid");
        console.log(emailValue);

    }
    //make the first name field to be required
    let fname = document.getElementById("fname");
    //getting the value that the user typed into the input field
    let firstNameValue = fname.value;
    if (firstNameValue === '') {
        console.log("First Name is required");

        //below applies the is-invalid class to the input so it is red 
        fname.classList.add("is-invalid");
        //these lines change the sub-sentence text and style
        document.getElementById("firstNameHelp").textContent = "Name is required";
        document.getElementById("firstNameHelp").classList.add("invalid-feedback");

    } else if (!firstNameValue.match(/^[A-Za-z]+$/) || firstNameValue.length === 0) {
        fname.classList.add("is-invalid");
        document.getElementById("firstNameHelp").textContent = "Letters only please";
        document.getElementById("firstNameHelp").classList.add("invalid-feedback");

    }

    else {
        fname.classList.add("is-valid");
        console.log(firstNameValue);
    }

    



    return false;

}




let slideIndex = 0;
showSlides();

function showSlides() {
    let i;
    let slides = document.getElementsByClassName("mySlides");
    let dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }
    slideIndex++;
    if (slideIndex > slides.length) { slideIndex = 1 }
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex - 1].style.display = "block";
    dots[slideIndex - 1].className += " active";
    setTimeout(showSlides, 2000); // Change image every 2 seconds
}