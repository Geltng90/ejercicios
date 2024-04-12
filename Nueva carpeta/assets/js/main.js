const cart = [];
let total = 0; // Variable para mantener el total del pedido

function addToCart(item, price) {
  cart.push({ item, price });
  document.getElementById(
    "cart-items"
  ).innerHTML += <li>${item} - $${price}</li>;
  total += price; // Actualizar el total
  document.getElementById("total").textContent = total;
}

function submitOrder() {
  const name = document.getElementById("customer-name").value;
  const address = document.getElementById("customer-address").value;
  if (name && address && cart.length > 0) {
    // Mostrar detalles del pedido en la interfaz en lugar de usar alert
    document.getElementById("order-name").textContent = "Nombre: " + name;
    document.getElementById("order-address").textContent =
      "Dirección: " + address;
    document.getElementById("order-summary").innerHTML = cart
      .map((item) => <li>${item.item} - $${item.price}</li>)
      .join("");
    document.getElementById("order-total").textContent = total;
    document.getElementById("order-details").style.display = "block"; // Mostrar detalles del pedido
  } else {
    alert(
      "Por favor, completa todos los campos y añade al menos un artículo al carrito."
    );
  }
}