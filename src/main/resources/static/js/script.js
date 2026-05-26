document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("factory-form");
    const toast = document.getElementById("toast-notification");
    const statusSelect = document.getElementById("machineStatus");
    const reasonGroup = document.getElementById("reasonGroup");
    const reasonInput = document.getElementById("downtimeReason");
    if (statusSelect && reasonGroup && reasonInput) {
        statusSelect.addEventListener("change", () => {
            const selectedStatus = statusSelect.value;
            if (selectedStatus === "BREAKDOWN" || selectedStatus === "MAINTENANCE") {
                reasonGroup.classList.remove("hidden");
                reasonInput.setAttribute("required", "true");
            } else {
                reasonGroup.classList.add("hidden");
                reasonInput.removeAttribute("required");
                reasonInput.value = ""; 
            }
        });
    }
    if (form) {
        form.addEventListener("submit", (e) => {
            e.preventDefault();
            const cardHeading = form.closest(".form-card").querySelector("h2").textContent.trim();
            showToast(`⚙️ System Event Logged: Completed context for "${cardHeading}"`);
            form.reset();
            if (reasonGroup) {
                reasonGroup.classList.add("hidden");
                reasonInput.removeAttribute("required");
            }
        });
    }
    function showToast(message) {
        if (!toast) return;
        toast.textContent = message;
        toast.classList.remove("hidden");
        setTimeout(() => {
            toast.classList.add("hidden");
        }, 4000);
    }
});