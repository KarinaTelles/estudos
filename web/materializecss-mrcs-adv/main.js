//Floating Action Button
const elementButton = document.querySelectorAll(".fixed-action-btn");
const floatingButton = M.FloatingActionButton.init(elementButton, {
  direction: "top",
  hoverEnabled: true,
  toolbarEnabled: false,
});
