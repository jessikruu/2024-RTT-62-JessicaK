        // Function to modify the text content of the paragraph
function changeText() {
    const button = document.querySelector('button');
    const p = document.querySelector('p');
    p.textContent = "Changed because of an event handler property.";
    button.textContent = "I was clicked";
}

function goToLookup () {
    window.location.href = 'lookup.html';
}