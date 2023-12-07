function generateProductCards(data) {
  const productGrid = document.getElementById("productGrid");

  data.forEach((item) => {
    let card = document.createElement("div");
    card.className = "card";
    card.innerHTML = `
            <div class="image-container">
                <img src="${item.img}" alt="${item.trim}">
            </div>
            <div class="details">
                <h3>${item.make} ${item.model} - <i>${item.trim}</i></h3>
            </div>
        `;

    card.onmouseenter = () => card.classList.add("active");
    card.onmouseleave = () => card.classList.remove("active");

    productGrid.appendChild(card);
  });
}

document.addEventListener("DOMContentLoaded", () => {
  generateProductCards(data);
});

document.addEventListener("DOMContentLoaded", function () {
  const navbar = document.querySelector(".navbar");

  const handleMouseMove = (e) => {
    // Adjust '250' to the number of pixels that defines 'close to the top'
    if (e.clientY <= 250) {
      navbar.classList.remove("navbar-hidden");
    } else {
      navbar.classList.add("navbar-hidden");
    }
  };

  document.addEventListener("mousemove", handleMouseMove);
});
